/**
 * 
 */
package maths;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import week10Lecture1.NumberCruncher;

/**
 * @author Ronan J Timoney
 *
 */
class NumberCruncherTest {
    final static int LOW_INTEGER = 2;
    final static int MID_INTEGER = 4;
    final static int HIGH_INTEGER = 6;
    // test data
    int num1, num2, num3;
    NumberCruncher nc;
    @BeforeEach
    void setUp() throws Exception {
        System.out.println("Setup code");
        num1 = LOW_INTEGER;
        num2 = MID_INTEGER;
        num3 = HIGH_INTEGER;
        nc = new NumberCruncher();
    }
    @Test
    final void testAddNumbersIntIntInt() {
        System.out.println("add 3 numbers test code");
        int expected = 12;
        int actual = nc.addNumbers(num1, num2, num3);
        assertEquals(expected, actual);
    }
    @Test
    final void testAddNumbersIntInt() {
        System.out.println("add 2number test code");
        int expected = 6; // it should be 6!
        int actual = nc.addNumbers(num1, num2);
        assertEquals(expected, actual);
    }
    @Test
    final void testMultiplyIntInt() {
        int expected = 8;
        int actual = nc.multiplyNumbers(2, 4);
        assertEquals(expected, actual);
    }
    @Test
    final void testMultiplyIntIntInt() {
        int expected = 8;
        int actual = nc.multiplyNumbers(2, 2, 2);
        assertEquals(expected, actual);
    }
    
    public void testDivideNumbersNoZeros() {
    	int num1=6;
    	int num2 = 3;
    	int expected = num1/num2;
    	try {
			int actual= nc.divideNumbers(num1, num2);
			assertEquals(expected,actual);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		}
    	
    	public void testDivideNumbersWithZeros() {
        	
    		Exception e = assertThrows(Exception.class, () -> {nc.divideNumbers(4, 0);});
    		
    		int num1=6;
        	int num2 =0;
        	int expected = num1/num2;
        	int actual=0;
        	try {
    			int actual= nc.divideNumbers(num1, num2);
    			
    		} catch (Exception e) {
    			System.out.println("We have zeros");
    			e.printStackTrace();
    		} assertEquals(expected,actual);
    	
    }
}