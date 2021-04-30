# ParkingPlaces

Design a parking system. There are 3 types of parking spaces: big, medium and small.

Implement ParkingSystem class(int big, int medium, int small). Constructor takes a number of places of types. So ParkingSystem(1,2,3) means there are 1 big place, 2 medium and 3 small.

Add method addCar(int carType) - carType takes one of three values [1,2,3] which represents big car, medium car and small car.

Method should check if there is a place for a car of such size or bigger, if yes then it parks the car in this place and returns true, else false.

For now there is no method to free parking space (when a car is leaving) but it can be added in future.
Example:
* ParkingSystem ps = new ParkingSystem(1, 2, 3); // creates parking with 1 big place, 2 medium and 3 small
* ps.addCar(2); //true, medium car takes medium place
* ps.addCar(2); //true, medium car takes medium place
* ps.addCar(2); //true, medium car takes big place
* ps.addCar(1); //false, no place for big car
