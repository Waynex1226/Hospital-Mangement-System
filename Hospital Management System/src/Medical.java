import java.util.Scanner;

public class Medical {
    String mname, mmanufacturer, expiryDate;
    int mcost, count;
    void newMedical()
    {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter new medical name:-");
        mname = input.nextLine();

        System.out.print("Please enter new medical  manufacturer:-");
        mmanufacturer = input.nextLine();

        System.out.print("Please enter new medical expiry Date:-");
        expiryDate = input.nextLine();

        System.out.print("Please enter new medical cost:-");
        mcost = input.nextInt();

        System.out.print("Please enter new medical no of unit:-");
        count = input.nextInt();

    }

    void findMedical()
    {
        System.out.println(mname + "  \t" + mmanufacturer + "    \t" + expiryDate + "     \t" + mcost);
    }
}
