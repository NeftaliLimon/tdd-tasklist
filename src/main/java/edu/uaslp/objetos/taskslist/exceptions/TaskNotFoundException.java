package edu.uaslp.objetos.taskslist.exceptions;

public class TaskNotFoundException extends RuntimeException {
    public TaskNotFoundException(String msj){
        super(msj);
    }
}
