package models;

public abstract class Services {
    private String id;
    private String nameService;
    private double areaUse;
    private double retalCost;
    private int numberOfPeople;
    private String rentalType;

    public Services() {

    }

    public abstract void showInfor();

    public Services(String id, String nameService, double areaUse, double retalCost, int numberOfPeople, String rentalType) {
        this.id = id;
        this.nameService = nameService;
        this.areaUse = areaUse;
        this.retalCost = retalCost;
        this.numberOfPeople = numberOfPeople;
        this.rentalType = rentalType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getAreaUse() {
        return areaUse;
    }

    public void setAreaUse(double areaUse) {
        this.areaUse = areaUse;
    }

    public double getRetalCost() {
        return retalCost;
    }

    public void setRetalCost(double retalCost) {
        this.retalCost = retalCost;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "Services{" +
                "id='" + id + '\'' +
                ", nameService='" + nameService + '\'' +
                ", areaUse=" + areaUse +
                ", retalCost=" + retalCost +
                ", numberOfPeople=" + numberOfPeople +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }
}
