public class Main {
    public static void main(String[] args) {
        Funkce_Kvadraticka obj1 = new Funkce_Kvadraticka(1, 7, 12);
        Funkce_Kvadraticka obj2 = new Funkce_Kvadraticka(1, 7, 12);
        Funkce_Kvadraticka obj3 = new Funkce_Kvadraticka(1, 6, 12);
        System.out.println(obj1.calc_y(-3));
        System.out.println(obj1.calc_y(-4));
        System.out.println(obj1.nazev_objektu());
        System.out.println(obj1.equals(obj2));
        System.out.println(obj1.equals(obj3));
        System.out.println(obj1);

        System.out.println("--------------------------");
        Funkce_Primka obj4 = new Funkce_Primka(3, -18);
        Funkce_Primka obj5 = new Funkce_Primka(3, -18);
        Funkce_Primka obj6 = new Funkce_Primka(3, -4);
        System.out.println(obj4.calc_y(6));
        System.out.println(obj4.nazev_objektu());
        System.out.println(obj4.equals(obj5));
        System.out.println(obj4.equals(obj6));
        System.out.println(obj4);


    }
}

/*
MatematickeFunkce:
    Funkce:
        double calc_y(double x) : hodnota funkce
        string nazev_objektu() : označení objektu (přímka, kvadratická funkce)
    Funkce_Primka : Funkce
        double k
        double q
        String TYPE
        Funkce_Primka(double k, double q) : constructor
        double calc_y(double x) : y = kx + q
        String nazev_objektu() : TYPE
        boolean equals(Funkce_Primka primka)
        String toString() : "f(x) = kx + q"
    Funkce_Kvadraticka: Funkce
        double a
        double b
        double c
        Funkce_Kvadraticka(double a, double b, double c) : constructor
        double calc_y(double x) :  y = ax^2 + bx + c
        String nazev_objektu() : TYPE
        int pocet_korenu() : D < 0, D > 0, D == 0
        double diskriminant() : b^2 - 4 * a * c;
        boolean equals(Funkce_Kvadraticka kvadraticka)
        String toString() : "f(x) = ax^2 + bx + c"
 */