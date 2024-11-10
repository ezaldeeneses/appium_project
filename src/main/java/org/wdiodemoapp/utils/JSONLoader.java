package org.wdiodemoapp.utils;

import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.IOException;
import java.io.InputStream;

public class JSONLoader {

    public JSONObject getJSONObject(String jsonFileName){
        JSONObject jsonObject;
        InputStream data =null;

        try {
            data = getClass().getClassLoader().getResourceAsStream(jsonFileName);
            JSONTokener tokener = new JSONTokener(data);
            jsonObject = new JSONObject(tokener);
        }catch (Exception e){
            e.printStackTrace();
            throw e;
        }finally {
            if (data != null){
                try {
                    data.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
        return jsonObject;
    }
}
