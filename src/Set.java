import java.util.HashMap;
import java.util.Iterator;

public class Set<E> implements Iterable<E> {
    private HashMap<E, Object> map;
    private Object val = new Object();

    public Set(){
        this.map = new HashMap<>();
    }

    public boolean add(E e){
        return map.put(e, val) == null;
    }

    public boolean remove(Object o){
        return map.remove(o) != null;
    }

    public boolean contains(Object o){
        return map.containsKey(o);
    }

    public Iterator<E> iterator() {
        return map.keySet().iterator();
    }

    public boolean addAll(Set<? extends E> s){
        boolean changed = false;
        for(E e : s){
            if(add(e)){
                changed = true;
            }
        }
        return changed;
    }

    public boolean removeAll(Set<? extends E> s){
        boolean changed = false;
        for(Object o : s){
            if(remove(o)){
                changed = true;
            }
        }
        return changed;
    }

    public boolean containsAll(Set<?> s){
        for(Object o : s){
            if(!contains(o)){
                return false;
            }
        }
        return true;
    }

}
