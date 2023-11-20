import java.util.List;

public class StringSorter {
    public List<String> sortStrings(List<String> inputStrings, List<String> outputStrings, SortingRule sorter) {

        for (String str: inputStrings) {
            if (sorter.sort(str))
                outputStrings.add(str);
        }

        return outputStrings;
    }
}

@FunctionalInterface
interface SortingRule {
    boolean sort(String string);
}
