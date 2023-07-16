// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class CarSeller {
    public static void main(String[] args) {
//        Ford kuga1=new Ford(17999.2, (short) 2020,73001.2,"5",5,2.0,"hat neue TUV","ein Jahr Garantie");
//        kuga1.setLeasing(false);
//        kuga1.setKredit(true);
//        System.out.println(kuga1.toString());


        Auto kuga1=new Auto(17999.2, (short) 2020,73001.2,"5",5,2.0,"hat neue TUV","ein Jahr Garantie");
        kuga1.setLeasing(false);
        kuga1.setKredit(true);
        System.out.println(kuga1.toString());
        kuga1.setVorleistung(11299);
        kuga1.setLaufzeit((short)72);
        kuga1.setPreis(17999.2);
        System.out.println("Zinsen");
        kuga1.rechnenZinzen();

    }
}
