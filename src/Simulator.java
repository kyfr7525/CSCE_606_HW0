package src;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulator {
    ArrayList<Movie> movies;
    ArrayList<MovieGoer> moviegoers;
    Admin admin;
    boolean flag = false;

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

        System.out.println("Enter name in all lowercase, please");

        String username = newUser.nextLine();  // Read user input
        System.out.println("Username is: " + username.toLowerCase());  // Output user input
        newUser.close();

        for (MovieGoer mg:moviegoers){
            if (mg.name == username.toLowerCase()){
                System.out.println("user has been found");
                flag = true;
            }
        }

        if (flag == false) {// user was not found
            System.out.println("Welcome new user: " + username.toLowerCase());
            moviegoers.add(new MovieGoer(username));
        }
        
        


    }
}
