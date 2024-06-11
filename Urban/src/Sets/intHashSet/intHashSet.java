package Sets.intHashSet;

import java.util.Iterator;

public class intHashSet implements Iterator{
    private int item;

    public intHashSet(int item) {
        this.item = item;
    }

    public boolean isOdd() {
        boolean result = false;
        if (item % 2 == 0) {
            result = true;
        }
        return result;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}


