package DataStructure.LinkedLists;

// Main Class that have all Methods
public class LinkedListCustomized {
    Node head = null;
    Node tail = null;
    int numOfElem = 0;

    public int size() {
        return numOfElem;
    }


    public boolean isEmpty() {
        return numOfElem == 0;
//        return head==null;
    }


    public int value_at(int index) {
        // O(1)
        if (index == 0) {
            return head.getValue();
        }
        // O(1)
        if (index == numOfElem - 1) {
            return tail.getValue();
        }
        if (index >= numOfElem) {
            System.out.println("Out of Bounded Index...!!");
            return -1;
            // O(n)
        } else {
            int i = 0;
            Node curr = head;
            while (i < index) {
                curr = curr.next;
                i++;
            }
            return curr.getValue();
        }
    }


    public void push_front(int value) {
        // O(1)
        Node newNode = new Node(value);
        // Empty List
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        numOfElem++;
    }


    public int pop_front() {
        // O(1)
        // IsEmpty
        if (isEmpty()) {
            System.out.println("Error...!!!");
            return -1;
        }
        Node curr = head;
        // Has one Element
        if (numOfElem == 1) {
            head = null;
            tail = null;

        } else {
            head = head.next;
        }
        numOfElem--;
        return curr.getValue();
    }


    public void push_back(int value) {
        // O(1)
        Node newNode = new Node(value);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        numOfElem++;
    }


    public int pop_back() {
        if (isEmpty()) {
            System.out.println("Error...!!");
            return -1;
        }
        Node curr = tail;
        // O(1)
        if (numOfElem == 1) {
            head = null;
            tail = null;
            // *** O(n)
        } else {
            Node start = head;
            while (start.next.next != null) {
                start = start.next;
            }
            start.next = null;
            tail = start;
        }
        numOfElem--;
        return curr.getValue();
    }


    public int getFrontValue() {
        return head.getValue();
    }

    public int getBackValue() {
        return tail.getValue();
    }

    public void insertAtIndex(int index, int value) {
        if (index == 0) {
            push_front(value);
        } else if (index == numOfElem - 1) {
            push_back(value);
        } else if (index < 0 || index >= numOfElem) {
            System.out.println("Out Of Bounded Indexes.....!!!");
            // O(n)
        } else {
            int i = 0;
            Node prev = head;
            Node curr = head.next;
            while (i != index - 1) {
                curr = curr.next;
                prev = prev.next;
                i++;
            }
            Node newNode = new Node(value);
            newNode.next = curr;
            prev.next = newNode;
            numOfElem++;
        }
    }


    public void eraseAtIndex(int index) {
        if (index == 0) {
            pop_front();
        } else if (index == numOfElem - 1) {
            pop_back();
        } else if (index < 0 || index >= numOfElem) {
            System.out.println("Out Of Bounded Indexes.....!!!");
        } else {
            int i = 0;
            Node curr = head;
            while (i != index - 1) {
                curr = curr.next;
                i++;
            }
            curr.next = curr.next.next;
            numOfElem--;
        }
    }


    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next;
        tail = head;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    public int value_n_from_end(int n) {
        // n=1-1=0====> 4-0-1
        // 0  1  2  3
        // 3  2  1  0

        int index = numOfElem - n;
        if (index == 0) {
            return head.getValue();
        } else if (index == numOfElem - 1) {
            return tail.getValue();
        } else if (index < 0 || index >= numOfElem) {
            return -1;
        } else {
            int i = 0;
            Node curr = head;
            while (i < index) {
                curr = curr.next;
                i++;
            }
            return curr.getValue();
        }
    }


    public void remove_value(int value) {
        if (isEmpty()){
            System.out.println("Empty List :( !!!");
        }
        else if (head.getValue() == value) {
            pop_front();
        } else {
            System.out.println();
            Node current = head.next;
            Node prev = head;
            while (current.getValue() != value) {
                prev = current;
                current = current.next;
            }
            prev.next = current.next;
            current.next = null;
        }
        numOfElem--;
    }



    public void print(){
        if (isEmpty()){
            System.out.println("Empty List :( !!!!");
        }else {
            System.out.println();
            Node curr = head;
            while (curr != null) {
                System.out.print(curr.getValue() + " --->");
                curr = curr.next;
            }
            System.out.println();
        }
    }

}
