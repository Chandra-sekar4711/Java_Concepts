package com.crud.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class OTMEmployee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="eid")
    private Integer id;
    @Column(name="ename")
    private String name;
    @Column(name="esalary")
    private Double salary;

    @ManyToOne()
    @JoinColumn(name="dept_fk")
    private OTMDepartment department;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "otmemp",orphanRemoval = true)
    @JsonIgnoreProperties(value = "otmemp",allowSetters = true)
    private List<OTMFamily> otmfamily;

}
