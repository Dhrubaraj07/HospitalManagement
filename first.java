package HospitalManagement;

import java.util.*;

class FirstPage{
    int loginInput;
    Scanner sc=new Scanner(System.in);
    void login(){
        System.out.println("-----------------------------------------------------WELCOME TO MISSION HOSPITAL-------------------------------------------");
        System.out.println("Enter Your Choice");
        System.out.println("1. PATIENT LOGIN");
        System.out.println("2. DOCTOR LOGIN");

        loginInput=sc.nextInt();
        switch(loginInput){
            case 1: {
                new Patient().PatientLogin();
                break;
            }
            case 2:{
                new Doctor().DoctorLogin();
                break;
            }
            default:{
                System.out.println("Invalid Input");
            }

        }
    }
}
public class first {
    public static void main(String[] args) {
        FirstPage fp=new FirstPage();
        fp.login();

    }
}
