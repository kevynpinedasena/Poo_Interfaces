package org.pineda.poointerfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curriculo extends Hoja implements Iimprimible{
	
	private Persona persona;
	private String carrera;
	private List<String> experiencias;

	public Curriculo(Persona perosna, String carrera, String contenido) {
		super(contenido);
		this.persona = perosna;
		this.carrera = carrera;
		this.experiencias = new ArrayList<>();
	}
	
	public Curriculo addExperiencia(String exp) {
		experiencias.add(exp);
		return this;
	}

	@Override
	public String imprimir() {
		StringBuilder sb = new StringBuilder("Nombre: ");
		sb.append(persona).append("\n")
			.append("Resumen: ").append(this.contenido)
			.append("\n").append("Profesion: ").append(carrera)
			.append("\n")
			.append("Experiencias: \n");
		
		for (String exp : this.experiencias) {
			sb.append("- ").append(exp).append("\n");
		}
		
		return sb.toString();
	}

}
