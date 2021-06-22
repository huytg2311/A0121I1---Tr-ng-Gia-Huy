package models;

public class Room extends Services{
    private FreeService freeServices;

    public Room() {}

    public Room(String id, String nameService, double areaUse, double retalCost, int numberOfPeople, String rentalType, FreeService freeServices) {
        super(id, nameService, areaUse, retalCost, numberOfPeople, rentalType);
        this.freeServices = freeServices;
    }

    @Override
    public void showInfor() {
        System.out.println(this.toString());
    }


    public FreeService getFreeServices() {
        return freeServices;
    }

    public void setFreeServices(FreeService freeServices) {
        this.freeServices = freeServices;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeServices=" + freeServices +
                '}';
    }
}
