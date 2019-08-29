import java.util.HashMap;
import java.util.Map;

public class Maptest {
    public static  void main(String[] args){
//       正常使用MAP的方法
        Map<String,String> map=new HashMap();
        map.put("chen", "xinyang");
        map.put("zhang","xinxiang");
//        JAVA9新增的方法，可以一次添加多條數據
        Map<String, String> map1=Map.of("chen","xinyang","zhang","xinxiang");
//    尝试在map中增加数据
        map.put("du", "xincai");
////        尝试在map1中增加数据
//        map1.put("du", "xincai");
//        那麽程序會報錯
//        Exception in thread "main" java.lang.UnsupportedOperationException
//	    at java.base/java.util.ImmutableCollections.uoe(ImmutableCollections.java:71)
//	    at java.base/java.util.ImmutableCollections$AbstractImmutableMap.put(ImmutableCollections.java:714)
//	    at Main.main(Main.java:16)
//      因爲無論是map.of還是list.of或則是set.of方法建立的都是不可改變的事物
        //    map實現遍歷的兩種常見方法如下
        //    一：使用map的keyset：
        for(String key : map.keySet()){
            System.out.println(map.get(key));
        }
        //    二：使用entryset便利
        for (Map.Entry<String,String> entry:map1.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }

}
