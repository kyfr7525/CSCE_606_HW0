package src;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulator {
    ArrayList<Movie> movies;
    ArrayList<MovieGoer> moviegoers;
    Admin admin;
    boolean flag = false;
    String username;
    Announcer ann;

    public void constructMovieInventory(){
        movies = new ArrayList<Movie>();
        movies.add(new Movie("Frozen"));
        movies.add(new Movie("Puss in Boots"));
        movies.add(new Movie("Belle"));
        movies.add(new Movie("Harry Potter"));
        movies.add(new Movie("Aristocats"));
    }

    public void constructUsers(){
        moviegoers = new ArrayList<MovieGoer>();
        moviegoers.add(new Admin("admin"));
        admin.setPassword();
  
    }

    public void runSim(){
        // user input https://www.w3schools.com/java/java_user_input.asp and https://www.tutorialspoint.com/java/util/scanner_close.htm
        Scanner newUser = new Scanner(System.in);  // Create a Scanner object

        ann.makeAnnouncement("Enter name in all lowercase, please");

        username = newUser.nextLine();  // Read user input
        ann.makeAnnouncement("Username is: " + username.toLowerCase());  // Output user input

            ////////////////////////////////////////////////////////////////////////////////

            // check if a string/username is only spaces https://howtodoinjava.com/java11/check-blank-string/#:~:text=isBlank()%20method%20to%20determine,isEmpty()%20method.
        while (username.isBlank())
        {
            ann.makeAnnouncement("Your name can't be only spaces!");
            ann.makeAnnouncement("Enter name in all lowercase, please");

            username = newUser.nextLine();  // Read user input
            ann.makeAnnouncement("Username is: " + username.toLowerCase());  // Output user input
        }
            ////////////////////////////////////////////////////////////////////////////////

        newUser.close();



        for (MovieGoer mg:moviegoers){
            if (mg.name == username.toLowerCase()){
                ann.makeAnnouncement("user has been found");
                flag = true;
            }
        }

        if (flag == false) {// user was not found
            ann.makeAnnouncement("Welcome new user: " + username.toLowerCase());
            moviegoers.add(new MovieGoer(username));
        }
        
        flag = false; // set the flag to false after finding user and after if conditional to not trigger conditional case

        


    }
}
