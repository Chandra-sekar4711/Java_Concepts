package com.crud.Model;

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
public class OTMFamily {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fid")
    private Integer fid;
    @Column(name = "fname")
    private String fname;
    @Column(name = "mname")
    private String mname;

    @ManyToOne()
    @JoinColumn(name = "otmemp_fk")
    private OTMEmployee otmemp;

}
