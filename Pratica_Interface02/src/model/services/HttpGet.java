package model.services;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;

public class HttpGet extends AbstractHttpService {

	/*Hashtable<String, String> parametros = new Hashtable<String, String>();
	parametros.put("limit", "10");
	parametros.put("formato", "1");*/

	
	public HttpGet(String url, Hashtable<String, String> parametros) {
		super(url, parametros);
		
	}

	@Override
	public String getResponse() {
		
		try {
			String parametrosUrlencode = getUrlEncode(parametros);
			URL url = new URL(getUrl()+parametrosUrlencode);

			// Open a connection to the URL
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();

			// Set the request method to GET
			connection.setRequestMethod("GET");
			

			// Get the response code
			int responseCode = connection.getResponseCode();
			//System.out.println("Response Code: " + responseCode);

			// Read the response from the input stream
			BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			String line;
			StringBuffer response = new StringBuffer();

			while ((line = reader.readLine()) != null) {
				response.append(line);
			}
			reader.close();

			// Print the response
			//System.out.println("Response: " + response.toString());

			// Close the connection
			connection.disconnect();
			return response.toString();

		}

		catch (Exception e) {
			e.printStackTrace();
			return e.toString();
		}	
		
	
	}

	private String getUrlEncode(Hashtable<String, String> parametros) {
		
		List<String> parametrosUrl = new ArrayList<String>();
		Enumeration  enuKey = parametros.keys();
		Enumeration enuvalues=parametros.elements();
	
		while(enuKey.hasMoreElements()) {
			String p = String.format("%s=%s" ,enuKey.nextElement(),enuvalues.nextElement() );
			parametrosUrl.add(p);
		}
		
		String pUrlencode = String.join("&", parametrosUrl);
		return pUrlencode;
	}

	
	
	
}
