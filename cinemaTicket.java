import java.util.*;
    
class cinemaTicket  {
        static Scanner in = new Scanner(System.in);
        String name;
        static int age;
        String aFilms[] = {"Joker", "Gemini Man", "Shutter Island", "The Purge Election", "Gangs of Wasseypur"};
        String uaFilms[] = {"Avengers: End Game", "Spiderman:Far from home", "Housefull 4", "War", "URI: The Surgical Strike"};
        public void welcomeMessage() {
            System.out.println("*****************************************************************************");
            System.out.println("\n" + "Welcome to MR.CINEMA!");
            System.out.println("We try our best to server you your time and");
            System.out.println(" with all the leisure and strive to make your entertainment time the best. \n");
            System.out.println("*****************************************************************************");
                   

        }
        
        public void userInputs() {
            
            System.out.println("Please Enter Your Name : ");
            System.out.println("> ");
            name = in.nextLine();
            
            System.out.println("Please Enter Your Age : ");
            System.out.println("> ");
            age = in.nextInt();
        }
        
        public void adultFilms() {
            System.out.println("Chose the films by selecting the number of the films in the given list.\n");
            for (int i=0; i < aFilms.length ; i++) {
                System.out.println(" "+ i + ". " + aFilms[i] );
            }
        }
        
        
            public void underFilms() {
            System.out.println("Chose the films by selecting the number of the films in the given list.\n");
            for (int i=0; i < uaFilms.length ; i++) {
                System.out.println(" "+ i + ". " + uaFilms[i] );
            }
        }
        
        public void filmChoice(int ch) {
               switch(ch) {
                   
               case 0 : 
               Joker joker = new Joker();
               joker.aboutFilm();
               joker.timings();
               joker.chooseTiming();
               
               userDetails();
               break;
               
               case 1:
               Gemini_Man gemini = new Gemini_Man();
               gemini.aboutFilm();
               gemini.timings();
               gemini.chooseTiming();
               
               userDetails();
               break;
               
               case 2:
               Shutter_Island island = new Shutter_Island();
               island.aboutFilm();
               island.timings();
               island.chooseTiming();
               
               userDetails();
               break;
               
               case 3: 
               The_Purge_Election election = new The_Purge_Election();
               election.aboutFilm();
               election.timings();
               election.chooseTiming();
               
               userDetails();
               break;
               
               case 4 : 
               Gangs_of_Wasseypur gangs = new Gangs_of_Wasseypur();
               gangs.aboutFilm();
               gangs.timings();
               gangs.chooseTiming();
               
               userDetails();
               break;
               
               default:
               System.out.println("Enter the correct one next time.. Time RunOut!. Try again!! :( :(");
               break;
               
            }
        
        
        }
        
        public void filmChoiceU(int ch) {
               switch(ch) {
                   
               case 0 : 
               End_Game end = new End_Game();
               end.aboutFilm();
               end.timings();
               end.chooseTiming();
               
               userDetails();
               break;
               
               case 1:
               Spiderman spiderman = new Spiderman();
               spiderman.aboutFilm();
               spiderman.timings();
               spiderman.chooseTiming();
               
               userDetails();
               break;
               
               case 2:
               Housefull4 housefull = new Housefull4();
               housefull.aboutFilm();
               housefull.timings();
               housefull.chooseTiming();
               
               userDetails();
               break;
               
               case 3: 
               War war = new War();
               war.aboutFilm();
               war.timings();
               war.chooseTiming();
               
               userDetails();
               break;
               
               case 4 : 
               URI uri = new URI();
               uri.aboutFilm();
               uri.timings();
               uri.chooseTiming();
               
               userDetails();
               break;
               
               default:
               System.out.println("Enter the correct one next time.. Time RunOut!. Try again!! :( :(");
               break;
               
            }
        }
        
        public void userDetails(){
            
            System.out.println("*****************************************************");
            System.out.println("MR.CINEMA! - YOUR ONE WAY ROUTE TO ALL MOVIES AND ENTERTAINMENT!");
            System.out.println("Thank You For Choosing Us.!");
            System.out.println("Name: " + name);
            System.out.println("Age : " +age);
            System.out.println();
        }
        
        public static void main (String args[]) { 
            cinemaTicket ob = new cinemaTicket();
            ob.welcomeMessage();
            ob.userInputs();
            
            
            if (age >= 18 && age <= 80 ) {
                do {
                    ob.adultFilms();
                    System.out.println("Enter the number of the chosen film.\n If you are sure then type '1'for 'yes' or '2' for no after entering the choice.");
                    int ch = in.nextInt();
                    int conform = in.nextInt();
                    if(conform == 1) {
                        ob.filmChoice(ch);
                        break;
                    } else {
                        System.out.println("reverted to previous menu! \n");
                    }
                } while(true);
            }
               
            else if (age < 18 && age>= 12) {
            do {
                    ob.underFilms();
                    System.out.println("Enter the number of the chosen film.\n If you are sure then type '1'for 'yes' or '2' for no after entering the choice.");
                    int ch = in.nextInt();
                    int conform = in.nextInt();
                    if(conform == 1) {
                        ob.filmChoiceU(ch);
                        break;
                    } else {
                        System.out.println("reverted to previous menu! \n");
                    }
                }while(true);
            } else {
                System.out.println("Inappropriate age. Sorry!");
            }
   

        }
}

class Joker  {
    static Scanner in = new Scanner(System.in);
    String  timing[] = {"9:05 AM", "1:00 PM", "7:00 PM"};
    String  timing2[] = {"12:05 PM", "5:00 PM", "8:00 PM"};
    int  price[] = {120 , 140, 200};
    int cost;
    String time;
    public void aboutFilm() {
        System.out.println();
        System.out.println("In Gotham City, mentally-troubled comedian Arthur Fleck is disregarded and mistreated by society."+ 
        "He then embarks on a downward spiral of revolution and bloody crime. This path brings him face-to-face with his alter-ego: 'The Joker'. /n");
    }
    
    public void timings() {
        System.out.println("Select the time which suits your schedule.");
        for(int i=0 ; i < timing.length; i++) {
            System.out.println(" "+i+". " + timing[i] + " -- Rs." + price[i]);
        }
    }
    
    public void chooseTiming() {
        System.out.println("Enter the number corresponding your choice : ");
        int ch = in.nextInt();
        
        switch(ch) {
            case  0: 
             time = "9:05 AM";
            System.out.println("Rs.120 per person");
            cost = 120;
            System.out.println("There are 50 seats in total. 'x' represent the taken seats and 'o' represnts the available seats.\n");
            showSeats(38);
            confirmation(120);
            break;
            
            case 1 : 
            time = "1:00 PM";
            System.out.println("Rs.140 per person");
            cost = 140;
            System.out.println("There are 50 seats in total. 'x' represent the taken seats and 'o' represnts the available seats.\n");
            showSeats(40);
            confirmation(140);
            break;
            
            case 2 : 
            time = "7:00 PM";
            System.out.println("Rs.200 per person");
            cost = 200;
            System.out.println("There are 50 seats in total. 'x' represent the taken seats and 'o' represnts the available seats.\n");
            showSeats(40);
            confirmation(200);
            break;
            
            default :
            System.out.println("Enter the correct one next time.. Time RunOut!. Try again!! :( :(");
            break;
            
        }
    }
    
    public void  confirmation(int cost) {
        do{
            System.out.println("Enter the number of seats to be booked.\n If you are sure then type '1'for 'yes' or '2' for no after entering the choice. \n");
            int seatBook = in.nextInt();
            int confirm = in.nextInt();
            if( confirm == 1) {
                PaymentMethod(seatBook, cost);
                break;
            } else {
                System.out.println("Reverted to the previous menu. \n");
            }
        } while(true);
    }
    
