package math;


import java.math.BigDecimal;

public class Permutition {
    /**
     * 字符串全排列方法
     * @param strs 输入的字符串
     * @param from
     * @param to
     */
    static void Permutition(char[] strs,int from,int to){



        if(strs==null || strs.length==0){
            return;
        }
        else {
           for(int i=from;i<to;i++){
               if (i==to-1){
                   System.out.print(String.valueOf(strs));
               }

           }




        }
    }
    public static void main(String[] args){
        BigDecimal bigDecimal = new BigDecimal(1.236);
        BigDecimal s1,s2;
        BigDecimal a = new BigDecimal(5.6);
        s1=s2=null;
        s1=bigDecimal.add(a);
        s2=bigDecimal.add(a);
        System.out.println(s1.equals(s2));


        String s = "12.34";
        float l= Float.valueOf(s);
        System.out.print(l);
        String str = "abcd";
        char[] strs = str.toCharArray();
        System.out.print(String.valueOf(strs));

    }
}
