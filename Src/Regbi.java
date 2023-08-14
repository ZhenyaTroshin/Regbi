import java.util.Random;

public class Regbi {
    public static void main(String[] args) {
        Random random = new Random();
        int[] age = new int[23];
        for (int a = 0; a<=22; a++){
            age[a] = 18 + a;
        }
        int[] comA = new int[25];
        int[] comB = new int[25];
           double sumComA = 0;
           double sumComB = 0;
        System.out.print("Вік гравців команди \"Blue\": ");
        for (int i = 0; i <= 24; i++) {
            int r = random.nextInt(23);
            comA[i] = age[r];
            if (i < 24) {
                System.out.print(comA[i] + ", ");
            } else if (i == 24) {
                System.out.println(comA[i] + ";");
            }
            sumComA += comA[i];
        }
        double midComA = sumComA/comA.length;
        System.out.println("Середній вік гравців: " + midComA + ".");

        System.out.print("Вік гравців команди \"Red\": ");
        for (int j = 0; j <= 24; j++) {
            int r = random.nextInt(23);
            comB[j] = age[r];
            if (j < 24) {
                System.out.print(comB[j] + ", ");
            } else if (j == 24) {
                System.out.println(comB[j] + ";");
            }
            sumComB += comB[j];
        }
        double midComB = sumComB/comB.length;
        System.out.println("Середній вік гравців: " + midComB + ".");
    }
}