package com.abartal.Journal_chantier.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
    @JsonBackReference
    private Project project;

    @OneToMany(mappedBy = "journal", cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Inventory> inventories;

    @OneToMany(mappedBy="journal", cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Visitor> visitors;

    @OneToMany(mappedBy = "journal", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Observation> observations;

    @OneToMany(mappedBy="journal", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<WorkTime> workTimes;

    @OneToMany(mappedBy = "journal",cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Incidence> incidences;

    @OneToMany(mappedBy = "journal",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<HumanResource> humanResources;

    @OneToMany(mappedBy = "journal",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Signature> signatures;
}
