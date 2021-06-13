import java.util.Scanner;

public class Staff {
	
    String sid, sname, desg, sex;
    int salary;
    public void newStaff()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter new Staff id:-");
        sid = input.nextLine();

        System.out.print("Please enter new Staff name:-");
        sname = input.nextLine();

        System.out.print("Please enter new Staff desigination (Nurse , Worker , Security):-");
        desg = input.nextLine();

        System.out.print("Please enter new Staff sex:-");
        sex = input.nextLine();

        System.out.print("Please enter new Staff salary:-");
        salary = input.nextInt();
    }
    
    public void showStaffInfo()

    {
        System.out.println(sid + "\t" + sname + "\t" + desg + "\t\t" + sex + "\t" + salary);
    }
    
  


}
