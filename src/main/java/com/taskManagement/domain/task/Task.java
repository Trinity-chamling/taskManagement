package com.taskManagement.domain.task;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * task entity which will define the task of the user.
 */
@Data
@Document("task")
public class Task {
    private String title;
    private boolean taskCompleted;
    private String Description;
    private String associatedUser;
}
