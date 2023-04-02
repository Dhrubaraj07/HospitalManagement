package HospitalManagement;

import java.util.*;

class Patient implements HospManagement {
    int count=0;
    public void DoctorAppointment() {

        System.out.println();
        System.out.println("   GENERAL PHYSICIAN                           NEUROLOGIST                            OPHTHALAMOLOGY                                PATHOLOGISTS");
        System.out.println("     Dr Rajdeep Banerjee                           Dr Kunal Ghosh                         Dr Shreetika Roy                                 Dr Rohan Singh");
        System.out.println("                BDS,MBBS                             BDS,MDS,MBBS                                     MBBS                                        MBBS,MD");
        System.out.println("Mon-Wed 12:30 To 3:30 PM                 Tue-Wed 10:30 To 12:30 PM                 Mon-Wed 02:00 To 3:30 PM                      Mon-Fri 10:00 To 2:00 PM");
        System.out.println("------->BOOK NOW<-------                 ------->BOOK NOW<-------                   ------->BOOK NOW<-------                     ------->BOOK NOW<-------");

    }

    public void BuyMedicine() {
        System.out.println();
        System.out.println("                                                                                                 |SEARCH ANY MEDICINE HERE|                          ");
        System.out.println("POPULAR DRUG SEARCHES");
        System.out.println("1. Hydrocodone(BUY NOW) \nHydrocodone, along with homatropine,is used to relieve cough. \nHydrocodone is a narcotic antitussive or a cough suppressant, acting directly on the brain’s cough center for relief.\n"
                +"\n2. Metformin(BUY NOW)\nIt is a prescribed medicine used to treat type 2 diabetes and even prevent \nit if someone is at a high risk of developing the disease by lowering blood sugar levels.\n"
                +"\n3. Losartan(BUY NOW)\nLosartan also lowers the risk of stroke in patients with high blood pressure and cardiomegaly or enlarged heart.\nType 2 diabetes patients and those with a history of hypertension also take it to address kidney problems.\n"
                +"\n4. Antibiotics(BUY NOW)\nThese are prescribed medicines that fight off bacterial infections.\n Viral infections like colds, runny noses, most sore throats (except strep throat),\n flu, and bronchitis cannot be treated with antibiotics.\n"
                +"\n5. Albuterol(BUY NOW)\nThis medicine prevents and treats breathing difficulties, wheezing, coughing, \nand other related conditions caused by lung diseases like asthma.\n"
                +"\n6. Antihistamines(BUY NOW)\nThese are commonly used to treat allergies and symptoms such as sneezing and rashes.\n"
                +"\n7. Gabapentin(BUY NOW)\nIt is an antiepileptic/anticonvulsant drug used with other medications to prevent and control seizures.\n"
                +"\n8. Omeprazole(BUY NOW)\nThis medication is usually prescribed to someone experiencing gastroesophageal reflux disease (GERD) and erosive esophagitis." +
                "\nGERD is a condition where too much acid is in the stomach, causing symptoms such as belching or burping, \nheartburn, indigestion, and even flatulence (farting). \n"
                +"\n9. Levothyroxine(BUY NOW)\nIt is used to treat an underactive thyroid gland condition called hypothyroidism. Thyroid hormones are essential to the body’s every \n cell and organ because they" +
                "regulate the rate at which calories are burned, affecting both weight loss and weight gain.\n"
                +"\n10. Atorvastatinn(BUY NOW)\nThis is prescribed to reduce the risk of a heart attack. This drug is also used to decrease\n the chances of undergoing heart surgery. ");
    }

    public void CheckUpHistory() {

        System.out.println("Last Check up done from Dr Kunal Ghosh on  20-02-2023"+"                        |DOWNLOAD PRESCRIPTION| ");
        System.out.println("Last Check up done from Dr Shreetika Roy on  13-03-2023"+"                      |DOWNLOAD PRESCRIPTION| ");
        System.out.println("Upcoming Check up from Dr Rajdeep Banerjee on  05-04-2023");
        System.out.println("Upcoming Check up from Dr Rohan Singh on  12-04-2023");
    }

    public void EmergencyInfo() {

        System.out.println("---MISSION HOSPITAL SUPPORT---\n"
                +"Hospitals are also an essential part of health system development.\n" +
                "Currently, external pressures, health systems shortcomings and hospital sector deficiencies are driving a new vision for hospitals in many parts of the world. \n" +
                "In this vision,they have a key role to play to support other healthcare providers and for community outreach and home-based services\n" +
                "and are essential in a well-functioning referral network.");
        System.out.println();
        System.out.println("Contact Us\n" +"24x7 Helpdesk\n" +
                "+91-7859939940");
        System.out.println();
        System.out.println("Email\n" +
                "ehospital@gov.in\n" +
                "helpdesk-ors@gov.in");
    }

    Scanner sc = new Scanner(System.in);
    void PatientLogin() {
        System.out.println();
        System.out.println("Enter Your Username: ");
        String P_Username = sc.next();
        System.out.println("Enter Password: ");
        String P_Password = sc.next();
        if (((P_Username.equals("Arnab") && P_Password.equals("1234")) || ((P_Username.equals("Dhruba") && (P_Password.equals("9876"))))))
        {
            Dashboard();
        }
        else {
            System.out.println("Wrong Username/Password");
            if(count<2) {
                count += 1;
                PatientLogin();
            }
        }
    }
    void Dashboard() {
        System.out.println();
        System.out.println("PATIENT DASHBOARD");
        System.out.println("****************************************8************************************************************");
        System.out.println("Enter Your Choice");
        System.out.print("1. Doctor Appointment" + "     ");
        System.out.print("2. Purchase Medicine" + "     ");
        System.out.print("3. Your CheckUp History Report" + "     ");
        System.out.println("4. Emergency Info Tab" + "     ");
        int P_input = sc.nextInt();
        System.out.println();
        switch (P_input) {
            case 1: {
                DoctorAppointment();
                break;
            }
            case 2: {
                BuyMedicine();
                break;
            }
            case 3:{
                CheckUpHistory();
                break;
            }
            case 4:{
                EmergencyInfo();
                break;
            }
            default:{
                System.out.println("Wrong Input");
            }
        }
    }
}
