# Collections
> The Collection in Java is a framework that provides an architecture to store and manipulate the group of objects.


<figure>
<img width="100%" alt="Hierarchy of the Collection Framework in Java" src="https://media.geeksforgeeks.org/wp-content/uploads/20230124151239/Collections-in-Java-768.png">
   <figcaption>Hierarchy of the Collection Framework in Java</figcaption>
</figure>

## List
List is an ordered collection that maintains insertion order of elements. Allows duplicate elements.

### ArrayList:
* Resizable array implementation.
* Provides random access by index in constant time.
* Not synchronized.
* Better for storing and accessing data.

```
List<String> fruits = new ArrayList<>();  
fruits.add("Apple");
fruits.get(0); // "Apple"
```
### LinkedList:
* Implemented as doubly linked list.
* Good for frequent additions and deletions from ends.
* Not synchronized.
* Better for manipulating data.

```
List<String> fruits = new LinkedList<>();
fruits.addFirst("Apple");
fruits.removeLast();
```
### Vector:
* Synchronized version of ArrayList.
* Thread-safe.
* Less used now.
### Stack:
* Stack represents a last-in, first-out (LIFO) stack of objects.
* Stack class in Java extends Vector
* it is synchronized and thread-safe.

```
Stack<Integer> stack = new Stack<>();
stack.push(1); // Add to top
stack.pop(); // Returns and removes top element (1)
```
**For better performance, ArrayDeque can be used as a stack:**

```
Deque<Integer> stack = new ArrayDeque<>();
stack.push(1);  
stack.pop();
```

---

## Set
Set contains unique elements with no duplicates.

### HashSet:
* Implements using hashing for fast performance.
* Elements are unordered.
* Allows null value.
* Not synchronized.
```
Set<String> fruits = new HashSet<>();
fruits.add("Apple");
fruits.contains("Mango"); // false
```
### LinkedHashSet:
* Maintains insertion order of elements.
* Slightly slower than HashSet.
* Not synchronized.

### TreeSet:

* Implements sorted set using Red-Black tree.
* Not synchronized.
* Null elements not allowed.

```
Set<Integer> set = new TreeSet<>();
set.add(3);
set.add(1);
System.out.println(set); // [1, 3]
```

---

## Queue
Queue provides first-in, first-out (FIFO) operations.

### LinkedList:
* Implements queue using doubly linked list.
* All queue methods are O(1).
* Not synchronized.
```
Queue<Integer> queue = new LinkedList<>();
queue.offer(1);
queue.poll(); // 1
```
### PriorityQueue:
* Orders elements by priority.
* Elements must be Comparable.
* Not synchronized.
```
  Queue<Integer> queue = new PriorityQueue<>();
  queue.offer(5);
  queue.offer(3);
  queue.peek(); // 3 (natural ordering)
```
---

## Deque
Deque (double ended queue) provides insertion and removal at both ends.

* ArrayDeque is the most common deque implementation.
* Based on resizable array.
* Very fast O(1) add and poll.
* Not thread-safe.
```
Deque<String> deque = new ArrayDeque<>();
deque.offerFirst("A"); // Add to front
deque.offerLast("Z"); // Add to end
deque.pollFirst(); // "A"
deque.pollLast(); // "Z"
```
LinkedList also implements Deque and provides similar functions.
* Slightly slower than ArrayDeque.
* Not thread-safe.

Some key differences from Queue:
* Deque allows adding/removing from both ends.
* Queue allows only add to end, remove from head.

---

## Map
Map maps keys to values. Does not inherit from Collection.

### HashMap:
* Most common implementation using hashing.
* Fast performance for lookups and adds.
* Not synchronized.
* Permits null keys/values.
```
Map<String, Integer> map = new HashMap<>();
map.put("apple", 10);
map.get("apple"); // 10
```

### LinkedHashMap:

* Maintains insertion order of elements.
* Slightly slower than HashMap.
* Not synchronized.

### TreeMap:
* Implements sorted map with navigable keys.
* Not synchronized.
* Null keys not allowed.

---

### Resources
* [java-topics](https://github.com/AsmaaIR/java-topics).
* [collections-in-java](https://www.javatpoint.com/collections-in-java).
* [collections-in-java-2](https://www.geeksforgeeks.org/collections-in-java-2/).
* [java-collection](https://www.simplilearn.com/tutorials/java-tutorial/java-collection).
* [collections](https://docs.oracle.com/javase/8/docs/technotes/guides/collections/overview.html).
* [java-collections-interview-questions](https://www.javatpoint.com/java-collections-interview-questions).

### Contact
Ahmed Sakr | [@Ahmed-Mohmed-Sakr](https://github.com/Ahmed-Mohmed-Sakr)
