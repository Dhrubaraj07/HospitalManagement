package HospitalManagement;

import java.util.*;

public class Doctor implements HospManagement {
    int count = 0;

    public void PatientList() {
        System.out.println("Sl NO.                  Patient Name                          Past Record");
        System.out.println("01                     Raj Srivastava                  |Download Past Checkup Report|");
        System.out.println("02                     Vinay Kumar                     |Download Past Checkup Report|");
        System.out.println("03                     Venkatesh Singh                 |Download Past Checkup Report|");
        System.out.println("04                     Sakshi Mukherjee                |Download Past Checkup Report|");
        System.out.println("05                     Vivek Rajdhan                   |Download Past Checkup Report|");
        System.out.println("06                     Vikash Khanderwal               |Download Past Checkup Report|");
        System.out.println("07                     Bipin Kumar                     |Download Past Checkup Report|");
        System.out.println("08                     Aryan Kapoor                    |Download Past Checkup Report|");
        System.out.println("09                     Sivanshu Mahato                 |Download Past Checkup Report|");
        System.out.println("10                     Shristhi Chaudhary              |Download Past Checkup Report|");

    }

    public void AppointmentsTiming() {
        System.out.println();
        System.out.println("Sudheer Kumar              Booked for 07-04-2023\n" +
                "Rahul Raj                  Booked for 11-04-2023\n" +
                "Susheel Bose               Booked for 17-04-2023\n" +
                "Sumana Chauhan             Booked for 05-04-2023\n");
    }


    Scanner sc = new Scanner(System.in);

    void DoctorLogin() {
        System.out.println();
        System.out.println("Enter Your Username: ");
        String P_Username = sc.next();
        System.out.println("Enter Password: ");
        String P_Password = sc.next();

        if (((P_Username.equals("Kunal") && P_Password.equals("1234"))))
        {
            Dashboard();
        }
        else
        {
            System.out.println("Wrong Username/Password");
            if (count < 2)
            {
                count += 1;
                DoctorLogin();
            }
        }
    }

    void Dashboard() {
        System.out.println();
        System.out.println("DOCTOR DASHBOARD");
        System.out.println("*************************************************************************************************");
        System.out.println("Enter Your Choice");
        System.out.print("1. Patient's List " + "     ");
        System.out.println("2. Upcoming Appointment Timings" + "     ");
        int D_input = sc.nextInt();
        System.out.println();
        switch (D_input) {
            case 1: {
                PatientList();
                break;
            }
            case 2: {
                AppointmentsTiming();
                break;
            }
            default: {
                System.out.println("Wrong Input");
            }
        }
    }
}
