package Iterator;

import java.util.List;

import Resident.Resident;

public class SolventIterator implements ResidentIterator {
    private ResidentCollection collection;
    private List<Resident> solventResidents;
    private int currentPosition;

    public SolventIterator(ResidentCollection collection) {
        this.collection = collection;
        this.currentPosition = 0;
        this.solventResidents = collection.getSolventResidents();
    }

    @Override
    public Resident getNext() {
        if (hasMore()) {
            return solventResidents.get(currentPosition++);
        } else {
            return null;
        }
    }

    @Override
    public boolean hasMore() {
        return currentPosition < solventResidents.size();
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
