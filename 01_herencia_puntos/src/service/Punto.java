package service;

import java.util.Objects;

public class Punto {
	private int x;
	private int y;
	public Punto(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public Punto() {
		x=5;
		y=10;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void imprimir() {
		System.out.print("Las coordenadas son: "+x+","+y);
	}
	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Punto other = (Punto) obj;
		return x == other.x && y == other.y;
	}
	
}
