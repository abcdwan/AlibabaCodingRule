/*
 * @(#) Programmer.java
 *
 * 版权: 康佳集团股份有限公司
 *
 *描述：
 *作者：dengzhiqiang  2022/8/22 12:11
 *
 */

package codingrule.controlstatement;

/**
 * @author dzq
 * @version 1.0 2022/8/22
 * @brief Class description goes here.
 */
public class SwitchNull {

    public static void main(String[] args) {
        // switch 条件不允许为null
        method(null);
    }

    /**
     * @brief: Method description goes here
     * @author: dengzhiqiang
     * @date: 2022/8/22 12:15
     *
     * @param: param
     */
    private static void method(String param) {
        switch (param) {
            case "sth":
                System.out.println("it's sth");
                break;
            case "null":
                System.out.println("it's null");
                break;
            default:
                System.out.println("default");
        }
    }
}
