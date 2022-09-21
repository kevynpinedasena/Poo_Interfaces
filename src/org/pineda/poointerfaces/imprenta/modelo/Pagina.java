package org.pineda.poointerfaces.imprenta.modelo;

public class Pagina extends Hoja implements Iimprimible {

	public Pagina(String contenido) {
		super(contenido);
	}

	@Override
	public String imprimir() {
		return this.contenido;
	}

}
