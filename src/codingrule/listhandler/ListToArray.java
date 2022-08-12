package codingrule.listhandler;

import java.util.ArrayList;
import java.util.List;

public class ListToArray {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(3);
        list.add("yi");
        list.add("ping");
        list.add("fang");
        //使用无参toArray方法返回值只能是Object[]类，强转报错
        //String[] array = (String[]) list.toArray();

        /*数组空间大小
        * 1.等于0，动态创建与集合size相同的数组，性能最好
        * 2.大于0小于size，重新创建大小等于size的数组，增加GC负担
        * 3.等于size，高并发情况下，size变大情况下，负面影响同2
        * 4.大于size，浪费空间，且在size处插入null值，存在NPE(空指针)隐患
        * */
        String[] array = list.toArray(new String[0]);

        for (String val : array) {
            System.out.println(val);
        }

        System.out.println(array.length);
    }
}
