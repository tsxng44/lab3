import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test
  public void testReverseInPlaceTwo() {
    int[] input1 = {1, 2, 3, 4, 5, 6, 7, 8};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{8, 7, 6, 5, 4, 3, 2, 1}, input1);
  }


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

    @Test
  public void testReversedTwo() {
    int[] input1 = {9, 7, 5, 3, 2, 1};
    assertArrayEquals(new int[]{1, 2, 3, 5, 7, 9}, ArrayExamples.reversed(input1));
  }

  @Test
  public void TestAverageWithoutLowest(){
    double[] input1 = {1.0, 1.0, 2.0, 3.0, 4.0, 5.0};
    double output = ArrayExamples.averageWithoutLowest(input1);
    assertequals(3.5, output);
  }
}
