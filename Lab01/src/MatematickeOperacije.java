public class MatematickeOperacije {
    int operand1;
    int operand2;

    MatematickeOperacije() {
        operand1=4;
        operand2=8;
    }

    MatematickeOperacije(int op1, int op2) {
        operand1=op1;
        operand2=op2;
    }

    public int proizvod() {
        return operand1*operand2;
    }

    public double kolicnik() {
        return (double)operand1/operand2; 
    }

    public boolean prviJeVeci() {
        return operand1>operand2;
    }

    public int sumaPrvih20CijelihBrojeva() {
        int suma=0;
        for (int i=0; i<21; i++)
            suma+=i;
        return suma;
    }

    public int razlikaBrojevaDjeljivihSa3() {
        int razlika=100;
        for (int i = 100; i>0; i--) {
            if (i%3==0) razlika-=i;
        }
        return razlika;
    }

    public static void main(String args[]) {
        MatematickeOperacije m1 = new MatematickeOperacije();
        MatematickeOperacije m2 = new MatematickeOperacije(2, 4);

        System.out.println(m1.proizvod());
        System.out.println(m1.kolicnik());
        System.out.println(m1.prviJeVeci());
        System.out.println(m1.sumaPrvih20CijelihBrojeva());
        System.out.println(m1.razlikaBrojevaDjeljivihSa3());

        System.out.println();

        System.out.println(m2.proizvod());
        System.out.println(m2.kolicnik());
        System.out.println(m2.prviJeVeci());
        System.out.println(m2.sumaPrvih20CijelihBrojeva());
        System.out.println(m2.razlikaBrojevaDjeljivihSa3());
    }
}