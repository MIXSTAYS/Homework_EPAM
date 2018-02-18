package javase01.t05;

public class TaskFive {
    public static void main(String[] args) {
        try {
            int size = Integer.parseInt(args[0]);
            String array [][] = new String[size][size];
            for (int i = 0; i < size; i++){
                for (int j = 0; j < size; j++){
                    if ((i == j || size - 1 - i == j) && i != size / 2 && j != size / 2) {
                        array[i][j] = "1";
                    } else if (i == size / 2) {
                        array[i][j] = "M";
                    } else if (j == size / 2) {
                        array[i][j] = "L";
                    } else {
                        array[i][j] = "0";
                    }
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
        } catch (RuntimeException e) {
            System.err.println("Only positive integers can be entered");
        }
    }
}
