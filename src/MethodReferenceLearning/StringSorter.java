package MethodReferenceLearning;

import java.util.List;

public class StringSorter {
    public List<String> sortStrings(List<String> inputStrings, List<String> outputStrings, SortingRule rule) {
        for (String str : inputStrings) {
            if (rule.sort(str))
                outputStrings.add(str);
        }
        return outputStrings;
    }
}

interface SortingRule {
    public boolean sort(String str);
}
