import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: Shannon
 * Date: 24/03/14
 * Time: 18:31
 */
public class GorellianSort {

    public static void main(String[]args) {
 /**       List<String> sorted = Arrays.asList(words());
        Collections.sort(sorted, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;  //To change body of implemented methods use File | Settings | File Templates.
            }
        });
        System.out.print("asda");
    **/
        TreeMap<String,House> houseSet = new TreeMap<String, House>();
        houseSet.put("First",new House(5));
        houseSet.put("Alas",new House(2));

        for(Map.Entry<String,House> entry: houseSet.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue().getWindows());
        }
    }

    private static String[] words() {
        String[] words = {"ANTLER",
                "ANY"       ,
                "COW"      ,
                "HILL"    ,
                "HOW"    ,
                "HOWEVER",
                "WHATEVER",
                "ZONE"};
        return words;
    }
}

class House {
    private int windows;

    int getWindows() {
        return windows;
    }

    void setWindows(int windows) {
        this.windows = windows;
    }

    public House(int windows) {
        setWindows(windows);
    }
}
