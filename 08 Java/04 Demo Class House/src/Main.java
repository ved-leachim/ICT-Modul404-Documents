public class Main {

    public static void main(String[] args) {

        var myHouse = new House();
        myHouse.setFloors(2);
        System.out.println("My house has " + myHouse.getFloors() + " floors.");

        var csbeBuilding = new House();
        csbeBuilding.setFloors(4);
        System.out.println("CsBe Building has " + csbeBuilding.getFloors() + " floors.");
    }

}
