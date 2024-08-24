package com.abartal.Journal_chantier.services.project_service;

import com.abartal.Journal_chantier.entities.Project;
import com.abartal.Journal_chantier.repositories.ProjectRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService{

    private ProjectRepository projectRepository;


    public ProjectServiceImpl(ProjectRepository projectRepository){
        this.projectRepository = projectRepository ;
    }

    @Override
    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    @Override
    public Project getProject(Long project_id) {
        return null;
    }

    @Override
    public Project addProject(Project project) {
        return projectRepository.save(project);
    }

    @Override
    public Project updateProject(Project project, Long project_id) {
        return null;
    }

    @Override
    public Project deleteProject(Long project_id) {
        return null;
    }
}
