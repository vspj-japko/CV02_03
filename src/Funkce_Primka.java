public class Funkce_Primka extends Funkce {

    private double k;
    private double q;

    public Funkce_Primka(double k, double q) {
        this.k = k;
        this.q = q;
    }

    public double calc_y(double x) {
        return this.k * x + this.q;
    }

    public boolean equals(Funkce_Primka primka) {
        return this.k == primka.k && this.q == primka.q;
    }

    @Override
    public String toString() {
        return "f(x) = " + this.k + "x + " + this.q;
    }

    @Override
    public String nazev_objektu() {
        return null;
    }
}
