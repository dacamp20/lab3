import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 2, 4, 6 ,8 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 8, 6, 4, 2}, input1);
	}

  @Test 
	public void testReverseInPlace2() {
    int[] input1 = { 1, 2, 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3, 2, 1 }, input1);
	}

  @Test 
	public void testReverseInPlace3() {
    int[] input1 = { 1, 2, 1 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{1, 2, 1 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = {2, 4, 6, 8 };
    assertArrayEquals(new int[]{ 8, 6, 4, 2}, ArrayExamples.reversed(input1));
  }
}
