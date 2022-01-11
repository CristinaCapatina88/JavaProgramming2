package practice.Restaurant;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant_ {

    public String owner,location;
    public int numberOfStars;
    public ArrayList<Server> serversList = new ArrayList<>();
    public ArrayList<Chef> chefsList = new ArrayList<>();

    public Restaurant_(String owner, String location, int numberOfStars) {
        this.owner = owner;
        this.location = location;
        this.numberOfStars = numberOfStars;
    }

    public void hireServer(Server server){
        serversList.add(server);//accepts a server object and adds it to the Servers ArrayList
    }
    public void hireServer(Server [] servers){
        serversList.addAll(Arrays.asList(servers));//accepts more servers from an array add to array list
    }
    public void hireChef(Chef chef){
        chefsList.add(chef);//adding one chef to the arraylist
    }
    public void hireChef(Chef [] chefs){
        chefsList.addAll(Arrays.asList(chefs));
    }

     public void terminateChef(int employeeId){
        chefsList.removeIf(p-> p.employeeID==employeeId);//removes the chef with the matching ID from the arraylist of chef
    }
     public void terminateServer(int employeeId){
        serversList.removeIf(p-> p.employeeID==employeeId);
}

    public String toString() {
        return "Restaurant_{" +
                "owner='" + owner + '\'' +
                ", location='" + location + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", Number of servers=" + serversList.size() +
                ", Number of chefs=" + chefsList.size() +
                '}';
    }
}
/*
Attributes:
	                Owner (String), Location (String), numberOfStars (int)
	                Servers (ArrayList of Server objects)
	                Chefs (ArrayList of Chef objects)

                Add a constructor that sets the owner, location, and number of stars.

	            Actions: (all void methods)

	                hireServer(Server server): accepts a server object and adds it to the Servers ArrayList
	                hireServer(Server [] servers): accepts an array of Server objects and adds all of them to the Servers ArrayList

	                hireChef(Chef chef): accepts a chef object and adds it to the Chefs ArrayList
	                hireChef(Chef [] chefs): accepts an array of Chef objects and adds all of them to the Chef ArrayList

	                terminateChef(int employeeID): removes the chef with the matching ID from the arraylist of chef
	                terminateServer(int employeeID) removes the server with the matching ID from the arraylist of server

	                toString(): Return (String) of all the information of a Restaurant object.
	                No need to print the whole list of Servers or Chefs.
	                 Print the number of Servers and Chefs along side the other information
 */