package webinar09;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        System.out.println(stringArrayList.size());
        System.out.println(stringArrayList.isEmpty());
        List<String> strList = new ArrayList<>();
        ArrayList<Integer> intList = new ArrayList<>(30);

        intList.add(2);
        intList.add(75);
        intList.add(8);
        intList.add(2);
        intList.add(75);
        intList.add(8);
        intList.add(null);
        intList.add(null);
        intList.add(null);
        intList.add(2);
        System.out.println("====================");
        System.out.println(intList);
        System.out.println(removeElementInList
                (intList, 12));
        System.out.println("====================");
        System.out.println(removeElementInList
                (intList, 8));
        System.out.println("====================");
        System.out.println(countElementsInList
                (intList, 8));
        System.out.println("====================");
        System.out.println(countElementsInList
                (intList, null));
        removeNullFromListWithFunctionalInterface(intList);
        System.out.println("====================");
        System.out.println(intList);
        intList.add(null);
        intList.add(null);
        System.out.println(removeNullFromList(intList));
        System.out.println("====================");
        intList.add(null);
        intList.add(null);
        System.out.println("====================");
        System.out.println(removeNullFromListToNewList(intList));
    }

    public static List<Integer> removeElementInList
            (List<Integer> list, Integer element) {
        if (list == null || list.isEmpty())
            return null;
        list.remove(element);
        return list;
    }

    public static Integer countElementsInList(List<Integer> list, Integer element) {
        if (list == null || list.isEmpty())
            return null;
        Integer count = 0;
        for (Integer el : list) {
            if (el == element)
                count++;
        }
        return count;
    }

    public static void removeNullFromListWithFunctionalInterface(List<Integer> list) {
        if (list == null || list.isEmpty())
            return;
        list.removeIf(el -> el == null);
    }

    public static List<Integer> removeNullFromList(ArrayList<Integer> list) {
        if (list == null || list.isEmpty())
            return null;
        System.out.println(list);
        for (Integer el : list) {
            if (el == null) {
                System.out.println(el);
                list.remove(el);
            }
        }
        return list;
    }

    public static List<Integer> removeNullFromListToNewList(List<Integer> list) {
        if (list == null || list.isEmpty())
            return null;
        System.out.println(list);
        List<Integer> resList = new ArrayList<>();
        for (Integer el : list) {
            if (el != null) {
                resList.add(el);
            }
        }
        return resList;
    }
}
