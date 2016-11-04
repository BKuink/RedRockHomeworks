import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by asus-pc on 2016/11/4.
 */
public class ListEach {
    static void EachWay1(List<String> strings){
        System.out.println("EachWay1");
        strings.forEach(string -> System.out.println(string));
    }

    static void EachWay2(List<String> strings){
        Iterator<String> stringsIterator = strings.iterator();
        System.out.println("EachWay2");
        stringsIterator.forEachRemaining(string -> System.out.println(string));
    }

    static void EachWay3(List<String> strings){
        System.out.println("EachWay3");
        for(String string : strings){
            System.out.println(string);
        }
    }

    static void EachWay4(List<String> strings){
        Iterator stringsIterator = strings.iterator();
        System.out.println("EachWay4");
        while (stringsIterator.hasNext()){
            String string = (String) stringsIterator.next();
            System.out.println(string);
        }
    }

    public static void main(String[] args){
        List<String> strings = new ArrayList<>();
        strings.add("苍");
        strings.add("颜");
        strings.add("白");
        strings.add("发");
        strings.add("人");
        strings.add("衰");
        strings.add("境");
        EachWay1(strings);
        EachWay2(strings);
        EachWay3(strings);
        EachWay4(strings);
    }
}
