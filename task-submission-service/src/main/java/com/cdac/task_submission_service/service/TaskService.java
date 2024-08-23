package com.cdac.task_submission_service.service;


import com.cdac.task_submission_service.modal.TaskDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.config.Task;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "SUBMISSION-SERVICE",url="http://localhost:5004/")
public interface TaskService {

    @GetMapping("/api/task/{id}")
    public TaskDto getTaskById
            (@PathVariable Long id,
             @RequestHeader("Authorization") String jwt) throws Exception;

    @PutMapping("/api/task/{id}/complete")
    public TaskDto completeTask(@PathVariable Long id)throws Exception;

    }
