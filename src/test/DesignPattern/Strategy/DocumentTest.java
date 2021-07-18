package Strategy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DocumentTest {

    Document doc;

    @BeforeEach
    public void init(){
        doc = new Document("abcde");
    }

    @Test
    public void shouldFormatDefault() {
        doc.formatDefault();
        assertEquals("abcde", doc.getText());
    }

    @Test
    public void shouldFormatVertically() {
        doc.formatVertical();
        assertEquals("a\nb\nc\nd\ne", doc.getText());
    }

    @Test
    public void shouldFormatStairsLike() {
        doc.formatStairsLike();
        assertEquals("a\n b\n  c\n   d\n    e", doc.getText());
    }
}
