public class linearSearch{

    /*
     * Concept: We iterate through the entire list and compare each element with our
     * target element , if target element is present then we return its index else we return -1
     * indicating target element is not in the list
     * */
    public static void main(String[] args) {
          
        int arr[]={45,5,65,584,542,4,78};

        int key=5;
     
        int pos=lS(arr, key);
        
        if(pos!=-1)
        {
            System.out.println("Element "+ key+" found at index:"+pos);
        }
       else
       {
        System.out.println("Not found");
       } 
    }

    //Worst Time Complexity: O(n)
    public static int lS(int arr[],int key)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            {
                return i;
            }
        }

        return -1;
    }
}