package com.practice.coding;

public class CarParking {
    public static void main(String[] args) {
        Parking parking = new Parking(1,1,1);
        System.out.println(parking.addCar(2));
        System.out.println(parking.addCar(1));
    }
}

class Parking {
    int[] availableSlots;
    public Parking(int big,int medium,int small){
        this.availableSlots = new int[3];
        this.availableSlots[0] = big;
        this.availableSlots[1] = medium;
        this.availableSlots[2] = small;
    }

    public boolean addCar(int carType){
        if(this.availableSlots[carType-1] > 0){
            this.availableSlots[carType-1]--;
            return true;
        }
        return false;
    }
}
