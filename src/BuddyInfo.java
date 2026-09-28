public class BuddyInfo {

    private String name;

    private String address;

    private String phoneNumber;

    public BuddyInfo() {
        name = "null";
        address = "null";
        phoneNumber = "null";
    }

    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }




    static void main() {
        System.out.println("Hello world!");

        BuddyInfo friend = new BuddyInfo();

        friend.name = "Logan";
        friend.address = "89 Steeple Chase dr";
        friend.phoneNumber = "6133019009";

        System.out.println("Hello "+friend.name);
    }
}
