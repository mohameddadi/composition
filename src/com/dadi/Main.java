package com.dadi;

/**
 * Created by Dadi on 29/12/2016.
 */
public class Main {

    public static void main(String[] args){

        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("220B","Dell","240",dimensions);

        Monitor theMonitor = new Monitor("27enchBeast","Acer",27,new Resolution(2540,1440));

        Motherboard motherboard = new Motherboard("BJ-200","Asus",1,1,"v2-44");

        Pc thePc = new Pc(theCase,theMonitor,motherboard);
        thePc.getMonitor().drowPixelAt(1500,1200,"red");
        thePc.getMotherboard().loadProgram("widows 1.0");
        thePc.getTheCase().pressPowerButton();
    }
}
