package oo2.ejercicio7_toDoList;

import java.time.Duration;
import java.time.LocalDate;

public class Pending implements State{
	
	public Pending() {}
	
	public void start(ToDoItem context) {
    	context.setStartTimeStamp(LocalDate.now());
		State newState = new InProgress();
		context.setState(newState);
	}
	
	public void togglePause(ToDoItem context) {
		throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");
	}
	
	public void finish(ToDoItem context) {
	}
	
	public Duration workedTime(LocalDate startTimeStamp) {
		throw new RuntimeException("La tarea aún no ha sido iniciada");
	}

	public void addComment(ToDoItem context, String comment) {
		context.addCommentToList(comment);
	}
	
}
