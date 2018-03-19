package t05.main.java.marksComparator;

import t05.main.java.mark.IntMark;
import t05.main.java.mark.Mark;
import t05.main.java.mark.RealMark;

import java.util.Comparator;

public class MarksComparator implements Comparator<Mark> {

    @Override
    public int compare(Mark mark1, Mark mark2) {
        if(mark1.getClass() == RealMark.class & mark2.getClass() == RealMark.class) {
            RealMark x = (RealMark) mark1 ;
            RealMark y = (RealMark) mark2;
            if (x.getValue() < y.getValue()) {
                return -1;
            } else if (x.getValue() > y.getValue()) {
                return 1;
            } else {
                return 0;
            }
        } else if (mark1.getClass() == IntMark.class & mark2.getClass() == RealMark.class) {
            IntMark x = (IntMark) mark1 ;
            RealMark y = (RealMark) mark2;
            if (x.getValue() < y.getValue()) {
                return -1;
            } else if (x.getValue() > y.getValue()) {
                return 1;
            } else {
                return 0;
            }
        } else if (mark1.getClass() == RealMark.class & mark2.getClass() == IntMark.class) {
            RealMark x = (RealMark) mark1 ;
            IntMark y = (IntMark) mark2;
            if (x.getValue() < y.getValue()) {
                return -1;
            } else if (x.getValue() > y.getValue()) {
                return 1;
            } else {
                return 0;
            }
        } else {
            IntMark x = (IntMark) mark1 ;
            IntMark y = (IntMark) mark2;
            if (x.getValue() < y.getValue()) {
                return -1;
            } else if (x.getValue() > y.getValue()) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}
