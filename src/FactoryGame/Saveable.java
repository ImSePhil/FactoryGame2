package FactoryGame;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public interface Saveable {

	JSONArray toJsonArray();
	
	JSONObject toJsonObject();
	

}
