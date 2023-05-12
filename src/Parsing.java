public class Parsing {
    public static void main(String[] args) {
        System.out.println(Integer.parseInt("1"));
        //Strings like "abc" don't work, because they cannot convert to a number!
        System.out.println(Double.parseDouble("1.123"));
        System.out.println(Long.parseLong("123456789"));
        //Long values cannot have dots!
    }
}
