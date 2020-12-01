import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Lambda!");
        // conventional function: int function(Object parameter) { return expression;}
        // lambda functions:
        // parameter -> expression
        // (param1, param2) -> expression
        // (param1, param2) -> {line1; return expression;} // better avoid it
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(-1);
        list.add(0);
        list.forEach(e -> System.out.println(e));

        Foo lambda = parameter -> parameter + " from lambda!";
        lambdaDemo(lambda, "Hello");
        lambdaDemo(m -> m + " from argument!", "Hello");

        list.forEach(System.out::println); // e -> System.out.println(e)
    }

    public static void lambdaDemo(Foo foo, String message) {
        String result = foo.method(message);
        System.out.println(result);
    }
}
