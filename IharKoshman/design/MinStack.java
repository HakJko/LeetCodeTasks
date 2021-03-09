package IharKoshman.design;

/**
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 *
 * push(x) -- Push element x onto stack.
 * pop() -- Removes the element on top of the stack.
 * top() -- Get the top element.
 * getMin() -- Retrieve the minimum element in the stack.
 */

public class MinStack {

    class Node {
        int value;
        public Node next;

        public Node(int value) {
            this.value = value;
        }
    }


    Node head;
    Node min;

    /**
     * initialize your data structure here.
     */
    public MinStack() {

    }

    public void push(int x) {
        Node node = new Node(x);
        if (head == null) {
            head = node;
            if (min == null) {
                min = node;
            }
        } else {
            node.next = head;
            head = node;
        }

        if (min.value > x) {
            min = node;
        }

    }

    public void pop() {
        if (head != null) {
            if (head.value == min.value) {
                Node currentNode = head.next;
                min = currentNode;
                while (currentNode != null) {
                    if (currentNode.value < min.value) {
                        min = currentNode;
                    }
                    currentNode = currentNode.next;
                }
            }
            head = head.next;

        }
    }

    public int top() {
        return head.value;

    }

    public int getMin() {
        return min.value;
    }
}
