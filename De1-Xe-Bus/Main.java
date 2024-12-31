import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);

        System.out.println(today.plusYears(1));
    }
}