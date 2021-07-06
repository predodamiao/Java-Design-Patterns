package ChainOfResponsability;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserTest {

    Node delete;
    Node update;
    Node read;
    Node create;
    Node login;

    User pedro ;
    User henrique;
    User cunha;
    User leonardo;
    User leandro;

    @BeforeEach
    public void init(){
        pedro      = new User("pedro"      ,"1234");
        henrique   = new User("henrique"   ,"45678");
        cunha      = new User("cunha"      ,"567891");
        leonardo   = new User("leonardo"   , "456489");
        leandro    = new User();
        leandro.setLogin("leandro");

        delete = new Delete();
        update = new Update(delete);
        read = new Read(update);
        create = new Create(read);
        login = new Login(create);

        login.setAllowedUsers(  pedro.getLogin(), henrique.getLogin(), cunha.getLogin(), leonardo.getLogin(), leandro.getLogin());
        create.setAllowedUsers( pedro.getLogin(), henrique.getLogin(), cunha.getLogin(), leonardo.getLogin());
        read.setAllowedUsers(   pedro.getLogin(), henrique.getLogin(), cunha.getLogin());
        update.setAllowedUsers( pedro.getLogin(), henrique.getLogin());
        delete.setAllowedUsers( pedro.getLogin());
    }


    @Test
    public void shouldNotGetLogged() {
        login.handle(leandro);
        assertFalse(leandro.isLogged());
    }

    @Test
    public void shouldBeAllowedCRUD() {
        login.handle(pedro);
        assertTrue(pedro.getPermissions().containsAll(Arrays.asList("Create", "Read", "Update", "Delete")));
    }

    @Test
    public void shouldBeAllowedCRU() {
        login.handle(henrique);
        assertTrue(henrique.getPermissions().containsAll(Arrays.asList("Create", "Read", "Update")));
    }

    @Test
    public void shouldBeAllowedCR() {
        login.handle(cunha);
        assertTrue(cunha.getPermissions().containsAll(Arrays.asList("Create", "Read")));
    }

    @Test
    public void shouldBeAllowedC() {
        login.handle(leonardo);
        assertTrue(leonardo.getPermissions().contains("Create"));
    }

    @Test
    public void shouldNotBeAllowed() {
        leandro.setPassword("7897");
        login.handle(leandro);
        assertTrue(leonardo.getPermissions().isEmpty());
    }

}
