public class Ford extends Finanz{
    private String beschreibung;
    private String garantie;

    public Ford(double preis, short erstzulassung, double kilometerStand, String anzahlTuer, int sitzPlatz, double motorRaum, String beschreibung, String garantie) {
        super(preis, erstzulassung, kilometerStand, anzahlTuer, sitzPlatz, motorRaum);
        this.beschreibung = beschreibung;
        this.garantie = garantie;
    }


    @Override
    public String toString() {
        return "Ford{" +
                "preis=" + getPreis() +
                ", erstzulassung=" + getErstzulassung() +
                ", \n\tkilometerStand=" + getKilometerStand() +
                ", \n\tanzahlTuer='" + getAnzahlTuer() + '\'' +
                ", \n\tsitzPlatz=" + getAnzahlTuer() +
                ", \n\tmotorRaum=" + getMotorRaum() +
                ", \n\tkofferRaum=" + getKofferRaum() +
                ", \n\tkraftsoffart='" + getKraftsoffart() + '\'' +
                ", \n\tleistung=" + getLeistung() +
                ", \n\tgetribe='" + getGetribe() + '\'' +
                ", \n\tumweltplakate='" + getUmweltplakate() + '\'' +
                ", \n\tausserFarbe='" + getAusserFarbe() + '\'' +
                ", \n\tinnerFarbe='" + getInnerFarbe() + '\'' +
                ", \n\tprivatAnbieter=" + isTempomat() +
                ", \n\tprivatAnbieter=" + isPrivatAnbieter() +
                ", \n\tleasing=" + isLeasing() +
                ", \n\tkredit=" + isKredit()+
                ", \n\tbeschreibung='" + beschreibung + '\'' +
                ", \n\tgarantie='" + garantie + '\'' +
                '}';
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public String getGarantie() {
        return garantie;
    }

    public void setGarantie(String garantie) {
        this.garantie = garantie;
    }
}
