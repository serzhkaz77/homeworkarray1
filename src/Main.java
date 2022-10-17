public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1.\n");

        int[] whole = new int[3];
        whole[0] = 1;
        whole[1] = 2;
        whole[2] = 3;
        double[] fractionNum = {1.57, 7.654, 9.986};
        long[] longsNum = {111_222_333, 444_555_777};
        System.out.println("Произведена инициализация 3-х массивов.");

        System.out.println("\nЗадание 2.\n");
        System.out.println(whole[0] + ", " + whole[1] + ", " + whole[2]);
        System.out.println(fractionNum[0] + ", " + fractionNum[1] + ", " + fractionNum[2]);
        System.out.println(longsNum[0] + ", " + longsNum[1]);

        System.out.println("\nЗадание 3.\n");
        System.out.println(whole[2] + ", " + whole[1] + ", " + whole[0]);
        System.out.println(fractionNum[2] + ", " + fractionNum[1] + ", " + fractionNum[0]);
        System.out.println(longsNum[1] + ", " + longsNum[0]);

        System.out.println("\nЗадание 4.\n");
        for (int i=0; i < 3; ++i) {
            if (whole[i] % 2 == 0) {
                System.out.print(whole[i] + " ");
            } else {
                System.out.print((whole[i] + 1) + " ");
            }
        }
    }
}