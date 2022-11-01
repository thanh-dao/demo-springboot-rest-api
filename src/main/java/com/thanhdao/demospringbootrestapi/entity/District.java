package com.thanhdao.demospringbootrestapi.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class District {
    @Id
    @Column
    private String districtId;

    @Column
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cityId")
    @JsonBackReference
    private City city;


    @Column
    @OneToMany(mappedBy = "district")
    @JsonManagedReference
    private List<Ward> wardList;
}
