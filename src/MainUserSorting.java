import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainUserSorting {
    public static void main(String[] args) {
        List<User> inputUsers = new ArrayList<>();
        List<User> outputUsers = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        String inputName;
        String inputAge;

        while (true) {
            System.out.println("Введите имя пользователя");
            inputName = scan.nextLine();
            if ("/".equals(inputName))
                break;
            System.out.println("Введите возраст пользователя");
            inputAge = scan.nextLine();
            if ("/".equals(inputAge))
                break;
            User user = new User(inputName, Integer.parseInt(inputAge));
            inputUsers.add(user);
        }

        UserSorter sorter = new UserSorter();
        outputUsers = sorter.sortUsers(inputUsers, outputUsers, user -> user.getAge() > 9);

        System.out.println(outputUsers);
    }
}
