package com.hexagonal.tasks.domain.ports.output;

import com.hexagonal.tasks.domain.models.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepositoryPort extends CrudRepository<Task, String> {

}
