import java.util.List;
import java.util.Vector;

//Java一些基础知识得剖析与理解
public class Main {

    public int solution (int n) {
        int sum=0;
        Vector<Integer> vector = new Vector<Integer>();
        String s="dadasda";
        Integer.valueOf(s);
        for (int i = 1;i<=n;i++){
            int j=i;
            while (j-->0){
                vector.add(i);
            }
        }
        for (int i=0;i<n;i++){
            sum+=vector.get(i);
        }
        return sum;

    }

    public static void main(String[] args) {
        System.out.print(System.getProperty("java.class.path"));
    }



//
//        Scanner input = new Scanner(System.in);
//        int m = input.nextInt();
//        int n= input.nextInt();
//        int k=input.nextInt();
//        int[][] arr=new int[m][n];
//        for (int i=0;i<k;i++){
//            int x=input.nextInt();
//            int y=input.nextInt();
//            arr[x][y]=1;
//        }

//
//    }
//
//}
////   ----------------------------------
//        String s = new String("hello");
//        String n = new String("hello");
//        String m = s;
//        System.out.println(m.equals(s));
//        System.out.println(m == s);
//        System.out.println(n == s);
//        System.out.println(m.equals(n));
////    ---------------------------------
////        注解：由输出可知，==用在引用型变量（对象中）时，会比较两个变量得引用是否为相同（比较对象得地址）
////                      而equals（）方法则是比较两个字符串对象得值是否相等，而非引用地址
    }