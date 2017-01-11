package com.greenfox.exams.spring.services;

import com.greenfox.exams.spring.domain.Project;
import com.greenfox.exams.spring.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by almasics on 2017.01.11..
 */
@Service
public class ProjectServices {
    ProjectRepository projectRepository;

    @Autowired
    public ProjectServices(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public Iterable<Project> list() {
        return projectRepository.findAll();
    }

}
