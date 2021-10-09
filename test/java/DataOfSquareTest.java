/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.*;
import java.awt.*;
import java.util.ArrayList;

/**
 *
 * @author Harshad Shiva Chand
 * ID : S11158346
 * Date Created : 10/08/2021- mm/dd/yyyy
 */
public class DataOfSquareTest {
    
    public DataOfSquareTest() {
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
     * Test of lightMeUp method, of class DataOfSquare.
     */
    @Test
    public void testLightMeUp() {
        System.out.println("lightMeUp");
        ArrayList<Color> C = new ArrayList<Color>();

        C.add(Color.darkGray);//0
        C.add(Color.BLUE);//1
        C.add(Color.white);//2

        DataOfSquare dataOfSquareInstance = new DataOfSquare(C.indexOf(Color.darkGray));
        dataOfSquareInstance.lightMeUp(0);

        dataOfSquareInstance = new DataOfSquare(C.indexOf(Color.BLUE));
        dataOfSquareInstance.lightMeUp(1);

        dataOfSquareInstance = new DataOfSquare(C.indexOf(Color.white));
        dataOfSquareInstance.lightMeUp(2);
    }
    
}
