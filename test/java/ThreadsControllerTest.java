/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.internal.verification.VerificationModeFactory.times;

/**
 *
 * @author shiva
 */
public class ThreadsControllerTest {
    
    public ThreadsControllerTest() {
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
     * Test of run method, of class ThreadsController.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        Tuple test = new Tuple(10, 10);
        ThreadsController instance = new ThreadsController(test);
        instance.start();
        instance.interrupt();
    }
    @Test
    public void testmoveInterne() {
        ArrayList<ArrayList<DataOfSquare>> Squares = new ArrayList<ArrayList<DataOfSquare>>();
        Tuple headSnakePos;
        int sizeSnake = 3;
        long speed = 50;
        int directionSnake;
        ArrayList<Tuple> positions = new ArrayList<Tuple>();
        Tuple foodPosition;
        Tuple myTuple = new Tuple(10, 10);
        ThreadsController instance = new ThreadsController(myTuple);
        instance.start();
        new KeyboardListenerTest().testKeyPressed();

    }
    
}
