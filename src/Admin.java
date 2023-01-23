package src;

public class Admin extends MovieGoer {
    String password;
    public Admin(String name){
        super(name);
    }

    public void setPassword(){
        password = "password";
    }
}
