import java.util.*;

public class ListFlattener {

    public List<Object> flattenList(List<Object> multiList) {
        boolean isFlat = false;

        while (!isFlat) {
            isFlat = true;
            List<Object> newList = new LinkedList<>();

            for (Object element : multiList) {
                if (element instanceof List) {
                    isFlat = false;
                    newList.addAll((List<Object>) element);

                } else {
                    newList.add(element);
                }
            }

            multiList = newList;

        }

        return multiList;
    }

    public static void main(String[] args) {
        List<Object> multiList = new LinkedList<>();
        multiList.add(1);
        multiList.add("kot");
        Collections.addAll(multiList, "a1", "str", "mystr", 7, Arrays.asList("a1", "str", 8, "mystr", Arrays.asList("a1", "str", "mystr")));
        System.out.println(multiList);
        System.out.println(new ListFlattener().flattenList(multiList));

    }
}
