package Part1;

public class TestMyArrayList {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        String s1 = "Buu";
        String s2 = "Puu";
        String s3 = "Nuu";
        String s4 = "Muu";
        String s5 = "Kuu";
        String s6 = "6";
        int i = list.addElement(s1);
        int j = list.addElement(s2);
        int k = list.addElement(s3);
        int l = list.addElement(s4);
        int m = list.addElement(s5);
        list.add(s6,2);
        list.remove(2);
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(l);
        System.out.println(list.get(2));
    }
}
