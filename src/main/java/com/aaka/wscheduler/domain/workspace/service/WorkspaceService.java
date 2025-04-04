package com.aaka.wscheduler.domain.workspace.service;

import com.aaka.wscheduler.domain.workspace.dto.WorkspaceRequestDto;
import com.aaka.wscheduler.domain.workspace.dto.WorkspaceResponseDto;
import com.aaka.wscheduler.domain.workspace.entity.Workspace;
import com.aaka.wscheduler.domain.workspace.repository.WorkspaceRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Transactional
public class WorkspaceService {
    private final WorkspaceRepository workspaceRepository;


    public WorkspaceResponseDto createWorkspace(WorkspaceRequestDto requestDto) {
        Workspace workspace = new Workspace(requestDto.getUserId());
        Workspace savedWorkspace = workspaceRepository.save(workspace);

        return new WorkspaceResponseDto(savedWorkspace);
    }

    public Long deleteWorkspace(Long userId) {
        workspaceRepository.deleteById(userId);
        // 예외처리
        return userId;
    }
}
