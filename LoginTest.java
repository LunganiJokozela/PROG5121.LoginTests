import org.junit.Test;
import static org.junit.Assert.*;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RC_Student_lab
 */
public class LoginTest {
    @Test
    public void testRegisterUser_CorrectInput() {
        Login.username = "kyl_1";
        Login.password = "Ch&&sec@ke99!";
        assertTrue(Login.registerUser());
    }

    @Test
    public void testRegisterUser_IncorrectUsername() {
        Login.username = "kyle!!!!!!";
        Login.password = "Ch&&sec@ke99!";
        assertFalse(Login.registerUser());
    }

    @Test
    public void testRegisterUser_IncorrectPassword() {
        Login.username = "kyl_1";
        Login.password = "password";
        assertFalse(Login.registerUser());
    }

    @Test
    public void testLoginUser_CorrectInput() {
        Login.username = "kyl_1";
        Login.password = "Ch&&sec@ke99!";
        assertTrue(Login.loginUser());
    }

    @Test
    public void testLoginUser_IncorrectInput() {
        Login.username = "kyle!!!!!!";
        Login.password = "Ch&&sec@ke99!";
        assertFalse(Login.loginUser());
    }

    @Test
    public void testCheckUserName_CorrectInput() {
        assertTrue(Login.checkUserName());
    }

    @Test
    public void testCheckUserName_IncorrectInput() {
        Login.username = "kyle!!!!!!";
        assertFalse(Login.checkUserName());
    }

    @Test
    public void testCheckPasswordComplexity_CorrectInput() {
        assertTrue(Login.checkPasswordComplexity());
    }

    @Test
    public void testCheckPasswordComplexity_IncorrectInput() {
        Login.password = "password";
        assertFalse(Login.checkPasswordComplexity());
    }
    
}
