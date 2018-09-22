package com.udacity.sandwichclub.utils;

import com.udacity.sandwichclub.model.Sandwich;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class JsonUtils {

    public static Sandwich parseSandwichJson(String json) {

        try {
            JSONObject SandwichJson = new JSONObject(json);

            return new Sandwich(
                    SandwichJson.getJSONObject("name").getString("mainName"),
                    getStringListFromJsonArray(SandwichJson.getJSONObject("name").getJSONArray("alsoKnownAs")),
                    SandwichJson.getString("placeOfOrigin"),
                    SandwichJson.getString("description"),
                    SandwichJson.getString("image"),
                    getStringListFromJsonArray(SandwichJson.getJSONArray("ingredients")));
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return null;
    }


    private static List<String> getStringListFromJsonArray(JSONArray jArray) throws JSONException {
        List<String> returnList = new ArrayList<>();
        for (int i = 0; i < jArray.length(); i++) {
            String val = jArray.getString(i);
            returnList.add(val);
        }
        return returnList;
    }



}
