package model.entities;

import model.enums.Dimensao;

public class Quadrado extends Shape {

	private Double lado;
	
	public Quadrado(String nomeFigura, Dimensao dimensao, Double lado) {
		super(nomeFigura, dimensao);
		this.lado = lado;
	}

	
	
	public Double getLado() {
		return lado;
	}



	public void setLado(Double lado) {
		this.lado = lado;
	}



	@Override
	public Double areaFigura() {
		
		return Math.pow(getLado(), 2);
	}



	@Override
	public Double perimetro() {
		
		return getLado()*4;
	}


	
	
}
