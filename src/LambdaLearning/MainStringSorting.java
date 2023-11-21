package LambdaLearning;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainStringSorting {
    public static void main(String[] args) {
        List<String> inputStrings = new ArrayList<>();
        List<String> outputStrings = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        StringSorter stringSorter = new StringSorter();
        String input = "";

        while (!"0".equals(input)) {
            input = scan.nextLine();
            inputStrings.add(input);
        }
        outputStrings = stringSorter.sortStrings(inputStrings, outputStrings, string -> string.contains("a"));
        System.out.println(outputStrings);
    }
}