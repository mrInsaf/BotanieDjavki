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
