package com.hexagonal.tasks.domain.ports.input;

import com.hexagonal.tasks.domain.models.Task;

import java.util.Optional;

public interface DeleteTaskUseCase {

    void deleteTask(Long id);
}
