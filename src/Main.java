import java.util.Random;

public class Main {
    // lesson 2 homework, Аль Маджали Ахмад, андроид первый месяц, группа с 4 по 6

        public static void main(String[] args) {
            System.out.println(ageTemperature(generateRandomAge(), 25));
            System.out.println(ageTemperature(22, 32));
            System.out.println(ageTemperature(65, 12));
            System.out.println(ageTemperature(44, 23));
            System.out.println(ageTemperature(11, 16));

        }

        public static String ageTemperature(int age, int temp) {
            if (age > 20 && age < 45 && temp > -20 && temp < 30) {
                return "You can go outside";
            } else if (age < 20 && temp > 0 && temp < 28) {
                return "You can go outside";
            } else if (age > 45 && temp > -10 && temp < 25) {
                return "You can go outside";
            }
            return "Stay at home";
        }

        public static int generateRandomAge() {
            Random random = new Random();
            return random.nextInt(100);
        }


}