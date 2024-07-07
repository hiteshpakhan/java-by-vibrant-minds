package three.four.folderexception;

public class InvalidAgeException extends RuntimeException {
    private String msg = "Invalid age Exception";
    public InvalidAgeException(){}
    public InvalidAgeException(String msg){this.msg = msg;}
    
    public String toString(){
        return "InvalidAgeException "+msg;
    }
}
