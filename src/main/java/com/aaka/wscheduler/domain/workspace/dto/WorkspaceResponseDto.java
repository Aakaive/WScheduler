package com.aaka.wscheduler.domain.workspace.dto;

import com.aaka.wscheduler.domain.workspace.entity.Workspace;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WorkspaceResponseDto {
    public WorkspaceResponseDto(Workspace workspace) {
        this.userId = workspace.getId();
    }

    private Long userId;

}
