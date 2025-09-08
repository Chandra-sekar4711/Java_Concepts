package com.crud1.Model;

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
public class OTMBoys {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="bid")
    Integer bid;

    @Column(name="bname")
    String bname;

    @Column(name="bage")
    Integer bage;

    @Column(name="bjob")
    String bjob;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "otmboys",orphanRemoval = true)
    @ToString.Exclude
    @JsonManagedReference
    List<OTMGirls> girls_fk = new ArrayList<>();

}
