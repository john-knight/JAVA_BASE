package arithmetic;
public class Main {
    public  static  void  main(String[] args){

int[] arr1 = new int[]{1,2,4,5,6,72,12,1,4};
int[] arr2 = new int[]{1,2,4,5,6,72,12,1,4};
    BubblingSort.sort(arr1);
    Quicksort.quickSort(arr2,0,arr2.length-1);
    System.out.println(arr1[7]);
    System.out.println(arr2[7]);
    }
}
