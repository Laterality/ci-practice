package kr.latera.cipractice;

public class Greeter {

    public static String greet(String name) {
        return String.format("Hello, %s!", name);
    }

    public static String bye(String name) {
        return String.format("Bye, %s!", name);
    }
}
