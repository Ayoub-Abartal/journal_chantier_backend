package com.abartal.Journal_chantier.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Journal extends BaseEntity{

    private String title;
    private String temp;
    private String sec;
    private String vent;
    private String orageux;
    private String pluieDiscontinue;
    private String pluieToutJournee;

    @ManyToOne
    @JoinColumn(name="project_id")
    private Project project;

    @OneToMany(mappedBy = "inventory", cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Inventory> inventories;

    @OneToMany(mappedBy="visitor", cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Visitor> visitors;



}
