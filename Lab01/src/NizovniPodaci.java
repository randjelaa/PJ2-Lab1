public class NizovniPodaci {
    //nije uradjena provjera ako se posalje prazan niz char[]
    //i formatiranje matrice
    char[] s;
    int[][] tablicaMnozenja;

    public void setSlova(char[] s) {
        this.s = s;
    }

    NizovniPodaci() {
        tablicaMnozenja = new int[11][11];
        for (int i=0; i<11; i++) {
            for (int j=0; j<11; j++) {
                tablicaMnozenja[i][j] = i*j;
            }
        }
    }

    public void printSlova() {
        for (int i=0; i<s.length; i++) {
            System.out.print(s[i]);
        }
        System.out.println();
    }

    public void printTablicu() {
        for (int i=0; i<11; i++) {
            for (int j=0; j<11; j++) {
                System.out.print(tablicaMnozenja[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        NizovniPodaci n1 = new NizovniPodaci();
        char[] s = {'s', 'l', 'o', 'v', 'a'};
        n1.setSlova(s);
        n1.printSlova();
        n1.printTablicu();
    }
}
