public class Main {
    public static void main(String[] args) {
        Lab07.test();
    }

    static class Lab07{
        static void test(){
            Set<String> s1 = new Set<>();
            Set<String> s2 = new Set<>();

            s1.add("OOP");
            s1.add("ez");
            s1.add("Lab07");
            s1.add("hello world!");
            s1.add("ez");
            for(String a : s1){
                System.out.print(a + " "); //print all members in s1
            }
            System.out.println();

            s1.remove("ez");
            System.out.println(s1.contains("ez")); //false

            s2.add("7");
            s2.add("1");
            s2.add("3");
            s2.add("100");
            s2.remove("50");
            for(String a : s2){
                System.out.print(a + " "); //print all members in s2
            }
            System.out.println();

            System.out.println(s2.contains("3")); //true

            s2.addAll(s1);
            for(String a : s2){
                System.out.print(a + " "); //print all members in s2 (after add all members in s1)
            }
            System.out.println();

            s1.remove("OOP");
            for(String a : s1){
                System.out.print(a + " "); //print all members in s1 (after remove "ez" and "OOP")
            }
            System.out.println();

            s1.addAll(s2);
            for(String a : s1){
                System.out.print(a + " "); //print all members in s1 (after add all members in s2)
            }
            System.out.println();

            s1.removeAll(s2);
            System.out.println(s1.containsAll(s2)); //false
            System.out.println(s2.containsAll(s1)); //true

            for(String a : s1){
                System.out.print(a + " "); //print all members in s1 (none)
            }
            System.out.println();

            s2.removeAll(s1);
            for(String a : s2){
                System.out.print(a + " "); //print all members in s2 (after remove all members in s1)
            }
            System.out.println();
        }
    }
}