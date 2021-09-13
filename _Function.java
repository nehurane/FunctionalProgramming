package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {
        int counter = incrementByOne(1);
        System.out.println(counter);

        int counter2 = incrementByOneFunction.apply(1);
        System.out.println(counter2);

        int multiplyCounter  =  multipleBy10Function.apply(counter2);
        System.out.println(multiplyCounter);

        Function<Integer, Integer> addBy1AndThenMultiplyBy10 = incrementByOneFunction.andThen(multipleBy10Function);
        System.out.println(addBy1AndThenMultiplyBy10.apply(4));

        System.out.println(incrementByOneMultiplyBiFunction.apply(4, 100));
    }

    static Function<Integer, Integer> incrementByOneFunction =  number  -> number + 1;

    static Function<Integer, Integer> multipleBy10Function = number -> number * 10;

    static int incrementByOne (final int number){
        return number + 1;
    }

    static int incrementByOneAndMultiply(final int number, final int numberToMultiply){
        return (number + 1) * numberToMultiply;
    }

    static BiFunction<Integer, Integer, Integer> incrementByOneMultiplyBiFunction =
            (numberToIncrement, numberMultiplyBy)
                -> (numberToIncrement + 1) * numberMultiplyBy;
}
