package com.junittest;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.junit.UserRegistration;

public class UserRegistrationTest {
    UserRegistration registration = new UserRegistration();
    @Test
    void testValidUserRegistration() {
        assertTrue(registration.registerUser( "Priyanshu",  "priyanshu@example.com","password123"));
    }
    @Test
    void testInvalidUsername() {
        assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser("", "user@test.com", "password123");
        });
    }
    @Test
    void testInvalidEmail() {
        assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser("User", "invalidemail", "password123");
        });
    }

    @Test
    void testInvalidPassword() {
        assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser("User", "user@test.com", "123");
        });
    }

    @Test
    void testNullInputs() {
        assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser(null, null, null);
        });
    }
}
