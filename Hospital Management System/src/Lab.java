import java.util.Scanner;

public class Lab {
    String lab;
    int lcost;
    void newLab()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter new lab:-");
        lab = input.nextLine();

        System.out.print("Please enter new lab cost:-");
        lcost = input.nextInt();

    }

    void labList()
    {
        System.out.println(lab + "\t\t" + lcost);

    }
}
