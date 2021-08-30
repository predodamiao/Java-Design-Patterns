package AbstractFactory;

import java.math.BigDecimal;

public interface TransferRate {
    BigDecimal calculateValue(BigDecimal value);
}
