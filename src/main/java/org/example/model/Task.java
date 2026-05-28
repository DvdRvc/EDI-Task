package org.example.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Task {

    public int taskId;
    public String taskName;
    public Client taskClient; //setting it from Client entity
    public Employee taskAssignedTo;//setting it from User entity

    public Employee taskReportsTo; //employee is reporting to who?

    public boolean taskIsActive; //is the task still active? (yes/no)

    public String taskDescription;
    public String taskCurrentState; //current state of the task (current status of the dev of the task)

    public Date taskStartDate;
    public Date taskFinishDate;

}
