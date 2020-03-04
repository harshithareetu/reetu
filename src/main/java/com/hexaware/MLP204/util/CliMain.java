package com.hexaware.MLP204.util;

import java.util.Scanner;

import com.hexaware.MLP204.model.Employee;
import com.hexaware.MLP204.model.leave;

/**
 * Class CliMain provides the command line interface to the leavemanagement
 * application.
 */
public class CliMain {
    private Scanner option = new Scanner(System.in, "UTF-8");

    // employee menu
    private void mainMenu() {
      System.out.println("Leave Management System");
    System.out.println("-----------------------");
    System.out.println("1. List All Employees Info");
    System.out.println("2. Display Employee Info");
    System.out.println("3. Apply Leave");
    System.out.println("4. Update Leave ");
    System.out.println("5. Employee Leave History");
    System.out.println("6. Pending Leave Status");
    System.out.println("7. Approve or Deny");
    System.out.println("8. Exit");
    System.out.println("Enter your choice:");
    int menuOption = option.nextInt();
    mainMenuDetails(menuOption);
  }

    
      // login details for employee
    public void login(){
      System.out.println("Username:");
      String un = option.next();
      System.out.println("Password:");
      String pw = option.next();

      if (un.equals("harshitha") && (pw.equals("reetu"))) {
            System.out.println("login successful");
            mainMenu();
      }
      else{
        System.out.println("Login unsuccessful");
      }
    }


  // for employee

    private void mainMenuDetails(final int selectedOption) {
      switch (selectedOption) {
        case 1: 
              listEmployeesDetails();
              break;
        case 2:
              listEmployeeDetail();
              break;   
          case 3:
                applyLeave();
          break;
          case 4:
            
            updateLeave();
            break;
          case 5:
            employeeleavehistory();
            break;
          case 6 :
            pendingleavestatus();
            break;
          case 7 :
            approve_denyleave();
            break;
          case 8:
            Runtime.getRuntime().halt(0);  
          default:
          System.out.println("Choose options from 1 to 8 only!!!"); 

      }  
      // mainMenu();
    }

   


    private void applyLeave(){}
     
     
    private void updateLeave(){}


    private void employeeleavehistory(){}


    private void pendingleavestatus(){}


    private void approve_denyleave(){}


   
    private void listEmployeeDetail() {
      System.out.println("Enter an Employee id");
      int empId = option.nextInt();
      Employee employee = Employee.listById(empId);
      if (employee == null) {
        System.out.println("Sorry, No such employee");
      } else {
        System.out.println(employee.getEmpId());
      }
    }

    private void listEmployeesDetails() {
      Employee[] employee = Employee.listAll();
      for (Employee e : employee) {
        System.out.println(e.getEmpId()+" "+ e.getFirst_name()+" "+e.getSecond_name()+" "+e.getContact_no()+" "+ e.getAddress()+" "+e.getDesignation()+" "+e.getBlood_group()+" "+ e.getManager_id());
      }

    }

   
    public static void main(final String[] ar) {
      CliMain m = new CliMain();
      m.login();
    }
  
}