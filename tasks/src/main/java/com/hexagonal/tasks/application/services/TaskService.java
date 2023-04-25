package com.hexagonal.tasks.application.services;

import com.hexagonal.tasks.domain.models.AdditionalTaskInfo;
import com.hexagonal.tasks.domain.models.Task;
import com.hexagonal.tasks.domain.ports.input.*;

import java.util.List;
import java.util.Optional;

public class TaskService implements CreateTaskUseCase, RetrieveTaskUseCase, UpdateTaskUseCase, DeleteTaskUseCase,
        GetAdditionalTaskUseCase {
    @Override
    public Task createTask(Task task) {
        return null;
    }

    @Override
    public boolean deleteTask(Long id) {
        return false;
    }

    @Override
    public AdditionalTaskInfo getAdditionalTaskInfo(Long id) {
        return null;
    }

    @Override
    public Optional<Task> getTask(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Task> getAllTasks() {
        return null;
    }

    @Override
    public Optional<Task> updateTask(Long id, Task updateTask) {
        return Optional.empty();
    }
}
