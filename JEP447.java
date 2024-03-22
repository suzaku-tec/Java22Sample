import java.math.BigDecimal;

public class JEP447 extends BigDecimal {

    public JEP447(long value) {
        if (value <= 0)
            throw new IllegalArgumentException("non-positive value");

        super(value);               // Potentially unnecessary work
    }

}
