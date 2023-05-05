public class DataTypes {
    public static void main(String[] args) {
       int num1 = 2;
       int num2 = 12;
       int num3 = 99;
       System.out.println(num2+num3);
       System.out.println(num2-num1);
       System.out.println(num2*num3);
       System.out.println(num2/num1);
       System.out.println(num3%num2);
       double num4 = 69.420;
       Operations ops=new Operations();
       num4 = ops.makeNegative((int) num4);
        System.out.println(num4);;
    }
}
