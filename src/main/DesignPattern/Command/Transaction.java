package Command;

import java.math.BigDecimal;

public class Transaction {
    private BigDecimal price;

    public Transaction (BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPrice () {
        return price;
    }

}
