package com.portfolio.portfoliors.controllers;

import com.portfolio.portfoliors.models.Project;
import com.portfolio.portfoliors.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/projects")
public class ProjectsController {
    @Autowired
    private ProjectRepository projectRepository;

    @GetMapping
    public List<Project> list(){
        return projectRepository.findAll();
    }
}
