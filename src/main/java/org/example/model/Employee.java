package org.example.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee {

    public int employeeId;
    public String employeeName;
    public String employeeMail;
    public String employeePosition;
    public String employeeDepartment;
    public int employeePhoneNumber;

    //employee
    public int activeTasks;
    public int finishedTasks;

}
