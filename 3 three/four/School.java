package three.four;
import three.four.folderexception.*;
import java.util.*;
import java.io.*;



public class School {

    private static void homePage(User s){
        System.out.println("Hello "+s.getUname());
        System.out.println("your data");
        System.out.println(s);
    }
   

    private RuntimeException verifyUser(User u){
        if (!(u.getUage()>6)) {
            throw new InvalidAgeException("age shoud jbskdfhi");
        }else{
            return null;
        }
    }
    public void login(User u) {
		RuntimeException re = verifyUser(u);
		if (re == null)
			School.homePage(u);
		else
		{System.out.println("program end");
			throw re;
		}
	}

    
}
