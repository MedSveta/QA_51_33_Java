package lesson_10;

public interface IMyArray {
   boolean add(Object obj);
   Object get(int index);
   boolean add(int index, Object obj);
   int size();
   Object remove(int index);
   boolean remove(Object obj);
   int indexOf(Object obj);
   int lastIndexOf(Object obj);
   boolean contains(Object obj);
   Object[] toArray();
}
