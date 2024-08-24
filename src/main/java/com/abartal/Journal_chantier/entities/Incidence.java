package com.abartal.Journal_chantier.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Incidence extends BaseEntity{

    private String description;

    @ManyToOne
    @JoinColumn(name="journal_id")
    private Journal journal;
}
