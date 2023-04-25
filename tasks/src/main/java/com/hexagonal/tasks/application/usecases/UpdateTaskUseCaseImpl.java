package com.hexagonal.tasks.application.usecases;

import com.hexagonal.tasks.domain.models.Task;
import com.hexagonal.tasks.domain.ports.input.UpdateTaskUseCase;
import com.hexagonal.tasks.domain.ports.output.TaskRepositoryPort;

import java.util.Optional;

public class UpdateTaskUseCaseImpl implements UpdateTaskUseCase {

    private final TaskRepositoryPort taskRepositoryPort;


    public UpdateTaskUseCaseImpl(TaskRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }

    @Override
    public Task updateTask(Long id, Task updateTask) {
        Optional<Task> taskDb = taskRepositoryPort.findById(id);
        taskDb.get().setTitle(updateTask.getTitle());
        taskDb.get().setDescription(updateTask.getDescription());
        taskDb.get().setCreateLocalDate(updateTask.getCreateLocalDate());
        taskDb.get().setCompleted(true);

        return taskRepositoryPort.save(taskDb.get());
    }
}
