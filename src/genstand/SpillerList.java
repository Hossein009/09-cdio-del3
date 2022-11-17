package genstand;

import java.util.Arrays;

public class SpillerList {
    private Spiller[] spillerlist;

    public SpillerList(int antalAfSpiller) {
        this.spillerlist = new Spiller[antalAfSpiller]:
    }
    //tilføjelse at spiller til listen
    public void addSpiller(Spiller spiller, int i) {
        this.spillerlist[i] = spiller;
    }
    public Spiller getSpiller(int i) {
        return spillerlist[i];
    }
    public int antalAfSiller() {
        return spillerlist.length;
    }
    @Override
    public String toString() {
        return "Spillerliste: " + Arrays.toString(spillerlist);
    }

}
