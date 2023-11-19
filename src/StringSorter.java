import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringSorter {
    public List<String> sortStrings(List<String> inputStrings, List<String> outputStrings) {
        Sorting sorter = (String str) -> {return str.contains("a");};
        for (String str: inputStrings) {
            if (sorter.sort(str))
                outputStrings.add(str);
        }

        return outputStrings;
    }
}

interface Sorting {
    boolean sort(String string);
}

class Testing {
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
        outputStrings = stringSorter.sortStrings(inputStrings, outputStrings);
        System.out.println(outputStrings);
    }
}