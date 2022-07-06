package DataStructure.LinkedLists;

import java.util.LinkedList;
import java.util.List;

public class Implement {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        LinkedListCustomized list = new LinkedListCustomized();
        list.push_front(1);
        list.push_front(2);
        list.push_front(3);
        list.push_front(4);
        list.push_front(5);
        list.print();
        list.reverse();
        list.print();
        list.pop_front();
        list.print();
       // System.out.println(list.size());
        list.insertAtIndex(2,10);
        list.print();
        list.eraseAtIndex(3);
        list.print();
        list.push_back(10);
        list.print();
        System.out.println("Front = "+list.getFrontValue()+"   "+"Back = "+list.getBackValue());
        //System.out.println(list.value_n_from_end(2));
        list.remove_value(10);
        list.print();
        System.out.println("Front = "+list.getFrontValue()+"   "+"Back = "+list.getBackValue());
    }
}
