package model.aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import model.enties.FearGreed;
import model.services.HttpGet;
import model.services.RequestFearGreedService;

public class Program {

	public  static void  main(String[] args)  {
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
		List<FearGreed> fearGreeds = new ArrayList<FearGreed>();
		Hashtable<String, String> parametros = new Hashtable<String, String>();
		parametros.put("limit", "10");
		parametros.put("format", "json&date_format=us");
		String url = "https://api.alternative.me/fng/?";
		RequestFearGreedService rq = new RequestFearGreedService(new HttpGet(url, parametros));
		JSONArray arraydata = rq.getInfo();

		for (int i=0;i<arraydata.size();i++) {
		
			JSONObject campos = (JSONObject) arraydata.get(i);
			//System.out.println(campos.get("value"));
			//System.out.println(campos.get("value_classification"));
			//System.out.println(campos.get("timestamp"));
			String value = (String) campos.get("value");
			String valueClassification = (String) campos.get("value_classification");
			String sdata = (String) campos.get("timestamp");
			Date data;
			try {
				data = sdf.parse(sdata);
				fearGreeds.add(new FearGreed(value, valueClassification, data));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		Collections.sort(fearGreeds);		
		for(FearGreed fd: fearGreeds) {
			
			System.out.println(fd.getValue()+","+fd.getData().getDate());
			
		}
		
	}
}
