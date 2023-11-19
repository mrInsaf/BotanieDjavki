import java.util.List;

public class StringSorter {
    public List<String> sortStrings(List<String> inputStrings, List<String> outputStrings) {
        Sorting sorter = (String str) -> str.contains("a");
        for (String str: inputStrings) {
            if (sorter.sort(str))
                outputStrings.add(str);
        }

        return outputStrings;
    }
}

@FunctionalInterface
interface Sorting {
    boolean sort(String string);
}
