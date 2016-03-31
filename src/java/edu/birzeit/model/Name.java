package edu.birzeit.model;

import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ahg
 */
public class Name {

 private int ID;
 private String Name;

    public Name() {
    }
    
    public void setID(int ID) {
        this.ID = ID;
    }   
    
     public int getID() {
        return ID;
    }
    
     public void setName(String Name) {
        this.Name = Name;
    }
     
    public String getName() throws JSONException, IOException {
        JsonParser JSON = new JsonParser();
        JSONObject Result = JSON.Parse();
        String name= Result.getJSONObject("profile"+(ID)).getString("name");
        return name;
    }
    
}
