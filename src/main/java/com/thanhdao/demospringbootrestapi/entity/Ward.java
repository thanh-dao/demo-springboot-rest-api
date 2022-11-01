package com.thanhdao.demospringbootrestapi.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Setter;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
@Setter

public class Ward {
    @Id
    @Column
    private String wardId;

    @Column
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "district_id")
    @JsonBackReference
    private District district;

}
