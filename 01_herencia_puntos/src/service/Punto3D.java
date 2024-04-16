package service;

import java.util.Objects;

public class Punto3D extends Punto{
	private int z;
	public Punto3D(int z) {
		//super();//llamada a constructor sin parámetros de la superclase
		this.z=z;
	}

	public Punto3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}

	@Override
	public void imprimir() {
		// TODO Auto-generated method stub
		super.imprimir();
		System.out.println(","+z);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(z);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Punto3D other = (Punto3D) obj;
		return z == other.z;
	}
	
}
