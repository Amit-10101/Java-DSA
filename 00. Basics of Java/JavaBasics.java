// Java Basics
// Java is a programming language and a platform.
// Java is a high level, robust, secured and object-oriented programming language.
// Platform: Any hardware or software environment in which a program runs, is known as a platform. Since Java has its own runtime environment (JRE) and API, it is called platform.

import java.util.*;

public class JavaBasics {
    public static void main(String args[]) {
        System.out.println("Hello World!");     // prints Hello World! with a new line
        System.out.print("Hello World!");       // prints Hello World! without a new line

        // Java Identifiers
        // A Java identifier is a name given to a package, class, interface, method or variable. It is a combination of letters, digits, underscore and dollar sign characters.
        // A Java identifier must begin with a letter, underscore (_) or a dollar sign ($).
        // Java is case sensitive, so "hello" and "Hello" have different meanings.

        // Java Modifiers
        // Access Modifiers: default, public, protected, private
        // Non-access Modifiers: final, abstract, strictfp

        // Java Variables
        // Local Variables: A variable declared inside the body of the method is called local variable. You can use this variable only within that method and the other methods in the class aren't even aware that the variable exists.
        // Instance Variables: A variable declared inside the class but outside the body of the method, is called instance variable. It is not declared as static.
        // Class Variables: A variable declared inside the class with the static keyword, is called class variable. It is declared as static.

        // Java Variables Types
        // Primitive Data Types: byte, short, int, long, float, double, boolean, char
        // Non-primitive Data Types: String, Array, Class

        // In Java, both String[] args and String args[] are correct and mean the same thing: an array of String objects.
        // The difference is purely stylistic:
        // - String[] args is more commonly used and is the convention in Java. It clearly indicates that you are declaring an array ([]) of String objects.
        // - String args[] is less common in Java, but you might see it in code written by programmers with a background in C or C++, where this syntax is more common.

        byte b = 10;
        short s = 20;
        int i = 30;
        long l = 40;
        float f = 50.0f;
        double d = 60.0d;
        boolean bool = true;
        char c = 'a';

        System.out.println("\n\nByte: " + b);
        System.out.println("Short: " + s);
        System.out.println("Int: " + i);
        System.out.println("Long: " + l);
        System.out.println("Float: " + f);
        System.out.println("Double: " + d);
        System.out.println("Boolean: " + bool);
        System.out.println("Char: " + c);

        // Java Input
        // Scanner class is used to get user input.
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter a string: ");
        String str = sc.nextLine();
        // String str = sc.Line();  // same as above but only reads the first word
        System.out.println("You entered: " + str);

        System.out.print("\nEnter an integer: ");
        int num = sc.nextInt();
        System.out.println("You entered: " + num);

        System.out.print("\nEnter a float: ");
        float fl = sc.nextFloat();
        System.out.println("You entered: " + fl);

        System.out.print("\nEnter a double: ");
        double db = sc.nextDouble();
        System.out.println("You entered: " + db);

        System.out.print("\nEnter a boolean: ");
        boolean bl = sc.nextBoolean();
        System.out.println("You entered: " + bl);

        System.out.print("\nEnter a character: ");
        char ch = sc.next().charAt(0);
        System.out.println("You entered: " + ch);

        //close the sc object
        sc.close();

    }
}