public class Test {
    public static void main(String args[]){
        String s1 = "Ala";
        String s2 = "Ala";
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

        String s3 = s1;
        String s4 = new String("Ala");
        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));
    }
}

