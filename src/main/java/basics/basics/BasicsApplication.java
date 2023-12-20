package basics.basics;

import basics.structures.stack.BasicStack;
import basics.structures.stack.Stack;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BasicsApplication {

    public static void main(String[] args) {
        SpringApplication.run(BasicsApplication.class, args);

        stackTesting();
    }

    private static void stackTesting() {
        Stack<String> stack = new BasicStack<>();

        stack.push("first element");
        stack.push("second element");
        stack.push("third element");
        stack.push("fourth element");

        // Print the elements in the stack
        System.out.println("Elements in the stack:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        // Test contains and access methods
        stack.push("first element");
        stack.push("second element");

        String elementToAccess = "first element";
        if (stack.contains(elementToAccess)) {
            System.out.println("Stack contains " + elementToAccess);
            System.out.println("Accessed element: " + stack.access(elementToAccess));
        } else {
            System.out.println("Stack does not contain " + elementToAccess);
        }
    }

}
