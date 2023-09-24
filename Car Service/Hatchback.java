
import java.util.*;

public class Hatchback {

    HashMap<String, Integer> priceOfServices = new HashMap<>();
    private int numOfSer;
    private String[] services;

// Service Code Service Hatchback Sedan SUV
// BS01 Basic Servicing ₹ 2000 ₹ 4000 ₹ 5000
// EF01 Engine Fixing ₹ 5000 ₹ 8000 ₹ 10000
// CF01 Clutch Fixing ₹ 2000 ₹ 4000 ₹ 6000
// BF01 Brake Fixing ₹ 1000 ₹ 1500 ₹ 2500
// GF01 Gear Fixing ₹ 3000 ₹ 6000 ₹ 8000

    // price menu
    public Hatchback() {
        priceOfServices.put("BS01", 2000);// basic servicing
        priceOfServices.put("EF01", 5000);//engine fixing
        priceOfServices.put("CF01", 2000);//clutch fixing
        priceOfServices.put("BF01", 1000);//brake fixing
        priceOfServices.put("GF01", 3000);//gear fixing
    }

    // display menu
    public void displayMenu() {
        System.out.println("***************** THE MENU CARD FOR HATCHBACK CAR ****************************");
        for(String service : priceOfServices.keySet()) {
            if(service.equals("BS01")) {
                System.out.println(service + " || " + " Basic Servicing " + " || " + " Price is -> " + priceOfServices.get(service));
            } else if(service.equals("EF01")) {
                System.out.println(service + " || " + " Engine Fixing " + " || " + " Price is -> " + priceOfServices.get(service));
            } else if(service.equals("CF01")) {
                System.out.println(service + " || " + " Engine Fixing " + " || " + " Price is -> " + priceOfServices.get(service));
            } else if(service.equals("BF01")) {
                System.out.println(service + " || " + " Gear Fixing " + " || " + " Price is -> " + priceOfServices.get(service));
            } else if(service.equals("GF01")) {
                System.out.println(service + " || " + " Breake Fixing " + " || " + " Price is -> " + priceOfServices.get(service));
            }
             
        }
        System.out.println("******************* END OF MENU CARD **********************************");
    }

    // setter to assign the valus
    public void setServices(int number, String[] services) {
        this.numOfSer = number;
        this.services = services;
    }

    public void displayPrice() {
        int totalPrice = 0;

        System.out.println("************ B I L L *************");
        for(int i = 0; i < numOfSer; i++) {
            String ser = services[i];
            System.out.println(ser + " || " + " it's price is : " + priceOfServices.get(ser));
           totalPrice = totalPrice + priceOfServices.get(ser);
        }
        // complimentary 
        if(totalPrice >= 10000) {
            System.out.println("*FREE*FREE*FREE* CLEANING FREE - COMPLIMENTARY  *FREE*");
        }
        System.out.println("Total is : " + totalPrice);
        System.out.println("--------------------------------------xxxxxx--------------------------------------");
        
    }
}
