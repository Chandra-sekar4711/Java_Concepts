package com.crud1.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OTMParent {

    @Id
    @Column(name = "parent_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name = "parent_name")
    String parentname;

    @Column(name = "parent_job")
    String parentjob;

    @Column(name="children_count")
    String childrentcount;

    @OneToMany(mappedBy = "otmparent", cascade = CascadeType.ALL)
    @JsonIgnoreProperties(value = "otmparent", allowSetters = true)
    @ToString.Exclude
    List<OTMChild> otmchild = new ArrayList<>();
}


