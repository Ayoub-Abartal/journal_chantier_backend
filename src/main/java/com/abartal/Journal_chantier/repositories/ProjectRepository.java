package com.abartal.Journal_chantier.repositories;

import com.abartal.Journal_chantier.entities.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project,Long> {
}
