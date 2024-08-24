package com.abartal.Journal_chantier.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="human_ressource")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HumanResource extends BaseEntity{

    private String quality;
    private String quantity;

    @ManyToOne
    @JoinColumn(name="journal_id")
    private Journal journal;
}
