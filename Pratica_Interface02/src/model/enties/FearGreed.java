package model.enties;

import java.util.Date;

public class FearGreed implements Comparable<FearGreed>{

	private String value;
	private String valueClassification;
	private Date data;
	
	public FearGreed(String value, String value_classification,  Date data) {
		super();
		this.value = value;
		this.valueClassification = value_classification;
		this.data = data;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	

	public String getValueClassification() {
		return valueClassification;
	}

	public void setValueClassification(String valueClassification) {
		this.valueClassification = valueClassification;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	@Override
	public int compareTo(FearGreed o) {
		// TODO Auto-generated method stub
		return -data.compareTo(o.getData());
	}
	
	
	
	
}
