package userdefineexception.folderexception;

class InvalidAgeException extends RuntimeException{
    private String msg = "Invalid age Exception";
    InvalidAgeException(){}
    InvalidAgeException(String msg){this.msg = msg;}
    
    public String toString(){
        return "InvalidAgeException "+msg;
    }
}
