/*
* @author Aduragbemi Ogunbunmi
* Data Structures and Algorithms - CSCI 2302 - 1B
* Assignment: P-2.33: Write a Java program that simulates a system that supports the functions of an ebook reader.
 You should include methods for users of your system to “buy” new
    books, view their list of purchased books, and read their purchased books. Your
    system should use actual books, which have expired copyrights and are available
    on the Internet, to populate your set of available books for users of your system
    to “purchase” and read.
    
    import scanner
    main:
         greeting
         list options
         call methods
         switch case
         continue?
         goodbye
    buyBook: (use do while loop)
         list available books
         select book
         another book?
         return to main menu
    view/read:(use do while)
         list books boughy
         read? (boolean)
         yes- what book-now reading-bookfinished
         read again? (loop)
         no-return main menu
     veiw available:
         list available books
         like to buy? 
         yes- call buyBook method 
         no- return to main menu
    

*/import java.util.Scanner;

class Books{
   private String title;
   private String author;
   private String year;
   private String edition;
   private double price;

   //allows access us acess to the private elements
   public Books(String title,String author, String year, String edition, double price){
      this.title = title;
      this.author=author;
      this.year=year;
      this.edition=edition;
      this.price = price;
   }
   
   //setters to assign to each instance
   public void setTitle(String title) {
      this.title = title;
   }
   public void setAuthor(String author) {
      this.author = author;
   }
   public void setYear(String year) {
      this.year = year;
   }
   public void setEdition(String edition) {
      this.edition = edition;
   }
   public void setPrice(double price) {
      this.price = price;
   }
   
   //displays the array in same format assigned
   public void display(){
      System.out.println("'"+this.title+ "' '"+ this.author+this.year+"' '"+ this.edition+"' $" +this.price);
   }

}
public class ebook{
   
