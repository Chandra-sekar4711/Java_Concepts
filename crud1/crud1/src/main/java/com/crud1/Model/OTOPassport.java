package com.crud1.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OTOPassport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long passid;
    private String passportNumber;
    private String country;
    private String passPortType;

    @JsonBackReference
    @OneToOne(mappedBy = "passport")
    private OTOPerson person;


}
