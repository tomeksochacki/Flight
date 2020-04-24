package com.test;

public class Main {
}

class Flight{
    private String departure;
    private String arrival;
    private String flightFrom;
    private String flightTo;

    public Flight(String departure, String arrival) {
        this.arrival = arrival;
        this.departure = departure;
    }
    public void flightFrom (){
        System.out.println("Flight from England");
    }
    public void flightTo (){
        System.out.println("FLight to USA");
    }
    public String getFlightFrom(){
        return this.flightFrom;
    }

    public String getFlightTo (){
        return this.flightTo;
    }
}
