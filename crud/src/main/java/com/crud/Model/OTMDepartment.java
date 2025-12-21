package com.crud.Model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class OTMDepartment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="did")
    private Integer id;
    @Column(name="dname")
    private String name;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "department",fetch = FetchType.LAZY,orphanRemoval = true)
    @JsonIgnoreProperties(value = "department", allowSetters = true)
    private List<OTMEmployee> employees;

}
