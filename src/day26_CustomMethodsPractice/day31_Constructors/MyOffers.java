package day26_CustomMethodsPractice.day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {
 Offer offer1 = new Offer();
 offer1.setInfo("Boston","Oracle","SDET",120000,true,true,true,true);

 Offer offer2 = new Offer();
 offer2.setInfo("New York","Mira","QA",65000,false,false,true,false);

 Offer offer3 = new Offer();
 offer3.setInfo("Chicago","Amazon Inc","matual tester",80000,true,true,true,true);

 Offer offer4 = new Offer();
 offer4.setInfo("CA","Sony","QA",100000,true,false,false,false);

 Offer offer5 = new Offer();
 offer5.setInfo("FL","Apple Inc","QE",130000,true,true,false,true);

 Offer offer6 = new Offer();
offer6.setInfo("WA","Bank of America","BA",90000,true,true,true,false);

Offer [] myoffers ={offer1,offer2,offer3,offer4,offer5,offer6};
        ArrayList<Offer> fullTimeOffers = new ArrayList<>(Arrays.asList(myoffers));

        fullTimeOffers.removeIf(p->!p.isFullTime);//removes if the offer is not full time
        System.out.println(fullTimeOffers.size());

        ArrayList<Offer> localOffers = new ArrayList<>(Arrays.asList(myoffers));
        localOffers.removeIf(p-> !p.location.equals("Boston")&& !p.location.equals("New York"));// removes the offers that are not local
        System.out.println(localOffers.size());

        ArrayList<Offer> offersWithBenefits = new ArrayList<>(Arrays.asList(myoffers));
        offersWithBenefits.removeIf(p-> !p.hasBenefit);
        System.out.println(offersWithBenefits.size());
        System.out.println(offersWithBenefits);

      ArrayList<Offer> sdetOffers = new ArrayList<>(Arrays.asList(myoffers));
      sdetOffers.removeIf(p-> !p.jobTitle.equalsIgnoreCase("Sdet"));
        System.out.println(sdetOffers.size());

        ArrayList<Offer> offersWith100K = new ArrayList<>(Arrays.asList(myoffers));
      offersWith100K.removeIf(p-> p.salary<100000);
        System.out.println(offersWith100K.size());

    }
}
/*
2. Create a class named MyOffers:

            2.1 Create 7 objects of Offer
            2.2 Create an array of Offers named myOffers and store all 7 objects of offers
            2.3 Create an ArrayList of Offer named fullTimeOffers and add all the offer objects.
                    2.3.1 Write a program that can remove the offer objects that are not full-time
            2.4 Create an ArrayList of Offer named localOffers and add all the offer objects.
                    2.4.1 Write a program that can remove all the offers that are not from local
            2.5 Create an ArrayList of Offer named offersWithBenefits and add all the offer objects.
                    2.5.1 Write a program that can remove all the offers that does not have benefit and does not have PTO
            2.6 Create an ArrayList of Offer named sdetOffers and add all the offer objects.
                    2.6.1 Write a program that can remove all the offers that are not for SDET
            2.7 Create an ArrayList of Offer named offersWith100K and add all the offer objects.
                    2.7.1 Write a program that can remove all the offers that are offering less than 100K salary

 */