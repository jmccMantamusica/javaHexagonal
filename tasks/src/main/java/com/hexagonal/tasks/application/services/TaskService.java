package com.hexagonal.tasks.application.services;

import com.hexagonal.tasks.domain.models.AdditionalTaskInfo;
import com.hexagonal.tasks.domain.models.Task;
import com.hexagonal.tasks.domain.ports.input.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class TaskService implements CreateTaskUseCase, RetrieveTaskUseCase, UpdateTaskUseCase, DeleteTaskUseCase,
        GetAdditionalTaskUseCase {

    private final CreateTaskUseCase createTaskUseCase;
    private final RetrieveTaskUseCase retrieveTaskUseCase;
    private final UpdateTaskUseCase updateTaskUseCase;
    private final DeleteTaskUseCase deleteTaskUseCase;
    private final GetAdditionalTaskUseCase getAdditionalTaskUseCase;

      public TaskService(CreateTaskUseCase createTaskUseCase, RetrieveTaskUseCase retrieveTaskUseCase,
                       UpdateTaskUseCase updateTaskUseCase, DeleteTaskUseCase deleteTaskUseCase,
                       GetAdditionalTaskUseCase getAdditionalTaskUseCase) {
        this.createTaskUseCase = createTaskUseCase;
        this.retrieveTaskUseCase = retrieveTaskUseCase;
        this.updateTaskUseCase = updateTaskUseCase;
        this.deleteTaskUseCase = deleteTaskUseCase;
        this.getAdditionalTaskUseCase = getAdditionalTaskUseCase;
    }


    @Override
    public Task createTask(Task task) {
        return createTaskUseCase.createTask(task);
    }

    @Override
    public void deleteTask(Long id) {
        deleteTaskUseCase.deleteTask(id);
    }

    @Override
    public AdditionalTaskInfo getAdditionalTaskInfo(Long id) {
        return getAdditionalTaskUseCase.getAdditionalTaskInfo(id);
    }

    @Override
    public Optional<Task> getTask(Long id) {
        return retrieveTaskUseCase.getTask(id);
    }

    @Override
    public List<Task> getAllTasks() {
        return retrieveTaskUseCase.getAllTasks();
    }

    @Override
    public Task updateTask(Long id, Task updateTask) {
        return updateTaskUseCase.updateTask(id, updateTask);
    }
}
