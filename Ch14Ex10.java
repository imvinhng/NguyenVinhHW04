
/*
 * ==========================================
 * CS211, Spring 2020, 5/3
 * Vinh T. Nguyen
 * Homework 04 - Chap 14 Exercise 10
 * isConsecutive method is created to check if elements in the stack is in Consecutive order
 * I used the while loop to check 2 values at the time, thus reduce computational complexity
 * Also using stack and queue to put the original's value back into the stack
 * ==========================================
 */
import java.util.*; 

public class Ch14Ex10 {
   public static void main(String[] args) {
   Integer[] num = {10,11,12,13};
   Stack<Integer> s = new Stack<>();
   
   for (int n : num){       //Input the el into stack
         s.push(n);
      }
   System.out.println("Stack before: "+s); //orignal queue
   System.out.println("");
   
   System.out.println(isConsecutive(s));//output: true
 
   System.out.println("");
   System.out.println("Stack after: "+s);  //after, still the same orignal order
   


   }
   
   public static boolean isConsecutive(Stack<Integer> s){
      Queue<Integer> q = new LinkedList<>();
      boolean b = true;
      if (s.size() < 2) { //if stack has fewer than 2 values
         return b;
      }
      
      while ((s.size()>1) && (b==true)){
         int i = s.pop(); //remove top stack
         q.add(i);
         
         int n = s.pop(); //removing the top stack
         q.add(n);    
           
         if ((i-1) == n){ //the bread & butter
            b = true;
         } else {
            b = false;
         }
      }
         
        while (!q.isEmpty()) { 
            s.push(q.remove()); 
        } 
        while (!s.isEmpty()) { 
            q.add(s.pop()); 
        } 
        
         for (int x : q) { //putting the values back into stack
         s.push(x);
         }  
      
      return b;
   }
}



