public class Main {
    public static void main(String[] args) {
        ParkingSystem ps = new ParkingSystem(1, 2, 3); // creates parking with 1 big place, 2 medium and 3 small
        System.out.println(ps.addCar(2)); //true, medium car takes medium place
        System.out.println(ps.addCar(2)); //true, medium car takes medium place
        System.out.println(ps.addCar(2)); //true, medium car takes big place
        System.out.println(ps.addCar(1)); //false, no place for big car
    }
}
