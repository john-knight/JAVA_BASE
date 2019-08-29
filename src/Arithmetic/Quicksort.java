package Arithmetic;

public class Quicksort {
    public void sort(int[] arr,int start,int end){
        int s=start;
        int e=end;
        int base=arr[start];
        int middle;
        if(s>=e)
            return;
        while (start<end){
            while (start<end && arr[end]>=base)
                --end;
            if(start<end)
            {
                arr[start]=arr[end];
                start++;
            }
            while (start<end &&arr[start]<=base)
                start++;
            if(start<end){
                arr[end]=arr[start];
                start++;
            }
            arr[start]=base;
            middle=start;
            sort(arr,s,middle-1);
            sort(arr, middle+1, e);
        }
    }
    public static void main(String[] args){
      int[] test={6,3,8,1,9,9,10,6};
       Quicksort quicksort=new Quicksort();
       quicksort.sort(test, 0, test.length-1);
        System.out.println(test[1]);
    }
}
