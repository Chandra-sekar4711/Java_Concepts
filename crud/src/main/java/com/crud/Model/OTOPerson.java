package com.crud.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class OTOPerson {
    @Id
    @Column(name = "pid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "pname")
    private String name;
    @Column(name = "page")
    private int age;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "person",fetch = FetchType.LAZY)
    @JsonIgnoreProperties(value = "person", allowSetters = true)
    OTOPassport otopassport;



}
