package functionalinterface;

import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {

        //Normal java function
        System.out.println("Without Predicate");
        System.out.println(isValidPhoneNumber("07000000000"));
        System.out.println(isValidPhoneNumber("09000045000"));

        System.out.println("With Predicate");
        System.out.println(isValidPhoneNumberPredicate.test("07000000000"));
        System.out.println(isValidPhoneNumberPredicate.test("09000045000"));

        System.out.println("With Predicate and Contains");
        System.out.println(isValidPhoneNumberPredicate.and(containsNumber3).test("07000000033"));
        System.out.println(isValidPhoneNumberPredicate.and(containsNumber3).test("08030000000"));

    }

    static boolean isValidPhoneNumber(String phoneNumber){
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }

    static Predicate<String> isValidPhoneNumberPredicate = phoneNumber
            -> phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    static Predicate<String> containsNumber3 = phoneNumber
            -> phoneNumber.contains("3");
}
