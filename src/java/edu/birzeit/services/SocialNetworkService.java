/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.birzeit.services;

import edu.birzeit.model.Address;
import edu.birzeit.model.Location;
import edu.birzeit.model.Name;
import static edu.birzeit.model.User.ID;
import static edu.birzeit.model.User.getFriendship;
import java.io.IOException;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import org.json.JSONException;

/**
 *
 * @author ahg
 */
@WebService(serviceName = "SocialNetworkService")
public class SocialNetworkService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "getUserData")
    public String hello(@WebParam(name = "ID") String UserID) throws JSONException, IOException {
        
    Name Name = new Name();
    Address Address=new Address();
    Location Location=new Location();
     
    Name.setID(ID);
    Address.setID(ID);
    Location.setID(ID);
   
   return "The ID is : "+ID
           +"\n"+"The Name is : "+Name.getName()
           +"\n"+"The Address is : "+Address.getAddress()
           +"\n"+"The Location is : "+Location.getLocation();
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getUserFriendList")
    public String[] getUserFriendList(@WebParam(name = "ID") int ID) throws JSONException, IOException {
        
        return getFriendship(ID);
    }
    
}
