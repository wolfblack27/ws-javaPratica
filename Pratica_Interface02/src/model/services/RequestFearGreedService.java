package model.services;

import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class RequestFearGreedService {
	private AbstractHttpService abstractHttpService;

	public RequestFearGreedService(AbstractHttpService abstractHttpService) {
		this.abstractHttpService = abstractHttpService;
	}

	public JSONArray getInfo() {

		String info = abstractHttpService.getResponse();
		Object obj = JSONValue.parse(info);
		JSONObject jsonObject = (JSONObject) obj;
		List<String> data = (List<String>) jsonObject.get("data");
		JSONArray dataarray = (JSONArray) data;
		
		
		//value,valueClassification*/
		return dataarray;

	}

}
