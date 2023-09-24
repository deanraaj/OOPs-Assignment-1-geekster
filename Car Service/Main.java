import java.util.*;

// the Main class 
class Main {
    public static void main(String[] args) {
        // scanner for taking input
        Scanner in = new Scanner(System.in);

        System.out.println("------------*  Welcome to Raju Car Service Center   *----------");

        System.out.println("Please specify what type of car you want to Serive : ");
        String typeOfCar = in.next();

        switch(typeOfCar) {
            case "Hatchback":
                // creating object
                System.out.println("---------------------------xxxxxxx-------------------------");
                Hatchback hb = new Hatchback();
                
                // assign the Prices
                //hb.menu();

                // displaying Menu
                hb.displayMenu();

                // number of services
                System.out.println("Enter number of sevices you need");
                int numOfSer = in.nextInt();

                String[] services = new String[numOfSer];
                for(int i = 0; i < numOfSer; i++) {
                    //System.out.println("please enter service Num-" + (i+1) + " : ");
                    services[i] = in.next();// storing services in array format
                    
                }
                // set the values
                hb.setServices(numOfSer, services);

                // Getting total price of services
                hb.displayPrice();

                break;
            case "Sedan":
                System.out.println("---------------------------xxxxxxx-------------------------");
                Sedan sd = new Sedan();
                
                // assign the Prices
                //hb.menu();

                // displaying Menu
                sd.displayMenu();

                // number of services
                System.out.println("Enter number of sevices you need");
                int numOfSe = in.nextInt();

                String[] service = new String[numOfSe];
                for(int i = 0; i < numOfSe; i++) {
                    //System.out.println("please enter service Num-" + (i+1) + " : ");
                    service[i] = in.next();// storing services in array format
                    
                }
                // set the values
                sd.setServices(numOfSe, service);

                // Getting total price of services
                sd.displayPrice();
                break;
            case "SUV":
                System.out.println("---------------------------xxxxxxx-------------------------");
                SUV suv = new SUV();
                
                // assign the Prices
                //hb.menu();

                // displaying Menu
                suv.displayMenu();

                // number of services
                System.out.println("Enter number of sevices you need");
                int num = in.nextInt();

                String[] Services = new String[num];
                for(int i = 0; i < num; i++) {
                    //System.out.println("please enter service Num-" + (i+1) + " : ");
                    Services[i] = in.next();// storing services in array format
                    
                }
                // set the values
                suv.setServices(num, Services);

                // Getting total price of services
                suv.displayPrice();
                break;
        }
    }
}