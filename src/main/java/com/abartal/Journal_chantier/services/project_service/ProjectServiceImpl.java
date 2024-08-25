package com.abartal.Journal_chantier.services.project_service;

import com.abartal.Journal_chantier.entities.Project;
import com.abartal.Journal_chantier.repositories.ProjectRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService{

    private ProjectRepository projectRepository;


    public ProjectServiceImpl(ProjectRepository projectRepository){
        this.projectRepository = projectRepository ;
    }

    // List of projects in DB
    @Override
    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    // Search for one project
    @Override
    public Project getProject(Long project_id) throws Exception {
        return projectRepository.findById(project_id).orElseThrow(()->new Exception("Project not found"));
    }

    // Handle creation of project entity
    @Override
    public Project addProject(Project project) {
        return projectRepository.save(project);
    }


    // Handle update information
    @Override
    public Project updateProject(Project project, Long project_id) throws Exception {
        Project oldProject = projectRepository.findById(project_id).orElseThrow(()-> new Exception("project not found"));

        if(project.getTitle() != null || project.getNumeroChantier()!= null || project.getLogo() != null){
            oldProject.setNumeroChantier(project.getNumeroChantier());
            oldProject.setLogo(project.getLogo());
            oldProject.setTitle(project.getTitle());

        return projectRepository.save(oldProject);
        }

        throw new Exception("Invalid Project informations");
    }

    // Handle Delete operation
    @Override
    public ResponseEntity<Object> deleteProject(Long project_id) throws Exception {
        Project project = projectRepository.findById(project_id).orElseThrow(()-> new Exception("Project not found"));

        String project_name =project.getTitle();
        projectRepository.delete(project);

        return new ResponseEntity<>(
                "Project "+project_name+" is deleted successefully",
                HttpStatus.OK
        );
    }
}
