package edu.birzeit.model;

import java.io.IOException;
import java.util.Scanner;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author ahg
 */

public class User {

public static int ID;
String Name;
String Address;
String Location;
String Friends;

private Name NameInput;
private Address AddressInput;
private Location LocationInput;

public int getID (){
    
    return this.ID;
}

public String getName () throws JSONException, IOException{
    Name name=new Name();
    name.setID(ID);
    this.Name=name.getName();
    return this.Name;
}

public String getAddress () throws JSONException, IOException{
    Address address=new Address();
    address.setID(ID);
    this.Address=address.getAddress();
    return this.Address;
}

public String getLocation () throws JSONException, IOException{
    Location location=new Location();
    location.setID(ID);
    this.Location=location.getLocation();
    return this.Location;
}

public static String[] getFriendship(int ID) throws JSONException, IOException {
        JsonParser JSON = new JsonParser();
        JSONObject Result = JSON.Parse();
        JSONArray friend_list= Result.getJSONObject("profile"+(ID)).getJSONArray("friends");
        
        String[] FreindsNames = new String[friend_list.length()];
        
        for (int i=0; i<friend_list.length(); i++)
                   {
                     int FreindsID=Integer.parseInt(friend_list.getString(i));
                     
                     String FriendName= Result.getJSONObject("profile"+(FreindsID)).getString("name");
                     
                     System.out.println(FriendName);
                     
                     FreindsNames[i]=FriendName;
                   }
        return FreindsNames;
       
                   }

public static void main(String [ ] args) throws JSONException, IOException
{
  
  Scanner reader = new Scanner(System.in);
  System.out.println("Please Enter a User ID From 1-5");
  int input = reader.nextInt();

  if (input>=1 && input<=5)
  {
    ID=input;
    Name Name = new Name();
    Address Address=new Address();
    Location Location=new Location();
     
   Name.setID(ID);
   Address.setID(ID);
   Location.setID(ID);
   
   System.out.println("The ID is : "+ID);
   System.out.println("The Name is : "+Name.getName());
   System.out.println("The Address is : "+Address.getAddress());
   System.out.println("The Location is : "+Location.getLocation());
   System.out.println("Freinds Are : ");
   getFriendship(ID);    
  }
else
  {
      System.out.println("Please Enter a Valid User ID from 1-5");
  }
  }
}   
