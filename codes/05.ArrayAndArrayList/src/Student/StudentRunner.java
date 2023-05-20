package Student;

import java.math.BigDecimal;
import java.util.ArrayList;

class Person {
    String name;
};

public class StudentRunner {
    public static void main(String[] args) {
        // int[] marks = { 97, 98, 100 };

        // Student student = new Student("Aditya", marks);
        // Student student = new Student("Aditya", new int[]{97,98,100});
        Student student = new Student("Aditya", 97, 98, 100);

        int number = student.getNumberOfMarks();
        System.out.println("number of marks : " + number);

        int sum = student.getTotalSumOfMarks();
        System.out.println("sum of marks : " + sum);

        int maximumMark = student.getMaximumMark();
        System.out.println("maximum of marks : " + maximumMark);

        int minimumMark = student.getMinimumMark();
        System.out.println("Minimum of marks : " + minimumMark);

        BigDecimal average = student.getAverageMarks();
        System.out.println("Average of marks : " + average);

        System.out.println(student);

        student.addMark(98);

        System.out.println(student);

        student.removeMarkAtIndex(1);

        System.out.println(student);

        // Person[] persons = {new Person(),new Person(),new Person()};
        // System.out.println(persons[1].name);

        // String[] textValues = {"Apple","Ball","Cat"};

        //adding an element or deleting an element from an array 
        //is of O(n)
        
        // ArrayList arrayList = new ArrayList();
        // arrayList.add("Apple");
        // arrayList.add("Bat");
        // arrayList.add("Cat");
        // arrayList.add(1);

        // System.out.println(arrayList.toString());  //[Apple, Bat, Cat, 1]
        // arrayList.remove("Cat");
        // System.out.println(arrayList.toString());  //[Apple, Bat, 1]

        // ArrayList<String> arrayList2 = new ArrayList<>();
        // arrayList2.add("Apple");
        // arrayList2.add("Bat");
        // arrayList2.add("Cat");

        // System.out.println(arrayList2.toString());

    }
}
