import com.sun.security.jgss.GSSUtil;
import java.util.Collections;
import javax.naming.PartialResultException;
import java.util.*;
import java.util.ArrayList;
class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        // add elements
        list.add(0);
        list.add(3);
        list.add(4);
        list.add(2,2);

        System.out.println(list);
        System.out.println(list.get(2));

        list.remove(3);
        System.out.println(list);

        System.out.println(list.size());

        list.set(0,5);
        System.out.println(list);

        list.remove(0);
        System.out.println(list);

        for (int i = 0; i < list.size(); i++){
            System.out.print(list.get(i));
        }
        System.out.println();

        Collections.sort(list);
        System.out.println(list);

        }

    }