    public void PaymentMethod(int seats, int price) {
        int totalCost = seats * price + 10;
        do{
            System.out.println("Below are the payment method choices.\n Enter the corresponding numbers.");
            System.out.println("If you are sure then type '1'for 'yes' or '2' for no after entering the choice. \n");
            System.out.println("1.Card");
            System.out.println("2.Mobile Wallet.");
            System.out.println("3.Cash");
            int ch = in.nextInt();
            int confirm = in.nextInt();
            if(confirm==1) {
                switch(ch) {
                    case 1 : 
                    System.out.println("Please Enter Your Card Company and the Name of the card User for extra Security:");
                    String company = in.nextLine();
                    String cardUser = in.nextLine();
                    System.out.println("Enter Your card number : ");
                    String cardNumber = in.nextLine();
                    System.out.println();
                    System.out.println("An total amount of " + totalCost +" will be debited from the account for " + seats +" seats (extra Rs.10 for processing fee.).");
                    System.out.println("Done!!!! YOur seats have been booked");
                    
                    bill( cost, seats, time,  "Card", totalCost  );
                    break;
                    
                    case 2 : 
                    System.out.println("Please Enter your e-wallet company name : ");
                    String wallet = in.nextLine();
                    System.out.println();
                    System.out.println("Checking....");
                    System.out.println("Checking....");
                    System.out.println("Checking....");
                    System.out.println("Checking..../n /n");
                    System.out.println("We Got Relevent information about you !");
                    System.out.println("An total amount of " + totalCost +" will be debited from the account for " + seats +" seats (extra Rs.10 for processing fee.).");
                    System.out.println("Done!!!! YOur seats have been booked");
                    
                    bill( cost, seats, time,  "e-wallet", totalCost  );
                    break;
                    
                    case 3 : 
                    
                    System.out.println("Pay the total amount of " + totalCost+ " to the cashier.");
                    System.out.println("Done!!!! YOur seats have been booked");
                    bill( cost, seats, time,  "cash", totalCost  );
                    break;
                    
                    default : 
                    System.out.println("Enter the correct one next time.. Time RunOut!. Try again!! :( :(");
                    break;
                    
                    
                    
                }break;
                
            } else {
                System.out.println("Reverted to the previous menu. \n");
            }
        }while(true);
        
        
        
    }
    
    public void bill( int cost, int seats, String  time, String payment, int total ) {
        
        System.out.println("**********************************************");
        System.out.println("Film : Joker");
        System.out.println("Per Person Rs." + cost);
        System.out.println("Seats Booked : " + seats);
        System.out.println("Time : " + time);
        System.out.println(" Payment Method : " + payment );
        System.out.println("Processing cost Rs." + 10);
        System.out.println("TOTAL: " + total);
        
    }
    
    public void showSeats(int taken) {
        System.out.println("          #######################################################");
        System.out.println("                          ALL EYES ON THIS SIDE!                 \n");
        int seats,  available, i, k;

        seats = 50;
        
        available = seats - taken;
        i = 0;
        k = 0;
        while (i <= taken) {
            i++;
            for(int j=65 ; j<= i; j++) {
            System.out.print((char)j);
            }
            System.out.print("\t X");
            if (i % 8 == 0) {
                System.out.println();
            }
        }

        while (k <= available) {
            k++;
            System.out.print("\t O");
            if ((k+taken+1) % 8 == 0) {
                System.out.println();
            }
        }
        System.out.println("\n");
    }
    
}


class Gemini_Man  {
    static Scanner in = new Scanner(System.in);
    String  timing[] = {"12:05 PM", "5:00 PM", "8:00 PM"};
    int  price[] = {120 , 140, 200};
    int cost;
    String time;
    public void aboutFilm() {
        System.out.println();
        System.out.println("An over-the-hill hitman faces off against a younger clone of himself. ");
    }
    
    public void timings() {
        System.out.println("Select the time which suits your schedule.");
        for(int i=0 ; i < timing.length; i++) {
            System.out.println(" "+i+". " + timing[i] + " -- Rs." + price[i]);
        }
    }
    
    public void chooseTiming() {
        System.out.println("Enter the number corresponding your choice : ");
        int ch = in.nextInt();
        
        switch(ch) {
            case  0: 
             time = "12:05 PM";
            System.out.println("Rs.120 per person");
            cost = 120;
            System.out.println("There are 50 seats in total. 'x' represent the taken seats and 'o' represnts the available seats.\n");
            showSeats(20);
            confirmation(120);
            break;
            
            case 1 : 
            time = "5:00 PM";
            System.out.println("Rs.140 per person");
            cost = 140;
            System.out.println("There are 50 seats in total. 'x' represent the taken seats and 'o' represnts the available seats.\n");
            showSeats(28);
            confirmation(140);
            break;
            
            case 2 : 
            time = "8:00 PM";
            System.out.println("Rs.200 per person");
            cost = 200;
            System.out.println("There are 50 seats in total. 'x' represent the taken seats and 'o' represnts the available seats.\n");
            showSeats(41);
            confirmation(200);
            break;
            
            default :
            System.out.println("Enter the correct one next time.. Time RunOut!. Try again!! :( :(");
            break;
            
        }
    }
    
    public void  confirmation(int cost) {
        do{
            System.out.println("Enter the number of seats to be booked.\n If you are sure then type '1'for 'yes' or '2' for no after entering the choice. \n");
            int seatBook = in.nextInt();
            int confirm = in.nextInt();
            if( confirm == 1) {
                PaymentMethod(seatBook, cost);
                break;
            } else {
                System.out.println("Reverted to the previous menu. \n");
            }
        } while(true);
    }
    
    public void PaymentMethod(int seats, int price) {
        int totalCost = seats * price + 10;
        do{
            System.out.println("Below are the payment method choices.\n Enter the corresponding numbers.");
            System.out.println("If you are sure then type '1'for 'yes' or '2' for no after entering the choice. \n");
            System.out.println("1.Card");
            System.out.println("2.Mobile Wallet.");
            System.out.println("3.Cash");
            int ch = in.nextInt();
            int confirm = in.nextInt();
            if(confirm==1) {
                switch(ch) {
                    case 1 : 
                    System.out.println("Please Enter Your Card Company and the Name of the card User for extra Security:");
                    String company = in.nextLine();
                    String cardUser = in.nextLine();
                    System.out.println("Enter Your card number : ");
                    String cardNumber = in.nextLine();
                    System.out.println();
                    System.out.println("An total amount of " + totalCost +" will be debited from the account for " + seats +" seats (extra Rs.10 for processing fee.).");
                    System.out.println("Done!!!! YOur seats have been booked");
                    
                    bill( cost, seats, time,  "Card", totalCost  );
                    break;
                    
                    case 2 : 
                    System.out.println("Please Enter your e-wallet company name : ");
                    String wallet = in.nextLine();
                    System.out.println();
                    System.out.println("Checking....");
                    System.out.println("Checking....");
                    System.out.println("Checking....");
                    System.out.println("Checking..../n /n");
                    System.out.println("We Got Relevent information about you !");
                    System.out.println("An total amount of " + totalCost +" will be debited from the account for " + seats +" seats (extra Rs.10 for processing fee.).");
                    System.out.println("Done!!!! YOur seats have been booked");
                    
                    bill( cost, seats, time,  "e-wallet", totalCost  );
                    break;
                    
                    case 3 : 
                    
                    System.out.println("Pay the total amount of " + totalCost+ " to the cashier.");
                    System.out.println("Done!!!! YOur seats have been booked");
                    bill( cost, seats, time,  "cash", totalCost  );
                    break;
                    
                    default : 
                    System.out.println("Enter the correct one next time.. Time RunOut!. Try again!! :( :(");
                    break;
                    
                    
                    
                }break;
                
            } else {
                System.out.println("Reverted to the previous menu. \n");
            }
        }while(true);
        
        
        
    }
    
