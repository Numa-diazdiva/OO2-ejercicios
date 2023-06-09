package oo2.ejercicio7_toDoList;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;

public class Paused implements State {
	
	public Paused() {}

	@Override
	public void start(ToDoItem context) {
	}

	@Override
	public void togglePause(ToDoItem context) {
		State newState = new InProgress();
		context.setState(newState);	
	}

	@Override
	public void finish(ToDoItem context) {
		State newState = new Finished();
		context.setState(newState);
	}

	@Override
	public Duration workedTime(LocalDate startTimeStamp) {
		Period periodo = Period.between(startTimeStamp, LocalDate.now());
		return Duration.ofDays(periodo.getDays());
	}

	@Override
	public void addComment(ToDoItem context, String comment) {
		context.addCommentToList(comment);	
	}
	
	
	
	
}
