public class ParkingSystem {
    private int big;
    private int medium;
    private int small;

    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar(int car) {
        if (car == 1 && isPlaceForBigCar()) {
            return parkBigCar();
        } else if (car == 2 && isPlaceForMediumCar()) {
            return parkMediumCar();
        } else if (car == 3 && isPlaceForSmallCar()) {
            return parkSmallCar();
        }
        return false;
    }

    private boolean parkBigCar() {
        this.big--;
        return true;
    }

    private boolean parkMediumCar() {
        if (medium > 0) {
            this.medium--;
        } else if (big > 0) {
            this.big--;
        }
        return true;
    }

    private boolean parkSmallCar() {
        if (small > 0) {
            this.small--;
        } else if (medium > 0) {
            this.medium--;
        } else if (big > 0) {
            this.small--;
        }
        return true;
    }

    private boolean isPlaceForBigCar() {
        return this.big > 0;
    }

    private boolean isPlaceForMediumCar() {
        return (this.big > 0 || this.medium > 0);
    }

    private boolean isPlaceForSmallCar() {
        return (this.big > 0 || this.medium > 0 || this.small > 0);
    }
}