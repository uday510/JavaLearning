package DataStructures;

public class StringExample {
    public static void main(String[] args) {

        // old way
        String str = new String();
        str = "Hello World";

        // new way and better way
//       String str = "Hello World";

        // String methods
        System.out.println("Length of the string: " + str.length());
        System.out.println("Character at index 1: " + str.charAt(1));
        System.out.println("Substring from index 0 to 5: " + str.substring(0, 5));
        System.out.println("Index of character 'o': " + str.indexOf('o')); // returns -1 if not found
        System.out.println("Index of character 'o' after index 5: " + str.indexOf('o', 5));
        System.out.println("Index of string 'World': " + str.indexOf("World"));
        System.out.println("Index of string 'World' after index 5: " + str.indexOf("World", 5));
        System.out.println("String in uppercase: " + str.toUpperCase());
        System.out.println("String in lowercase: " + str.toLowerCase());
        System.out.println("String with leading and trailing spaces removed: " + "  Hello World  ".trim());
        System.out.println("String replaced: " + str.replace("World", "Universe"));
        System.out.println("String split by space: " + str.split(" ")[0] + " " + str.split(" ")[1]);
        System.out.println("String starts with 'Hello': " + str.startsWith("Hello"));
        System.out.println("String ends with 'World': " + str.endsWith("World"));
        System.out.println("String contains 'World': " + str.contains("World"));


        // Add string to string
        String str1 = "Hello";
        String str2 = "World";

        String newStr = str1 + " " + str2;
        // this is not efficient because it creates a new string object in memory

        // StringBuilder
        StringBuilder sb = new StringBuilder(); //

        sb.append("h");
        sb.append("100000");

        // StringBuilder methods
        System.out.println("StringBuilder length: " + sb.length());
        System.out.println("StringBuilder capacity: " + sb.capacity());
        System.out.println("StringBuilder to string: " + sb.toString());
        System.out.println("StringBuilder reverse: " + sb.reverse()); // this is efficient
        System.out.println("StringBuilder delete: " + sb.delete(0, 1));
        System.out.println("StringBuilder insert: " + sb.insert(0, "h"));
        System.out.println("StringBuilder replace: " + sb.replace(0, 1, "H"));


        // aabbccddaddbb return unique characters string
        // use StringBuilder to build the string
        StringBuilder sb1 = new StringBuilder();
    }
}
