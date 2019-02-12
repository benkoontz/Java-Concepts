package halo;

import java.util.*;

// Bubble Sort works by repeatedly swapping the adjacent elements if they are in wrong order.

// Example: 
// first pass : you're checking 5 with every element
// (5, 1, 4, 2, 8)
// (1, 5, 4, 2, 8)
// (1, 4, 5, 2, 8)
// (1, 4, 2, 5, 8)
// second pass : you're checking 4 with every element
// (1, 2, 4, 5, 8)
// third pass : you're checking each number to confirm the correct order
// (1, 2, 4, 5, 8)


class Ben
{ 
	// Driver method to test above 
    public static void main(String args[]) 
    { 
        BubbleSort ob = new BubbleSort(); 
        int arr[] = {64, 34, 25, 12, 22, 11, 90}; 
        ob.bubbleSort(arr); 
        System.out.println("Sorted array"); 
        ob.printArray(arr); 
    } 
} 
