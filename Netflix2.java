import java.util.Scanner;

public class Netflix2{
  public static void main(String [] args){
    Scanner keyboard = new Scanner (System.in);
    double subscription = 14.99;
    final String username = "someUserName"; //Why is this declared as final? and not the password?
    String password = "Th1s1smyp@$$w0rd!";
    final int profileLimit = 4; //the max # of user profiles allowed for this subscription level
    int numProfiles = 1; //the current number of user profiles created
    String userProfile1 = "ProfZ";
    String userProfile2 = "";

    System.out.print("Enter your username: "); //let the user enter the username and vertify if it is valid.
    String myUsername = keyboard.nextLine();
    
    while (!(username.equals(myUsername))) {
        System.out.println("You entered an invalid username.");
        System.out.print("Enter your username again: ");
        myUsername = keyboard.nextLine();
    }

    System.out.print("Enter your password: "); //let the user enter the password and vertify if it is valid.
    String myPassword = keyboard.nextLine();

    while (!(password.equals(myPassword))) {
        System.out.println("You entered an invalid password.");
        System.out.print("Enter your password again: ");
        myPassword = keyboard.nextLine();
    }

    //The following print statements are the menu options for our menu-driven Netflix system, which should only be displayed when username and password are vertified.
    System.out.println("Netflix Main Menu");        
    System.out.println("P: Change Password");                        //If the user types P, the program will execute to change user's password.
    System.out.println("U: Create a User Profile");                  //If the user types U, the program will create a new user profile.
    System.out.println("D: Display subscription cost (incl. tax)");  //If the user types D, the program will calculate the total monthly charge of subscription w/ charge.
    System.out.println("Q: Quit");                                   //If the user types Q, the program will quit.
    System.out.print("Type your choice: ");
    char userChoice = keyboard.next().charAt(0);
    //keyboard.nextLine();
    System.out.println(keyboard.nextLine());

    switch (userChoice) {
        case 'P':      //the progream is going to change the user's password
            String newPassword;
            System.out.print("Enter your new password: ");
            newPassword = keyboard.nextLine();   //the user enters the new password 
            while (newPassword.equals(password) || newPassword.length() < 6) {     //if the new password matches the old one, or if the length of new password is less than 6, the system will ask user to re-enter the new password.
                if (newPassword.equals(password)) {
                    System.out.println("Your new password cannot be the same as your old password.");
                }
                if (newPassword.length() < 6) {
                    System.out.println("Your new password must be at least 6 characters long.");
                }
                System.out.print("Enter your new password again: ");
                newPassword = keyboard.nextLine();
            }
            System.out.println("Your new password is set!");
            password = newPassword;
            break;

        case 'U':      //the program is going to create a new user profile.
            if (numProfiles < profileLimit) {
                System.out.print("Enter the name for your new profile: ");
                userProfile2 = keyboard.nextLine();
                numProfiles ++;
            }
            else {
                System.out.println("The number of profiles reached maximum limit.");
            }

            System.out.println("All your profile names are listed below.");
            System.out.println(userProfile1);
            System.out.println(userProfile2);
            break;

        case 'D':      //the program will display the monthly charge for current subscription level.
            System.out.print("The total monthly charge (w/ tax) for the current subscription level is $");
            System.out.printf("%.2f", subscription * 1.1);
            System.out.println();
            break;

        case 'Q':      //the program will quit
            System.out.println("You have been logged out successfully. Thanks for using Netflix!");
            break;

        default:       //this is an invalid input so the program will send out a warning.
            System.out.println("Invalid input. Try it again.");
            break;
    }

    keyboard.close();

  }
}
    
