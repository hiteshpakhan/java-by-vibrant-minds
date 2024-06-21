package three.four;
import three.four.School;
import three.four.User;


public class UserMain {
    public static void main(String[] args) {
        User u1 = new User();
        u1.setUage(22);
        School s= new School();
        s.login(u1);
    }
}
