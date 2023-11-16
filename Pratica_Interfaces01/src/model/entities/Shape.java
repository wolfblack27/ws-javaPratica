package model.entities;

import model.enums.Dimensao;
import model.interfaces.Propriedades;

public  abstract class Shape implements Propriedades{

	private String nomeFigura;
	private Dimensao dimensao;
	
	public Shape(String nomeFigura, Dimensao dimensao) {
		
		this.nomeFigura = nomeFigura;
		this.dimensao = dimensao;
	}
	
	
	public String getNomeFigura() {
		return nomeFigura;
	}
	public void setNomeFigura(String nomeFigura) {
		this.nomeFigura = nomeFigura;
	}
	public Dimensao getDimensao() {
		return dimensao;
	}
	public void setDimensao(Dimensao dimensao) {
		this.dimensao = dimensao;
	}
	
	


}
