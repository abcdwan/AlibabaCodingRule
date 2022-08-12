package codingrule.ooprule;


public class SplitProblem {
    public static void main(String[] args) {
        String  str = "a,b,c,,";
        String[] ary = str.split(",");
        for (String val : ary) {
            System.out.println(val);
        }
        System.out.println("ary's length is " + ary.length);
    }
}
