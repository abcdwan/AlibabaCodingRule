/*
 * @(#) Programmer.java
 *
 * 版权: 康佳集团股份有限公司
 *
 *描述：
 *作者：dengzhiqiang  2022/8/22 10:49
 *
 */

package codingrule.listhandler;

import codingrule.pojo.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author dzq
 * @version 1.0 2022/8/22
 * @brief Class description goes here.
 */
public class ComparatorSort {

    public static void main(String[] args) {

        // 定义两个学生类
        Student dzq = new Student(1, 22, "dzq");
        Student clx = new Student(2, 24, "clx");

        // 构造比较器comparator，根据年龄大小从小到大排序
        Comparator<Student> comparatorA = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        };

        // 构造没有处理相等的情况的比较器，观察是否出现异常
        Comparator<Student> comparatorB = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                System.out.println("比较对象顺序" +o1 +" " +o2);
                return o1.getAge() > o2.getAge() ? 1 : -1;
            }
        };

        // 定义学生集合
        List<Student> stuList = new ArrayList<>();

        stuList.add(clx);
        stuList.add(dzq);

        // 通过比较器进行排序
        Collections.sort(stuList, comparatorB);
    }
}
