import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Grading {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            int grade = in.nextInt();
            System.out.println(getRoundedGrade(grade));
        }
    }
    
    private static int getRoundedGrade(int grade) {
        if (grade < 38) {
            return grade;
        }
        int differenceToNext5 = grade % 5;
        if(differenceToNext5 >= 3) {
            return grade + 5 - differenceToNext5;
        }
        return grade;
    }

}

