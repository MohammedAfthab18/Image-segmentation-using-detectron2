import java.util.*;
public class LC {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("This");
        list.add("List");

        System.out.println(list);

        System.out.println(list.size());

       //String  value = "List";
        //if(list.get(i) == value) by using this we can traverse the list and can search the given value
        for(int i =0; i< list.size(); i++){
            System.out.print(list.get(i) + " ->");
        }
        System.out.println("null");

        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

    }
};
