package com.abartal.Journal_chantier.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Visitor extends BaseEntity{

    private String name;
    private String quality;
    private String heure;

    @ManyToOne
    @JoinColumn(name="journal_id")
    private Journal journal;
}
