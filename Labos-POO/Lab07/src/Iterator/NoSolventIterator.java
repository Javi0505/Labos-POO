package Iterator;

import java.util.List;
import java.util.ArrayList;
import Resident.*;

public class NoSolventIterator implements ResidentIterator {
    private ResidentCollection collection;
    private List<Resident> noSolventResidents = new ArrayList<>();
    private int currentPosition = 0;

    public NoSolventIterator(ResidentCollection collection) {
        this.collection = collection;
    }

    private void initIterator() {
        if (this.noSolventResidents.size() == 0)
            this.noSolventResidents = collection.getNoSolventResidents();
    }

    @Override
    public Resident getNext() {
        if (hasMore()) {
            Resident noSolventResident = noSolventResidents.get(currentPosition);
            currentPosition++;
            return noSolventResident;
        } else {
            return null;
        }
    }

    @Override
    public boolean hasMore() {
        initIterator();
        return currentPosition < noSolventResidents.size();
    }

    @Override
    public int getPosition() {
        return currentPosition;
    }

    @Override
    public void reset() {
        currentPosition = 0;
    }
}
