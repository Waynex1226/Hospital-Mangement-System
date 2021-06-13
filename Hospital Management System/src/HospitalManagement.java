import java.util.Calendar;
import java.util.Scanner;

public class HospitalManagement {
	public static void main(String args[])
    {
        String months[] = {

            "Jan",
            "Feb",
            "Mar",
            "Apr",

            "May",
            "Jun",
            "Jul",
            "Aug",

            "Sep",
            "Oct",
            "Nov",
            "Dec"
        };

        Calendar calendar = Calendar.getInstance();
        //System.out.println("--------------------------------------------------------------------------------");
        int count1 = 4, count2 = 4, count3 = 4, count4 = 4, count5 = 4, count6 = 4;

        System.out.println("\n--------------------------------------------------------------------------------");
        System.out.println("            *** Welcome to Hospital Management System Project in Java ***");
        System.out.println("--------------------------------------------------------------------------------");

        System.out.print("Date: " + months[calendar.get(Calendar.MONTH)] + " " + calendar.get(Calendar.DATE) + " " + calendar.get(Calendar.YEAR));

        System.out.println("\t\t\t\t\t\tTime: " + calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND));

        Doctor[] d = new Doctor[25];

        Patient[] p = new Patient[100];

        Lab[] l = new Lab[20];

        Facility[] f = new Facility[20];

        Medical[] m = new Medical[100];

        Staff[] s = new Staff[100];

        int i;

        for (i = 0; i < 25; i++)

            d[i] = new Doctor();

        for (i = 0; i < 100; i++)

            p[i] = new Patient();

        for (i = 0; i < 20; i++)

            l[i] = new Lab();

        for (i = 0; i < 20; i++)

            f[i] = new Facility();

        for (i = 0; i < 100; i++)

            m[i] = new Medical();

        for (i = 0; i < 100; i++)

            s[i] = new Staff();


        d[0].did = "001";
        d[0].dname = "Dr.Tom Wong";
        d[0].specilist = "Surgeon";
        d[0].workTime = "8-11AM";
        d[0].qualification = "MBBS,MD";
        d[0].droom = 11;

        d[1].did = "002";
        d[1].dname = "Dr.Samuel Lim";
        d[1].specilist = "Physician";
        d[1].workTime = "10-3AM";
        d[1].qualification = "MBBS,MD";
        d[1].droom = 45;

        d[2].did = "003";
        d[2].dname = "Dr.Amy Chia";
        d[2].specilist = "Surgeon";
        d[2].workTime = "7-11AM";
        d[2].qualification = "MBBS,MD";
        d[2].droom = 8;

        d[3].did = "952";
        d[3].dname = "Dr.Wayne Ang";
        d[3].specilist = "Artho";
        d[3].workTime = "10-4PM";
        d[3].qualification = "MBBS,MS";
        d[3].droom = 40;
        
        d[4].did = "123";
        d[4].dname = "Dr.Chew ";
        d[4].specilist = "Artho";
        d[4].workTime = "10-4PM";
        d[4].qualification = "MBBS,MS";
        d[4].droom = 45;


        p[0].pid = "120";
        p[0].pname = "John";
        p[0].disease = "Covid-19";
        p[0].sex = "Male";
        p[0].admitStatus = "y";
        p[0].age = 30;

        p[1].pid = "135";
        p[1].pname = "Joshua";
        p[1].disease = "Cold";
        p[1].sex = "Male";
        p[1].admitStatus = "y";
        p[1].age = 23;

        p[2].pid = "144";
        p[2].pname = "Alex";
        p[2].disease = "Maleriya";
        p[2].sex = "Male";
        p[2].admitStatus = "y";
        p[2].age = 45;

        p[3].pid = "156";
        p[3].pname = "Ravi";
        p[3].disease = "Diabetes";
        p[3].sex = "Male";
        p[3].admitStatus = "y";
        p[3].age = 25;
        
        p[4].pid = "078";
        p[4].pname = "Jiayi";
        p[4].disease = "Fever";
        p[4].sex = "Female";
        p[4].admitStatus = "y";
        p[4].age = 25;


        m[0].mname = "Corex";
        m[0].mmanufacturer = "Cino pvt";
        m[0].expiryDate = "9-5-21";
        m[0].mcost = 55;
        m[0].count = 8;

        m[1].mname = "Nytra";
        m[1].mmanufacturer = "Ace pvt";
        m[1].expiryDate = "4-4-22";
        m[1].mcost = 500;
        m[1].count = 5;

        m[2].mname = "Brufa";
        m[2].mmanufacturer = "Reckitt";
        m[2].expiryDate = "12-7-21";
        m[2].mcost = 50;
        m[2].count = 56;

