import java.math.BigInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Test {

    public static void main(String[] args) {
        var list = Stream.of(BigInteger.ONE, BigInteger.ONE).collect(Collectors.toList());
        var index = 0;
        while (list.get(index).toString().length() < 1000) {
            list.add(list.get(index).add(list.get(index + 1)));
            index++;
        }
        System.out.println(index + 1);
    }


}
