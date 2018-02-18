package javase01.t04;

public class TaskFour {
    public static void main(String[] args) {
        try {
            double max = Double.parseDouble(args[0]) + Double.parseDouble(args[args.length - 1]);
            for (int i = 0; i < args.length - 1; i++) {
                if ((Double.parseDouble(args[i]) + Double.parseDouble(args[args.length - 1 - i])) > max) {
                    max = Double.parseDouble(args[i]) + Double.parseDouble(args[args.length - 1 - i]);
                }
            }
            System.out.println("Max : " + max);
        } catch (NumberFormatException notNumber) {
            System.err.println("Not a number was entered");
        }
    }
}