        m[3].mname = "Pride";
        m[3].mmanufacturer = "DDF pvt";
        m[3].expiryDate = "12-4-22";
        m[3].mcost = 1100;
        m[3].count = 100;
        
        m[4].mname = "Paracetamol";
        m[4].mmanufacturer = "Impex pvt";
        m[4].expiryDate = "12-4-21";
        m[4].mcost = 2000;
        m[4].count = 1000;


        l[0].lab = "X-ray     ";
        l[0].lcost = 800;

        l[1].lab = "CT Scan   ";
        l[1].lcost = 1200;

        l[2].lab = "OR Scan   ";
        l[2].lcost = 500;

        l[3].lab = "Blood Bank";
        l[3].lcost = 50;
        
        l[4].lab = "Test Machine";
        l[4].lcost = 500;


        f[0].facility = "Ambulance";

        f[1].facility = "Admit Facility ";

        f[2].facility = "Canteen";

        f[3].facility = "Emergency";
        
        f[4].facility = "Surgery Room";


        s[0].sid = "322";
        s[0].sname = "Ben";
        s[0].desg = "worker";
        s[0].sex = "Male";
        s[0].salary = 5000;

        s[1].sid = "223";
        s[1].sname = "Joey";
        s[1].desg = "Nurse";
        s[1].sex = "Female";
        s[1].salary = 2000;

        s[2].sid = "124";
        s[2].sname = "Jake";
        s[2].desg = "Security";
        s[2].sex = "Male";
        s[2].salary = 5000;

        s[3].sid = "125";
        s[3].sname = "Joyce";
        s[3].desg = "Worker";
        s[3].sex = "Female";
        s[3].salary = 20000;
        
        s[4].sid = "128";
        s[4].sname = "Joshua";
        s[4].desg = "Security";
        s[4].sex = "Male";
        s[4].salary = 20000;


        Scanner input = new Scanner(System.in);

        int choice, j, c1, status = 1, s1 = 1, s2 = 1, s3 = 1, s4 = 1, s5 = 1, s6 = 1;

        while (status == 1)

