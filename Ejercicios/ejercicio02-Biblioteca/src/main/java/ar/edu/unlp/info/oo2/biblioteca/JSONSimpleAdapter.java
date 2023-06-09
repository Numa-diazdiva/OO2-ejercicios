package ar.edu.unlp.info.oo2.biblioteca;

import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONSimpleAdapter implements JSONExporter{
	private JSONArray listaDeSocios;
	
	private JSONObject socioAObjeto(Socio socio) {
		JSONObject objeto = new JSONObject();
		objeto.put("nombre", socio.getNombre());
		objeto.put("email", socio.getEmail());
		objeto.put("legajo", socio.getLegajo());
		return objeto;
	}
	
	public String exportar(List<Socio> socios) {
		listaDeSocios = new JSONArray();
		List<JSONObject> sociosJSON = socios.stream().map(s -> this.socioAObjeto(s)).toList();
		listaDeSocios.addAll(sociosJSON);
		return listaDeSocios.toString();
	}
	
	
}
