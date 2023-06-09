package oo2.ejercicio7_toDoList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;
import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ToDoItemTest {
	ToDoItem item;
	
	@BeforeEach
	void setUp() {
		item = new ToDoItem("Investigar almacenamiento de imágenes");
	}
	
	@Test
	void testPendingStatePause(){
		try {
			item.togglePause();
		} catch(Exception e) {
			assertEquals(e.getMessage(), "El objeto ToDoItem no se encuentra en pause o in-progress");
		}
	}
	
	@Test
	void testFinishedPause(){
		item.start();
		item.finish();
		try {
			item.togglePause();
		} catch(Exception e) {
			assertEquals(e.getMessage(), "Unable to pause/unpause because the current state is Finished");
		}
	}	
	
	@Test
	void testAddMessage() {
		String mensaje1, mensaje2, mensaje3, mensaje4, mensaje5;
		
		mensaje1 = "Para iniciar este ticket es necesario resolver aquel otro";
		item.addComment(mensaje1);
		assertTrue(item.getComments().contains(mensaje1));
		
		item.start();
		mensaje2 = "Hice eso y esto otro";
		item.addComment(mensaje2);
		assertTrue(item.getComments().contains(mensaje2));
		
		item.togglePause();
		mensaje3 = "Pausé la tarea";
		item.addComment(mensaje3);
		assertTrue(item.getComments().contains(mensaje3));

		item.togglePause();
		mensaje4 = "despausé la tarea";
		item.addComment(mensaje4);
		assertTrue(item.getComments().contains(mensaje4));
		
		item.finish();
		mensaje5 = "finalicé la tarea";
		item.addComment(mensaje5);
		assertFalse(item.getComments().contains(mensaje5));
		
	}
	
	@Test
	void testWorkedTimePending() {
		try {
			item.workedTime();
		} catch(Exception e) {
			assertEquals(e.getMessage(), "La tarea aún no ha sido iniciada");
		}
	}
	
	@Test
	void testWorkedTimeInProgress() {
		// Evaluar visibilidad de este mensaje (setStartTimeStamp)
		// Tiene sentido que alguien pueda cambiar la fecha en caso de que se agregue una tarea que 
		// ya se estaba llevando a cabo, por ejemplo. Pero hay cosas que me gustaría que fueran accesibles únicamente por el state.
		item.start();
		item.setStartTimeStamp(LocalDate.of(2023, 4, 4));
		assertEquals(item.workedTime().compareTo(Duration.ofDays(3)), 0);
	}
	
	@Test
	void testWorkedTimePause() {
		item.start();
		item.togglePause();
		item.setStartTimeStamp(LocalDate.of(2023, 4, 4));
		assertEquals(item.workedTime().compareTo(Duration.ofDays(3)), 0);
	}
	
	@Test
	void testWorkedTimeFinished() {
		item.start();
		item.togglePause();
		item.setStartTimeStamp(LocalDate.of(2023, 4, 3));
		item.finish();
		assertEquals(item.workedTime().compareTo(Duration.ofDays(4)), 0);
	}
	
}
