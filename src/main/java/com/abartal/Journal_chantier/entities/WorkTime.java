package com.abartal.Journal_chantier.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="work_time")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class WorkTime extends BaseEntity {

    private String partieOuverage;
    private String localisation;

    @ManyToOne
    @JoinColumn(name="journal_id")
    private Journal journal;

}
