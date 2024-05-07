package Iterator;
import Resident.Resident;

import java.util.List;
import java.util.ArrayList;

public class ResidentCollection implements IterableCollection{
    private List<Resident> residents;

    public ResidentCollection(List<Resident> residents) {
        this.residents = residents;
    }

    @Override
    public ResidentIterator createSolventIterator() {
        return new SolventIterator(this);
    }

    @Override
    public ResidentIterator createNoSolventIterator() {
        return new NoSolventIterator(this);
    }

    public List<Resident> getSolventResidents() {
        List<Resident> solventResidents = new ArrayList<>();

        for (Resident resident : this.residents) {
            if (resident.isSolvent())
                solventResidents.add(resident);
        }

        return solventResidents;
    }

    public List<Resident> getNoSolventResidents() {
        List<Resident> noSolventResidents = new ArrayList<>();

        for (Resident resident : this.residents) {
            if (!resident.isSolvent())
                noSolventResidents.add(resident);
        }

        return noSolventResidents;
    }
}
