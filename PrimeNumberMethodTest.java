/*
 * Class: CMSC201 
 * Instructor: Ashique Tanveer
 * Description: Write a JUnit test class to test the method isPrime in Listing 6.7, PrimeNumberMethod.java.
 * Use javadoc comments to describe a class, an interface, data fields, and methods

 * Due: 5/15/22
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Moises Hernandez
*/
import org.junit.Assert;
import org.junit.Test;

public class PrimeNumberMethodTest 
{
	

	@Test
	public void primeNumberTestPositive() 
	{
		Assert.assertTrue(PrimeNumberMethod.isPrime(2));
        Assert.assertTrue(PrimeNumberMethod.isPrime(3));
        Assert.assertTrue(PrimeNumberMethod.isPrime(5));
        Assert.assertTrue(PrimeNumberMethod.isPrime(7));
		
	}
	
	@Test
	 public void primeNumberTestNegative() 
	{
		Assert.assertFalse(PrimeNumberMethod.isPrime(4));
        Assert.assertFalse(PrimeNumberMethod.isPrime(9));
        Assert.assertFalse(PrimeNumberMethod.isPrime(10));
        Assert.assertFalse(PrimeNumberMethod.isPrime(15));
	}
	

}
