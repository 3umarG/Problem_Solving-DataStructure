package DataStructure.Arrays;

public class Implement {
    public static void main(String[] args) {
        // Code....
        DynamicArray array = new DynamicArray(4);
        array.push(1);
        array.push(2);
        array.push(3);
        array.push(4);
        array.push(5);
        array.pop();
        array.pop();
        array.pop();
        array.push(5);
        array.push(6);
        array.insertAt(2,3);
        array.insertAt(3,4);
        System.out.println("Index="+array.find(5));
        array.removeItem(4);
        array.deleteAt(1);
        System.out.println("The item in index  2 = "+array.at(2));
        array.pop();
        array.pop();
        array.displayItems();
        System.out.println(array.getCapacity());
        System.out.println(array.getSize());
    }
}
