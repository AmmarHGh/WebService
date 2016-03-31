package edu.birzeit.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public class JsonParser {
    
    public static String[] Names = {"Nariman Ammar","Alice Bob","Sam Stanley","Mathio Jerome","Nick Tom"};

    private static JSONTokener jsonOut;

    //public static void main(String myHelpers[]) throws JSONException, IOException {

    public JsonParser() {
    }
    
     public static JSONObject Parse() throws JSONException, IOException{
    
                File f = new File("/home/ahg/NetBeansProjects/Assignment2/src/java/edu/birzeit/model/SocialNetwork.json");

                  
                    String jsonString = readFile(f.getPath());
                                
                    jsonOut = new JSONTokener(jsonString);
                    JSONObject output = new JSONObject(jsonOut);
                    
                    return output;
                    
                    /*for( int i=0; i<output.length(); i++ )
                    {
                    String name = output.getJSONObject("profile"+(i+1)).getString("name");
                    String id = output.getJSONObject("profile"+(i+1)).getString("id");
                    String location = output.getJSONObject("profile"+(i+1)).getString("location");
                    String address = output.getJSONObject("profile"+(i+1)).getString("address");
                    JSONArray friend_list= output.getJSONObject("profile"+(i+1)).getJSONArray("friends");
                    
                    System.out.println(" User "+(i+1)+" : ");
                    System.out.println("---------");
                    System.out.println("");
                    System.out.println("Name : "+name);
                    System.out.println("ID : "+id);
                    System.out.println("Location : "+location);
                    System.out.println("Address : "+address);
                    
                    System.out.println("");
                    System.out.println("Friends List : ");
                    
                   for (int j=0; j<friend_list.length(); j++)
                   {
                     int num=Integer.parseInt(friend_list.getString(j));
                     String Name=Names[num];
                     System.out.println("- "+Name);
                     
                   }
                    
                    
                    System.out.println("");
                    System.out.println("-------------------------");
                    System.out.println("-------------------------");
                    System.out.println("");
                    }*/
                    
            }
     
     

    private static String readFile(String file) throws IOException {
        
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line = null;
        StringBuilder stringBuilder = new StringBuilder();
        String ls = System.getProperty("line.separator");

        while ((line = reader.readLine()) != null) {
            stringBuilder.append(line);
            stringBuilder.append(ls);
        }
        return stringBuilder.toString();
    }
}