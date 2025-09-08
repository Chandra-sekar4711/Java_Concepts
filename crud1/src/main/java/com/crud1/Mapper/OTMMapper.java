package com.crud1.Mapper;

import com.crud1.Model.ModelBO.OTMChildBO;
import com.crud1.Model.ModelBO.OTMParentBO;
import com.crud1.Model.OTMChild;
import com.crud1.Model.OTMParent;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface OTMMapper {


    OTMParent toparententity(OTMParentBO otmparentbo);
    OTMParentBO toparentdto(OTMParent otmparent);

    /*  Need to Ignore child here or else ignore in the child model*/

    /*@Mapping(target = "otmparent", ignore = true)*/
    OTMChildBO toChildDto(OTMChild child);

    OTMChild toChildEntity(OTMChildBO childBO);

}
