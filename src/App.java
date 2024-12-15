import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;

public class App {
    public static void main(String[] args) throws Exception {

        // 1. Set (HashSet)
        System.out.println("\n--- Set (HashSet) ---");
        setExample();

        // 2. Map (HashMap)
        System.out.println("\n--- Map (HashMap) ---");
        mapExample();

        // 3. List (ArrayList)
        System.out.println("\n--- List (ArrayList) ---");
        listExample();

        // 4. Queue (PriorityQueue and LinkedList)
        System.out.println("\n--- Queue (PriorityQueue) ---");
        queueExamplePriorityQueue();
        
        // Queue example with LinkedList (FIFO order)
        System.out.println("\n--- Queue (LinkedList) ---");
        queueExampleLinkedList();

        // 5. Stack (Stack)
        System.out.println("\n--- Stack (Stack) ---");
        stackExample();

        // 6. Array (Primitive Type Example)
        System.out.println("\n--- Array (Integer Array) ---");
        arrayExample();

        // 7. Vector (Object Type Example)
        System.out.println("\n--- Vector (Object Type Example) ---");
        vectorExample();
    }


    // Function for Set (HashSet)
    // A Set is a collection that stores unique elements, meaning duplicates are not allowed.
    // HashSet is a specific implementation of Set that uses a hash table internally.
    // Iteration: You can go through the elements using an iterator or a for-each loop, but the order of elements is not guaranteed.
    // Access: Direct access is not possible. To check if an element exists, use the `contains` method.
    // Difference from List: Unlike a List, a Set does not maintain element order and does not allow duplicates.
    public static void setExample() {
        
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Apple"); // Duplicate, won't be added!
        set.add("Cherry");

        System.out.println("Set elements: " + set);
        System.out.println("Does set contain 'Banana'? " + set.contains("Banana"));
        System.out.println("Size of set: " + set.size());
        set.remove("Banana"); // Removes "Banana"
        System.out.println("Set after removing 'Banana': " + set);
        System.out.println("Is set empty? " + set.isEmpty());
        set.clear(); // Clears all elements
        System.out.println("Set after clear: " + set);
    }

    // Function for Map (HashMap)
    // A Map is a collection that associates keys with values. Each key must be unique, but values can repeat.
    // HashMap uses a hash table for efficient storage and retrieval based on keys.
    // Iteration: You can loop through keys, values, or key-value pairs using methods like entrySet(), keySet(), or values().
    // Access: Retrieve a value by its key quickly, typically in O(1) time.
    public static void mapExample() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(3, "Three");
        map.put(6, "Six");

