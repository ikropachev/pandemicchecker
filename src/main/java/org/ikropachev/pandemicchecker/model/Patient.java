package org.ikropachev.pandemicchecker.model;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "patient")
public class Patient {
    public static final int START_SEQ = 100000;

    @Id
    @SequenceGenerator(name = "global_seq", sequenceName = "global_seq", allocationSize = 1, initialValue = START_SEQ)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "global_seq")
    @Access(AccessType.PROPERTY)
    @ApiModelProperty(example = "null", readOnly = true)
    private Integer id;

    @Column(name = "name")
    @NotBlank
    @Size(max = 100)
    @ApiModelProperty(example = "Петров Геннадий Семенович")
    private String name;

    @Column(name = "disease")
    @NotBlank
    @Size(max = 100)
    @ApiModelProperty(example = "Краснуха")
    private String disease;

    public Patient() {
    }

    public Patient(Integer id, String name, String disease) {
        this.id = id;
        this.name = name;
        this.disease = disease;
    }

    /*
    public Patient(Patient p) {
        this(p.id, p.name, p.disease);
    }
     */

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", name=" + name +
                ", disease=" + disease +
                '}';
    }
}
