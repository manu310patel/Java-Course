public class Main {
    public static void main(String[] args) {
        // any class we create is a reference type
        // predefined classes like String is a reference type
        // the instances of class are reference variables

        // primitive types will be stored in stack
        // references will be stored in heap
        // Animal dog = new Animal();
        // here dog is a reference variable which contains value of
        // reference animal
        // so dog will be stored in stack
        // and the reference of which value it is having will be
        // stored in heap

        Animal dog = new Animal("Animal10");
        Animal cat = new Animal("Animal12");
        System.out.println(cat.getName()); // Animal12
        Animal temp;
        temp = cat;
        temp.setName("Animal13");
        System.out.println(temp.getName()); // Animal13
        System.out.println(cat.getName()); // Animal13
        // changing on temp changes cat, because both have value of same reference

        System.out.println(cat == dog);
        System.out.println(cat == temp);

        Animal dog2 = new Animal("Animal10");
        System.out.println(dog == dog2); // even though have same values but are not equal
        // as they are referring to different objects

        // String class
        String str1 = "test"; // no need to use constructor
        String str2 = new String("This is a lot of text"); // constructor can be used
        // but without it will also works in string class
        System.out.println(str1 + " " + str2);
        System.out.println(str1.charAt(0));
        System.out.println(str2.substring(5));
        System.out.println(str2.substring(5, 13));

        System.out.println(str2.indexOf("lot"));
        System.out.println(str2.indexOf("i"));
        System.out.println(str2.lastIndexOf("i"));
        System.out.println(str2.contains("text"));
        System.out.println(str2.startsWith("This is"));
        System.out.println(str2.endsWith(" text"));
        System.out.println(str2.isEmpty());
        System.out.println(str1.equals(new String("test"))); // true,content will be checked
        System.out.println(str1.equalsIgnoreCase(new String("TeSt")));

        // String in java is immutable
        String str = "Aditya";
        String anotherString = str.concat(" is Awesome");
        System.out.println(str + "\n" + anotherString);

        String upperCasedStr = str.toUpperCase();
        System.out.println(upperCasedStr);

        String lowerCasedStr = str.toLowerCase();
        System.out.println(lowerCasedStr);

        // to remove spaces at the start and end of the string
        String str3 = "     abcdef     ";
        String trimmedStr3 = str3.trim();
        System.out.println(trimmedStr3);

        // integer is converted to string on addition with a string
        System.out.println(1 + 2 + "3"); // "33" left to right associativity in addition
        System.out.println("1" + 2 + 3); // "123"

        System.out.println("Value is " + 20); // Value is 20
        System.out.println("Value is " + 20 + 20); // Value is 2020
        System.out.println("Value is " + (20 + 20)); // Value is 40

        String joinedStr = String.join(",", "A", "B", "C");
        System.out.println(joinedStr);
        String replacedStr = "abcd".replace('a', 'z');
        System.out.println(replacedStr);

        String replacedStr2 = "abcd".replace("ab","xyz");
        System.out.println(replacedStr2);

        //StringBuffer
        StringBuffer sb = new StringBuffer("TEst");
        System.out.println(sb);
        //StringBuffer is immutable
        sb.append(" 123");
        System.out.println(sb);

        sb.setCharAt(1, 'e');
        System.out.println(sb);

        //StringBuffer is synchronized class, which is ready for multithreading
        //in single threaded scenarios where we don't need multithreading
        //StringBuffer may get really slow

        StringBuilder sB = new StringBuilder("Test");
        System.out.println(sB);

        //if you want your code to be thread safe go to StringBuilder class


        // ---  Wrapper classes
        //why we need wrapper class , because they provide a lot of 
        //options
        //refer to WrapperClasses.java
    }
}
