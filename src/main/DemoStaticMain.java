/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 25-Aug-20
 *  Time: 1:22 PM
 */
package main;
import demostatic.DemoStatic;
public class DemoStaticMain {
    public static void main(String[] args) {
        System.out.println("main method of DemoStatic class");
        DemoStatic.main(args);

        System.out.println("static  variable rollNo = " + DemoStatic.rollNo);
        System.out.println("static variable name = " + DemoStatic.name);
        System.out.println("static variable initialized by java marks = " + DemoStatic.marks);
    }
}
