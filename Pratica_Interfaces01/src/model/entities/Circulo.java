package model.entities;

import model.enums.Dimensao;

public class Circulo extends Shape {
	private Double radius;
	
	public Circulo(String nomeFigura, Dimensao dimensao, Double radius) {
		super(nomeFigura, dimensao);
		this.radius = radius;
		
	}

	
	public Double getRadius() {
		return radius;
	}
	public void setRadius(Double radius) {
		this.radius = radius;
	}

	@Override
	public Double areaFigura() {
		
		return getRadius()*Math.PI;
	}


	@Override
	public Double perimetro() {
		return getRadius()+2*3.14;
	}

	
	
}
