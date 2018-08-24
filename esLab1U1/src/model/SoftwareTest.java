package model;

import java.util.ArrayList;

import javax.swing.text.DefaultEditorKit.CopyAction;



public class SoftwareTest {
	
	
//CONSTANS
	

	
	
//ATTRIBUTES
	private int [] arrayListNumbers1Copy;
	private int [] listNumbers1;
	private ArrayList<Integer> listNumbers0Copy;
	private ArrayList<Integer> listNumbers0;
	private String time;
	
	
	
//BUILDER METHOD
	
	public SoftwareTest() {
		
		
		
//SET UP ATTRIBUTES
		listNumbers0 = new ArrayList<Integer>();
		listNumbers0Copy = new ArrayList<>();
		ArrayList<Integer> numeros = new ArrayList<>();
		time = "";
		

	
		
	}
	
//GETTER AND SETTER METHODS
	
	public int[] getListNumbers1() {
		return listNumbers1;
	}

	public void setListNumbers1(int[] listNumbers1) {
		this.listNumbers1 = listNumbers1;
	}

	public ArrayList<Integer> getListNumbers0() {
		return listNumbers0;
	}

	public void setListNumbers0(ArrayList<Integer> listNumbers0) {
		this.listNumbers0 = listNumbers0;
	}
	public ArrayList<Integer> getListNumbers0Copy() {
		return listNumbers0Copy;
	}

	public void setListNumbers0Copy(ArrayList<Integer> listNumbers0Copy) {
		this.listNumbers0Copy = listNumbers0Copy;
	}


	public int[] getArrayListNumbers1Copy() {
		return arrayListNumbers1Copy;
	}

	public void setArrayListNumbers1Copy(int[] arrayListNumbers1Copy) {
		this.arrayListNumbers1Copy = arrayListNumbers1Copy;
	}
	public String getTime() {
		return time;
	}
	
	public void setTime(String x) {
		 time = "";
	}

	
//METHODS THAT RESOLVE PROBLEMS
	

	public long calculeFinalTime(long firstTime) {
		long finalTime =System.nanoTime() - firstTime;
		time = "El tiempo en nano-segundos es: " + finalTime;
		return finalTime;
	}
	
	
	
	public int numberRandomWithoutRepetition(ArrayList<Integer> listNumber, int rank1, int rank2) {
		int numberRandomFinal = 0;
		int numberRandom =(int) (( Math.random()* (rank2-rank1) + rank1));
			if(!listNumber.contains(numberRandom)) 
				numberRandomFinal = numberRandom;
			else {
				while(listNumber.contains(numberRandom)) {
					numberRandom = (int) (( Math.random()* (rank2-rank1) + rank1));
				}
				numberRandomFinal = numberRandom;
			}	
			return numberRandomFinal;
		}
	
	public int numberRandomWithRepetition(ArrayList<Integer> listNumber, int rank1, int rank2) {
		int numberRandom =(int) (( Math.random()* (rank2-rank1) + rank1));
		return numberRandom;
	}
	
	public void fillListNumberWithoutRepetitionNumbers(int amount, int rank1 , int rank2) {
		for (int i = 0; i <amount; i++) {
			
			listNumbers0.add(numberRandomWithoutRepetition(listNumbers0, rank1 ,rank2));

			
		}
	}
		
	public void fillListNumberWithRepetitionNumbers(int amount, int rank1 , int rank2) {
		for (int i = 0; i <amount; i++) {
				listNumbers0.add(numberRandomWithRepetition(listNumbers0, rank1 ,rank2));
		}	
	}
	public void fillArray() {
		listNumbers1 = new int[listNumbers0.size()];
		for(int i = 0; i < listNumbers0.size(); i++){
			listNumbers1[i] = listNumbers0.get(i);
			listNumbers0Copy = (ArrayList<Integer>)listNumbers0.clone();
			arrayListNumbers1Copy = listNumbers1;
		}
	}
	

		



