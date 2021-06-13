import java.util.Scanner;

public class Patient {
    String pid, pname, disease, sex, admitStatus;
    int age;
    void newPatient()

    {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter new Patient id:-");
        pid = input.nextLine();

        System.out.print("Please enter new Patient name:-");
        pname = input.nextLine();

        System.out.print("Please enter new Patient disease:-");
        disease = input.nextLine();

        System.out.print("Please enter new Patient sex:-");
        sex = input.nextLine();

        System.out.print("Please enter new Patient admit_status:-");
        admitStatus = input.nextLine();

        System.out.print("Please enter new Patient age:-");
        age = input.nextInt();

    }

    void showPatientInfo()
    {
        System.out.println(pid + "\t" + pname + " \t" + disease + "     \t" + sex + "      \t" + admitStatus + "\t" + age);
    }
}
