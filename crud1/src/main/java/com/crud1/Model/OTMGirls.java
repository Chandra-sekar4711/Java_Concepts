package com.crud1.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.annotation.processing.Generated;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OTMGirls {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="gid")
    Integer gid;

    @Column(name="gname")
    String gname;

    @Column(name="gage")
    Integer gage;

    @Column(name="gprofession")
    String gprofession;

    @ManyToOne()
    @JsonBackReference
    @JoinColumn(name="otmboys_fk",referencedColumnName = "bid")
    @ToString.Exclude
    OTMBoys otmboys;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "otmgirls",orphanRemoval = true)
    @JsonIgnoreProperties(value = "otmgirls", allowSetters = true)
    @ToString.Exclude
    @Column(name = "otmbesties")
    List<OTMBesties> otmbesties = new ArrayList<>();


}
