package Lógica;

public abstract class Pieza {
	private int posicionColumna;
	private int posicionFila;
	
	public Pieza(int posicionColumna2, int posicionFila2) {
	}
	
	public abstract int calcularMovimientos();
}
