import java.util.*;

public class QueuesDemo {
    public static void main(String[] args) {
        // ---- LinkedList (List + Deque) ----
        LinkedList<String> ll = new LinkedList<>();
        ll.add("A");
        ll.add("B");
        ll.addFirst("Z");
        ll.addLast("C");
        System.out.println("LinkedList: " + ll);
        System.out.println("First: " + ll.getFirst());
        System.out.println("Last: " + ll.getLast());
        ll.removeFirst();
        System.out.println("After removeFirst: " + ll);

        // ---- Queue (FIFO) ----
        Queue<String> q = new LinkedList<>();
        q.offer("first");
        q.offer("second");
        q.offer("third");
        System.out.println("Queue: " + q);
        System.out.println("Peek: " + q.peek());
        System.out.println("Poll: " + q.poll());
        System.out.println("After poll: " + q);

        // ---- Stack (Deque as stack) ----
        Deque<String> stack = new ArrayDeque<>();
        stack.push("bottom");
        stack.push("middle");
        stack.push("top");
        System.out.println("Stack: " + stack);
        System.out.println("Pop: " + stack.pop());
        System.out.println("After pop: " + stack);
        System.out.println("Peek: " + stack.peek());

        // ---- PriorityQueue (Min-Heap by default) ----
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(30);
        pq.offer(10);
        pq.offer(20);
        System.out.println("PriorityQueue: " + pq);
        System.out.println("Poll (smallest): " + pq.poll());
        System.out.println("After poll: " + pq);

        // Max-Heap using Comparator
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.offer(30);
        maxHeap.offer(10);
        maxHeap.offer(20);
        System.out.println("MaxHeap poll: " + maxHeap.poll()); // 30

        // ---- Deque as double-ended queue ----
        Deque<Integer> dq = new ArrayDeque<>();
        dq.addFirst(1);
        dq.addLast(2);
        dq.addFirst(0);
        System.out.println("Deque: " + dq);
        System.out.println("removeFirst: " + dq.removeFirst());
        System.out.println("removeLast: " + dq.removeLast());
    }
}

/*
--- EXERCISES ---
1. Use a Stack (Deque) to reverse a string
2. Use a Queue to implement a simple task scheduler (add tasks, process in FIFO order)
3. Use a PriorityQueue to find the K largest elements in an array
*/
