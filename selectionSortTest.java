import static org.junit.Assert.*;

import org.junit.Test;

public class selectionSortTest {

	@Test
	public void test()
	{
		//testPositive();
		//testNegative();
		//testMixed();
		testDuplicates();
	}
	public void testPositive()
     {
     	int[] arr = new int[5];
     	arr[0] = 8;
     	arr[1] = 9;
     	arr[2] = 7;
     	arr[3] = 10;
     	arr[4] = 2;

     	selectionSort temp1 = new selectionSort();
     	temp1.basicSelectionSort(arr);

     	int[] Sortedarr = new int[5];
     	Sortedarr[0] = 2;
     	Sortedarr[1] = 7;
     	Sortedarr[2] = 8;
     	Sortedarr[3] = 9;
     	Sortedarr[4] = 10;
     	 assertSame("not the same", Sortedarr[1], arr[1]);
     	/** add tests to check for this unit test **/
     	}

     public void testNegative()
     {
     	/** Test data contains negative values only **/
     	int[] arr = new int[5];
     	arr[0] = -8;
     	arr[1] = -9;
     	arr[2] = -7;
     	arr[3] = -10;
     	arr[4] = -2;

     	selectionSort temp1 = new selectionSort();
     	temp1.basicSelectionSort(arr);

     	int[] Sortedarr = new int[5];
     	Sortedarr[0] = -10;
     	Sortedarr[1] = -9;
     	Sortedarr[2] = -8;
     	Sortedarr[3] = -7;
     	Sortedarr[4] = -2;
     	 assertSame("not the same", Sortedarr[1], arr[1]);
     }
public void testDuplicates(){
/** Test data contains duplicates **/
}
}
