package es.upm.miw.iwvg.ecosystem.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserTest {

    private User user;

    @Test
    void testFullname() {
        this.user = new User(001, "Yuling", "Hu");
        assertEquals("Yuling Hu", user.fullName());
    }

    @Test
    void testInitials(){
        this.user = new User(001, "Yuling", "Hu");
        String string = user.initials();
        System.out.printf(string);
        assertEquals("Y.", user.initials());
    }


    @Test
    void testGetName() {
        this.user = new User(001, "Yuling", "Hu");
        assertEquals("Yuling", user.getName());
    }


    @Test
    void testGetFamilyName() {
        this.user = new User(001, "Yuling", "Hu");
        assertEquals("Hu", user.getFamilyName());
    }
}