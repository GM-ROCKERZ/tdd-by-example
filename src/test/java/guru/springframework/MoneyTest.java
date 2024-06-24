package guru.springframework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoneyTest
{
    @Test
    void testMultiplication()
    {
        Money five = Money.dollar(5);
        assertEquals(Money.dollar(10),five.times(2));
        assertEquals(Money.dollar(15),five.times(3));

        Money fiveF = Money.franc(5);
        assertEquals(Money.franc(10),fiveF.times(2));

    }
}
