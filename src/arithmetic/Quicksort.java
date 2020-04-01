package arithmetic;
/**
 * @Description: 快速排序
 * @Author: cjl
 * @CreateDate: 2020/3/31 23:14
 * @UpdateUser:
 * @UpdateDate: 2020/3/31 23:14
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
public class Quicksort {
    public static void quickSort(int[] array, int start, int end) {
        if (start >= end) {
            return;
        }
        int x, y;
        x = start;
        y = end;
        int base = array[start];
        while (x < y) {
            while (array[y] >= base && y > x) {
                y--;
            }
            while (array[x] <= base && x < y) {
                x++;
            }
            if (x < y) {
                int tag = array[x];
                array[x] = array[y];
                array[y] = tag;
            }
        }
        if(x==y){
            int tag = array[start];
            array[start]=array[x];
            array[x]=tag;
        }
        quickSort(array,start,x-1);
        quickSort(array,x+1,end);
    }

}