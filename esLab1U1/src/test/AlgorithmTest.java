package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;
import model.SoftwareTest;

public class AlgorithmTest extends TestCase {

	
	private SoftwareTest softwareTest;
	public AlgorithmTest() {
		
	}
	
	public void stage1() {
		softwareTest = new SoftwareTest();
	}
	
	public void testAlgorithmRadixSort() {
		stage1();
		int[] array = new int [] {7,30,1,5,3,8,6,4,9,4};
			softwareTest.radixSort(array);
		int []	expectedArray  = new int []{1,3,4,4,5,6,7,8,9,30};
			assertArrayEquals(expectedArray, array);
			
	}
	
	
	public void testMaxValue() {
		stage1();
		int[] array = new int [] {7,30,1,5,3,8,6,4,9,4};
		int maxValeu = 	softwareTest.maxValue(array);
		int expectedValue = 30;
			assertTrue(maxValeu == expectedValue);
		
	}
	
	public void testAlgorithmCountingSort() {
		
		stage1();
		int[] array = new int [] {7,30,1,5,3,8,6,4,9,4};
		int maxValeu = 	softwareTest.maxValue(array);
			softwareTest.countingSort(array, maxValeu);
			int []	expectedArray  = new int []{1,3,4,4,5,6,7,8,9,30};
			int [] arrayCopy = softwareTest.getArrayListNumbers1Copy();
			assertArrayEquals(expectedArray, arrayCopy);
			
	}
	
	public void testAlgorithmHeapSortAscendant() {
		stage1();
		int[] array = new int [] {7,30,1,5,3,8,6,4,9,4};
			softwareTest.heapSortAscendant(array);
			int []	expectedArray  = new int []{1,3,4,4,5,6,7,8,9,30};
				assertArrayEquals(expectedArray, array);
			
		
	}
	
	public void testAlgorithmHeapSortDescendant() {
		stage1();
		int[] array = new int [] {7,30,1,5,3,8,6,4,9,4};
			softwareTest.heapSortDescendant(array, array.length);
			int []	expectedArray  = new int []{30,9,8,7,6,5,4,4,3,1};
				assertArrayEquals(expectedArray, array);
			
		
	}
	
	public void numbersRandomWithoutRepetition() {
		
		stage1();
			ArrayList<Integer> array = new ArrayList<>();
			softwareTest.numberRandomWithoutRepetition(array, 1, 100);
			softwareTest.fillListNumberWithoutRepetitionNumbers(10, 1, 100);
				assertTrue(10 == softwareTest.getListNumbers0().size());
					
	}
	
	public void numbersRandomWithRepetition() {
		stage1();
		ArrayList<Integer> array = new ArrayList<>();
		softwareTest.numberRandomWithRepetition(array, 1, 100);
		softwareTest.fillListNumberWithRepetitionNumbers(15, 1, 1200);
			assertTrue(10 == softwareTest.getListNumbers0().size());
		
	}
	
	

}
