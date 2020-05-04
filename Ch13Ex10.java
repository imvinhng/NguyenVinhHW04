
/*
 * ==========================================
 * CS211, Spring 2020, 5/3
 * Vinh T. Nguyen
 * Homework 04 - Chap 13 Exercise 5, 10 ; Chap 14 Exercise 6, 13
 * To be filled
 * Ex 5 , Chap 13, has complexity of O(log N) - Logarithmic - because it divides the list in half
 * repeatedly until the problem is solved
 * Ex 10 - write the state of the elements after each pass of the sorting algorithm
 * compare the element at index i to all the other elements in the array, and put the smallest value at i,
 * til all the elements of the array has been sorted
 * ==========================================
 */
import java.util.*; 

public class Ch13Ex10 {
   public static void main(String[] args) {
   int[] numbers3 = {8, 5, -9, 14, 0, -1, -7, 3}; 
   int[] numbers4 = {15, 56, 2, 5, 39, -4, 27, 10};
   
   System.out.println(Arrays.toString(numbers3));
   sort(numbers3);
   System.out.println(Arrays.toString(numbers3)+"\n");
   
   System.out.println(Arrays.toString(numbers4));
   sort(numbers4);
   System.out.println(Arrays.toString(numbers4)+"\n");
   
   }
   
   public static void sort(int arr[]) 
    { 
        int n = arr.length; 
  
        // One by one move boundary of unsorted subarray 
        for (int i = 0; i < n-1; i++) 
        { 
            // Find the minimum element in unsorted array 
            int min_idx = i; 
            for (int j = i+1; j < n; j++) 
                if (arr[j] < arr[min_idx]) 
                    min_idx = j; 
            System.out.print("at index "+i+": "+arr[i]);
            System.out.print(", at index "+min_idx+": "+arr[min_idx]);
            
            // Swap the found minimum element with the first 
            // element 
            int temp = arr[min_idx]; 
            arr[min_idx] = arr[i]; 
            arr[i] = temp; 
            System.out.println(" Min index: "+min_idx+", target: "+temp);
        } 
    } 
   
}