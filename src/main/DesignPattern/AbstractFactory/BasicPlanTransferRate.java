package AbstractFactory;

import java.math.BigDecimal;

public class BasicPlanTransferRate implements TransferRate{
    @Override
    public BigDecimal calculateValue (BigDecimal value) {
        return value.multiply(new BigDecimal("0.30"));
    }
}
