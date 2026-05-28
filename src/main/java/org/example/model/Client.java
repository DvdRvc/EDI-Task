package org.example.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Client {


    public int clientId;
    public String clientName;
    public int clientGln;
    public String clientMail;


    public List <String> clientContactPerson;
    public List <String> clientContactPersonMail;
    public List <String> clientContactPersonPhone; //maybe string?, maybe obsolete

    public int clientNumberOfActiveTasks;
    public int clientNumberOfFinishedTasks;





}
