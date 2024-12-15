# Java Collections Demonstration Project

This project demonstrates the usage of various Java collection types, including `Set`, `Map`, `List`, `Queue`, `Stack`, `Array`, and `Vector`. Each collection type is explained with a corresponding example, showing their unique behaviors and operations.

## Collection Types Covered:

1. **Set (HashSet)**: A collection that stores unique elements, meaning no duplicates are allowed. `HashSet` is an implementation of `Set` that does not guarantee the order of elements.

2. **Map (HashMap)**: A collection that stores key-value pairs. Each key must be unique, but values can be duplicated. `HashMap` uses a hash table for efficient retrieval and insertion.

3. **List (ArrayList)**: An ordered collection of elements that allows duplicates. `ArrayList` provides fast random access to elements via their index.

4. **Queue (PriorityQueue and LinkedList)**: A collection used for processing elements in a First-In-First-Out (FIFO) order. `PriorityQueue` orders elements based on their natural order or a custom comparator, while `LinkedList` processes elements strictly in FIFO order.

5. **Stack (Stack)**: A collection that follows the Last-In-First-Out (LIFO) principle. Elements are added and removed from the top of the stack.

6. **Array**: A fixed-size collection that holds elements of the same type, with direct access via indices.

7. **Vector (Object Type Example)**: A thread-safe, resizable array-like collection. `Vector` allows duplicate elements and is synchronized for safe use in multi-threaded environments.

## Project Structure:

Each collection type is demonstrated with its own method, which shows common operations such as adding, removing, accessing elements, checking the size, and clearing the collection.

### Collection Examples:

1. **Set Example** (`setExample()`): Demonstrates the use of `HashSet` to store unique elements, checking for duplicates, and clearing the set.

2. **Map Example** (`mapExample()`): Demonstrates the use of `HashMap` to store key-value pairs, retrieving values by key, and clearing the map.

3. **List Example** (`listExample()`): Shows how `ArrayList` stores elements in a specific order, allows duplicates, and provides random access.

4. **Queue Example (PriorityQueue)** (`queueExamplePriorityQueue()`): Demonstrates how `PriorityQueue` orders elements based on priority and supports FIFO processing.

5. **Queue Example (LinkedList)** (`queueExampleLinkedList()`): Demonstrates the use of `LinkedList` for FIFO processing.

6. **Stack Example** (`stackExample()`): Demonstrates the use of `Stack` to process elements in a LIFO manner, with basic operations like `push`, `pop`, and `peek`.

7. **Array Example** (`arrayExample()`): Shows how to use an `Array` for fixed-size collections, with direct access to elements by their indices.

8. **Vector Example** (`vectorExample()`): Demonstrates how to use a `Vector` for thread-safe resizable arrays, with basic operations like `add`, `get`, `set`, and `remove`.

## How to Run the Project:

1. Clone the repository or download the project files.
2. Compile the `App.java` file:
   ```bash
   javac App.java

### Example Output:
--- Set (HashSet) ---
Set elements: [Apple, Cherry, Banana]
Does set contain 'Banana'? true
Size of set: 3
Set after removing 'Banana': [Apple, Cherry]        
Is set empty? false
Set after clear: []

--- Map (HashMap) ---
Map elements: {1=One, 3=Three, 6=Six}
Value for key 2: Six
Returns a Collection view of the values contained in this map: [One, Three, Six]
Returns a Collection view of the keys contained in this map: [1, 3, 6]
Returns map in Collection view (key=value):  [1=One, 3=Three, 6=Six]
Size of map: 3
Map after removing key 2: {1=One, 3=Three, 6=Six}   
Is map empty? false
Map after clear: {}

--- List (ArrayList) ---
List elements: [Dog, Cat, Bird, Cat]
Element at index 1: Cat
Size of list: 4
List after removing 'Cat': [Dog, Bird, Cat]
Is list empty? false
List after clear: []

--- Queue (PriorityQueue) ---
Queue elements (PriorityQueue, sorted by priority): [5, 10, 20]
Looking up peak (first in queue) element: 5
Polled element (removed): 5
Queue after poll: [10, 20]
Size of queue: 2
checking if queue empty: false
Queue after clear: []

--- Queue (LinkedList) ---
Queue elements (LinkedList, FIFO order): [10, 5, 20]
Looking up peak (first in queue) element: 10        
Polled element (removed): 10
Queue after poll: [5, 20]
Size of queue: 2
Is queue empty? false
Queue after clear: []

--- Stack (Stack) ---
Stack elements: [First, Second, Third]
Looking up peak(last added) element: Third
Popped element (removed): Third
Stack after pop: [First, Second]
Size of stack: 2
Is stack empty? false
Stack after clear: []

--- Array (Integer Array) ---
Array elements:
i=0: 10
i=1: 20
i=2: 30
i=3: 40
i=4: 50
Size of array: 5
Element at index 2: 30
Array after modifying element at index 4:
i=0: 10
i=1: 20
i=2: 30
i=3: 40
i=4: 100

--- Vector (Object Type Example) ---
Vector elements: [First, Second, Third]
Element at index 1: Second
Vector after modifying element at index 2: [First, Second, Modified Third]
Vector after removing element at index 0: [Second, Modified Third]
Size of vector: 2
Is vector empty? false
Vector after clear: []"# CollectionsExercises" 
