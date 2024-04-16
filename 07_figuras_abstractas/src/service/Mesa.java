package service;

public class Mesa implements Operaciones {
	private int largo,ancho,alto;
	
	public Mesa(int largo, int ancho, int alto) {
		super();
		this.largo = largo;
		this.ancho = ancho;
		this.alto = alto;
	}

	@Override
	public void girar(int grados) {
		alto+=grados;

	}

	@Override
	public int invertir() {
		ancho*=-1;
		return ancho*alto;
	}

}
