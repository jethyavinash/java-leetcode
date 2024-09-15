package com.practice.coding;

public class EnumDemo {
    public static void main(String[] args) {
        for(Day day : Day.values()){
            System.out.println(day.getDayInHindi());
        }

        Day day = Day.MONDAY;
        switch (day){
            case SUNDAY: {
                System.out.println("hahah "+day.getDayInHindi());
                break;
            }
            case MONDAY:{
                System.out.println("oh no "+day.getDayInHindi());
            }
            case TUESDAY:{
                System.out.println("urghh :"+day.getDayInHindi());
            }

        }
    }
}

enum Day {
    MONDAY("somvar"),
    TUESDAY("mangalvar"),
    WEDNESDAY("budhvar"),
    THURSDAY("guruvar"),
    FRIDAY("sukravar"),
    SATURDAY("sanivar"),
    SUNDAY("rabivar");
    private String dayInHindi;

    private Day(String dayInHindi){
        this.dayInHindi = dayInHindi;
    }

    public String getDayInHindi() {
        return dayInHindi;
    }
}
