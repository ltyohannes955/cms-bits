/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.cms.Ui;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author tito
 */
public class LoginFrameTest {
    @Test
    void userNameMustBeUser(){
    var LoginFrame = new LoginFrame();
    assertEquals(true, LoginFrame.user("User"));
}
    @Test
    void iFUserNameIsNotUser(){
    var LoginFrame = new LoginFrame();
    assertEquals(false, LoginFrame.user("use"));
}
    @Test
    void ifPasswordIsNotPassword(){
        var LoginFrame = new LoginFrame();
        assertEquals(false, LoginFrame.password("pass"));
    }
    
    @Test
    void ifPasswordIsPassword(){
        var LoginFrame = new LoginFrame();
        assertEquals(true, LoginFrame.password("Password"));
    }
}
