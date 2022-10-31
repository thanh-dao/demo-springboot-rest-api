package com.thanhdao.demospringbootrestapi.entity;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class City {
    @Id
    @Column
    private String cityId;

    @Column
    private String name;


    @Column
    @OneToMany(mappedBy = "city")
    @JsonManagedReference
    private List<District> districtList;

    @Override
    public String toString() {
        return "City{" +
                "cityId='" + cityId + '\'' +
                ", name='" + name + '\'' +
                ", districtList=" + districtList +
                '}';
    }
}
