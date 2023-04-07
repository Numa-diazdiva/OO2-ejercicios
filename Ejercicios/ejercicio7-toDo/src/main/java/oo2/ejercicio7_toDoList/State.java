package oo2.ejercicio7_toDoList;

import java.time.Duration;
import java.time.LocalDate;

public interface State {

	public void start(ToDoItem context);
	
	public void togglePause(ToDoItem context);
	
	public void finish(ToDoItem context);
	
	public Duration workedTime(LocalDate startTimeStamp);
	
	public void addComment(ToDoItem context, String comment);
	
}
