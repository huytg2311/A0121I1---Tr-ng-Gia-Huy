package csv;

public class CsvGetSet {
    private String ip1;
    private String ip2;
    private String s1;
    private String s2;
    private String n1;
    private String n2;

    public CsvGetSet(String ip1, String ip2, String s1, String s2, String n1, String n2) {
        this.ip1 = ip1;
        this.ip2 = ip2;
        this.s1 = s1;
        this.s2 = s2;
        this.n1 = n1;
        this.n2 = n2;
    }

    public CsvGetSet() {

    }

    public String getIp1() {
        return ip1;
    }

    public void setIp1(String ip1) {
        this.ip1 = ip1;
    }

    public String getIp2() {
        return ip2;
    }

    public void setIp2(String ip2) {
        this.ip2 = ip2;
    }

    public String getS1() {
        return s1;
    }

    public void setS1(String s1) {
        this.s1 = s1;
    }

    public String getS2() {
        return s2;
    }

    public void setS2(String s2) {
        this.s2 = s2;
    }

    public String getN1() {
        return n1;
    }

    public void setN1(String n1) {
        this.n1 = n1;
    }

    public String getN2() {
        return n2;
    }

    public void setN2(String n2) {
        this.n2 = n2;
    }

    @Override
    public String toString() {
        return ip1 + "," + ip2 + "," + s1 + "," + s2 +
                "," + n1 + "," + n2;
    }
}
