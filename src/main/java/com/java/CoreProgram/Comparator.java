package com.java.CoreProgram;

public class Comparator implements java.util.Comparator<CamparableStudent> {
    @Override
    public int compare(CamparableStudent o1, CamparableStudent o2) {
        if(o1.getId()==o2.getId())
        {
          //  return 0;
            return o1.getName().compareTo(o2.getName());

        }
        else if (o1.getId() > o2.getId())
        {
            return 1;
        }
        else{
            return -1;
        }

    }

}
