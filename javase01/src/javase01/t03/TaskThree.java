package javase01.t03;
import static java.lang.Math.tan;

public class TaskThree {
    public static void main(String[] args) {
        try{
            double a = Double.parseDouble(args[0]);
            double b = Double.parseDouble(args[1]);
            double h = Double.parseDouble(args[2]);
            if (a < b){
                if (h <= 0){
                    System.out.println("Step should be positive");
                } else{
                    do {
                        double f = tan(2 * a) - 3;
                        System.out.println(a + ". " + f);
                    }
                    while ((a += h) <= b);
                }
            } else if (a > b) {
                System.out.println("The first number must be greater than the second");
            }

        } catch (NumberFormatException e) {
            System.out.println("You can only enter numbers");
        }
    }
}

//public class TaskThree {
//    public static void main(String[] args) {
//        double a = Double.parseDouble(args[0]);
//        double b = Double.parseDouble(args[1]);
//        double h = Double.parseDouble(args[2]);
//        if (h > 0) {
//            do {
//                double f = tan(2 * a) - 3;
//                System.out.println(a + ". " + f);
//            }
//            while ((a += h) <= b);
//        } else if (h < 0) {
//            do {
//                double f = tan(2 * a) - 3;
//                System.out.println(a + ". " + f);
//            }
//            while ((a += h) >= b);
//        } else {
//            System.out.println("There must be a step not equal to zero");
//        }
//    }
//}