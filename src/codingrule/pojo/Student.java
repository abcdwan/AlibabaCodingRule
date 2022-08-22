/*
 * @(#) Programmer.java
 *
 * 版权: 康佳集团股份有限公司
 *
 *描述：
 *作者：dengzhiqiang  2022/8/22 9:45
 *
 */

package codingrule.pojo;

/**
 * @author dzq
 * @version 1.0 2022/8/22
 * @brief Student 实体类
 */
public class Student {

    private int id;

    private int age;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    private String name;

    public Student(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
