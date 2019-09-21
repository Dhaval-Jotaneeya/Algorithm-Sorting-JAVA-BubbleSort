class Bubble
{
    int[] sorting( int Array[] , int length )                       
    {
        for (int i = 1; i < length; i++) 
        {
            for (int j = 0; j < length-1; j++) 
            {
                if ( Array[j] > Array[j+1] ) 
                {
                     int temp = Array[j] ;
                    Array[j] = Array[j+1];
                    Array[j+1] = temp;
                }
            }    
        }
        return Array;
    }
}
public class BubbleSort 
{                                           
    public static void main(String[] args) 
    {
        int uArray[] = {1,9,5,4,7,8,6,3,2};
        Bubble b1 = new Bubble();
        long startTime = System.nanoTime();
        int sortedArray[] = b1.sorting(uArray, 9);
        long endTime = System.nanoTime();
        for (int i = 0; i < 9; i++) {
            System.out.println(sortedArray[i]);
        }
        System.out.println("Total Time in Neno Second: "+ (endTime-startTime));
    }
}