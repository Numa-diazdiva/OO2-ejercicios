package ar.edu.unlp.info.oo2.biblioteca;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;

public class JacksonAdapter implements JSONExporter{
	private ObjectMapper jacksonObjectMapper;
	
	public JacksonAdapter() {
		jacksonObjectMapper = new ObjectMapper();
	}
	
	public String exportar(List<Socio> socios) {
		List<String> sociosJSON = socios.stream().map(s -> {
			try {
				return jacksonObjectMapper.writeValueAsString(s);
			} catch (JsonProcessingException e) {
				// Si hay una excepción retorna un string vacío
				return "";
			}
		}).toList();
		
		return sociosJSON.toString();
	}
}
