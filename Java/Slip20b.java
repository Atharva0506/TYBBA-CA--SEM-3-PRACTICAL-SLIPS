import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;

public class Slip20b {
    public static void main(String[] args) {
        
        LinkedList<String> pLanguages = new LinkedList<>();
        pLanguages.add("CPP");
        pLanguages.add("Java");
        pLanguages.add("Python");
        pLanguages.add("PHP");

       
        System.out.println("Contents of the List using Iterator:");
        displayListUsingIterator(pLanguages);

       
        System.out.println("\nContents of the List in Reverse Order using ListIterator:");
        displayListInReverseOrder(pLanguages);
    }

    private static void displayListUsingIterator(LinkedList<String> list) {
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private static void displayListInReverseOrder(LinkedList<String> list) {
        ListIterator<String> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}

