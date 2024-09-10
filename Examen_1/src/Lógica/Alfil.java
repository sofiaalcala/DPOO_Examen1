package Lógica;

public class Alfil extends Pieza {
	private int columna;
	private int fila;
	
	public Alfil(int columna, int fila) {
		super(columna, fila); }
		
	public int calcularMovimientos() {
		int contador = 0;
		if (this.columna==1 || this.columna==8)	{	
			contador =8; }
		else if (this.columna==2 || this.columna==7) {
			contador = 7; }
		else if (this.columna==3 || this.columna==6) {
			contador=6; }
		else  {
			contador=5; }
				
	}}