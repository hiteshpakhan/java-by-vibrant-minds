package userdefineexception;

public class User {
    //instance
    private String uname;
    private String uemail;
    private String upassword;
    private int uage;
    
    //also can be static

    public String getUname() {
        //local

        return uname;
    }
    public void setUname(String uname) {

        this.uname = uname;
    }
    public String getUemail() {
        return uemail;
    }
    public void setUemail(String uemail) {
        this.uemail = uemail;
    }
    public String getUpassword() {
        return upassword;
    }
    public void setUpassword(String upassword) {
        this.upassword = upassword;
    }
    public int getUage() {
        return uage;
    }
    public void setUage(int uage) {
        this.uage = uage;
    }
    @Override
    public String toString() {
        return "User [uname=" + uname + ", uemail=" + uemail + ", upassword=" + upassword + ", uage=" + uage + "]";
    }


    
    
}