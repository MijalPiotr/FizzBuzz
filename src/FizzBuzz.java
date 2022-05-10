import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzz {
    public static String fizzBuzz1(int i) {
        if (i % 15 == 0) {
            return "FizzBuzz";
        } else if (i % 5 == 0) {
            return "Buzz";
        } else if (i % 3 == 0) {
            return "Fizz";
        }
        return String.valueOf(i);
    }

    @Test
    public void testFizzBuzz() {
        assertEquals("FizzBuzz", fizzBuzz1(15));
        assertEquals("Buzz", fizzBuzz1(5));
        assertEquals("Fizz", fizzBuzz1(3));
        assertEquals("2", fizzBuzz1(2));
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 100; ++i) {
            System.out.println(FizzBuzz.fizzBuzz1(i));
        }
    }
}
