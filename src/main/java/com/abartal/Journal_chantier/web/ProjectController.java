package com.abartal.Journal_chantier.web;

import com.abartal.Journal_chantier.entities.Project;
import com.abartal.Journal_chantier.services.project_service.ProjectService;
import com.abartal.Journal_chantier.services.project_service.ProjectServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    /***
     *
     * CREATE Operations
     *
     * */

    @PostMapping(path="/projects/add")
    public Project addProject(@RequestBody Project project){
            return projectService.addProject(project);
    }
}
