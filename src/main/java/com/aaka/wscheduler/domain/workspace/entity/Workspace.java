package com.aaka.wscheduler.domain.workspace.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Workspace {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private Long userId;

    public Workspace(Long userId) {
        this.userId = userId;
    }
}
