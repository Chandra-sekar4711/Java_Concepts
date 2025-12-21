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
public class OTOPassport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "passid")
    private Integer id;
    @Column(name = "passno")
    private String passportNumber;
    @Column(name = "passnationality")
    private String nationality;
    @OneToOne
    @JoinColumn(name = "person_fk" )
    private OTOPerson person; // one-to-one relationship

}

