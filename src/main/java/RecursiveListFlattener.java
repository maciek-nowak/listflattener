import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class RecursiveListFlattener {

    public List<Object> flattenList(List<Object> flatList, List<Object> multiList) {

            for (Object element : multiList) {
                if (element instanceof List) {
                    flattenList(flatList, (List<Object>) element);

                } else {
                    flatList.add(element);
                }
            }

        return flatList;
    }

    public static void main(String[] args) {
        List<Object> multiList = new LinkedList<>();
        multiList.add(1);
        multiList.add("kot");
        Collections.addAll(multiList, "a1", "str", "mystr", 7, Arrays.asList("a1", "str", 8, "mystr", Arrays.asList("a1", "str", "mystr")));
        System.out.println(multiList);
        System.out.println(new RecursiveListFlattener().flattenList(new LinkedList<>(), multiList));
    }
}
