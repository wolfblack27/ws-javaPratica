package model.aplicattion;

import model.entities.Circulo;
import model.entities.Quadrado;
import model.entities.Shape;
import model.enums.Dimensao;

public class Program {

	public static void main(String[] args) {
		
		Circulo shape = new Circulo("c1", Dimensao.Dois, 2.14);
		Shape quadrado = new Quadrado("d1", Dimensao.Dois, 2.0);
		System.out.println(shape.areaFigura());
		System.out.println(quadrado.areaFigura());
		System.out.println(shape.perimetro());
		System.out.println(quadrado.perimetro());
	}


}
