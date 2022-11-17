package genstand;

import java.sql.PreparedStatement;

public class Konto {
    private int penge;

    //construktor for Konto med variable penge
    public Konto(int penge){
        this.penge = penge;
    }
    //nuværende saldo på kontoen
    public int getSaldo(){
        return penge;
    }
    // Metode bruges for at sætte saldo til 0
    public void setFallit (int penge){
        this.penge = penge;
    }
    //dette er for at give kontoen penge
    public void givPenge(){
        this.penge = this.penge + penge;
    }
    //det bruges til at trække penge fra kontoen og samt anvende setFallit, hvis kontosaldo går i minus
    public void tagPenge(int penge){
        int minSaldo = getSaldo() - penge;
        if (minSaldo < 0 ){
            setFallit(0);
        }else {
            this.penge = this.penge - penge;

        }
    }
    public String toString(){
        return "["+penge+"]";
    }
}
