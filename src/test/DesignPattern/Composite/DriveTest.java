package Composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DriveTest {

    @Test
    public void testDrive() {
        Drive C = new Drive("C");

        Directory bin = new Directory("bin");
        C.addDirectory(bin);

        Archive configuration = new Archive("all.conf");
        bin.addFile(configuration);
        Archive net = new Archive("net.d");
        bin.addFile(net);


        Directory users = new Directory("users");
        C.addDirectory(users);
        Directory home = new Directory("home");
        users.addFile(home);

        Archive teste = new Archive("teste.txt");
        home.addFile(teste);

        assertEquals("C\n\\bin\n-all.conf\n-net.d\n\\users\n\\home\n-teste.txt", C.getContent());
    }


}
