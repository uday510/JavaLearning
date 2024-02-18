package DataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> list = new ArrayList<>();


        // Add elements to the list
        list.add(1);
        list.add(2);

        // List methods
        System.out.println(" list size: " + list.size());
        System.out.println(" list is empty: " + list.isEmpty());
        System.out.println(" list contains 1: " + list.contains(1));
        System.out.println(" list contains 3: " + list.contains(3));
        System.out.println(" list get 0: " + list.get(0));
        System.out.println(" list get 1: " + list.get(1));
        System.out.println(" list index of 1: " + list.indexOf(1));
        System.out.println(" list index of 2: " + list.indexOf(2));
        System.out.println(" list last index of 1: " + list.lastIndexOf(1));
        System.out.println("list remove at index 0: " + list.remove(0));
        System.out.println("list remove 2: " + list.remove(Integer.valueOf(2)));
        System.out.println("list set 0 to 3: " + list.set(0, 3));
        System.out.println("list to array: " + Arrays.toString(list.toArray()));
        System.out.println("list to string: " + list.toString());


        // sort the list in ascending order
        Collections.sort(list);
        list.sort((a, b) -> a - b);

        // sort using a lambda expression (descending order)
       list.sort((val1, val2) -> val2 - val1);

        List<ArrayExample.User> users = new ArrayList<>();
        users.add(new ArrayExample.User(1, "John"));
        users.add(new ArrayExample.User(2, "Doe"));
        users.add(new ArrayExample.User(3, "Smith"));
        users.add(new ArrayExample.User(4, "Brown"));
        users.add(new ArrayExample.User(5, "Wilson"));
        users.add(new ArrayExample.User(6, "Johnson"));


        // sort users by id
        users.sort((user1, user2) -> user1.id - user2.id);


        // print the list
        System.out.println(list);

        // remove the first element
        list.remove(0);

        // remove last element
        list.remove(list.size() - 1);


        // Create a list of strings

        List<String> list2 = new ArrayList<>();
        list2.add("Hello");
        list2.add("World");

        // print the list
        System.out.println(list2);

         users = new ArrayList<>();
        users.add(new ArrayExample.User(1, "John"));
        users.add(new ArrayExample.User(2, "Doe"));

        for (ArrayExample.User user : users) {
            System.out.println(user.id + " " + user.name);
        }
    }
}
