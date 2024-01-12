package basics.basics;

import basics.structures.hashtable.BasicHashSet;
import basics.structures.hashtable.HashSet;
import basics.structures.queue.BasicQueue;
import basics.structures.queue.Queue;
import basics.structures.stack.BasicStack;
import basics.structures.stack.Stack;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BasicsApplication {

    public static void main(String[] args) {
        SpringApplication.run(BasicsApplication.class, args);
        stackTesting();
        queueTesting();
        hashSetTesting();
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

    private static void queueTesting() {
        Queue<String> queue = new BasicQueue<>();

        // Enqueue elements
        queue.enQueue("first element");
        queue.enQueue("second element");
        queue.enQueue("third element");
        queue.enQueue("fourth element");

        // Print the elements in the queue
        System.out.println("Elements in the queue:");
        while (queue.getSize() > 0) {
            System.out.println(queue.deQueue());
        }

        // Test contains and access methods
        queue.enQueue("first element");
        queue.enQueue("second element");

        String elementToAccess = "first element";
        if (queue.contains(elementToAccess)) {
            System.out.println("Queue contains " + elementToAccess);
            System.out.println("Accessed element: " + queue.access(0));
        } else {
            System.out.println("Queue does not contain " + elementToAccess);
        }
    }

    private static void hashSetTesting() {
        HashSet<String> hashSet = new BasicHashSet<>();

        // Add elements to the hash set
        hashSet.add("first element");
        hashSet.add("second element");
        hashSet.add("third element");
        hashSet.add("fourth element");

        // Print the elements in the hash set
        System.out.println("Elements in the hash set:");
        for (int i = 0; i < 100000; i++) {
            if (hashSet.contains("element " + i)) {
                System.out.println("Hash set contains element " + i);
            }
        }

        // Test contains method
        String elementToCheck = "second element";
        if (hashSet.contains(elementToCheck)) {
            System.out.println("Hash set contains " + elementToCheck);
        } else {
            System.out.println("Hash set does not contain " + elementToCheck);
        }

        // Test remove method
        String elementToRemove = "third element";
        hashSet.remove(elementToRemove);
        System.out.println("Removed element: " + elementToRemove);

        // Check if the element is still present after removal
        if (hashSet.contains(elementToRemove)) {
            System.out.println("Hash set contains " + elementToRemove + " after removal");
        } else {
            System.out.println("Hash set does not contain " + elementToRemove + " after removal");
        }
    }
}

