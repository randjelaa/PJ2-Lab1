public class InicijalizacijaPromjenljivih {
    int vrijednost;
    int duplaVrijednost;
    double kolicnikSaDva;
    char znakPodatka;

    InicijalizacijaPromjenljivih() {
        vrijednost=7;
        duplaVrijednost=vrijednost*2;
        kolicnikSaDva=vrijednost/2.0;
        znakPodatka='A';
    }

    public static void main(String args[]) {
        InicijalizacijaPromjenljivih a = new InicijalizacijaPromjenljivih();
        System.out.println(a.vrijednost);
        System.out.println(a.duplaVrijednost);
        System.out.println(a.kolicnikSaDva);
        System.out.println(a.znakPodatka);
    }
}
