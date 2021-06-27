package models;

public class Customer implements Comparable<Customer>{
    private String fullName;
    private String date;
    private String gender;
    private String idCard;
    private String phoneNumber;
    private String email;
    private String typeOfCustomer;
    private String address;
    private Services services;

    @Override
    public String toString() {
        return "Customer{" +
                "fullName='" + fullName + '\'' +
                ", date='" + date + '\'' +
                ", gender='" + gender + '\'' +
                ", idCard='" + idCard + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", typeOfCustomer='" + typeOfCustomer + '\'' +
                ", address='" + address + '\'' +
                ", services=" + services +
                '}';
    }

    public void showInfor() {
        System.out.println(this.toString());
    }

    public Customer() {
    }

    public Customer(String fullName, String date, String gender,
                    String idCard, String phoneNumber, String email,
                    String typeOfCustomer, String address, Services services) {
        this.fullName = fullName;
        this.date = date;
        this.gender = gender;
        this.idCard = idCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.typeOfCustomer = typeOfCustomer;
        this.address = address;
        this.services = services;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTypeOfCustomer() {
        return typeOfCustomer;
    }

    public void setTypeOfCustomer(String typeOfCustomer) {
        this.typeOfCustomer = typeOfCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Services getServices() {
        return services;
    }

    public void setServices(Services services) {
        this.services = services;
    }

    // Sap xep customer theo alpha b
    @Override
    public int compareTo(Customer second) {
        int result = this.fullName.compareTo(second.fullName);

        if (result == 0) {
            int yearCustomerFirst = Integer.parseInt(this.date.split("/")[2]);
            int yearCustomerSecond = Integer.parseInt(second.date.split("/")[2]);
            result = yearCustomerFirst - yearCustomerSecond;
        }
        return result;
    }

}
