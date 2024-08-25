package com.abartal.Journal_chantier.services.project_service;

import com.abartal.Journal_chantier.entities.Project;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ProjectService {

    List<Project> getAllProjects();

    Project getProject(Long project_id) throws Exception;

    Project addProject(Project project);

    Project updateProject(Project project, Long project_id) throws Exception;

    ResponseEntity<Object> deleteProject(Long project_id) throws Exception;
}
