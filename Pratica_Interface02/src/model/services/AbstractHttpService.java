package model.services;

import java.util.Hashtable;

public abstract class AbstractHttpService implements HttpService {
	private String url;
	Hashtable<String, String> parametros = new Hashtable<String, String>();

	public AbstractHttpService(String url, Hashtable<String, String> parametros ) {
		this.parametros = parametros;
		this.url = url;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Hashtable<String, String> getParametros() {
		return parametros;
	}

	public void setParametros(Hashtable<String, String> parametros) {
		this.parametros = parametros;
	}

	
	
	
}
