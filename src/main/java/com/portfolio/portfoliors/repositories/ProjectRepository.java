package com.portfolio.portfoliors.repositories;

import com.portfolio.portfoliors.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
