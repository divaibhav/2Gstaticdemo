/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 24-Aug-20
 *  Time: 3:30 PM
 */
package demostatic;

public class DemoStatic {
    //static block
    static {
        System.out.println("Static block demo");
    }

    public static void main(String[] args) {
        System.out.println("main method");
    }
    //block 2
    static {
        System.out.println("block 2");
    }
}
