package org.example;

public class BinarySearch
{
    private static Integer binarySearch(int[] list, int item) {
       int low = 0;
       int high = list.length -1;
       while(low<=high){
           int mid = (low+high)/2;
           int guess = list[mid];
           if(guess==item)
               return mid;
           if(guess < item )
               low = mid +1;
           else
               high = mid -1;
       }
       return null;

    }

    public static void main(String[] args) {
        int[] myList = {1, 3, 5, 7, 9};

        System.out.println(binarySearch(myList, 5)); // 1
        System.out.println(binarySearch(myList, -1)); // null
    }
}
