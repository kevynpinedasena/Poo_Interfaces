package org.pineda.poointerfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Libro implements Iimprimible{

	private List<Iimprimible> paginas;
	private Persona autor;
	private String titulo;
	private Genero genero;
	
	public Libro(Persona autor, String titulo, Genero genero) {
		super();
		this.autor = autor;
		this.titulo = titulo;
		this.genero = genero;
		this.paginas = new ArrayList<>();
	}
	
	public Libro addPagina(Iimprimible pagina) {
		paginas.add(pagina);
		return this;
	}
	
	@Override
	public String imprimir() {
		
		StringBuilder sb = new StringBuilder("Titulo: ");
		sb.append(this.titulo).append("\n")
			.append("Autor: ").append(this.autor).append("\n")
			.append("Genero: ").append(genero).append("\n");
		
		for (Iimprimible pag : this.paginas) {
			sb.append(pag.imprimir()).append("\n");
		}
		
		return sb.toString();
	}
}
