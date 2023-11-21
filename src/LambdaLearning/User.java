package LambdaLearning;

public class User {
    private final String name;
    private final int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "LambdaLearning.User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
