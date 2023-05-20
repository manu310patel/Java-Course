import java.util.Arrays;

public record Main() {
    class Person{
        String name;
    }
    public static void main(String[] args) {
        // int[] marks = {1,2,3,4,5,6,7,8};
        // System.out.println(marks.length);

        // for(int i=0;i<marks.length;++i){
        //     System.out.print(marks[i]+" ");
        // }

        int[] intMarks = new int[5];  //0 0 0 0 0 
        double[] doubleMarks = new double[5];  //0.0 0.0 0.0 0.0 0.0
        boolean[] booleanMarks = new boolean[5];  //false false false false false

        System.out.println(Arrays.toString(intMarks));
        System.out.println(Arrays.toString(doubleMarks));
        System.out.println(Arrays.toString(booleanMarks));
       

        Person[] persons = new Person[5]; //null null null null
        
        //in an array we can only store values of a specified type
        // int[] marks = {1,2,3,4.0}  this is wrong ❌ 
        
        // int[] marks = {100,99,95,96,100};
        // for(int mark : marks){    //enhanced for loop
        //     System.out.print(mark+" ");
        // }
        // System.out.println();

        int[] marks = new int[5];
        Arrays.fill(marks,100);

        int[] array1 = {1,2,3};
        int[] array2 = {1,2,3};

        System.out.println(Arrays.equals(array1, array2));
        
        int[] array3 = {2,3,1};

        System.out.println(Arrays.equals(array1, array3));
        
        Arrays.sort(array3); //in position sorting
        System.out.println(Arrays.toString(array3));

    }
}