	public String [] transformArray(String numbers) {
		String [] array = numbers.split(",");
		return array;
	}
	public void fillArrayByUser(String[] array) {
		listNumbers1 = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			int num = Integer.parseInt(array[i]);
			listNumbers1[i] = num;
			listNumbers0Copy.add(num);
			
			
		}
		 arrayListNumbers1Copy = listNumbers1;
	}
	
	public String firsNumbers() {
		String numbers = "";
			for (int i = 0; i <listNumbers0Copy.size(); i++) {
				numbers += "["+ listNumbers0Copy.get(i) + "]";
			}
		
			return numbers;
	}
	public String orderedNumbers(String numbers) {
		numbers +="\n"+"Ordered numbers:"+"\n" ; 
		for (int i = 0; i < arrayListNumbers1Copy.length; i++) {
			numbers += "["+ arrayListNumbers1Copy[i] + "]";
		}
		return numbers;
	}
	
	public int [] arrayCopy() {
		int [] arrayCopy2 = arrayListNumbers1Copy;
		return arrayCopy2;
	}
	
	public void updateArray() {
	//---------------------------------
	      for (int k = 0; k < listNumbers1.length; k++) {
			listNumbers0Copy.set(k, listNumbers1[k]);
		}
	}
	public void updateArray2() {
	//---------------------------------
	      for (int k = 0; k < listNumbers1.length; k++) {
			listNumbers0Copy.add(listNumbers1[k]);
		}
	}
	

	
	public static void radixSort( int[] a) {
		
        int i, m = a[0], exp = 1, n = a.length;
        int[] b = new int[n];
        for (i = 1; i < n; i++)
            if (a[i] > m)
                m = a[i];
        while (m / exp > 0)
        {
            int[] bucket = new int[10];
 
            for (i = 0; i < n; i++)
                bucket[(a[i] / exp) % 10]++;
            for (i = 1; i < 10; i++)
                bucket[i] += bucket[i - 1];
            for (i = n - 1; i >= 0; i--)
                b[--bucket[(a[i] / exp) % 10]] = a[i];
            for (i = 0; i < n; i++)
                a[i] = b[i];
            exp *= 10;        
        }
    }  
	

    public void heapSortAscendant(int inputArray[])
    {
        for (int i =  inputArray.length/ 2 - 1; i >= 0; i--){
            heapify1(inputArray, inputArray.length, i);
        }
      
        for (int i = inputArray.length - 1; i>=0; i--)
        {
          
            int temp = inputArray[0];
            inputArray[0] = inputArray[i];
            inputArray[i] = temp;
        
            heapify1(inputArray, i, 0);
        }
    }
    
    public void heapify1(int arr[], int arrayLength, int rootElementIndex)
    {
       
        int leftIndex = 2*rootElementIndex + 1;  
        int rightIndex = 2*rootElementIndex + 2;  		       
        int largest = rootElementIndex;		
        if (leftIndex < arrayLength && arr[leftIndex] > arr[largest])
            largest = leftIndex;		      
        if (rightIndex < arrayLength && arr[rightIndex] > arr[largest])
            largest = rightIndex;	     
        if (largest != rootElementIndex)
        {		           
            int swap = arr[rootElementIndex];
            arr[rootElementIndex] = arr[largest];
            arr[largest] = swap;
            heapify1(arr, arrayLength, largest);
        }
    }
    
    public void heapSortDescendant(int arr[], int n)
    {
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify2(arr, n, i);
        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify2(arr, i, 0);
        }
    }
    
    public void heapify2(int arr[], int n, int i)
    {
        int smallest = i; 
        int l = 2 * i + 1; 
        int r = 2 * i + 2; 
        if (l < n && arr[l] < arr[smallest])
            smallest = l;
        if (r < n && arr[r] < arr[smallest])
            smallest = r;
        if (smallest != i) {
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
            heapify2(arr, n, smallest);
        }
    }
	

    
	  public void countingSort(int[] theArray, int maxValue) {
		    int numCounts[] = new int[maxValue + 1];
		    for (int num : theArray) {
		        numCounts[num]++;
		    }

		    arrayListNumbers1Copy = new int[theArray.length];
		    int currentSortedIndex = 0;
		    for (int num = 0; num < numCounts.length; num++) {
		        int count = numCounts[num];
		        for (int i = 0; i < count; i++) {			       
		        	 arrayListNumbers1Copy[currentSortedIndex] = num;
		            currentSortedIndex++;
		        }
		    }
		}
	  
		 public int maxValue(int[]array){
			  int max;
			  max = array[0];
			  for (int i = 0; i < array.length; i++) {			      
			          if(array[i]>max){		          
			              max=array[i];			              
			          }     
			  }   
			  
			  return max;
			  }


}
