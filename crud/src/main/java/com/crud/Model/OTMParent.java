package com.crud.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OTMParent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="pid")
    Integer pid;

    @Column(name="pname")
    String pname;

    @Column(name="page")
    Integer page;

    @Column(name="pjob")
    String pjob;

    @JsonIgnoreProperties(value = "otmparent", allowSetters = true)
    @ToString.Exclude
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "otmparent",orphanRemoval = true)
    List<OTMChild> child_fk = new ArrayList<>();

}
