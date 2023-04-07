package oo2.ejercicio7_toDoList;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;

public class Finished implements State {

	private LocalDate finishedTimeStamp;
	
	public Finished() {
		this.finishedTimeStamp = LocalDate.now();
	}
	
	@Override
	public void start(ToDoItem context) {
		
	}

	@Override
	public void togglePause(ToDoItem context) {
		throw new RuntimeException("Unable to pause/unpause because the current state is Finished");
	}

	@Override
	public void finish(ToDoItem context) {		
	}

	@Override
	public Duration workedTime(LocalDate startTimeStamp) {
		Period periodo = Period.between(startTimeStamp, this.finishedTimeStamp);
		return Duration.ofDays(periodo.getDays());
	}

	@Override
	public void addComment(ToDoItem context, String comment) {		
	}
	
}
