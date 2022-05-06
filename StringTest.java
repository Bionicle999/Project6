/*
 * Class: CMSC201 
 * Instructor: Ashique Tanveer
 * Description: Write a JUnit test class to test the methods length, charAt, substring, and indexOf in the java.lang.String class.
 * Due: 5/15/22
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Moises Hernandez
*/
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringTest 
{

	@Test
	public void test() 
	{
		assertEquals(0, "".length());
		assertEquals(1, "R".length());
		assertEquals(2, "Re".length());
		assertEquals(3, "Res".length());
		assertEquals(4, "Rest".length());
		
	}
	
	@Test
	public void charAtTest() 
	{
		assertEquals('T', "Test".charAt(0));
		assertEquals('e', "Test".charAt(1));
		assertEquals('t', "Test".charAt(3));
	}

	@Test
	public void subStringTest() 
	{
		assertEquals("Nice", "Nice picture!".substring(0, 4));
		assertEquals("picture!?", "Nice picture!?".substring(5));
		assertEquals("ur", "Nice picture!?".substring(9, 11));
	}
	
	@Test
	public void indexOfTest()
	{
		assertEquals(2, "Test time".indexOf('s'));
		assertEquals(1, "Test time".indexOf('e'));
		assertEquals(6, "Test time".indexOf('i'));
	}
}
