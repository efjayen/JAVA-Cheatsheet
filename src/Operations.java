public class Operations {
    int num1 = 2;
    int num2 = 12;
    int num3 = 99;
    double num4 = 69.420;
    public int increment(int num) { //<-- 5
        num1 = num2 + 1;
        return num1;
    }
    public int increment2(int num) { //<-- 5
        num = num + 1;
        return num;
    }
    public int makeNegative(int num3) {
        num3 = -1;
        System.out.println(num3);
        return num3;
    }
}
class healNum {
    public static void main(String[] args) {
        Operations ops1 = new Operations();
        Operations ops2 = new Operations();

        System.out.println(ops1.num1); //2
        System.out.println(ops2.num1); //2
        
        ops2.num1 = ops2.increment(ops2.num1);
        System.out.println(ops1.num1); //2
        System.out.println(ops2.num1); //13

        float num4 = 69.420f;
        num4 = makeNegative4(num4);
        ops1.increment(ops1.num1);
        //System.out.println(ops1.num1);
        //System.out.println(num4); // printing the result to verify
    }
    public static float makeNegative4(float num) {
        return -num;
    }
}}