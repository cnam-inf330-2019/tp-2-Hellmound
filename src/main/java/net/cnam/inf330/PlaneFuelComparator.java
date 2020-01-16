package net.cnam.inf330;

import java.util.Comparator;

public class PlaneFuelComparator<Plane> implements Comparator<Plane>{
    public Plane compare(Plane a, Plane b)
    {
        if (a.getFuelCapacity() > b.getFuelCapacity()) return b;
        else return a;
    }


}