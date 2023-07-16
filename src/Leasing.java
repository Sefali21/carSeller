public class Leasing {
    AutoAllgemeinInfo leasingYN=new AutoAllgemeinInfo();

    private String leasingInfo;

    public Leasing(String leasingInfo) {
        this.leasingInfo = leasingInfo;
    }

    public String getLeasingInfo() {
        return leasingInfo;
    }

    public void setLeasingInfo(String leasingInfo) {
        this.leasingInfo = leasingInfo;
    }

    @Override
    public String toString() {
        if (leasingYN.isLeasing()){
            return "Leasing{" +
                    "leasingInfo='" + leasingInfo + '\'' +
                    '}';
        }
        else return String.valueOf(leasingYN.isLeasing());
    }
}
