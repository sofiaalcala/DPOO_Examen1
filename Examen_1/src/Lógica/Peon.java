package Lógica;

public class Peon extends Pieza {
	private int columna;
	private int fila;
	
	public Peon(int columna, int fila) {
		super(columna, fila);
	}
	public int calcularMovimientos() {
		int contador = 0;
		if (this.columna==1 && this.fila==1) {
			contador++;
			contador++;
		} else {
			contador ++; }
		return contador;
			
	}}

