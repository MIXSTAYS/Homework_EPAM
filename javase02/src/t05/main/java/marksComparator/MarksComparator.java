package t05.main.java.marksComparator;

import t05.main.java.mark.IntMark;
import t05.main.java.mark.Mark;
import t05.main.java.mark.RealMark;

import java.util.Comparator;

public class MarksComparator implements Comparator<Mark> {

    @Override
    public int compare(Mark mark1, Mark mark2) {
        if (mark1.getRealValue() < mark2.getRealValue()) {
            return -1;
        } else if (mark1.getRealValue() > mark2.getRealValue()) {
            return 1;
        } else {
            return 0;
        }
    }
}
