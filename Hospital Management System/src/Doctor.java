import java.util.Scanner;

public class Doctor {
    String did, dname, specilist, workTime, qualification;
    int droom;
    public void newDoctor()

    {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter new Doctor id:-");
        did = input.nextLine();

        System.out.print("Please enter new Doctor name:-");
        dname = input.nextLine();

        System.out.print("Please enter new Doctor specilization:-");
        specilist = input.nextLine();

        System.out.print("Please enter new Doctor work time:-");
        workTime = input.nextLine();

        System.out.print("Please enter new Doctor qualification:-");
        qualification = input.nextLine();

        System.out.print("Please enter new Doctor room no.:-");
        droom = input.nextInt();

    }

    public void showDoctorInfo()

    {
        System.out.println(did + "\t" + dname + "  \t" + specilist + "     \t" + workTime + "    \t" + qualification + "       \t" + droom);

    }

}
