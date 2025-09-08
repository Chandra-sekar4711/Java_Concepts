package com.crud1.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class OTMBesties {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bestieid")
    public int id ;

    @Column(name = "besname")
    public String besname;

    @Column(name = "besjob")
    public String besjob;

    @ManyToOne()
    @ToString.Exclude
    @JoinColumn(name = "bestie_fk",referencedColumnName = "gid")
    OTMGirls otmgirls;


}
