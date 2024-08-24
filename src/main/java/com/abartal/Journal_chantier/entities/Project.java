package com.abartal.Journal_chantier.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;

import java.util.List;

public class Project extends BaseEntity{

    private String title;
    private String numeroChantier;
    private String logo;

    @OneToMany(mappedBy = "project", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Journal> journals;



}
