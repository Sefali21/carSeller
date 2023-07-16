public class AutoAllgemeinInfo {
    private double preis;
    private short erstzulassung;
    private double kilometerStand;
    private String anzahlTuer;
    private int sitzPlatz;
    private double motorRaum;
    private double kofferRaum;
    private String kraftsoffart;
    private int leistung;
    private String getribe;
    private String umweltplakate;
    private String ausserFarbe;
    private String innerFarbe;
    private boolean tempomat;
    private boolean privatAnbieter;
    private boolean leasing;
    private boolean kredit;

    public boolean isKredit() {
        return kredit;
    }

    public void setKredit(boolean kredit) {
        this.kredit = kredit;
    }

    public AutoAllgemeinInfo() {

    }

    public AutoAllgemeinInfo(double preis, short erstzulassung, double kilometerStand, String anzahlTuer, int sitzPlatz, double motorRaum) {
        this.preis = preis;
        this.erstzulassung = erstzulassung;
        this.kilometerStand = kilometerStand;
        this.anzahlTuer = anzahlTuer;
        this.sitzPlatz = sitzPlatz;
        this.motorRaum = motorRaum;
    }

    public AutoAllgemeinInfo(double preis, short erstzulassung, double kilometerStand, String anzahlTuer, int sitzPlatz, double motorRaum, double kofferRaum, String kraftsoffart, int leistung, String getribe, String umweltplakate, String ausserFarbe, String innerFarbe, boolean tempomat, boolean privatAnbieter, boolean leasing) {
        this.preis = preis;
        this.erstzulassung = erstzulassung;
        this.kilometerStand = kilometerStand;
        this.anzahlTuer = anzahlTuer;
        this.sitzPlatz = sitzPlatz;
        this.motorRaum = motorRaum;
        this.kofferRaum = kofferRaum;
        this.kraftsoffart = kraftsoffart;
        this.leistung = leistung;
        this.getribe = getribe;
        this.umweltplakate = umweltplakate;
        this.ausserFarbe = ausserFarbe;
        this.innerFarbe = innerFarbe;
        this.tempomat = tempomat;
        this.privatAnbieter = privatAnbieter;
        this.leasing = leasing;
    }

    @Override
    public String toString() {
        return "AutoA{" +
                "preis=" + preis +
                ", erstzulassung=" + erstzulassung +
                ", kilometerStand=" + kilometerStand +
                ", anzahlTuer='" + anzahlTuer + '\'' +
                ", sitzPlatz=" + sitzPlatz +
                ", motorRaum=" + motorRaum +
                ", kofferRaum=" + kofferRaum +
                ", kraftsoffart='" + kraftsoffart + '\'' +
                ", leistung=" + leistung +
                ", getribe='" + getribe + '\'' +
                ", umweltplakate='" + umweltplakate + '\'' +
                ", ausserFarbe='" + ausserFarbe + '\'' +
                ", innerFarbe='" + innerFarbe + '\'' +
                ", tempomat=" + tempomat +
                ", privatAnbieter=" + privatAnbieter +
                ", leasing=" + leasing +
                ", kredit=" + kredit+
                '}';
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public short getErstzulassung() {
        return erstzulassung;
    }

    public void setErstzulassung(short erstzulassung) {
        this.erstzulassung = erstzulassung;
    }

    public double getKilometerStand() {
        return kilometerStand;
    }

    public void setKilometerStand(double kilometerStand) {
        this.kilometerStand = kilometerStand;
    }

    public String getAnzahlTuer() {
        return anzahlTuer;
    }

    public void setAnzahlTuer(String anzahlTuer) {
        this.anzahlTuer = anzahlTuer;
    }

    public int getSitzPlatz() {
        return sitzPlatz;
    }

    public void setSitzPlatz(int sitzPlatz) {
        this.sitzPlatz = sitzPlatz;
    }

    public double getMotorRaum() {
        return motorRaum;
    }

    public void setMotorRaum(double motorRaum) {
        this.motorRaum = motorRaum;
    }

    public double getKofferRaum() {
        return kofferRaum;
    }

    public void setKofferRaum(double kofferRaum) {
        this.kofferRaum = kofferRaum;
    }

    public String getKraftsoffart() {
        return kraftsoffart;
    }

    public void setKraftsoffart(String kraftsoffart) {
        this.kraftsoffart = kraftsoffart;
    }

    public int getLeistung() {
        return leistung;
    }

    public void setLeistung(int leistung) {
        this.leistung = leistung;
    }

    public String getGetribe() {
        return getribe;
    }

    public void setGetribe(String getribe) {
        this.getribe = getribe;
    }

    public String getUmweltplakate() {
        return umweltplakate;
    }

    public void setUmweltplakate(String umweltplakate) {
        this.umweltplakate = umweltplakate;
    }

    public String getAusserFarbe() {
        return ausserFarbe;
    }

    public void setAusserFarbe(String ausserFarbe) {
        this.ausserFarbe = ausserFarbe;
    }

    public String getInnerFarbe() {
        return innerFarbe;
    }

    public void setInnerFarbe(String innerFarbe) {
        this.innerFarbe = innerFarbe;
    }

    public boolean isTempomat() {
        return tempomat;
    }

    public void setTempomat(boolean tempomat) {
        this.tempomat = tempomat;
    }

    public boolean isPrivatAnbieter() {
        return privatAnbieter;
    }

    public void setPrivatAnbieter(boolean privatAnbieter) {
        this.privatAnbieter = privatAnbieter;
    }

    public boolean isLeasing() {
        return leasing;
    }

    public void setLeasing(boolean leasing) {
        this.leasing = leasing;
    }
}
