package Singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WebServiceTest {

    @Test
    public void shouldReturnAnInstanceOfWebService() {

        assertTrue(WebService.getInstance() instanceof WebService);
    }

    @Test
    public void shouldReturnIP() {

        WebService.getInstance().setIp("192.168.0.1");
        assertEquals("192.168.0.1", WebService.getInstance().getIp());
    }

    @Test
    public void shouldReturnPort() {

        WebService.getInstance().setPort(1349);
        assertEquals(1349, WebService.getInstance().getPort());
    }

    @Test
    public void shouldReturnProtocol() {

        WebService.getInstance().setProtocol("SOAP");
        assertEquals("SOAP", WebService.getInstance().getProtocol());
    }

    @Test
    public void shouldReturnLogin() {

        WebService.getInstance().setLogin("admin");
        assertEquals("admin", WebService.getInstance().getLogin());
    }

    @Test
    public void shouldReturnPassword() {

        WebService.getInstance().setPassword("admin1234");
        assertEquals("admin1234", WebService.getInstance().getPassword());
    }

}
