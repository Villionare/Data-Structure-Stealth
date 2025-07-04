package Collections.List.LinkedList.findingAnElement;

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("rusya");
        list.add("Ranjhan");
        list.add("mera");
        list.add("mai");
        list.add("vi");
        list.add("tang");
        list.add("me aithi");

        System.out.println("\n");
        list.insert("(sedd)", "rusya");
        //list.delete("vi");
        //list.delete("(sedd)");

        list.delete("rusya");
        list.delete("rusyaaaa");

        list.show();
    }
}