    public void bill( int cost, int seats, String  time, String payment, int total ) {
        
        System.out.println("**********************************************");
        System.out.println("Film : Gemini Man");
        System.out.println("Per Person Rs." + cost);
        System.out.println("Seats Booked : " + seats);
        System.out.println("Time : " + time);
        System.out.println(" Payment Method : " + payment );
        System.out.println("Processing cost Rs." + 10);
        System.out.println("TOTAL: " + total);
        
    }
    
    public void showSeats(int taken) {
        System.out.println("          #######################################################");
        System.out.println("                          ALL EYES ON THIS SIDE!                 \n");
        int seats,  available, i, k;

        seats = 50;
        
        available = seats - taken;
        i = 0;
        k = 0;
        while (i <= taken) {
            i++;
            for(int j=65 ; j<= i; j++) {
            System.out.print((char)j);
            }
            System.out.print("\t X");
            if (i % 8 == 0) {
                System.out.println();
            }
        }

        while (k <= available) {
            k++;
            System.out.print("\t O");
            if ((k+taken+1) % 8 == 0) {
                System.out.println();
            }
        }
        System.out.println("\n");
    }
    
}

class Shutter_Island  {
    static Scanner in = new Scanner(System.in);
    String  timing[] = {"9:05 AM", "1:00 PM", "7:00 PM"};
    int  price[] = {120 , 140, 200};
    int cost;
    String time;
    public void aboutFilm() {
        System.out.println();
        System.out.println("In 1954, a U.S. Marshal investigates the disappearance of a murderer who escaped from a hospital for the criminally insane. ");
    }
    
    public void timings() {
        System.out.println("Select the time which suits your schedule.");
        for(int i=0 ; i < timing.length; i++) {
            System.out.println(" "+i+". " + timing[i] + " -- Rs." + price[i]);
        }
    }
    
    public void chooseTiming() {
        System.out.println("Enter the number corresponding your choice : ");
        int ch = in.nextInt();
        
        switch(ch) {
            case  0: 
             time = "9:05 AM";
            System.out.println("Rs.120 per person");
            cost = 120;
            System.out.println("There are 50 seats in total. 'x' represent the taken seats and 'o' represnts the available seats.\n");
            showSeats(31);
            confirmation(120);
            break;
            
            case 1 : 
            time = "1:00 PM";
            System.out.println("Rs.140 per person");
            cost = 140;
            System.out.println("There are 50 seats in total. 'x' represent the taken seats and 'o' represnts the available seats.\n");
            showSeats(45);
            confirmation(140);
            break;
            
            case 2 : 
            time = "7:00 PM";
            System.out.println("Rs.200 per person");
            cost = 200;
            System.out.println("There are 50 seats in total. 'x' represent the taken seats and 'o' represnts the available seats.\n");
            showSeats(42);
            confirmation(200);
            break;
            
            default :
            System.out.println("Enter the correct one next time.. Time RunOut!. Try again!! :( :(");
            break;
            
        }
    }
    
    public void  confirmation(int cost) {
        do{
            System.out.println("Enter the number of seats to be booked.\n If you are sure then type '1'for 'yes' or '2' for no after entering the choice. \n");
            int seatBook = in.nextInt();
            int confirm = in.nextInt();
            if( confirm == 1) {
                PaymentMethod(seatBook, cost);
                break;
            } else {
                System.out.println("Reverted to the previous menu. \n");
            }
        } while(true);
    }
    
    public void PaymentMethod(int seats, int price) {
        int totalCost = seats * price + 10;
        do{
            System.out.println("Below are the payment method choices.\n Enter the corresponding numbers.");
            System.out.println("If you are sure then type '1'for 'yes' or '2' for no after entering the choice. \n");
            System.out.println("1.Card");
            System.out.println("2.Mobile Wallet.");
            System.out.println("3.Cash");
            int ch = in.nextInt();
            int confirm = in.nextInt();
            if(confirm==1) {
                switch(ch) {
                    case 1 : 
                    System.out.println("Please Enter Your Card Company and the Name of the card User for extra Security:");
                    String company = in.nextLine();
                    String cardUser = in.nextLine();
                    System.out.println("Enter Your card number : ");
                    String cardNumber = in.nextLine();
                    System.out.println();
                    System.out.println("An total amount of " + totalCost +" will be debited from the account for " + seats +" seats (extra Rs.10 for processing fee.).");
                    System.out.println("Done!!!! YOur seats have been booked");
                    
                    bill( cost, seats, time,  "Card", totalCost  );
                    break;
                    
                    case 2 : 
                    System.out.println("Please Enter your e-wallet company name : ");
                    String wallet = in.nextLine();
                    System.out.println();
                    System.out.println("Checking....");
                    System.out.println("Checking....");
                    System.out.println("Checking....");
                    System.out.println("Checking..../n /n");
                    System.out.println("We Got Relevent information about you !");
                    System.out.println("An total amount of " + totalCost +" will be debited from the account for " + seats +" seats (extra Rs.10 for processing fee.).");
                    System.out.println("Done!!!! YOur seats have been booked");
                    
                    bill( cost, seats, time,  "e-wallet", totalCost  );
                    break;
                    
                    case 3 : 
                    
                    System.out.println("Pay the total amount of " + totalCost+ "to the cashier.");
                    System.out.println("Done!!!! YOur seats have been booked");
                    bill( cost, seats, time,  "cash", totalCost  );
                    break;
                    
                    default : 
                    System.out.println("Enter the correct one next time.. Time RunOut!. Try again!! :( :(");
                    break;
                    
                    
                    
                }break;
                
            } else {
                System.out.println("Reverted to the previous menu. \n");
            }
        }while(true);
        
        
        
    }
    
    public void bill( int cost, int seats, String  time, String payment, int total ) {
        
        System.out.println("**********************************************");
        System.out.println("Film : Shutter Island");
        System.out.println("Per Person Rs." + cost);
        System.out.println("Seats Booked : " + seats);
        System.out.println("Time : " + time);
        System.out.println(" Payment Method : " + payment );
        System.out.println("Processing cost Rs." + 10);
        System.out.println("TOTAL: " + total);
        
    }
    
    public void showSeats(int taken) {
        System.out.println("          #######################################################");
        System.out.println("                          ALL EYES ON THIS SIDE!                 \n");
        int seats,  available, i, k;

        seats = 50;
        
        available = seats - taken;
        i = 0;
        k = 0;
        while (i <= taken) {
            i++;
            for(int j=65 ; j<= i; j++) {
            System.out.print((char)j);
            }
            System.out.print("\t X");
            if (i % 8 == 0) {
                System.out.println();
            }
        }

        while (k <= available) {
            k++;
            System.out.print("\t O");
            if ((k+taken+1) % 8 == 0) {
                System.out.println();
            }
        }
        System.out.println("\n");
    }
    
}

class The_Purge_Election  {
    static Scanner in = new Scanner(System.in);
    String  timing[] = {"12:05 PM", "5:00 PM", "8:00 PM"};
    int  price[] = {120 , 140, 200};
    int cost;
    String time;
    public void aboutFilm() {
        System.out.println();
        System.out.println("Former Police Sergeant Barnes becomes head of security for Senator Charlie Roan,"+
         "a Presidential candidate targeted for death on Purge night due to her vow to eliminate the Purge.  ");
    }
    
    public void timings() {
        System.out.println("Select the time which suits your schedule.");
        for(int i=0 ; i < timing.length; i++) {
            System.out.println(" "+i+". " + timing[i] + " -- Rs." + price[i]);
        }
    }
    
