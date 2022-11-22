package applications.demowebshop.models;

public class Credentials {

    public String email;
    public String password;

    public Credentials(String user, String pswrd){
        this.email = user;
        this.password = pswrd;
    }
}
