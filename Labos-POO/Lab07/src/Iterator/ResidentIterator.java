package Iterator;
import Resident.*;
public interface ResidentIterator {
    public Resident getNext();
    public boolean hasMore();
    public int getPosition();
    public void reset();
}