    public void chooseTiming() {
        System.out.println("Enter the number corresponding your choice : ");
        int ch = in.nextInt();
        
        switch(ch) {
            case  0: 
             time = "12:05 PM";
            System.out.println("Rs.120 per person");
            cost = 120;
            System.out.println("There are 50 seats in total. 'x' represent the taken seats and 'o' represnts the available seats.\n");
            showSeats(40);
            confirmation(120);
            break;
            
            case 1 : 
            time = "5:00 PM";
            System.out.println("Rs.140 per person");
            cost = 140;
            System.out.println("There are 50 seats in total. 'x' represent the taken seats and 'o' represnts the available seats.\n");
            showSeats(12);
            confirmation(140);
            break;
            
            case 2 : 
            time = "8:00 PM";
            System.out.println("Rs.200 per person");
            cost = 200;
            System.out.println("There are 50 seats in total. 'x' represent the taken seats and 'o' represnts the available seats.\n");
            showSeats(10);
            confirmation(200);
            break;
            
            default :
            System.out.println("Enter the correct one next time.. Time RunOut!. Try again!! :( :(");
            break;
            
        }
    }
    
    public void  confirmation(int cost) {
        do{
            System.out.println("Enter the number of seats to be booked.\n If you are sure then type '1'for 'yes' or '2' for no after entering the choice. \n");
            int seatBook = in.nextInt();
            int confirm = in.nextInt();
            if( confirm == 1) {
                PaymentMethod(seatBook, cost);
                break;
            } else {
                System.out.println("Reverted to the previous menu. \n");
            }
        } while(true);
    }
    
    public void PaymentMethod(int seats, int price) {
        int totalCost = seats * price + 10;
        do{
            System.out.println("Below are the payment method choices.\n Enter the corresponding numbers.");
            System.out.println("If you are sure then type '1'for 'yes' or '2' for no after entering the choice. \n");
            System.out.println("1.Card");
            System.out.println("2.Mobile Wallet.");
            System.out.println("3.Cash");
            int ch = in.nextInt();
            int confirm = in.nextInt();
            if(confirm==1) {
                switch(ch) {
                    case 1 : 
                    System.out.println("Please Enter Your Card Company and the Name of the card User for extra Security:");
                    String company = in.nextLine();
                    String cardUser = in.nextLine();
                    System.out.println("Enter Your card number : ");
                    String cardNumber = in.nextLine();
                    System.out.println();
                    System.out.println("An total amount of " + totalCost +" will be debited from the account for " + seats +" seats (extra Rs.10 for processing fee.).");
                    System.out.println("Done!!!! YOur seats have been booked");
                    
                    bill( cost, seats, time,  "Card", totalCost  );
                    break;
                    
                    case 2 : 
                    System.out.println("Please Enter your e-wallet company name : ");
                    String wallet = in.nextLine();
                    System.out.println();
                    System.out.println("Checking....");
                    System.out.println("Checking....");
                    System.out.println("Checking....");
                    System.out.println("Checking..../n /n");
                    System.out.println("We Got Relevent information about you !");
                    System.out.println("An total amount of " + totalCost +" will be debited from the account for " + seats +" seats (extra Rs.10 for processing fee.).");
                    System.out.println("Done!!!! YOur seats have been booked");
                    
                    bill( cost, seats, time,  "e-wallet", totalCost  );
                    break;
                    
                    case 3 : 
                    
                    System.out.println("Pay the total amount of " + totalCost+ " to the cashier.");
                    System.out.println("Done!!!! YOur seats have been booked");
                    bill( cost, seats, time,  "cash", totalCost  );
                    break;
                    
                    default : 
                    System.out.println("Enter the correct one next time.. Time RunOut!. Try again!! :( :(");
                    break;
                    
                    
                    
                }break;
                
            } else {
                System.out.println("Reverted to the previous menu. \n");
            }
        }while(true);
        
        
        
    }
    
    public void bill( int cost, int seats, String  time, String payment, int total ) {
        
        System.out.println("**********************************************");
        System.out.println("Film : The Purge Election");
        System.out.println("Per Person Rs." + cost);
        System.out.println("Seats Booked : " + seats);
        System.out.println("Time : " + time);
        System.out.println(" Payment Method : " + payment );
        System.out.println("Processing cost Rs." + 10);
        System.out.println("TOTAL: " + total);
        
    }
    
    public void showSeats(int taken) {
        System.out.println("          #######################################################");
        System.out.println("                          ALL EYES ON THIS SIDE!                 \n");
        int seats,  available, i, k;

        seats = 50;
        
        available = seats - taken;
        i = 0;
        k = 0;
        while (i <= taken) {
            i++;
            for(int j=65 ; j<= i; j++) {
            System.out.print((char)j);
            }
            System.out.print("\t X");
            if (i % 8 == 0) {
                System.out.println();
            }
        }

        while (k <= available) {
            k++;
            System.out.print("\t O");
            if ((k+taken+1) % 8 == 0) {
                System.out.println();
            }
        }
        System.out.println("\n");
    }
    
}

class Gangs_of_Wasseypur  {
    static Scanner in = new Scanner(System.in);
    String  timing[] = {"9:05 AM", "1:00 PM", "7:00 PM"};
    String  timing2[] = {"12:05 PM", "5:00 PM", "8:00 PM"};
    int  price[] = {120 , 140, 200};
    int cost;
    String time;
    public void aboutFilm() {
        System.out.println();
        System.out.println("A clash between Sultan and Shahid Khan leads to the expulsion of Khan from Wasseypur"+
        ", and ignites a deadly blood feud spanning three generations. ");
    }
    
    public void timings() {
        System.out.println("Select the time which suits your schedule.");
        for(int i=0 ; i < timing.length; i++) {
            System.out.println(" "+i+". " + timing[i] + " -- Rs." + price[i]);
        }
    }
    
    public void chooseTiming() {
        System.out.println("Enter the number corresponding your choice : ");
        int ch = in.nextInt();
        
        switch(ch) {
            case  0: 
             time = "9:05 AM";
            System.out.println("Rs.120 per person");
            cost = 120;
            System.out.println("There are 50 seats in total. 'x' represent the taken seats and 'o' represnts the available seats.\n");
            showSeats(38);
            confirmation(120);
            break;
            
            case 1 : 
            time = "1:00 PM";
            System.out.println("Rs.140 per person");
            cost = 140;
            System.out.println("There are 50 seats in total. 'x' represent the taken seats and 'o' represnts the available seats.\n");
            showSeats(40);
            confirmation(140);
            break;
            
            case 2 : 
            time = "7:00 PM";
            System.out.println("Rs.200 per person");
            cost = 200;
            System.out.println("There are 50 seats in total. 'x' represent the taken seats and 'o' represnts the available seats.\n");
            showSeats(40);
            confirmation(200);
            break;
            
            default :
            System.out.println("Enter the correct one next time.. Time RunOut!. Try again!! :( :(");
            break;
            
        }
    }
    
    public void  confirmation(int cost) {
        do{
            System.out.println("Enter the number of seats to be booked.\n If you are sure then type '1'for 'yes' or '2' for no after entering the choice. \n");
            int seatBook = in.nextInt();
            int confirm = in.nextInt();
            if( confirm == 1) {
                PaymentMethod(seatBook, cost);
                break;
            } else {
                System.out.println("Reverted to the previous menu. \n");
            }
        } while(true);
    }
    
