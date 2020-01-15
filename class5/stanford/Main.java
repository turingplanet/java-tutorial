package stanford;

import harvard.Student;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("BMW", 10000);
        System.out.println(map.get("BMW")); // 10000
    }
}
