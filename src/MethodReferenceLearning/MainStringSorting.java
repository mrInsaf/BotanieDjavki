package MethodReferenceLearning;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainStringSorting {
    public static void main(String[] args) {
        List<String> inputStrings = new ArrayList<>();
        List<String> outputStrings = new ArrayList<>();
        StringSorter sorter = new StringSorter();
        Scanner scan = new Scanner(System.in);

        String input = "";
        System.out.println("Введите список строк через enter");
        while (!"/".equals(input)) {
            input = scan.nextLine();
            inputStrings.add(input);
        }

        SortingRule rule = String::startsWith;
    }

}