    public void PaymentMethod(int seats, int price) {
        int totalCost = seats * price + 10;
        do{
            System.out.println("Below are the payment method choices.\n Enter the corresponding numbers.");
            System.out.println("If you are sure then type '1'for 'yes' or '2' for no after entering the choice. \n");
            System.out.println("1.Card");
            System.out.println("2.Mobile Wallet.");
            System.out.println("3.Cash");
            int ch = in.nextInt();
            int confirm = in.nextInt();
            if(confirm==1) {
                switch(ch) {
                    case 1 : 
                    System.out.println("Please Enter Your Card Company and the Name of the card User for extra Security:");
                    String company = in.nextLine();
                    String cardUser = in.nextLine();
                    System.out.println("Enter Your card number : ");
                    String cardNumber = in.nextLine();
                    System.out.println();
                    System.out.println("An total amount of " + totalCost +" will be debited from the account for " + seats +" seats (extra Rs.10 for processing fee.).");
                    System.out.println("Done!!!! YOur seats have been booked");
                    
                    bill( cost, seats, time,  "Card", totalCost  );
                    break;
                    
                    case 2 : 
                    System.out.println("Please Enter your e-wallet company name : ");
                    String wallet = in.nextLine();
                    System.out.println();
                    System.out.println("Checking....");
                    System.out.println("Checking....");
                    System.out.println("Checking....");
                    System.out.println("Checking..../n /n");
                    System.out.println("We Got Relevent information about you !");
                    System.out.println("An total amount of " + totalCost +" will be debited from the account for " + seats +" seats (extra Rs.10 for processing fee.).");
                    System.out.println("Done!!!! YOur seats have been booked");
                    
                    bill( cost, seats, time,  "e-wallet", totalCost  );
                    break;
                    
                    case 3 : 
                    
                    System.out.println("Pay the total amount of " + totalCost+ " to the cashier.");
                    System.out.println("Done!!!! Your seats have been booked");
                    bill( cost, seats, time,  "cash", totalCost  );
                    break;
                    
                    default : 
                    System.out.println("Enter the correct one next time.. Time RunOut!. Try again!! :( :(");
                    break;
                    
                    
                    
                }break;
            } else {
                System.out.println("Reverted to the previous menu. \n");
            }
        }while(true);
        
        
        
    }
    
    public void bill( int cost, int seats, String  time, String payment, int total ) {
        
        System.out.println("**********************************************");
        System.out.println("Film : Gangs of Wasseypur");
        System.out.println("Per Person Rs." + cost);
        System.out.println("Seats Booked : " + seats);
        System.out.println("Time : " + time);
        System.out.println(" Payment Method : " + payment );
        System.out.println("Processing cost Rs." + 10);
        System.out.println("TOTAL: " + total);
        
    }
    
    public void showSeats(int taken) {
        System.out.println("          #######################################################");
        System.out.println("                          ALL EYES ON THIS SIDE!                 \n");
        int seats,  available, i, k;

        seats = 50;
        
        available = seats - taken;
        i = 0;
        k = 0;
        while (i <= taken) {
            i++;
            for(int j=65 ; j<= i; j++) {
            System.out.print((char)j);
            }
            System.out.print("\t X");
            if (i % 8 == 0) {
                System.out.println();
            }
        }

        while (k <= available) {
            k++;
            System.out.print("\t O");
            if ((k+taken+1) % 8 == 0) {
                System.out.println();
            }
        }
        System.out.println("\n");
    }
    
}



//under age
class End_Game  {
    static Scanner in = new Scanner(System.in);
    String  timing[] = {"9:05 AM", "1:00 PM", "7:00 PM"};
    int  price[] = {120 , 140, 200};
    int cost;
    String time;
    public void aboutFilm() {
        System.out.println();
        System.out.println("After the devastating events of Avengers: Infinity War (2018), the universe is in ruins. With the help of remaining allies,"+
        "the Avengers assemble once more in order to reverse Thanos' actions and restore balance to the universe. ");
    }
    
    public void timings() {
        System.out.println("Select the time which suits your schedule.");
        for(int i=0 ; i < timing.length; i++) {
            System.out.println(" "+i+". " + timing[i] + " -- Rs." + price[i]);
        }
    }
    
    public void chooseTiming() {
        System.out.println("Enter the number corresponding your choice : ");
        int ch = in.nextInt();
        
        switch(ch) {
            case  0: 
             time = "9:05 AM";
            System.out.println("Rs.120 per person");
            cost = 120;
            System.out.println("There are 50 seats in total. 'x' represent the taken seats and 'o' represnts the available seats.\n");
            showSeats(45);
            confirmation(120);
            break;
            
            case 1 : 
            time = "1:00 PM";
            System.out.println("Rs.140 per person");
            cost = 140;
            System.out.println("There are 50 seats in total. 'x' represent the taken seats and 'o' represnts the available seats.\n");
            showSeats(47);
            confirmation(140);
            break;
            
            case 2 : 
            time = "7:00 PM";
            System.out.println("Rs.200 per person");
            cost = 200;
            System.out.println("There are 50 seats in total. 'x' represent the taken seats and 'o' represnts the available seats.\n");
            showSeats(39);
            confirmation(200);
            break;
            
            default :
            System.out.println("Enter the correct one next time.. Time RunOut!. Try again!! :( :(");
            break;
            
        }
    }
    
    public void  confirmation(int cost) {
        do{
            System.out.println("Enter the number of seats to be booked.\n If you are sure then type '1'for 'yes' or '2' for no after entering the choice. \n");
            int seatBook = in.nextInt();
            int confirm = in.nextInt();
            if( confirm == 1) {
                PaymentMethod(seatBook, cost);
                break;
            } else {
                System.out.println("Reverted to the previous menu. \n");
            }
        } while(true);
    }
    
    public void PaymentMethod(int seats, int price) {
        int totalCost = seats * price + 10;
        do{
            System.out.println("Below are the payment method choices.\n Enter the corresponding numbers.");
            System.out.println("If you are sure then type '1'for 'yes' or '2' for no after entering the choice. \n");
            System.out.println("1.Card");
            System.out.println("2.Mobile Wallet.");
            System.out.println("3.Cash");
            int ch = in.nextInt();
            int confirm = in.nextInt();
            if(confirm==1) {
                switch(ch) {
                    case 1 : 
                    System.out.println("Please Enter Your Card Company and the Name of the card User for extra Security:");
                    String company = in.nextLine();
                    String cardUser = in.nextLine();
                    System.out.println("Enter Your card number : ");
                    String cardNumber = in.nextLine();
                    System.out.println();
                    System.out.println("An total amount of " + totalCost +" will be debited from the account for " + seats +" seats (extra Rs.10 for processing fee.).");
                    System.out.println("Done!!!! YOur seats have been booked");
                    
                    bill( cost, seats, time,  "Card", totalCost  );
                    break;
                    
                    case 2 : 
                    System.out.println("Please Enter your e-wallet company name : ");
                    String wallet = in.nextLine();
                    System.out.println();
                    System.out.println("Checking....");
                    System.out.println("Checking....");
                    System.out.println("Checking....");
                    System.out.println("Checking..../n /n");
                    System.out.println("We Got Relevent information about you !");
                    System.out.println("An total amount of " + totalCost +" will be debited from the account for " + seats +" seats (extra Rs.10 for processing fee.).");
                    System.out.println("Done!!!! YOur seats have been booked");
                    
                    bill( cost, seats, time,  "e-wallet", totalCost  );
                    break;
                    
                    case 3 : 
                    
                    System.out.println("Pay the total amount of " + totalCost+ " to the cashier.");
                    System.out.println("Done!!!! YOur seats have been booked");
                    bill( cost, seats, time,  "cash", totalCost  );
                    break;
                    
                    default : 
                    System.out.println("Enter the correct one next time.. Time RunOut!. Try again!! :( :(");
                    break;
                    
                    
                    
                }break;
                
            } else {
                System.out.println("Reverted to the previous menu. \n");
            }
        }while(true);
        
        
        
    }
    
    public void bill( int cost, int seats, String  time, String payment, int total ) {
        
        System.out.println("**********************************************");
        System.out.println("Film : Avenger: Endgame");
        System.out.println("Per Person Rs." + cost);
        System.out.println("Seats Booked : " + seats);
        System.out.println("Time : " + time);
        System.out.println(" Payment Method : " + payment );
        System.out.println("Processing cost Rs." + 10);
        System.out.println("TOTAL: " + total);
        
    }
    
