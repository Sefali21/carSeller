public class Finanz extends AutoAllgemeinInfo{
    private final double ZINSENSATZ=5;
    private double vorleistung;
    private short laufzeit;
    private double zinsen;

    public Finanz(double preis, short erstzulassung, double kilometerStand, String anzahlTuer, int sitzPlatz, double motorRaum) {
    }

    public double getVorleistung() {
        return vorleistung;
    }

    public void setVorleistung(double vorleistung) {
        this.vorleistung = vorleistung;
    }



    public Finanz(double preis, short erstzulassung, double kilometerStand, String anzahlTuer, int sitzPlatz, double motorRaum, double vorleistung, short laufzeit) {
        super(preis, erstzulassung, kilometerStand, anzahlTuer, sitzPlatz, motorRaum);
        this.vorleistung = vorleistung;
        this.laufzeit = laufzeit;

    }

    public Finanz(double preis, short erstzulassung, double kilometerStand, String anzahlTuer, int sitzPlatz, double motorRaum, double kofferRaum, String kraftsoffart, int leistung, String getribe, String umweltplakate, String ausserFarbe, String innerFarbe, boolean tempomat, boolean privatAnbieter, boolean leasing, double vorleistung,  short laufzeit) {
        super(preis, erstzulassung, kilometerStand, anzahlTuer, sitzPlatz, motorRaum, kofferRaum, kraftsoffart, leistung, getribe, umweltplakate, ausserFarbe, innerFarbe, tempomat, privatAnbieter, leasing);
        this.vorleistung = vorleistung;
        this.laufzeit = laufzeit;

    }

    public Finanz(double vorleistung, short laufzeit) {
        this.vorleistung = vorleistung;
        this.laufzeit = laufzeit;
    }

    public double rechnenZinzen(){
        if (isKredit()) {
            zinsen = ((getPreis()-vorleistung)*laufzeit)/(100*12);
            zinsen+=(getPreis()-vorleistung);
            System.out.println(zinsen);
            System.out.println(String.format("Monatlich: € %.2f",zinsen/laufzeit));

        }
        return zinsen;
    }
    @Override
    public String toString() {
        return "Finanz{" +
                " ZINSENSATZ=" + ZINSENSATZ +
                ", kapital=" + vorleistung +
                ", laufzeit=" + laufzeit +
                ", zinsen=+"+ zinsen+
        '}';
    }

    public double getZINSENSATZ() {
        return ZINSENSATZ;
    }

    public double getKapital() {
        return vorleistung;
    }

    public void setKapital(double kapital) {
        this.vorleistung = kapital;
    }

    public short getLaufzeit() {
        return laufzeit;
    }

    public void setLaufzeit(short laufzeit) {
        this.laufzeit = laufzeit;
    }
}
