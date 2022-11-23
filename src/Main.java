import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Write one day of the week :");
            String day = scanner.nextLine();

            if (Objects.equals(day, "Monday")) {
                Week monday = Week.MONDAY;
                System.out.println(monday);
            } else if (Objects.equals(day, "Tuesday")) {
                Week tuesday = Week.TUESDAY;
                System.out.println(tuesday);
            } else if (Objects.equals(day, "Wednesday ")) {
                Week wednesday = Week.WEDNESDAY;
                System.out.println(wednesday);
            } else if (Objects.equals(day, "Thursday")) {
                Week thursday = Week.THURSDAY;
                System.out.println(thursday);
            } else if (Objects.equals(day, "Friday")) {
                Week friday = Week.FRIDAY;
                System.out.println(friday);
            } else if (Objects.equals(day, "Saturday")) {
                Week saturday = Week.SATURDAY;
                System.out.println(saturday);
            } else if (Objects.equals(day, "Sunday")) {
                Week sunday = Week.SUNDAY;
                System.out.println(sunday);
            }


        }

        
        


    }
}