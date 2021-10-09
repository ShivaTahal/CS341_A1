/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.*;
import java.awt.event.KeyEvent;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author shiva
 */
public class KeyboardListenerTest {
    
    public KeyboardListenerTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of keyPressed method, of class KeyboardListener.
     */
    @Test
    public void testKeyPressed() {
        System.out.println("keyPressed");
        int numberOfIteration = 1000;
        Button myButton = new Button();
        KeyEvent leftKeyPressed = new KeyEvent(myButton, 1, 1, 1, KeyEvent.VK_LEFT);
        KeyEvent rightKeyPressed = new KeyEvent(myButton, 1, 1, 1, KeyEvent.VK_RIGHT);
        KeyEvent upKeyPressed = new KeyEvent(myButton, 1, 1, 1, KeyEvent.VK_UP);
        KeyEvent downKeyPressed = new KeyEvent(myButton, 1, 1, 1, KeyEvent.VK_DOWN);
        KeyEvent escapeKeyPressed = new KeyEvent(myButton, 1, 1, 1, KeyEvent.VK_ESCAPE);
        KeyboardListener keyEvent = new KeyboardListener();
        keyEvent.keyPressed(leftKeyPressed);
        keyEvent.keyPressed(rightKeyPressed);
        keyEvent.keyPressed(downKeyPressed);
        keyEvent.keyPressed(upKeyPressed);
        keyEvent.keyPressed(rightKeyPressed);
        keyEvent.keyPressed(leftKeyPressed);
        keyEvent.keyPressed(upKeyPressed);
        keyEvent.keyPressed(downKeyPressed);
        keyEvent.keyPressed(escapeKeyPressed);

        for (int i = 0; i < numberOfIteration; i++) {
            keyEvent.keyPressed(leftKeyPressed);
            keyEvent.keyPressed(downKeyPressed);
            keyEvent.keyPressed(leftKeyPressed);
            keyEvent.keyPressed(downKeyPressed);
            keyEvent.keyPressed(leftKeyPressed);
            keyEvent.keyPressed(downKeyPressed);

        }

        for (int i = 0; i < numberOfIteration; i++) {
            keyEvent.keyPressed(rightKeyPressed);
            keyEvent.keyPressed(upKeyPressed);
            keyEvent.keyPressed(rightKeyPressed);
            keyEvent.keyPressed(upKeyPressed);
            keyEvent.keyPressed(rightKeyPressed);
            keyEvent.keyPressed(upKeyPressed);
        }

        for (int i = 0; i < numberOfIteration; i++) {
            keyEvent.keyPressed(leftKeyPressed);
            keyEvent.keyPressed(upKeyPressed);
            keyEvent.keyPressed(leftKeyPressed);
            keyEvent.keyPressed(upKeyPressed);
            keyEvent.keyPressed(leftKeyPressed);
            keyEvent.keyPressed(upKeyPressed);
        }

        for (int i = 0; i < numberOfIteration; i++) {
            keyEvent.keyPressed(leftKeyPressed);
            keyEvent.keyPressed(downKeyPressed);
            keyEvent.keyPressed(leftKeyPressed);
            keyEvent.keyPressed(downKeyPressed);
            keyEvent.keyPressed(leftKeyPressed);
            keyEvent.keyPressed(downKeyPressed);

        }

        //If snake bite itself.
        keyEvent.keyPressed(leftKeyPressed);
        keyEvent.keyPressed(leftKeyPressed);
        keyEvent.keyPressed(downKeyPressed);
        keyEvent.keyPressed(downKeyPressed);
        keyEvent.keyPressed(upKeyPressed);
        keyEvent.keyPressed(upKeyPressed);
        keyEvent.keyPressed(rightKeyPressed);
        keyEvent.keyPressed(rightKeyPressed);

    }
    
}
