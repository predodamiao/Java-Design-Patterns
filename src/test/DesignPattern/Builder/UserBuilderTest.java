package Builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserBuilderTest {

    @Test
    public void shouldReturnSimpleValidUser() {

        UserBuilder userBuilder = new UserBuilder();

        User user = userBuilder
                .setName("John Deere")
                .setId(147258369)
                .build();

        assertNotNull(user);
    }
    @Test
    public void shouldReturnCompleteValidUser() {

        UserBuilder userBuilder = new UserBuilder();

        User user = userBuilder
                .setName("John Deere")
                .setId(147258369)
                .setEmail("me@johndeere.com")
                .setSite("www.johndeere.com")
                .setTelephone("(11) 4002-8922")
                .build();

        assertNotNull(user);
    }

    @Test
    public void shouldFailUserWithoutName() {

        try {
            UserBuilder userBuilder = new UserBuilder();

            User user = userBuilder
                    .setId(147258369)
                    .build();

            fail();
        }catch(Exception e){
            assertEquals("Invalid name", e.getMessage());
        }
    }

    @Test
    public void shouldFailUserWithoutId() {

        try {
            UserBuilder userBuilder = new UserBuilder();

            User user = userBuilder
                    .setName("John Deere")
                    .build();

            fail();
        }catch(Exception e){
            assertEquals("Invalid id", e.getMessage());
        }
    }

    @Test
    public void shouldFailUserInvalidSite() {

        try {
            UserBuilder userBuilder = new UserBuilder();

            User user = userBuilder
                    .setName("John Deere")
                    .setId(147258369)
                    .setSite("meusite")
                    .build();

            fail();
        }catch(Exception e){
            assertEquals("Invalid site", e.getMessage());
        }
    }

    @Test
    public void shouldFailUserInvalidTelephone() {

        try {
            UserBuilder userBuilder = new UserBuilder();

            User user = userBuilder
                    .setName("John Deere")
                    .setId(147258369)
                    .setTelephone("(11) 1234-4567")
                    .build();

            fail();
        }catch(Exception e){
            assertEquals("Invalid telephone", e.getMessage());
        }
    }

    @Test
    public void shouldFailUserInvalidEmail() {

        try {
            UserBuilder userBuilder = new UserBuilder();

            User user = userBuilder
                    .setName("John Deere")
                    .setId(147258369)
                    .setEmail("me@johnDeere")
                    .build();

            fail();
        }catch(Exception e){
            assertEquals("Invalid e-mail", e.getMessage());
        }
    }
}
