import java.util.*;

public class binarySearch {
    
    //can only use Binary Search if the array is already sorted
    /*
    * Concept- We start with the middle element and compare it with our target element
    * If our target element is equal to middle element , we return its index(mid)
    * If our target element is less than mid then we reduce our search window by setting end = mid-1
    * If our target element is more than mid then we reduce our search window by setting start = mid+1
    * We repeat this process until start < end
    * If element is not present we return -1 indicating the target element is not present
    * */
    public static void main(String[] args) {

        int arr[]={9,3,34,42,21,32,7,89};
        Arrays.sort(arr);

        int key=9;
        int pos=bSearch(arr,key,0,arr.length);

        System.out.println(pos);
    }

    //Worst Time Complexity : O(logn)
    //binary search iterative
    public static int iterbS(int arr[],int key)
    {
        int start=0;
        int end=arr.length;
        
        while(start<end)
        {
            int mid=(start+end)/2;
            System.out.println("Mid :"+mid);

            if(arr[mid]==key)
            {
                return mid;
            }
           else if(arr[mid]<key)
           {
             start=mid+1;
           }
          else
          {
            end=mid-1;
          }  
        }

        return -1;
    }

    //binary search recursive
    public static int bSearch(int a[],int key,int first,int last)
    {
        int mid=(first+last)/2;
        System.out.println("Mid :"+mid);

        if(first<=last)
        {
            if(a[mid]==key)
            {
                return mid;
            }

            if(key<a[mid])
            {
                return bSearch(a, key, first, mid-1);
            }
           else
           {
            return bSearch(a, key, mid+1, last);
           } 
        }

        return -1; //if element is not present
    }
   
}
