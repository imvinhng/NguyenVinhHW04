
/*
 * ==========================================
 * CS211, Spring 2020, 5/3
 * Vinh T. Nguyen
 * Homework 04 - Chap 14 Exercise 6
 * creating rearranged method that put the evens number 
 * in front of the odds, while keeping the original order
 * 
 * I used an extra queue in the exercise, cause 
 * i found it impossible to rearrange the queue and preserve its original state at the same time
 * 
 * ==========================================
 */
import java.util.*; 

public class Ch14Ex6 {
   public static void main(String[] args) {
   Integer[] num = {3, 5, 4, 17, 6, 83, 1, 84, 16, 37 };
   Queue<Integer> q = new LinkedList<>();
   

   for (int n : num){       //Input the el into queue
         q.add(n);
      }
   System.out.println("Queue before: "+q); //orignal queue
   System.out.println("");
   
   rearrange(q); //rearranged order
   
   System.out.println("");
   System.out.println("Queue after: "+q);  //after, still the same orignal order
   


   }
   
   public static void rearrange(Queue<Integer> q){
      Stack<Integer> s = new Stack<>();
      Queue<Integer> t = new LinkedList<>();
      
      int size = q.size(); 
      for (int i = 0 ; i<size ; i++){
         int n = q.remove();  //i found it impossible to rearrange the queue and preserve its original state at the same time
         q.add(n);            // so i added back the original value
         
         if ((n % 2) == 0){
            t.add(n);         //add rearranged value into a new queue
         } else {
            s.push(n);
         }
      }
       
       for (int n : s ){
         t.add(n);
       }     
         System.out.println("Rearranged Queue: "+t); //new rearranged queue
   }
}


