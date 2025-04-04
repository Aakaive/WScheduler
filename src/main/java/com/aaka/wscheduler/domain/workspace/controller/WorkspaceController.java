package com.aaka.wscheduler.domain.workspace.controller;

import com.aaka.wscheduler.domain.workspace.dto.WorkspaceRequestDto;
import com.aaka.wscheduler.domain.workspace.dto.WorkspaceResponseDto;
import com.aaka.wscheduler.domain.workspace.entity.Workspace;
import com.aaka.wscheduler.domain.workspace.service.WorkspaceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/workspace")
public class WorkspaceController {
    private final WorkspaceService workspaceService;

    @PostMapping
    public ResponseEntity<WorkspaceResponseDto> create(@RequestBody WorkspaceRequestDto workspaceRequestDto) {
        WorkspaceResponseDto workspaceResponseDto = workspaceService.createWorkspace(workspaceRequestDto);
        return ResponseEntity.ok(workspaceResponseDto);
    }

    @DeleteMapping("/{user_id}")
    public ResponseEntity<Long> deleteWorkspace(@PathVariable("user_id") Long userId) {
        Long deletedId = workspaceService.deleteWorkspace(userId);
        return ResponseEntity.ok(deletedId);
    }


}