    public void showSeats(int taken) {
        System.out.println("          #######################################################");
        System.out.println("                          ALL EYES ON THIS SIDE!                 \n");
        int seats,  available, i, k;

        seats = 50;
        
        available = seats - taken;
        i = 0;
        k = 0;
        while (i <= taken) {
            i++;
            for(int j=65 ; j<= i; j++) {
            System.out.print((char)j);
            }
            System.out.print("\t X");
            if (i % 8 == 0) {
                System.out.println();
            }
        }

        while (k <= available) {
            k++;
            System.out.print("\t O");
            if ((k+taken+1) % 8 == 0) {
                System.out.println();
            }
        }
        System.out.println("\n");
    }
    
}


class Spiderman  {
    static Scanner in = new Scanner(System.in);
    String  timing[] = {"12:05 PM", "5:00 PM", "8:00 PM"};
    int  price[] = {120 , 140, 200};
    int cost;
    String time;
    public void aboutFilm() {
        System.out.println();
        System.out.println("Following the events of Avengers: Endgame (2019), Spider-Man must step up to take on new threats in a world that has"+
        "changed forever.  ");
    }
    
    public void timings() {
        System.out.println("Select the time which suits your schedule.");
        for(int i=0 ; i < timing.length; i++) {
            System.out.println(" "+i+". " + timing[i] + " -- Rs." + price[i]);
        }
    }
    
    public void chooseTiming() {
        System.out.println("Enter the number corresponding your choice : ");
        int ch = in.nextInt();
        
        switch(ch) {
            case  0: 
             time = "12:05 PM";
            System.out.println("Rs.120 per person");
            cost = 120;
            System.out.println("There are 50 seats in total. 'x' represent the taken seats and 'o' represnts the available seats.\n");
            showSeats(40);
            confirmation(120);
            break;
            
            case 1 : 
            time = "5:00 PM";
            System.out.println("Rs.140 per person");
            cost = 140;
            System.out.println("There are 50 seats in total. 'x' represent the taken seats and 'o' represnts the available seats.\n");
            showSeats(31);
            confirmation(140);
            break;
            
            case 2 : 
            time = "8:00 PM";
            System.out.println("Rs.200 per person");
            cost = 200;
            System.out.println("There are 50 seats in total. 'x' represent the taken seats and 'o' represnts the available seats.\n");
            showSeats(41);
            confirmation(200);
            break;
            
            default :
            System.out.println("Enter the correct one next time.. Time RunOut!. Try again!! :( :(");
            break;
            
        }
    }
    
    public void  confirmation(int cost) {
        do{
            System.out.println("Enter the number of seats to be booked.\n If you are sure then type '1'for 'yes' or '2' for no after entering the choice. \n");
            int seatBook = in.nextInt();
            int confirm = in.nextInt();
            if( confirm == 1) {
                PaymentMethod(seatBook, cost);
                break;
            } else {
                System.out.println("Reverted to the previous menu. \n");
            }
        } while(true);
    }
    
    public void PaymentMethod(int seats, int price) {
        int totalCost = seats * price + 10;
        do{
            System.out.println("Below are the payment method choices.\n Enter the corresponding numbers.");
            System.out.println("If you are sure then type '1'for 'yes' or '2' for no after entering the choice. \n");
            System.out.println("1.Card");
            System.out.println("2.Mobile Wallet.");
            System.out.println("3.Cash");
            int ch = in.nextInt();
            int confirm = in.nextInt();
            if(confirm==1) {
                switch(ch) {
                    case 1 : 
                    System.out.println("Please Enter Your Card Company and the Name of the card User for extra Security:");
                    String company = in.nextLine();
                    String cardUser = in.nextLine();
                    System.out.println("Enter Your card number : ");
                    String cardNumber = in.nextLine();
                    System.out.println();
                    System.out.println("An total amount of " + totalCost +" will be debited from the account for " + seats +" seats (extra Rs.10 for processing fee.).");
                    System.out.println("Done!!!! YOur seats have been booked");
                    
                    bill( cost, seats, time,  "Card", totalCost  );
                    break;
                    
                    case 2 : 
                    System.out.println("Please Enter your e-wallet company name : ");
                    String wallet = in.nextLine();
                    System.out.println();
                    System.out.println("Checking....");
                    System.out.println("Checking....");
                    System.out.println("Checking....");
                    System.out.println("Checking..../n /n");
                    System.out.println("We Got Relevent information about you !");
                    System.out.println("An total amount of " + totalCost +" will be debited from the account for " + seats +" seats (extra Rs.10 for processing fee.).");
                    System.out.println("Done!!!! YOur seats have been booked");
                    
                    bill( cost, seats, time,  "e-wallet", totalCost  );
                    break;
                    
                    case 3 : 
                    
                    System.out.println("Pay the total amount of " + totalCost+ " to the cashier.");
                    System.out.println("Done!!!! YOur seats have been booked");
                    bill( cost, seats, time,  "cash", totalCost  );
                    break;
                    
                    default : 
                    System.out.println("Enter the correct one next time.. Time RunOut!. Try again!! :( :(");
                    break;
                    
                    
                    
                }break;
                
            } else {
                System.out.println("Reverted to the previous menu. \n");
            }
        }while(true);
        
        
        
    }
    
    public void bill( int cost, int seats, String  time, String payment, int total ) {
        
        System.out.println("**********************************************");
        System.out.println("Film : Spiderman : Far From Home");
        System.out.println("Per Person Rs." + cost);
        System.out.println("Seats Booked : " + seats);
        System.out.println("Time : " + time);
        System.out.println(" Payment Method : " + payment );
        System.out.println("Processing cost Rs." + 10);
        System.out.println("TOTAL: " + total);
        
    }
    
    public void showSeats(int taken) {
        System.out.println("          #######################################################");
        System.out.println("                          ALL EYES ON THIS SIDE!                 \n");
        int seats,  available, i, k;

        seats = 50;
        
        available = seats - taken;
        i = 0;
        k = 0;
        while (i <= taken) {
            i++;
            for(int j=65 ; j<= i; j++) {
            System.out.print((char)j);
            }
            System.out.print("\t X");
            if (i % 8 == 0) {
                System.out.println();
            }
        }

        while (k <= available) {
            k++;
            System.out.print("\t O");
            if ((k+taken+1) % 8 == 0) {
                System.out.println();
            }
        }
        System.out.println("\n");
    }
    
}


class War  {
    static Scanner in = new Scanner(System.in);
    String  timing[] = {"9:05 AM", "1:00 PM", "7:00 PM"};
    int  price[] = {120 , 140, 200};
    int cost;
    String time;
    public void aboutFilm() {
        System.out.println();
        System.out.println("An Indian soldier is assigned a mission to eliminate his former mentor, who has gone rogue.  ");
    }
    
    public void timings() {
        System.out.println("Select the time which suits your schedule.");
        for(int i=0 ; i < timing.length; i++) {
            System.out.println(" "+i+". " + timing[i] + " -- Rs." + price[i]);
        }
    }
    
    public void chooseTiming() {
        System.out.println("Enter the number corresponding your choice : ");
        int ch = in.nextInt();
        
        switch(ch) {
            case  0: 
             time = "9:05 AM";
            System.out.println("Rs.120 per person");
            cost = 120;
            System.out.println("There are 50 seats in total. 'x' represent the taken seats and 'o' represnts the available seats.\n");
            showSeats(45);
            confirmation(120);
            break;
            
            case 1 : 
            time = "1:00 PM";
            System.out.println("Rs.140 per person");
            cost = 140;
            System.out.println("There are 50 seats in total. 'x' represent the taken seats and 'o' represnts the available seats.\n");
            showSeats(41);
            confirmation(140);
            break;
            
            case 2 : 
            time = "7:00 PM";
            System.out.println("Rs.200 per person");
            cost = 200;
            System.out.println("There are 50 seats in total. 'x' represent the taken seats and 'o' represnts the available seats.\n");
            showSeats(39);
            confirmation(200);
            break;
            
            default :
            System.out.println("Enter the correct one next time.. Time RunOut!. Try again!! :( :(");
            break;
            
        }
    }
    
