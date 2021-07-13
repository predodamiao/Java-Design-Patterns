package Memento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class SystemTest {

    @Test
    public void shouldSaveSnapshots() {
        System system = new System("TheBest ERP");
        Snapshot s1 = new Snapshot("1.0");
        system.deploy(s1);
        Snapshot s2 = new Snapshot("1.1");
        system.deploy(s2);

        assertEquals(2, system.getAllSnapshots().size());
    }

    @Test
    public void shouldReturnInitalSnapshot() {
        System system = new System("TheBest ERP");
        Snapshot s1 = new Snapshot("1.0");
        system.deploy(s1);
        Snapshot s2 = new Snapshot("1.1");
        system.deploy(s2);
        system.restoreVersion(0);

        assertEquals("1.0", system.getCurrentSnapshot().getVersion());
    }

    @Test
    public void shouldReturnLastSnapshot() {
        System system = new System("TheBest ERP");
        Snapshot s1 = new Snapshot("1.0");
        system.deploy(s1);
        Snapshot s2 = new Snapshot("1.1");
        system.deploy(s2);
        Snapshot s3 = new Snapshot("1.2");
        system.deploy(s3);
        system.restoreLastVersion();

        assertEquals("1.1", system.getCurrentSnapshot().getVersion());
    }

    @Test
    public void shouldReturnInvalidSnapshot() {
        System system = new System("TheBest ERP");
        Snapshot s1 = new Snapshot("1.0");
        system.deploy(s1);

        try{
            system.restoreLastVersion();
            fail();
        }catch(Exception e){
            assertEquals("Snapshot not found", e.getMessage());
        }
    }
}
