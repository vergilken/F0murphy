import java.util.Scanner;
public class ATM1{
// all programs begin with a class name. The class name and file name must be the same
//main method required for every java program
     public static void main(String [] args){
     // must declare variables before using
     // declaring and initializing the Scanner Class
          Scanner myScanner = new Scanner(System.in);
          //boolean receipt;   //used to see if customer wants a receipt
          //String name;      // showing an example of String
          //char middleName;  // when using two words to define a variable alwasy uppercase the first character in the second workd
          int pin;  
          int transType;  
          
          // variables used for calculations should often be intialized to zero at the time declaration
          double Balance = 0;
          double amountDeposit = 0;   
          double amountWithdraw = 0;
          long acctNum;  // the long datatype allows us to store larger numbers
          double feeTotal = 0;
          //boolean fee;
          final double checkFee = 1.5; //constant for every 25 dollars withdrawn we will apply 1.5 dollar fee
          int transactionCount = 0;

          
          /*
          System.out.println("Enter your full Name");
          name = myScanner.next();
          System.out.println(name);
          */

          System.out.println("Enter your full name");
          String fname = myScanner.next();
          String mname = myScanner.next();
          String lname = myScanner.next();

          System.out.println("Hello, " + fname + " " + mname + " " + lname + "!");


          // this begins the code for the ATM menu system
          System.out.println("ATM System");
          System.out.println("Enter your account number");
          acctNum = myScanner.nextLong(); // reads a long value from the terminal
          System.out.println("Enter your pin");
          pin = myScanner.nextInt(); // reads an integer value from the terminal
          System.out.println("1. Check Balance");
          System.out.println("2. Get Cash");
          System.out.println("3. Deposit");
          System.out.println("Enter the number above of the type transaction");
          transType = myScanner.nextInt(); // reads an integer value from the terminal
          
          System.out.println(acctNum);
          System.out.println(pin);
          System.out.println(transType);
          
          
          
          
          
          
          
          
          if(transType == 1){
               System.out.println("You entered check Balance");
               System.out.println("You Balaance: " + Balance);
          }
          else if(transType == 2){
               System.out.println("You entered get cash");
               System.out.println("How much do you want to get?");
               transactionCount++;
               amountWithdraw = myScanner.nextDouble();
               Balance += amountWithdraw;
               feeTotal += amountWithdraw / 25 * checkFee;
               Balance -= feeTotal;
               System.out.println("You chechfee for this service is " + feeTotal + ".");

          }
          else if(transType == 3){
               System.out.println("You entered make deposit");
               System.out.println("How much do you want to deposit?");
               amountDeposit = myScanner.nextDouble();
               transactionCount++;
               Balance += amountDeposit;
               feeTotal += amountDeposit / 25 * checkFee;
               Balance -= feeTotal;
               System.out.println("You chechfee for this service is " + feeTotal + ".");

          }
          else{
               System.out.println("Invalid Transaction");
          }
          
          System.out.println("Your toal transaction is " + transactionCount + ".");

          myScanner.close();
     }

}