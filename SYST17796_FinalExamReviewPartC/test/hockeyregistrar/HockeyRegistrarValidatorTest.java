/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hockeyregistrar;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Frankie
 */
public class HockeyRegistrarValidatorTest {
    
    
    public HockeyRegistrarValidatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Good Test of validateBirthYear method, of class HockeyRegistrarValidator.
     */
    @Test
    public void testValidateBirthYearGood() {
        System.out.println("Validate Birth Year Good");
        int playerBirthYear = 2010;
        boolean expResult = true;
        HockeyRegistrarValidator hockeyRegistrar = new HockeyRegistrarValidator();
        boolean result = hockeyRegistrar.validateBirthYear(playerBirthYear);
        assertEquals(expResult, result);
    }
    
    /**
     * Bad Test of validateBirthYear method, of class HockeyRegistrarValidator.
     */
    @Test
    public void testValidateBirthYearBad() {
        System.out.println("Validate Birth Year Bad");
        int playerBirthYear = 2008;
        boolean expResult = false;
        HockeyRegistrarValidator hockeyRegistrar = new HockeyRegistrarValidator();
        boolean result = hockeyRegistrar.validateBirthYear(playerBirthYear);
        assertEquals(expResult, result);
    }
    /**
     * Boundary Test of validateBirthYear method, of class HockeyRegistrarValidator.
     */
    @Test
    public void testValidateBirthYearBoundary() {
        System.out.println("Validate Birth Year Bad");
        int playerBirthYear = 2009;
        boolean expResult = true;
        HockeyRegistrarValidator hockeyRegistrar = new HockeyRegistrarValidator();
        boolean result = hockeyRegistrar.validateBirthYear(playerBirthYear);
        assertEquals(expResult, result);
    }
}
