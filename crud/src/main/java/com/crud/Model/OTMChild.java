package com.crud.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OTMChild {

    @Id
    @Column(name = "child_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer cid;

    @Column(name = "Child_name")
    String childname;

    @Column(name="child_job")
    String childjob;

    @ManyToOne()
    @JoinColumn(name = "parent_fk",referencedColumnName = "pid" )
    OTMParent otmparent;


}