        System.out.println("Map elements: " + map);
        System.out.println("Value for key 2: " + map.get(6));
        System.out.println("Returns a Collection view of the values contained in this map: " + map.values());
        System.out.println("Returns a Collection view of the keys contained in this map: " + map.keySet());
        System.out.println("Returns map in Collection view (key=value):  " + map.entrySet());
        System.out.println("Size of map: " + map.size());
        map.remove(2); // Removes key-value pair with key 2
        System.out.println("Map after removing key 2: " + map);
        System.out.println("Is map empty? " + map.isEmpty());
        map.clear(); // Clears all entries
        System.out.println("Map after clear: " + map);
    }

    // Function for List (ArrayList)
    // A List is an ordered collection of elements where duplicates are allowed (unlike Set).
    // ArrayList is a resizable array implementation that provides random access to elements.
    // Iteration: You can use an iterator, a for-each loop, or a traditional for-loop with indices.
    // Access: Directly access elements by their index with O(1) complexity.
    // Difference from Set: A List maintains the order of insertion and allows duplicate elements, unlike a Set.
    public static void listExample() {
        List<String> list = new ArrayList<>();
        list.add("Dog");
        list.add("Cat");
        list.add("Bird");
        list.add("Cat"); // Duplicates are allowed

        System.out.println("List elements: " + list);
        System.out.println("Element at index 1: " + list.get(1));
        System.out.println("Size of list: " + list.size());
        list.remove("Cat"); // Removes the first occurrence of "Cat"
        System.out.println("List after removing 'Cat': " + list);
        System.out.println("Is list empty? " + list.isEmpty());
        list.clear(); // Clears all elements
        System.out.println("List after clear: " + list);
    }
    
    // Function for Queue (PriorityQueue)
    // A Queue is a collection that holds elements before processing, generally in a First-In-First-Out (FIFO) manner.
    // PriorityQueue orders elements based on their natural order or a custom comparator (higher priority elements are processed first).
    // LinkedList implements Queue in FIFO order, meaning the first element added is the first one to be processed.
    // Iteration: You can use an iterator, but the order of elements during iteration is not guaranteed unless specified by the Queue type.
    // Access: Use `peek` to view the element at the front of the queue or `poll` to retrieve and remove it.
    // Difference from Stack: A Queue processes elements in FIFO order, while a Stack follows LIFO order.
    public static void queueExamplePriorityQueue() {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(10);
        queue.add(5);
        queue.add(20);

        System.out.println("Queue elements (PriorityQueue, sorted by priority): " + queue);
        System.out.println("Looking up peak (first in queue) element: " + queue.peek()); // returning peek's value
        System.out.println("Polled element (removed): " + queue.poll()); // Retrieves and removes head, returning peek's value
        System.out.println("Queue after poll: " + queue);
        System.out.println("Size of queue: " + queue.size());
        System.out.println("checking if queue empty: " + queue.isEmpty());
        queue.clear(); // Clears all elements
        System.out.println("Queue after clear: " + queue);
    }

    // Function for Queue (LinkedList)
    public static void queueExampleLinkedList() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(5);
        queue.add(20);

        System.out.println("Queue elements (LinkedList, FIFO order): " + queue);
        System.out.println("Looking up peak (first in queue) element: " + queue.peek());
        System.out.println("Polled element (removed): " + queue.poll()); // Retrieves and removes head
        System.out.println("Queue after poll: " + queue);
        System.out.println("Size of queue: " + queue.size());
        System.out.println("Is queue empty? " + queue.isEmpty());
        queue.clear(); // Clears all elements
        System.out.println("Queue after clear: " + queue);
    }
    // Function for Stack (Stack)
    // A Stack is a collection that follows the Last-In-First-Out (LIFO) principle.
    // Elements are added to and removed from the top of the stack.
    // Iteration: Traverse using an iterator or a for-each loop.
    // Access: Use `peek` to see the top element or `pop` to remove it.
    // Difference from Queue: A Stack processes elements in LIFO order, while a Queue processes them in FIFO order.
    public static void stackExample() {
        Stack<String> stack = new Stack<>();
        stack.push("First");
        stack.push("Second");
        stack.push("Third");

        System.out.println("Stack elements: " + stack);
        System.out.println("Looking up peak(last added) element: " + stack.peek());
        System.out.println("Popped element (removed): " + stack.pop()); // Retrieves and removes top
        System.out.println("Stack after pop: " + stack);
        System.out.println("Size of stack: " + stack.size());
        System.out.println("Is stack empty? " + stack.isEmpty());
        stack.clear(); // Clears all elements
        System.out.println("Stack after clear: " + stack);
    }

    // Function for Array (Integer Array Example)
    // An Array is a fixed-size collection that holds elements of the same type in a sequential order.
    // You can access elements directly by their index.
    // Iteration: Use a for-loop with indices or a for-each loop.
    // Access: Retrieve or modify elements by index with O(1) complexity.
    public static void arrayExample() {
        int[] array = {10, 20, 30, 40, 50};

        System.out.println("Array elements: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println("i=" + i + ": " + array[i]);
        }
        System.out.println("Size of array: " + array.length);
        System.out.println("Element at index 2: " + array[2]);// Access element at index 2
        array[4] = 100; // Changing value at index 4 to 100
        System.out.println("Array after modifying element at index 4: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println("i=" + i + ": " + array[i]);
        }
    }

    // Function for Vector (Vector Example)
    // A Vector is a thread-safe, resizable array-like collection that allows duplicate elements.
    // It is synchronized, meaning it is safe for use in multi-threaded environments.
    // Iteration: Traverse using an iterator, a for-each loop, or a traditional for-loop.
    // Access: Access elements by their index with O(1) complexity.
    public static void vectorExample() {
        Vector<String> vector = new Vector<>();
        vector.add("First");
        vector.add("Second");
        vector.add("Third");

        System.out.println("Vector elements: " + vector);
        String elementAtIndex1 = vector.get(1); // Get element at index 1
        System.out.println("Element at index 1: " + elementAtIndex1);
        vector.set(2, "Modified Third"); // Change element at index 2
        System.out.println("Vector after modifying element at index 2: " + vector);
        vector.remove(0); // Remove element at index 0
        System.out.println("Vector after removing element at index 0: " + vector);
        System.out.println("Size of vector: " + vector.size());
        System.out.println("Is vector empty? " + vector.isEmpty());
        vector.clear();
        System.out.println("Vector after clear: " + vector);
    }
}