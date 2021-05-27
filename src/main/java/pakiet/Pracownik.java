package pakiet;

public class Pracownik {
    private String imie;
    private double wyplata;
    private final double WYPLATA_MINIMALNA = 1000;
    private final double WYPLATA_SREDNIA = 1500;

    public Pracownik(String imie, double wyplata) {
        this.imie = imie;
        this.wyplata = wyplata;
    }

    public Pracownik(String imie) {
        this.imie = imie;
        this.wyplata = WYPLATA_MINIMALNA;
    }

    public String getImie() {
        return imie;
    }

    public double getWyplata() {
        return wyplata;
    }

    public void zwiekszWyplate(double wartosc) {
        this.wyplata += wartosc;
    }

    public boolean jestBogaczem() {
        return wyplata > WYPLATA_SREDNIA;
    }

    public String duzeImie() {
        return imie.toUpperCase();
    }

    public boolean jestBiedakiem() { return wyplata < WYPLATA_MINIMALNA; }

    public String pracownikWita() {
        return "Cześć, jestem" + imie;
    }

    public boolean jestemPiekny() {
        return true;
    }
}
