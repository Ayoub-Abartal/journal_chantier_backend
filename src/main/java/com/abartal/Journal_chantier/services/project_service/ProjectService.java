package com.abartal.Journal_chantier.services.project_service;

import com.abartal.Journal_chantier.entities.Project;

import java.util.List;

public interface ProjectService {

    List<Project> getAllProjects();

    Project getProject(Long project_id);

    Project addProject(Project project);

    Project updateProject(Project project, Long project_id);

    Project deleteProject(Long project_id);
}
