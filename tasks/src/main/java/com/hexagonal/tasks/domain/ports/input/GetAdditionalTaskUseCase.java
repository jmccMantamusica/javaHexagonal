package com.hexagonal.tasks.domain.ports.input;

import com.hexagonal.tasks.domain.models.AdditionalTaskInfo;
import com.hexagonal.tasks.domain.models.Task;

public interface GetAdditionalTaskUseCase {

    AdditionalTaskInfo getAdditionalTaskInfo(Long id);
}
