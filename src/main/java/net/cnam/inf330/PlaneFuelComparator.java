package net.cnam.inf330;

import java.util.Comparator;

// FIXME No need to parameterize the custom Comparator
public class PlaneFuelComparator<Plane> implements Comparator<Plane>{
    // FIXME The compare method returns an int, not a Plane.
    public Plane compare(Plane a, Plane b)
    {
        if (a.getFuelCapacity() > b.getFuelCapacity()) return b;
        else return a;
    }


}