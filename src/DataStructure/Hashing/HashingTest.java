package DataStructure.Hashing;

import java.util.Scanner;

public class HashingTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner("JavaTpoint/Abhishek/Male/22");

        // useDelimiter() : as the split() function in String but in Scanner ,
        // and also used to get all Patterns in this String by using --ReGex--
        scan.useDelimiter("/");

        // next : Read the only One & First String until find a Space
        //System.out.println(scan.next());


        // hasNext() : Return True if there is string after the space
        while (scan.hasNext()){
            System.out.println(scan.next());
        }

    }
}
