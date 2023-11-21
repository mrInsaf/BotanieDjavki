package LambdaLearning;

import java.util.List;

public class UserSorter {
    public List<User> sortUsers(List<User> input, List<User> output, UserSortingRule rule) {
        for (User user : input) {
            if (rule.sort(user))
                output.add(user);
        }
        return output;
    }

}


@FunctionalInterface
interface UserSortingRule {
    public boolean sort(User user);
}
