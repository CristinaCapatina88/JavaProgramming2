package practice.Restaurant;

import java.util.ArrayList;
import java.util.Arrays;

public class LocalRestaurant {
    public static void main(String[] args) {

      Restaurant_ casaMare = new Restaurant_("Vasea","Chisinau",5);

       Server server1 = new Server("Ion",56,12.0,true);
       Server server2 = new Server("Catea",5689,11.0,true);
       Server server3 = new Server("Fedea",2356,10.0,false);


       Server [] servers= {server1,server2,server3};

        ArrayList<Server> serversList = new ArrayList<>(Arrays.asList(servers));

        Chef chef1 = new Chef("Mea",3355,40.50,true);
        Chef chef2 = new Chef("Teya",3465,45.50,true);
        Chef chef3 = new Chef("Alfredo",39445,100,false);

        Chef [] chefs= {chef1,chef2,chef3};

     ArrayList<Chef> chefsList = new ArrayList<>(Arrays.asList(chefs));

     casaMare.hireChef(chefs);
     casaMare.hireServer(servers);
     casaMare.terminateChef(3355);
     casaMare.terminateServer(56);

        System.out.println(casaMare);


    }
}
/*
Create a class LocalRestaurant that has a main method with the following:
	        	- Make a Restaurant object
	        	- Create an array of servers with their information set. Add those initial servers to the ArrayList of Servers in the Restaurant object
	            - Create an array of chefs with their information set. Add those initial chefs to the ArrayList of Chefs in the Restaurant object

	            - Print your whole restaurants information
 */