package functionalinterface;

import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class _Supplier {

    public static void main(String[] args) {

        System.out.println(getDBConnectionURL());
        System.out.println();

        System.out.println(getDBConnectionURLSupplier.get());
        System.out.println(getDBConnectionSupplierList.get());

    }

    static String getDBConnectionURL(){
        return "jdbc://localhost:3360/users";
    }

    static Supplier<String> getDBConnectionURLSupplier = () -> "jdbc://localhost:3360/users";

    static Supplier<List<String>> getDBConnectionSupplierList = ()
            -> List.of("jdbc://localhost:3360/users", "jdbc://localhost:3360/users");
}
