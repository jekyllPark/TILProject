package The_java_various_ways_to_manipulate_code;

public class App {

    static String name;

    static {
        name = "hi";
    }
    public static void main(String[] args) {
        ClassLoader classLoader = App.class.getClassLoader();
        System.out.println("classLoader = " + classLoader.getName());
    }
}
