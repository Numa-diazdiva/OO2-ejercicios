package oo2.ejercicio7_toDoList;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ToDoItem {
	private String name;
	private List<String> comments;
	private State state;
	private LocalDate startTimeStamp;
	
	/**
	* Instancia un ToDoItem nuevo en estado pending con <name> como nombre.
	*/
    public ToDoItem(String name) {
    	this.setName(name);
    	this.comments = new ArrayList<String>();
    	this.state = new Pending();
    }

   	/**
	* Pasa el ToDoItem a in-progress, siempre y cuando su estado actual sea
	* pending. Si se encuentra en otro estado, no hace nada.
	*/
    public void start() {
    	this.state.start(this);
    }

	/**
	* Pasa el ToDoItem a paused si su estado es in-progress, o a in-progress si su
	* estado es paused. Caso contrario (pending o finished) genera un error
	* informando la causa específica del mismo.
	*/
    public void togglePause() {
    	this.state.togglePause(this);
    }

	/**
	* Pasa el ToDoItem a finished, siempre y cuando su estado actual sea 
	* in-progress o paused. Si se encuentra en otro estado, no hace nada.
	*/
    public void finish() {
    	this.state.finish(this);
    }

	/**
	* Retorna el tiempo que transcurrió desde que se inició el ToDoItem (start)
	* hasta que se finalizó. En caso de que no esté finalizado, el tiempo que
	* haya transcurrido hasta el momento actual. Si el ToDoItem no se inició,
	* genera un error informando la causa específica del mismo.
	*/
    public Duration workedTime() {
    	return this.state.workedTime(startTimeStamp);
    }

	/**
	* Agrega un comentario al ToDoItem siempre y cuando no haya finalizado. Caso
	* contrario no hace nada."
	*/
    public void addComment(String comment) {
    	this.state.addComment(this, comment);
    }
    
    /*
     * Agrega un comentario a la lista de comentarios. Mensaje utilizado por el State correspondiente.
     * */
	public void addCommentToList(String comment) {
		this.comments.add(comment);
	}
	
	/*
	 * Retorna la lista de comentarios del Item
	 * */
	public List<String> getComments() {
		return this.comments;
	}

    public void setState(State state) {
    	this.state = state;
    }
	
	public State getState() {
		return this.state;
	}
    
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setStartTimeStamp(LocalDate timestamp) {
		this.startTimeStamp = timestamp;
	}

}
