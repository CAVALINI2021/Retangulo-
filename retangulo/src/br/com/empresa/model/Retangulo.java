package br.com.empresa.model;

public class Retangulo {
	
	private double altura;
	private double base;
	
	//ALTURA
	public void setAltura(double altura) {
		this.altura = altura;
		
	}
	
	public double getAltura() {
		return this.altura;
	}

	//BASE
	public void setBase(double base) {
		this.base = base;
	}
	
	public double getBase() {
		return base;
	}
	
	//M�TODO PARA CALCULAR �REA 
	public double calcularArea() {
		return this.base * this.altura;	
	}
	
	//M�TODO PARA CALCULAR PER�METRO
	public double calcularPerimetro() {
		return 2 * (this.base = this.altura);
	}
}

