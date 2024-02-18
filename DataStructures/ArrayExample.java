package DataStructures;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayExample {
    public static void main(String[] args) {



//        int[] arr;
//
//        arr = new int[5];

        int[] arr = new int[10];

        // Array methods

        System.out.println("Array length: " + arr.length);
        System.out.println("Array element at index 0: " + arr[0]);
        System.out.println("Array changed element at index 0: " + arr[0]);

        // sort the array
        Arrays.sort(arr);

        // sort using descending order


        // print
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println(Arrays.toString(arr));

//        System.out.println(arr.length);

        // print range
//        System.out.println(Arrays.toString(Arrays.copyOfRange(arr, 0, 2)));

        // fill
//        Arrays.fill(arr, 10);
//        System.out.println(Arrays.toString(arr));

        // change arr[2] to 5
        arr[2] = 5;

        // custom array
        User[] users = new User[2];
        users[0] = new User(1, "John");
        users[1] = new User(2, "Doe");

        for (User user : users) {
            System.out.println(user.id + " " + user.name);
        }

        users[0].name = "new Name";

        System.out.println(users[0].name);

        // single object
//        User user = new User(3, "Jane");
//        System.out.println(user.id + " " + user.name);
    }
    static class User {
        int id;
        String name;
        public User(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }

}
