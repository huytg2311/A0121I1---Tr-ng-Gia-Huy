package models;

/*
    Dịch vụ đi kèm bao gồm các thông tin: Tên dịch vụ đi kèm, đơn vị , giá
 */
public class FreeService {
    private String freeServiceName;
    private String unit;
    private double money;

    public FreeService(String freeServiceName, String unit, double money) {
        this.freeServiceName = freeServiceName;
        this.unit = unit;
        this.money = money;
    }

    public String getFreeServiceName() {
        return freeServiceName;
    }

    public void setFreeServiceName(String freeServiceName) {
        this.freeServiceName = freeServiceName;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "FreeService{" +
                "freeServiceName='" + freeServiceName + '\'' +
                ", unit='" + unit + '\'' +
                ", money=" + money +
                '}';
    }
}
