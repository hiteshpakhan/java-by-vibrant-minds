//date : 25-5-24

//#imp
// upcasting vs downcasting
/*
    # Upcasting 
        -in java upcasting is a concept where object of chile class reference to parent class
        - upcasting also known as a widennining or generalization 
        - in java upcasting is permissible
        eg: 
            Demo1 d1 = new Demo2();
            Demo1 d2 = new Demo3();
            Demo1 d1 = new Demo3();

    # downcasting
        - in java downcasting is a concept where object of parent class reference to child class 
        - downcasting also known as narrowing or degeneralization
        - downcasting is not permissible
        - Note: if we try to perform downcasting explicitly, we will get ClassCastException 
        eg: 
            Demo2 d1 = new Demo1();
            Demo3 d1 = new Demo2();
            Demo3 d1 = new Demo1();

    Note: during upcasting common method from child and parent will invoked

 */


public class Program25 {
    public static void main(String[] args) {
        Demo2Program25 d2 = new Demo2Program25();
    }
}
