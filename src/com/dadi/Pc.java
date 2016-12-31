package com.dadi;

/**
 * Created by Dadi on 29/12/2016.
 */
public class Pc {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public Pc(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public Case getTheCase() {
        return theCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }
}