    public void  confirmation(int cost) {
        do{
            System.out.println("Enter the number of seats to be booked.\n If you are sure then type '1'for 'yes' or '2' for no after entering the choice. \n");
            int seatBook = in.nextInt();
            int confirm = in.nextInt();
            if( confirm == 1) {
                PaymentMethod(seatBook, cost);
                break;
            } else {
                System.out.println("Reverted to the previous menu. \n");
            }
        } while(true);
    }
    
    public void PaymentMethod(int seats, int price) {
        int totalCost = seats * price + 10;
        do{
            System.out.println("Below are the payment method choices.\n Enter the corresponding numbers.");
            System.out.println("If you are sure then type '1'for 'yes' or '2' for no after entering the choice. \n");
            System.out.println("1.Card");
            System.out.println("2.Mobile Wallet.");
            System.out.println("3.Cash");
            int ch = in.nextInt();
            int confirm = in.nextInt();
            if(confirm==1) {
                switch(ch) {
                    case 1 : 
                    System.out.println("Please Enter Your Card Company and the Name of the card User for extra Security:");
                    String company = in.nextLine();
                    String cardUser = in.nextLine();
                    System.out.println("Enter Your card number : ");
                    String cardNumber = in.nextLine();
                    System.out.println();
                    System.out.println("An total amount of " + totalCost +" will be debited from the account for " + seats +" seats (extra Rs.10 for processing fee.).");
                    System.out.println("Done!!!! YOur seats have been booked");
                    
                    bill( cost, seats, time,  "Card", totalCost  );
                    break;
                    
                    case 2 : 
                    System.out.println("Please Enter your e-wallet company name : ");
                    String wallet = in.nextLine();
                    System.out.println();
                    System.out.println("Checking....");
                    System.out.println("Checking....");
                    System.out.println("Checking....");
                    System.out.println("Checking..../n /n");
                    System.out.println("We Got Relevent information about you !");
                    System.out.println("An total amount of " + totalCost +" will be debited from the account for " + seats +" seats (extra Rs.10 for processing fee.).");
                    System.out.println("Done!!!! YOur seats have been booked");
                    
                    bill( cost, seats, time,  "e-wallet", totalCost  );
                    break;
                    
                    case 3 : 
                    
                    System.out.println("Pay the total amount of " + totalCost+ " to the cashier.");
                    System.out.println("Done!!!! YOur seats have been booked");
                    bill( cost, seats, time,  "cash", totalCost  );
                    break;
                    
                    default : 
                    System.out.println("Enter the correct one next time.. Time RunOut!. Try again!! :( :(");
                    break;
                    
                    
                    
                }break;
                
            } else {
                System.out.println("Reverted to the previous menu. \n");
            }
        }while(true);
        
        
        
    }
    
    public void bill( int cost, int seats, String  time, String payment, int total ) {
        
        System.out.println("**********************************************");
        System.out.println("Film : War");
        System.out.println("Per Person Rs." + cost);
        System.out.println("Seats Booked : " + seats);
        System.out.println("Time : " + time);
        System.out.println(" Payment Method : " + payment );
        System.out.println("Processing cost Rs." + 10);
        System.out.println("TOTAL: " + total);
        
    }
    
    public void showSeats(int taken) {
        System.out.println("          #######################################################");
        System.out.println("                          ALL EYES ON THIS SIDE!                 \n");
        int seats,  available, i, k;

        seats = 50;
        
        available = seats - taken;
        i = 0;
        k = 0;
        while (i <= taken) {
            i++;
            for(int j=65 ; j<= i; j++) {
            System.out.print((char)j);
            }
            System.out.print("\t X");
            if (i % 8 == 0) {
                System.out.println();
            }
        }

        while (k <= available) {
            k++;
            System.out.print("\t O");
            if ((k+taken+1) % 8 == 0) {
                System.out.println();
            }
        }
        System.out.println("\n");
    }
   
}


class Housefull4  {
    static Scanner in = new Scanner(System.in);
    String  timing[] = {"12:05 PM", "5:00 PM", "8:00 PM"};
    int  price[] = {120 , 140, 200};
    int cost;
    String time;
    public void aboutFilm() {
        System.out.println();
        System.out.println("A set of three brothers are due to marry a set of three sisters, until one of the brothers starts"+ 
        "to realize that they are all reincarnations from 600"+
        "years earlier and the wrong couples are about to get married. ");
    }
    
    public void timings() {
        System.out.println("Select the time which suits your schedule.");
        for(int i=0 ; i < timing.length; i++) {
            System.out.println(" "+i+". " + timing[i] + " -- Rs." + price[i]);
        }
    }
    
    public void chooseTiming() {
        System.out.println("Enter the number corresponding your choice : ");
        int ch = in.nextInt();
        
        switch(ch) {
            case  0: 
             time = "12:05 PM";
            System.out.println("Rs.120 per person");
            cost = 120;
            System.out.println("There are 50 seats in total. 'x' represent the taken seats and 'o' represnts the available seats.\n");
            showSeats(31);
            confirmation(120);
            break;
            
            case 1 : 
            time = "5:00 PM";
            System.out.println("Rs.140 per person");
            cost = 140;
            System.out.println("There are 50 seats in total. 'x' represent the taken seats and 'o' represnts the available seats.\n");
            showSeats(15);
            confirmation(140);
            break;
            
            case 2 : 
            time = "8:00 PM";
            System.out.println("Rs.200 per person");
            cost = 200;
            System.out.println("There are 50 seats in total. 'x' represent the taken seats and 'o' represnts the available seats.\n");
            showSeats(11);
            confirmation(200);
            break;
            
            default :
            System.out.println("Enter the correct one next time.. Time RunOut!. Try again!! :( :(");
            break;
            
        }
    }
    
    public void  confirmation(int cost) {
        do{
            System.out.println("Enter the number of seats to be booked.\n If you are sure then type '1'for 'yes' or '2' for no after entering the choice. \n");
            int seatBook = in.nextInt();
            int confirm = in.nextInt();
            if( confirm == 1) {
                PaymentMethod(seatBook, cost);
                break;
            } else {
                System.out.println("Reverted to the previous menu. \n");
            }
        } while(true);
    }
    
    public void PaymentMethod(int seats, int price) {
        int totalCost = seats * price + 10;
        do{
            System.out.println("Below are the payment method choices.\n Enter the corresponding numbers.");
            System.out.println("If you are sure then type '1'for 'yes' or '2' for no after entering the choice. \n");
            System.out.println("1.Card");
            System.out.println("2.Mobile Wallet.");
            System.out.println("3.Cash");
            int ch = in.nextInt();
            int confirm = in.nextInt();
            if(confirm==1) {
                switch(ch) {
                    case 1 : 
                    System.out.println("Please Enter Your Card Company and the Name of the card User for extra Security:");
                    String company = in.nextLine();
                    String cardUser = in.nextLine();
                    System.out.println("Enter Your card number : ");
                    String cardNumber = in.nextLine();
                    System.out.println();
                    System.out.println("An total amount of " + totalCost +" will be debited from the account for " + seats +" seats (extra Rs.10 for processing fee.).");
                    System.out.println("Done!!!! YOur seats have been booked");
                    
                    bill( cost, seats, time,  "Card", totalCost  );
                    break;
                    
                    case 2 : 
                    System.out.println("Please Enter your e-wallet company name : ");
                    String wallet = in.nextLine();
                    System.out.println();
                    System.out.println("Checking....");
                    System.out.println("Checking....");
                    System.out.println("Checking....");
                    System.out.println("Checking..../n /n");
                    System.out.println("We Got Relevent information about you !");
                    System.out.println("An total amount of " + totalCost +" will be debited from the account for " + seats +" seats (extra Rs.10 for processing fee.).");
                    System.out.println("Done!!!! YOur seats have been booked");
                    
                    bill( cost, seats, time,  "e-wallet", totalCost  );
                    break;
                    
                    case 3 : 
                    
                    System.out.println("Pay the total amount of " + totalCost+ " to the cashier.");
                    System.out.println("Done!!!! YOur seats have been booked");
                    bill( cost, seats, time,  "cash", totalCost  );
                    break;
                    
                    default : 
                    System.out.println("Enter the correct one next time.. Time RunOut!. Try again!! :( :(");
                    break;
                    
                    
                    
                }break;
                
            } else {
                System.out.println("Reverted to the previous menu. \n");
            }
        }while(true);
        
        
        
    }
    
