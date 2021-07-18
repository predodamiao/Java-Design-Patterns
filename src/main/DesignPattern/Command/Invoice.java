package Command;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Invoice {

    private LocalDateTime generationDate;
    private LocalDate dueDate;
    private BigDecimal price;

    public Invoice (BigDecimal price) {
        this.price = price;
        this.generationDate = LocalDateTime.now();
        this.dueDate = LocalDate.now().plusDays(15);
    }

    public BigDecimal getPrice () {
        return price;
    }
}
