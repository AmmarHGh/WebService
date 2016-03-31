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
public class Location {

 private int ID;
 private String Location;

    public Location() {
    }
    
    public void setID(int ID) {
        this.ID = ID;
    }   
    
     public int getID() {
        return ID;
    }
    
     public void setLocation(String Location) {
        this.Location = Location;
    }
     
    public String getLocation() throws JSONException, IOException {
        JsonParser JSON = new JsonParser();
        JSONObject Result = JSON.Parse();
        String location= Result.getJSONObject("profile"+(ID)).getString("location");
        return location;
    }
    
}
