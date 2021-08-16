package Proxy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DocumentTest {

    @BeforeEach
    public void setUp() {
        SSD.saveDocument(new Document("test.txt", "Daniel", "test test test test test test test test"));
        SSD.saveDocument(new Document("LetItGo.txt", "Danya", "Let it go, let it go\nCan't hold it back anymore\nLet it go, let it go\nTurn away and slam the door\n"));
    }

    @Test
    public void shouldReturnOwner() {
        DocumentProxy doc = new DocumentProxy("test.txt");

        assertEquals("Daniel", doc.getOwner());
    }

    @Test
    public void shouldReturnContent() {
        DocumentProxy doc = new DocumentProxy("test.txt");

        assertEquals("test test test test test test test test", doc.readDocument("Daniel"));
    }

    @Test
    public void shouldFailOnUnauthorizedTryOfReading() {
        try {
            DocumentProxy doc = new DocumentProxy("LetItGo.txt");

            doc.readDocument("Daniel");
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Invalid Owner", e.getMessage());
        }
    }
}
