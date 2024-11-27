public class StudentTester
{
    public static void main(String[] args)
    {
        Student student1 = new Student("Igor Kovac");

        // TODO: simulujte absolvovanie niekoľkých testov
        student1.absolvujTest(15);
        student1.absolvujTest(17);
        student1.absolvujTest(19);
        student1.absolvujTest(23);

        // TODO: následne zobrazte aktuálne a očakávané hodnoty (meno, celkové skóre, priemerné skóre)
        System.out.println("Meno studenta: " + student1.getMeno());
        System.out.println("Ocakavana hodnota: Igor Kovac");
        System.out.println("Celkove skore: " + student1.getCelkoveSkore());
        System.out.println("Ocakavana hodnota: 74.0");
        System.out.println("Priemerne skore: " + student1.getPriemerneSkore());
        System.out.println("Ocakavana hodnota: 18.5");
    }
}
