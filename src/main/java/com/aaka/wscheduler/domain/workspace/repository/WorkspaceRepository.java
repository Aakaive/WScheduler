package com.aaka.wscheduler.domain.workspace.repository;

import com.aaka.wscheduler.domain.workspace.entity.Workspace;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkspaceRepository extends JpaRepository<Workspace, Long> {
}