   public static void main (String[] args){
   
      Scanner type = new Scanner(System.in);
      //Welcome "welcome to e-Reader"
      System.out.println("Welcome to e-Reader!");
      
      //login prompt username and passwoord/ store username and password
      System.out.println("Enter Username: ");
      String userName = type.nextLine();
      
      System.out.println("Enter Password: ");
      String pw = type.nextLine();      
      
      //greetings "helo (username) "
      System.out.println("Hello "+ userName+ "!");
      
      boolean answer= false;//condition for the do while loop. 
   
      do{
         //list options - include method calls 
         System.out.println("what would you like to do? \n 1.Buy A Book \n 2.View Purchased books \n 3.View Available Books");
         System.out.print("Number: ");
         int task= type.nextInt();
      
         switch(task){
            case 1:
               buyBook();//calls buy method
               System.out.println("Thank you!");
               break;
            case 2:
               purchasedBooks();//calls purchase method
               System.out.println("Thank you!");
               break;
            case 3:
               viewBooks();//calls method that list books
               System.out.println("Thank you!");
               break;
         }
      
         //would you like to continue?- !ends do while loop
         Scanner y = new Scanner(System.in);
         System.out.print("Would you like to continue? Enter Yes or No: ");
         String cont = y.nextLine();     
         if(cont.equals("yes") || cont.equals("Yes")){
            answer= true;//continues do while loop
         } else if(cont.equals("No") || cont.equals("no")){
            answer=false;//ends do while loop
         }
                     
      } while (answer == true);
      
      //goodbye
      System.out.println("See you next time, Goodbye!");//ends code
   }
   
   
   public static void displayArray(){
      Books eb []= new Books[13];//creates array
      //populate array
      eb[0]= new Books("Northanger Abbey","Austen, Jane","1814","Penguin",18.2);
      eb[1]= new Books("War and Peace", "Tolstoy, Leo", "1865", "Penguin",12.7);
      eb[2]= new Books("Anna Karenina", "Tolstoy, Leo", "1875", "Penguin",13.5);
      eb[3]= new Books("Mrs. Dalloway", "Woolf, Virginia", "1925", "Harcourt Brace",25.0);
      eb[4]= new Books("The Hours", "Cunnningham, Michael", "1999", "Harcourt Brace",12.35);
      eb[5]= new Books("Huckleberry Finn", "Twain, Mark", "1865", "Penguin",5.76);
      eb[6]= new Books("Bleak House", "Dickens, Charles", "1870", "Random House",5.75);
      eb[7]= new Books("Tom Sawyer", "Twain, Mark", "1862", "Random House",7.75);
      eb[8]= new Books("A Room of One's Own", "Woolf, Virginia", "1922","Penguin",29);
      eb[9]= new Books("Harry Potter","Rowling, J.K.","2000","Harcourt Brace",19.95);
      eb[10]= new Books("One Hundred Years of Solitude","Marquez","1967","Harper  Perennial",14.00);
      eb[11]= new Books("Hamlet, Prince of Denmark","Shakespeare","1603","Signet  Classics",7.95);
      eb[12]= new Books("Lord of the Rings","Tolkien, J.R.","1937","Penguin",27.45);
   
      int a=0;//loops through and displays book list
      for(int i = 0; i<eb.length; i++) {
         System.out.print(a+ ":");
         eb[i].display();
         System.out.println(" ");
         a++;
      }
   }
 
 
   public static void buyBook(){
      Scanner bb = new Scanner(System.in);
      boolean blue= false;//condition for loop
      boolean red=false;//condition for loop
      
      //call available books method- ! begins do while loop
      do{System.out.println("Would you like to purchase a book?");
         String purch = bb.nextLine();//stores user input
         
         if (purch.equals("Yes")||purch.equals("yes")){
            displayArray();//list books
            System.out.println("What book would you like to buy \n Enter Book Number:");
            int buying= bb.nextInt();
            do{System.out.println("purchased!");
               Scanner tbh = new Scanner(System.in);
               System.out.println("Would you like to purchase another book?");
               String more=tbh.nextLine();
               if (more.equals("Yes")||more.equals("yes")){
                  displayArray();
                  System.out.println("What book would you like to buy \n Enter Book Number:");
                  int buys= tbh.nextInt();
                  System.out.println("You have purchased another book!");
                  
                  Scanner hh =new Scanner(System.in);
                  System.out.println("Would you like to purchase another book?");
                  String line =hh.nextLine();
                  
                  if(line.equals("Yes")|| line.equals("yes")){
                     displayArray();
                     System.out.println("What book would you like to buy \n Enter Book Number:");
                     int cart= hh.nextInt();
                     red=true;//continues do while loop
                  }
                  
                  else if(line.equals("No")||line.equals("no")){
                     red=false;//ends this do while loop
                  }
               }
               
            }while (red==true);
         }
         else if(purch.equals("No")||purch.equals("no")){
            blue=false;//ends do while loop
         }
      }while(blue==true);
   }
   
   
   public static void purchasedBooks(){
      Scanner tp = new Scanner(System.in);
      boolean yes=false;
      boolean no= false;
      
      do{ //list purchased books - array !begins do while loop
      
      //would like to read? y or n
         System.out.println("Would you like to read a book? \n Enter Yes or No");
         String enter =tp.nextLine();
         
         if(enter.equals("yes") || enter.equals("Yes")){
            System.out.print("What would you like to read? Book number:");
            String read= tp.nextLine();
            //now reading...input should correspond to array
            System.out.println("Now reading");
            
            do{ System.out.println("The end");
               System.out.println("Would you like to read another book?");
               String another = tp.nextLine();
               if (another.equals("Yes")|| another.equals("yes")){
                  System.out.print("What would you like to read? Book number:");
                  String next= tp.nextLine();
               //now reading...input should correspond to array
                  System.out.println("Now reading...");
                  System.out.println("The end ");
                  System.out.println("Would you like to read another book?");
                  String again = tp.nextLine();
                  if(again.equals("Yes") ||again.equals("yes")){
                     no=true;//cont. loop
                  } 
                  else if(again.equals("No")||again.equals("no")){
                     no=false;//ends loop
                  }
               }
            }while(no==true);
         // returning to main menu
         } else if(enter.equals("No") || enter.equals("no")){
            yes = false;
         }
      }while (yes == true);         
         
   }
   
   public static void viewBooks(){
      Scanner ha= new Scanner(System.in);
      
   //list available books
      displayArray();//list books
   
   //would like to buy?
      System.out.println("would you like to add to cart? Yes or No");
      String cart = ha.nextLine();
   //if: call buyBook Method and loops through that
      if(cart.equals("Yes")|| cart.equals("yes")){
         buyBook();
      }
   //else return to main menu
   }
}