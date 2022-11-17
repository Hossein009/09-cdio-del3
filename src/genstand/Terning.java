package genstand;

import java.sql.PreparedStatement;

public class Terning {
   public int øjne;
   public int terningsider = 6;
   //Dette metode er til at simulere terning kast (Constructor)
    public int kast(){
        return this.øjne = (int) (Math.random() * terningsider) + 1;

    }
   // En anden metode som fortæller andtal af øjne/ henter øjne fra terning kast.


    public int getØjne() {
        return this.øjne;
    }
}
