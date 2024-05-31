class MainClass {       
    public static void main(String[] args) {
        SifiCalculator c = new SifiCalculator();
        System.out.println(c.add(10, 20));
        System.out.println(c.sub(10, 20));
        System.out.println(c.div(10, 20));
        System.out.println(c.mul(10, 20));
        System.out.println(c.square(10));
        System.out.println(c.cube(10));
        System.out.println(c.squareRoot(10));
        System.out.println(c.cubeRoot(10));
    }    
}
//output:
// 30.0
// -10.0
// 0.5
// 200.0
// 100.0
// 1000.0
// 2.154434690031884
// 3.1622776601683795

// -----------------------------------------------------------------



//here in this example you will see the inheritance like

// this is also called as Single Inheritance

// calculator 
//     |
//     |    here we have inherited the calculator into SifiCalculator 
//     |
// SifiCalculator
//     |
//     |    here we have created the object of SifiCalculator into the MAinClass
//     |
// MainClass




