package three.userdefineexception;
import java.util.*;
import java.io.*;
import userdefineexception.folderexception.InvalidAgeException;


public class School {

    private void homePage(User s){
        System.out.println("Hello "+s.getUname());
        System.out.println("your data");
        System.out.println(s);
    }
   

    private RuntimeException verifyUser(User u){
        if (!(u.getUage()>6)) {
            throw new InvalidAgeException("Age Should be not less than 6");
        }
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner

        User u1 = new User();    
        u1.setUname("hitesh");
        u1.setUemail("hitesh5pakhan@gmail.com");
        u1.setUpassword("Hitesh@123");
        u1.setUage(23);

        School s1 = new School();
        s1.homePage(u1);
    } 
}
