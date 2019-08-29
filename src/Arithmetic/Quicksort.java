package Arithmetic;

public class Quicksort {
    public void sort(int[] arr,int start,int end){
        int s=start;
        int e=end;
        int base=arr[start];
        int middle;
        while (start<end){
            while (start<end && arr[end]>arr[base])
                end--;
            if(start<end)
            {
                arr[start]=arr[end];
                start++;
            }
            while (start<end &&arr[start]<arr[base])
                start++;
            if(start<end){
                arr[end]=arr[start];
                end--;
            }
            arr[start]=arr[base];
            middle=start;
            sort(arr,s,middle-1);
            sort(arr, middle+1, e);
        }
    }
    public static void main(String[] args){
        int[] test={6,3,8,7,1,2,8,4};
        Quicksort quicksort=new Quicksort();
        quicksort.sort(test, 0, test.length-1);
        for(int a:test){
            System.out.println(a);
        }
    }
}
