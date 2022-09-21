package org.pineda.poointerfaces.imprenta;

import org.pineda.poointerfaces.imprenta.modelo.Curriculo;
import org.pineda.poointerfaces.imprenta.modelo.Genero;
import org.pineda.poointerfaces.imprenta.modelo.Hoja;
import org.pineda.poointerfaces.imprenta.modelo.Iimprimible;
import org.pineda.poointerfaces.imprenta.modelo.Informe;
import org.pineda.poointerfaces.imprenta.modelo.Libro;
import org.pineda.poointerfaces.imprenta.modelo.Pagina;
import org.pineda.poointerfaces.imprenta.modelo.Persona;

public class Main {

	public static void main(String[] args) {
		
		Curriculo curriculo = new Curriculo(new Persona("John" , " Doe"), "Ingeniero de Sistemas", "Resumen laboral...");
		curriculo.addExperiencia("Java")
			.addExperiencia("Oracle DBA")
			.addExperiencia("Spring Framework")
			.addExperiencia("Desarrollador Fullstack")
			.addExperiencia("Angular");
		
		Libro libro = new Libro(new Persona("Erick"," Gama"), "Patrones de Diseño: elem. reutilisables POO", Genero.PROGRAMACION);
		libro.addPagina(new Pagina("Patron Singleton"))
			.addPagina(new Pagina("Patron Onservador"))
			.addPagina(new Pagina("Patron Fabrica"))
			.addPagina(new Pagina("Patron Compositor"))
			.addPagina(new Pagina("Patron Facade"));
		
		Informe informe = new Informe(new Persona("Martin", " fowbler"), new Persona("James" , "Torres"), "Estudio sobre micro servicios");
		imprimir(curriculo);
		imprimir(informe);
		imprimir(libro);

	}
	
	public static void imprimir(Iimprimible imprimible) {
		System.out.println(imprimible.imprimir());
	}

}
