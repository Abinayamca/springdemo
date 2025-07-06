/**
 * 
 */
package com.demo.pathdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.demo.pathdemo.Service.PathService;

class PathServiceTest {

	/*@Test
	void test() {
		fail("Not yet implemented");
	}*/
	
	PathService calc = new PathService();

    @Test
    public void testAdd() {
        assertEquals(30, calc.add(10, 20));
    }

    @Test
    public void testIsEvenTrue() {
        assertTrue(calc.isEven(8));
    }

    @Test
    public void testIsEvenFalse() {
        assertFalse(calc.isEven(9));
    }

}