    public void bill( int cost, int seats, String  time, String payment, int total ) {
        
        System.out.println("**********************************************");
        System.out.println("Film : Housefull 4");
        System.out.println("Per Person Rs." + cost);
        System.out.println("Seats Booked : " + seats);
        System.out.println("Time : " + time);
        System.out.println(" Payment Method : " + payment );
        System.out.println("Processing cost Rs." + 10);
        System.out.println("TOTAL: " + total);
        
    }
    
    public void showSeats(int taken) {
        System.out.println("          #######################################################");
        System.out.println("                          ALL EYES ON THIS SIDE!                 \n");
        int seats,  available, i, k;

        seats = 50;
        
        available = seats - taken;
        i = 0;
        k = 0;
        while (i <= taken) {
            i++;
            for(int j=65 ; j<= i; j++) {
            System.out.print((char)j);
            }
            System.out.print("\t X");
            if (i % 8 == 0) {
                System.out.println();
            }
        }

        while (k <= available) {
            k++;
            System.out.print("\t O");
            if ((k+taken+1) % 8 == 0) {
                System.out.println();
            }
        }
        System.out.println("\n");
    }
    
}


class URI  {
    static Scanner in = new Scanner(System.in);
    String  timing[] = {"9:05 AM", "1:00 PM", "7:00 PM"};
    int  price[] = {120 , 140, 200};
    int cost;
    String time;
    public void aboutFilm() {
        System.out.println();
        System.out.println("Indian army special forces execute a covert operation, avenging the killing of fellow army men at their base by a terrorist group. ");
    }
    
    public void timings() {
        System.out.println("Select the time which suits your schedule.");
        for(int i=0 ; i < timing.length; i++) {
            System.out.println(" "+i+". " + timing[i] + " -- Rs." + price[i]);
        }
    }
    
    public void chooseTiming() {
        System.out.println("Enter the number corresponding your choice : ");
        int ch = in.nextInt();
        
        switch(ch) {
            case  0: 
             time = "9:05 AM";
            System.out.println("Rs.120 per person");
            cost = 120;
            System.out.println("There are 50 seats in total. 'x' represent the taken seats and 'o' represnts the available seats.\n");
            showSeats(12);
            confirmation(120);
            break;
            
            case 1 : 
            time = "1:00 PM";
            System.out.println("Rs.140 per person");
            cost = 140;
            System.out.println("There are 50 seats in total. 'x' represent the taken seats and 'o' represnts the available seats.\n");
            showSeats(41);
            confirmation(140);
            break;
            
            case 2 : 
            time = "7:00 PM";
            System.out.println("Rs.200 per person");
            cost = 200;
            System.out.println("There are 50 seats in total. 'x' represent the taken seats and 'o' represnts the available seats.\n");
            showSeats(28);
            confirmation(200);
            break;
            
            default :
            System.out.println("Enter the correct one next time.. Time RunOut!. Try again!! :( :(");
            break;
            
        }
    }
    
    public void  confirmation(int cost) {
        do{
            System.out.println("Enter the number of seats to be booked.\n If you are sure then type '1'for 'yes' or '2' for no after entering the choice. \n");
            int seatBook = in.nextInt();
            int confirm = in.nextInt();
            if( confirm == 1) {
                PaymentMethod(seatBook, cost);
                break;
            } else {
                System.out.println("Reverted to the previous menu. \n");
            }
        } while(true);
    }
    
    public void PaymentMethod(int seats, int price) {
        int totalCost = seats * price + 10;
        do{
            System.out.println("Below are the payment method choices.\n Enter the corresponding numbers.");
            System.out.println("If you are sure then type '1'for 'yes' or '2' for no after entering the choice. \n");
            System.out.println("1.Card");
            System.out.println("2.Mobile Wallet.");
            System.out.println("3.Cash");
            int ch = in.nextInt();
            int confirm = in.nextInt();
            if(confirm==1) {
                switch(ch) {
                    case 1 : 
                    System.out.println("Please Enter Your Card Company and the Name of the card User for extra Security:");
                    String company = in.nextLine();
                    String cardUser = in.nextLine();
                    System.out.println("Enter Your card number : ");
                    String cardNumber = in.nextLine();
                    System.out.println();
                    System.out.println("An total amount of " + totalCost +" will be debited from the account for " + seats +" seats (extra Rs.10 for processing fee.).");
                    System.out.println("Done!!!! YOur seats have been booked");
                    
                    bill( cost, seats, time,  "Card", totalCost  );
                    break;
                    
                    case 2 : 
                    System.out.println("Please Enter your e-wallet company name : ");
                    String wallet = in.nextLine();
                    System.out.println();
                    System.out.println("Checking....");
                    System.out.println("Checking....");
                    System.out.println("Checking....");
                    System.out.println("Checking..../n /n");
                    System.out.println("We Got Relevent information about you !");
                    System.out.println("An total amount of " + totalCost +" will be debited from the account for " + seats +" seats (extra Rs.10 for processing fee.).");
                    System.out.println("Done!!!! YOur seats have been booked");
                    
                    bill( cost, seats, time,  "e-wallet", totalCost  );
                    break;
                    
                    case 3 : 
                    
                    System.out.println("Pay the total amount of " + totalCost+ " to the cashier.");
                    System.out.println("Done!!!! YOur seats have been booked");
                    bill( cost, seats, time,  "cash", totalCost  );
                    break;
                    
                    default : 
                    System.out.println("Enter the correct one next time.. Time RunOut!. Try again!! :( :(");
                    break;
                    
                    
                    
                }break;
                
            } else {
                System.out.println("Reverted to the previous menu. \n");
            }
        }while(true);
        
        
        
    }
    
    public void bill( int cost, int seats, String  time, String payment, int total ) {
        
        System.out.println("**********************************************");
        System.out.println("Film : URI : The Surgical Strike");
        System.out.println("Per Person Rs." + cost);
        System.out.println("Seats Booked : " + seats);
        System.out.println("Time : " + time);
        System.out.println(" Payment Method : " + payment );
        System.out.println("Processing cost Rs." + 10);
        System.out.println("TOTAL: " + total);
        
    }
    
    public void showSeats(int taken) {
        System.out.println("          #######################################################");
        System.out.println("                          ALL EYES ON THIS SIDE!                 \n");
        int seats,  available, i, k;

        seats = 50;
        
        available = seats - taken;
        i = 0;
        k = 0;
        while (i <= taken) {
            i++;
            for(int j=65 ; j<= i; j++) {
            System.out.print((char)j);
            }
            System.out.print("\t X");
            if (i % 8 == 0) {
                System.out.println();
            }
        }

        while (k <= available) {
            k++;
            System.out.print("\t O");
            if ((k+taken+1) % 8 == 0) {
                System.out.println();
            }
        }
        System.out.println("\n");
    }
   
}







