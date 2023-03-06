public class string {

    public static void main(String[] args) {
        // String name = "John";
        // String name = new String("Jason");
        // System.out.println("Hello " + name);

        // String literalString1 = "abc";
        // String literalString2 = "abc";
        // String objectString1 = new String("xyz");
        // String objectString2 = new String("xyz");

        // System.out.println(literalString1 == literalString2); // this will print true because the string is a literal and is stored in the same string pool
        // System.out.println(objectString1 == objectString2); // this will print false because the string is an object and is stored in different memory locations cause of the new keyword

        System.out.println("Hello World!".length()); // this will print 12 because it counts the spaces as well
        System.out.println("Hello World!".indexOf("o")); // this will print 4 because it starts counting from 0 and the first o is at index 4
        System.out.println("Hello World!".isEmpty()); // this will print false because the string is not empty

        // you can use the %s to print a string and the %d to print a number
        // toupper and tolower are methods that can be used to change the case of a string
        // string1.equals(string2) is used to compare two strings
        // string.replace(oldChar, newChar) is used to replace a character in a string
        // string.contains(substring) is used to check if a string contains a substring
        
    }
    
}
