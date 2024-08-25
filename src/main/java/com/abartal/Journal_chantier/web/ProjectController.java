package com.abartal.Journal_chantier.web;

import com.abartal.Journal_chantier.entities.Project;
import com.abartal.Journal_chantier.services.project_service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    /***
     *
     * READ Operations
     *
     * */

    //Read All
    @GetMapping(path="/projects")
    public List<Project> getAllProjects(){
        return projectService.getAllProjects();
    }

    // Read One
    @GetMapping(path = "/projects/{project_id}")
    public ResponseEntity<Project> getProject(@PathVariable Long project_id){
        try{
            Project searchedProject = projectService.getProject(project_id);

            return ResponseEntity.ok(searchedProject);

        } catch(Exception e ){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
    }

    /***
     *
     * UPDATE Operations
     *
     * */

    @PutMapping(path = "/project/{project_id}")
    public ResponseEntity<Project> updateProject(@RequestBody Project project, @PathVariable Long project_id){
        try{
            Project updatedProject = projectService.updateProject(project,project_id);

            return ResponseEntity.ok(updatedProject);
        }catch(Exception e){
            return ResponseEntity.badRequest().body(null);
        }

    }

}
