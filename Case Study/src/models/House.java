package models;

public class House extends Services{
    private String roomStandard;
    private String otherFacilities;
    private int numberOfFloor;

    public House() {}

    @Override
    public String toString() {
        return "House{" +
                "roomStandard='" + roomStandard + '\'' +
                ", otherFacilities='" + otherFacilities + '\'' +
                ", numberOfFloor=" + numberOfFloor +
                '}';
    }

    public House(String id, String nameService, double areaUse, double retalCost, int numberOfPeople, String rentalType, String roomStandard, String otherFacilities, int numberOfFloor) {
        super(id, nameService, areaUse, retalCost, numberOfPeople, rentalType);
        this.roomStandard = roomStandard;
        this.otherFacilities = otherFacilities;
        this.numberOfFloor = numberOfFloor;
    }

    @Override
    public void showInfor() {
        System.out.println(this.toString());
    }



    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getOtherFacilities() {
        return otherFacilities;
    }

    public void setOtherFacilities(String otherFacilities) {
        this.otherFacilities = otherFacilities;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }
}
