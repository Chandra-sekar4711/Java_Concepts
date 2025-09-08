package com.crud1.Model.ModelBO;

import lombok.Data;
import lombok.ToString;

import java.util.List;
@Data
public class OTMParentBO {

    private Integer id;
    private String parentname;
    private String parentjob;
    private String childrentcount;
    private List<OTMChildBO> otmchild ;

}









