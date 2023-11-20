import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> inputStrings = new ArrayList<>();
        List<String> outputStrings = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        StringSorter stringSorter = new StringSorter();
        SortingRule sortingRule = (String str) -> str.contains("a");
        String input = "";

        while (!"0".equals(input)) {
            input = scan.nextLine();
            inputStrings.add(input);
        }
        outputStrings = stringSorter.sortStrings(inputStrings, outputStrings, sortingRule);
        System.out.println(outputStrings);
    }
}