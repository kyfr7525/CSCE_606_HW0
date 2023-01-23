package src;

public class MovieGoer extends User {

    public MovieGoer(String name){
        super(name);
    }

    public void readReviews(Simulator sim){
        for (Movie m:sim.movies){
            System.out.println(m.name);
        }
    }
}