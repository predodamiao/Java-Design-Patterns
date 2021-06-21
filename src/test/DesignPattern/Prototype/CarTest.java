package Prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {

    @Test
    public void shouldNotModifyOriginal() throws CloneNotSupportedException {

        Car carBase = new Car();
        carBase.setCompany("GM")
                .setModel("Camaro")
                .setYear(2022)
                .setSerialNumber("YHPHDIPV456VFV564");

        Car carClone = carBase.clone();

        carClone.setSerialNumber("DKSALFKJCVODS4556");

        assertEquals("YHPHDIPV456VFV564", carBase.getSerialNumber());
    }

    @Test
    public void shouldNotModifyClone() throws CloneNotSupportedException {

        Car carBase = new Car();
        carBase.setCompany("GM")
                .setModel("Camaro")
                .setYear(2022)
                .setSerialNumber("YHPHDIPV456VFV564");

        Car carClone = carBase.clone();

        carBase.setModel("Onix Joy");

        assertEquals("Camaro", carClone.getModel());
    }

}