        {
            System.out.println("\n                                    MAIN MENU");
            System.out.println("-----------------------------------------------------------------------------------");
            System.out.println("1.Doctos  2. Patients  3.Medicines  4.Laboratories  5. Facilities  6. Staff ");
            System.out.println("-----------------------------------------------------------------------------------");

            choice = input.nextInt();
            switch (choice)

            {

                case 1:

                    {
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("                      **DOCTOR SECTION**");
                        System.out.println("--------------------------------------------------------------------------------");

                        s1 = 1;

                        while (s1 == 1)
                        {
                            System.out.println("1.Add New Entry\n2.Existing Doctors List");
                            c1 = input.nextInt();
                            switch (c1)

                            {
                                case 1:
                                    {
                                        d[count1].newDoctor();count1++;
                                        break;
                                    }
                                case 2:
                                    {
                                        System.out.println("--------------------------------------------------------------------------------");
                                        System.out.println("id\tName\t\tSpecilist\tTiming \t\tQualification\tRoom No.");
                                        System.out.println("--------------------------------------------------------------------------------");
                                        for (j = 0; j < count1; j++)
                                        {
                                            d[j].showDoctorInfo();
                                        }
                                        break;
                                    }
                            }
                            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                            s1 = input.nextInt();
                        }
                        break;
                    }
                    

                case 2:

                    {
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("                     **PATIENT SECTION**");
                        System.out.println("--------------------------------------------------------------------------------");

                        s2 = 1;

                        while (s2 == 1)
                        {
                            System.out.println("1.Add New Entry\n2.Existing Patients List");
                            c1 = input.nextInt();
                            switch (c1)
                            {
                                case 1:
                                    {
                                        p[count2].newPatient();count2++;
                                        break;
                                    }

                                case 2:
                                    {
                                        System.out.println("--------------------------------------------------------------------------------");
                                        System.out.println("id \tName\tDisease \tSex \t Admit Status \tAge");
                                        System.out.println("--------------------------------------------------------------------------------");
                                        for (j = 0; j < count2; j++) {
                                            p[j].showPatientInfo();
                                        }
                                        break;
                                    }
                            }

                            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                            s2 = input.nextInt();
                        }
                        break;
                    }

                case 3:
                    {
                        s3 = 1;

                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("                     **MEDICINE SECTION**");
                        System.out.println("--------------------------------------------------------------------------------");

                        while (s3 == 1)
                        {
                            System.out.println("1.Add New Entry\n2. Existing Medicines List");
                            c1 = input.nextInt();

                            switch (c1)
                            {

                                case 1:
                                    {
                                        m[count3].newMedical();count3++;
                                        break;
                                    }

                                case 2:
                                    {
                                        System.out.println("--------------------------------------------------------------------------------");
                                        System.out.println("Name \tCompany \tExpiry Date \tCost");
                                        System.out.println("--------------------------------------------------------------------------------");

                                        for (j = 0; j < count3; j++) {
                                            m[j].findMedical();
                                        }
                                        break;
                                    }

                            }
                            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                            s3 = input.nextInt();
                        }
                        break;
                    }

                case 4:

                    {
                        s4 = 1;

                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("                    **LABORATORY SECTION**");
                        System.out.println("--------------------------------------------------------------------------------");

                        while (s4 == 1)

                        {
                            System.out.println("1.Add New Entry \n2.Existing Laboratories List");
                            c1 = input.nextInt();

                            switch (c1)

                            {
                                case 1:
                                    {
                                        l[count4].newLab();count4++;
                                        break;
                                    }

                                case 2:

                                    {
                                        System.out.println("--------------------------------------------------------------------------------");
                                        System.out.println("Fecilities\t\tCost");
                                        System.out.println("--------------------------------------------------------------------------------");

                                        for (j = 0; j < count4; j++) {
                                            l[j].labList();
                                        }
                                        break;
                                    }
                            }

                            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                            s4 = input.nextInt();
                        }
                        break;
                    }

                case 5:

                    {
                        s5 = 1;

                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("          **HOSPITAL FACILITY SECTION**");
                        System.out.println("--------------------------------------------------------------------------------");

                        while (s5 == 1)

                        {
                            System.out.println("1.Add New Facility\n2.Existing Fecilities List");
                            c1 = input.nextInt();

                            switch (c1)

                            {
                                case 1:
                                    {
                                        f[count5].newFacility();count5++;
                                        break;
                                    }

                                case 2:
                                    {

                                        System.out.println("--------------------------------------------------------------------------------");
                                        System.out.println("Hospital  Facility are:");
                                        System.out.println("--------------------------------------------------------------------------------");

                                        for (j = 0; j < count5; j++) {
                                            f[j].showFacility();
                                        }
                                        break;
                                    }
                            }
                            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                            s5 = input.nextInt();
                        }
                        break;
                    }

                case 6:

                    {
                        s6 = 1;

                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("                       **STAFF SECTION**");
                        System.out.println("--------------------------------------------------------------------------------");

                        while (s6 == 1)

                        {
                            String a = "nurse",A = "Nurse",B= "Worker", b = "worker",C= "Security", c = "security";
                            System.out.println("1.Add New Entry \n2.Existing Nurses List\n3.Existing Workers List \n4.Existing Security List");
                            c1 = input.nextInt();

                            switch (c1)

                            {
                                case 1:
                                    {
                                        s[count6].newStaff();count6++;
                                        break;
                                    }

                                case 2:
                                    {
                                        System.out.println("--------------------------------------------------------------------------------");
                                        System.out.println("id \tName \tDesignation \tSex \tSalary");
                                        System.out.println("--------------------------------------------------------------------------------");

                                        for (j = 0; j < count6; j++)
                                        {
                                            if (a.equals(s[j].desg)||A.equals(s[j].desg))
                                                s[j].showStaffInfo();
                                        }
                                        break;
                                    }

                                case 3:
                                    {
                                        System.out.println("--------------------------------------------------------------------------------");
                                        System.out.println("id \tName \tDesignation \tSex \tSalary");
                                        System.out.println("--------------------------------------------------------------------------------");

                                        for (j = 0; j < count6; j++)
                                        {
                                            if (b.equals(s[j].desg)||B.equals(s[j].desg))
                                                s[j].showStaffInfo();
                                        }
                                        break;
                                    }
                                case 4:
                                    {
                                        System.out.println("--------------------------------------------------------------------------------");
                                        System.out.println("id \tName \tDesignation \tSex \tSalary");
                                        System.out.println("--------------------------------------------------------------------------------");

                                        for (j = 0; j < count6; j++)
                                        {
                                            if (c.equals(s[j].desg)||C.equals(s[j].desg))
                                                s[j].showStaffInfo();
                                        }	
                                        break;
                                    }
                            }
                            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                            s6 = input.nextInt();
                        }
                        break;
                    }
                default:
                    {
                        System.out.println(" You Have Enter Wrong Choice!!!");
                    }
            }

            System.out.println("\nReturn to MAIN MENU Press 1");

            status = input.nextInt();
        }
    }

}
