package Arithmetic;

public class Quicksort {
    public  static String string= "test";
    public  static  void  test(){
        System.out.println("hello");
    }

    //    public void sort(int[] arr,int start,int end){
//        int s=start;
//        int e=end;
//        int base=arr[start];
//        int middle;
//        if(s>=e)
//            return;
//        while (start<end){
//            while (start<end && arr[end]>=base)
//                --end;
//            if(start<end)
//            {
//                arr[start]=arr[end];
//                start++;
//            }
//            while (start<end &&arr[start]<=base)
//                start++;
//            if(start<end){
//                arr[end]=arr[start];
//                start++;
//            }
//            arr[start]=base;
//            middle=start;
//            this.sort(arr,s,middle-1);
//            this.sort(arr, middle+1, e);
//        }
//    }
    public void  sort2(int[] array, int start, int end) {
        if (start >= end)
            return;
        int base = array[start];
        int i = start + 1;
        int j = end;
        while (i < j) {
            while (array[j] > base && j > i)
                j--;
            while (array[i] < base && i < j)
                i++;
            if (j == i) {
                int war1 = array[j];
                array[j] = array[start];
                array[start] = war1;
                break;
            } else {
                int war;
                war = array[i];
                array[i] = array[j];
                array[j] = war;
            }
        }
        sort2(array, start, i - 1);
        sort2(array, i + 1, end);
    }

    public static void main(String[] args) {

        int[] test = {6, 3, 8, 1, 9};
        int[] test2 = {6, 3, 8, 1, 9};
        Quicksort quicksort = new Quicksort();
        quicksort.sort2(test2, 0, test2.length - 1);
        BubblingSort.sort(test);
        System.out.println(test[2]);
        System.out.println(test2[2]);
        System.out.println(BubblingSort.class.hashCode());
    }

}
