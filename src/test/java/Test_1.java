import io.vavr.Tuple;
import io.vavr.Tuple2;

import org.junit.Test;


public class Test_1 {

    @Test
    public void touples_test() {
        // touples
        Tuple2<String, Integer> java8 = Tuple.of("Java", 8);
        System.out.println(java8);

    }
}
