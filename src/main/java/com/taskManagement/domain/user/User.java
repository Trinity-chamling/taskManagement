package com.taskManagement.domain.user;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * The basic details of the User who creates the task
 */
@Data
@Document("user")
public class User {
    private String firstName;
    private String middleName;
    private String lastName;
    private List<String> associatedTasks;
}
