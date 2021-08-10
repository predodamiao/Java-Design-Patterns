package Interpreter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CommandInterpreterTest {

    @Test
    public void simpleCommandTest() {
        Command expected = new Command();
        expected.setCommand("pwd");

        Command c = CommandInterpreter.interpret("pwd");
        assertEquals(expected.toString(), c.toString());
    }

    @Test
    public void mediumCommandTest() {
        Command expected = new Command();
        expected.setCommand("pwd");
        expected.addOption("test", "");
        expected.addOption("-f", "aaa");

        Command c = CommandInterpreter.interpret("pwd test -f aaa");
        assertEquals(expected.toString(), c.toString());
    }

    @Test
    public void complexCommandTest() {
        Command expected = new Command();
        expected.setCommand("pwd");
        expected.addOption("-a", "test");
        expected.addOption("-b", "test");
        expected.addOption("-c", "test");

        Command c = CommandInterpreter.interpret("pwd -a test -b test -c test");
        assertEquals(expected.toString(), c.toString());
    }

    @Test
    public void emptyCommandTest() {
        try {
            Command c = CommandInterpreter.interpret("");
            fail();
        }catch (Exception e){
            assertEquals(e.getMessage(), "Invalid command");
        }

    }

    @Test
    public void nonValidCommandTest() {
        try {
            Command c = CommandInterpreter.interpret("pwd -a");
            fail();
        }catch (Exception e){
            assertEquals(e.getMessage(), "Invalid command");
        }

    }
}
