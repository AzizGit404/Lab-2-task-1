public class task2 {
    public static void main(String[] args) {

        int number = (int)(Math.random() * 100) + 1;
        System.out.println("Generated random number: " + number);

        if (number % 2 == 0) {
            System.out.println(number + " is EVEN");
        } else {
            System.out.println(number + " is ODD");
        }
    }
}
