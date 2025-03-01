//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Giovani Zuniga

import java.util.PriorityQueue;

/**
 * The ArrayReduction class provides a method to find the minimum cost 
 * of decreasing an array by continuously summing the two smallest elements
 */
public class ArrayReduction {

    /**
     * Finds the minimum cost to reduce the array by summing the two smallest elements 
     * repeatedly until only one element remains
     *
     * @param r The array of integers to be reduced
     * @return The total cost of reducing the array
     */
    public static int min_cost(int[] r) {
        if (r.length <= 1){
	    return 0; // If only one element, no cost is required
	}
        PriorityQueue<Integer> pq = new PriorityQueue<>();
       
        // Add all elements to the priority queue
        for (int num : r) {
            pq.add(num);
        }
       
        int totalCost = 0;
       
        // Continue combining the two smallest elements until one remains
        while (pq.size() > 1) {
            int bob = pq.poll();
            int bob2 = pq.poll();
            int sum = bob + bob2;
            totalCost += sum;
            pq.add(sum);
        }
       
        return totalCost;
    }

    public static void main(String[] args) {
        int[] s0 = {212};
        System.out.println(ArrayReduction.min_cost(s0));
       
        int[] s1 = {25,10,20};
        System.out.println(ArrayReduction.min_cost(s1));        
           
        int[] s2 = {1,2,3};
        System.out.println(ArrayReduction.min_cost(s2));    
           
        int[] s3 = {1,2,3,4,7,22,33,54,-66,3,4,5,76,7,999};
        System.out.println(ArrayReduction.min_cost(s3));    
           
        int[] s4 = {1,1,1,1,1};
        System.out.println(ArrayReduction.min_cost(s4));    
           
        int[] s5 = {1,1};
        System.out.println(ArrayReduction.min_cost(s5));                                            
    }
}



/* EXPECTED OUTPUT
 0
85
9
947
12
2
*/
