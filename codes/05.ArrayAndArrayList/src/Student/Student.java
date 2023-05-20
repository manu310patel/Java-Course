package Student;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class Student {
    private String name;
    private ArrayList<Integer> marks = new ArrayList<>();

    // public Student(String name, int[] marks) {
    // this.name = name;
    // this.marks = marks;
    // }
    public Student(String name, int... marks) {
        //variable argument must be the last parameter
        this.name = name;
        for(int mark : marks){
            this.marks.add(mark);
        }
    }

    public int getNumberOfMarks() {
        return marks.size();
    }

    public int getTotalSumOfMarks() {
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
        return totalMarks;
    }

    public int getMaximumMark() {
        // int maxMark = Integer.MIN_VALUE;
        // for (int mark : marks) {
        //     maxMark = Math.max(maxMark, mark);
        // }
        // return maxMark;
        return Collections.max(marks);
    }

    public int getMinimumMark() {
        // int minMark = Integer.MAX_VALUE;
        // for (int mark : marks) {
        //     minMark = Math.min(minMark, mark);
        // }
        // return minMark;
        return Collections.min(marks);
    }

    public BigDecimal getAverageMarks() {
        int sum = getTotalSumOfMarks();
        int number = getNumberOfMarks();
        return new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.UP);
        // 98.66666666666666...... non terminating
        // we can solve this by using Precision and Rounding

    }

    public String toString(){
        return name + " : " + marks + "\n";
    }

    public void addMark(int mark){
        marks.add(mark);
    }

    public void removeMarkAtIndex(int index){
        marks.remove(index);
    }

}
