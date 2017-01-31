import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.ArrayList;
import java.util.List;

public class WeightedString {
    
    private List<Character> alphabetValues;
    {
        alphabetValues = new ArrayList<>();
        alphabetValues.add('0');
        alphabetValues.add('a');
        alphabetValues.add('b');
        alphabetValues.add('c');
        alphabetValues.add('d');
        alphabetValues.add('e');
        alphabetValues.add('f');
        alphabetValues.add('g');
        alphabetValues.add('h');
        alphabetValues.add('i');
        alphabetValues.add('j');
        alphabetValues.add('k');
        alphabetValues.add('l');
        alphabetValues.add('m');
        alphabetValues.add('n');
        alphabetValues.add('o');
        alphabetValues.add('q');
        alphabetValues.add('r');
        alphabetValues.add('s');
        alphabetValues.add('t');
        alphabetValues.add('u');
        alphabetValues.add('v');
        alphabetValues.add('w');
        alphabetValues.add('x');
        alphabetValues.add('y');
        alphabetValues.add('z');
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner in = new Scanner(System.in);
        String s = in.next();
        List<Integer> inputValues = solution.getSubstringValues(s);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            int x = in.nextInt();
            System.out.println(inputValues.contains(x) ? "Yes" : "No");
        }
    }
    
    public List<Integer> getSubstringValues(String input) {
        List<Integer> inputValues = new ArrayList<>();
        for(int i = 0; i < input.length(); i++) {
            int charValue = alphabetValues.indexOf(input.charAt(i));
            if(i > 0 && (input.charAt(i-1) == input.charAt(i))) {
                inputValues.add(charValue + inputValues.get(i-1));
            }
            else {
                inputValues.add(charValue);
            }
        }
        return inputValues;
    }
    
}

