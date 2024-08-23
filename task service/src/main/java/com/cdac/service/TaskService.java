package com.cdac.service;

import com.cdac.modal.Task;
import com.cdac.modal.TaskStatus;

import java.util.List;

public interface TaskService {

    Task createTask(Task task, String requesterRole)throws Exception;

    Task getTaskById(Long Id) throws Exception;

    List<Task> getAllTask(TaskStatus status);

    Task updateTask(Long id, Task updatedTask, Long userId)throws Exception;

    void deleteTask(Long id) throws Exception;

    Task assignedToUSer(Long userId,Long taskId)throws Exception;

    List<Task>assignedUserTask(Long userId, TaskStatus status );

    Task completeTask(Long taskId) throws Exception;


}
