public class House {
    private int floors;
    private int rooms;
    private double length;
    private double width;
    private double height;
    private boolean doorIsOpen = false;

    public void setFloors(int floors) {
        if (floors < 0) {
            throw new IllegalArgumentException("The number of floors cannot be less than zero.");

        }
        this.floors = floors;
    }

    public int getFloors() {
        return floors;
    }

    public static String build() {
        System.out.println("Is building House!");
        return "House builded";
    }

    public void openFrontDoor() {
        if (doorIsOpen == false) {
            System.out.println("Door is now open");
            doorIsOpen = true;
        }
    }
}
