import java.util.Scanner;

public class Facility {
    String facility;
    void newFacility()

    {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter new facility:-");
        facility = input.nextLine();
    }

    void showFacility()
    {
        System.out.println(facility);
    }

}
