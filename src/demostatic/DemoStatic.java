/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 24-Aug-20
 *  Time: 3:30 PM
 */
package demostatic;

public class DemoStatic {
    //static variables
    //declaration
    public static int rollNo;
    // initialize
    // either I use static block or initialize it when declared or let java initialize it
    static {
        rollNo = 10;
    }
    //declaration and initialization on static variable
    public static String name = "Vaibhav";

    //let java initialize static variable
    static public int marks;
    //static block
    static {
        System.out.println("Static block demo");
        marks++;
        rollNo++;
    }

    public static void main(String[] args) {
        System.out.println("main method");
    }
    //block 2

    static {
        System.out.println("block 2");
    }
    static {
        System.out.println("block 3");
    }
}
