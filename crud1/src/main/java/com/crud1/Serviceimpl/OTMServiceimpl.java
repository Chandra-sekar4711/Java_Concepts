package com.crud1.Serviceimpl;

import com.crud1.CustomException.MyException;
import com.crud1.Mapper.OTMMapper;
import com.crud1.Model.ModelBO.OTMParentBO;
import com.crud1.Model.OTMBesties;
import com.crud1.Model.OTMBoys;
import com.crud1.Model.OTMGirls;
import com.crud1.Model.OTMParent;
import com.crud1.Repository.OTMParentRepo;
import com.crud1.Repository.OTMRepo;
import com.crud1.Service.OTMService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Slf4j
@Service
public class OTMServiceimpl implements OTMService {


    OTMRepo otmrepo;
    OTMParentRepo otmparentrepo;
    OTMMapper otmmapper;
    @Autowired
    OTMServiceimpl(OTMRepo otmrepo, OTMParentRepo otmparentrepo, OTMMapper otmmapper)
    {
        this.otmrepo=otmrepo;
        this.otmparentrepo=otmparentrepo;
        this.otmmapper = otmmapper;

    }

    @Override
    public OTMBoys otmsave(OTMBoys otmboys) throws ArithmeticException, NullPointerException, MyException {

        if(otmboys != null)
        {
            throw new MyException("Service MyException");
        }
        otmboys.getGirls_fk().forEach(girl ->{
            girl.getOtmbesties().stream().forEach(n->n.setOtmgirls(girl));
            girl.setOtmboys(otmboys);

        } );

        System.out.println(otmboys);
        return otmrepo.save(otmboys);
    }

    @Override
    public OTMBoys getBoysByid(Integer id) {
         Optional<OTMBoys> res = otmrepo.findById(id);
        log.info("***********************--->>"+""+res);
        List<OTMGirls> gir = res.get().getGirls_fk();
        log.info("***********************--->>"+""+gir);
         //OTMBoys res1 = res.get();
        List<OTMBesties> bes = gir.get(0).getOtmbesties();
        log.info("***********************--->>"+""+bes);
         return res.get();
    }

    @Override
    public OTMBoys updateBoysbyID(OTMBoys otmboys) {
       if(otmboys==null)
       {throw new NullPointerException("NO Record Found Give me the Correct Data");}
       OTMBoys res =  otmrepo.findById(otmboys.getBid()).orElseThrow(()-> new NullPointerException("No Record Found Give The correct Record"));
        res.setBage(otmboys.getBage());
        res.setBjob(otmboys.getBjob());
        res.setBname(otmboys.getBname());
        res.getGirls_fk().clear();
        for(OTMGirls girl : otmboys.getGirls_fk())
        {
            girl.setOtmboys(res);
            girl.getOtmbesties().forEach(bestie->bestie.setOtmgirls(girl));
            res.getGirls_fk().add(girl);
        }

        return otmrepo.save(res);
    }

    @Override
    public void Deleteboys(Integer id) {
        otmrepo.deleteById(id);
    }

    @Override
    public OTMParentBO saveparent(OTMParentBO otmparentbo) {
        OTMParent otmparent =  otmmapper.toparententity(otmparentbo);
        otmparent.getOtmchild().forEach(child->child.setOtmparent(otmparent));
        OTMParent otmparententity = otmparentrepo.save(otmparent);
        OTMParentBO res = otmmapper.toparentdto(otmparententity);
        return res;

    }

    @Override
    public OTMParent getParentsByid(Integer id) {
        return otmparentrepo.findById(id).get();
    }

    @Override
    public OTMBoys getboysandgirls(Map<String,String> request) {
        System.out.println(request.get("id"));
        System.out.println(request.get("age"));
        OTMBoys res = otmrepo.findByIDS(request.get("id"),request.get("age"));

        return res;
    }


}

