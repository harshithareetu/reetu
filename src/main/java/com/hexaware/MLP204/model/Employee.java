package com.hexaware.MLP204.model;

import com.hexaware.MLP204.persistence.DbConnection;
import com.hexaware.MLP204.persistence.EmployeeDAO;
import com.hexaware.MLP204.util.CliMain;

import java.util.Objects;
import java.util.List;

import java.util.Date;

/**
 * Employee class to store employee personal details.
 * @author hexware
 */
public class Employee {

  /**
   * empId to store employee id.
   */
  private int empId;
  private String First_name;
    private String Second_name;
    private int Contact_no;
    private String Address;
    private String Designation;
    private String Blood_group;
    private int Manager_id;
    private String user_name;
    private String passwordd;
    private String emailid;
    private Date date_of_joining;
    private String dept_name;
    private int dept_id;
    
    
  /**
   * empId to store employee id.
   */
  
  @Override
  public final boolean equals(final Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    Employee emp = (Employee) obj;
    if (Objects.equals(empId, emp.empId) && 
    Objects.equals( First_name, emp.First_name) &&
     Objects.equals(Second_name, emp.Second_name) && 
     Objects.equals(Contact_no, emp.Contact_no) && 
     Objects.equals( Address ,emp.Address)&&
      Objects.equals( Designation, emp.Designation) && 
      Objects.equals( Blood_group,emp. Blood_group)&& 
    Objects.equals( Manager_id,emp.Manager_id)&&
    Objects.equals( user_name,emp.user_name) && 
    Objects.equals(passwordd,emp.passwordd)&&
    Objects.equals(emailid,emp.emailid)&&
    Objects.equals(date_of_joining,emp.date_of_joining)&&
    Objects.equals(dept_name,emp.dept_name)&&
    Objects.equals(dept_id,emp.dept_id))

    {
      return true;
    }
    return false;
  }

  

  @Override
  public final int hashCode() {
    return Objects.hash(empId,First_name, Second_name, Contact_no,
    Address,Designation, Blood_group, Manager_id, user_name, passwordd, emailid, 
    date_of_joining, dept_name, dept_id);
  }
  
  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return "empid"+empId+"Firstname"+First_name+
    "Secondname"+Second_name+"Contactno"+Contact_no+
    "Address"+Address+"Designation"+Designation+
    "Bloodgroup"+Blood_group+"Managerid"+Manager_id+
    "username"+user_name+"passwordd"+passwordd+"emailid"+emailid+
    "date of joining"+date_of_joining+"dept name"+dept_name+"dept_id"+dept_id
    ;
  }
  /**
   * @param argEmpId to initialize employee id.
   */
  public Employee(final int argEmpId,final String First_name,final String Second_name,final int Contact_no,
  final String Address,final String Designation,final String Blood_group,final int Manager_id,final String user_name,
  final String passwordd, final String emailid,final Date date_of_joining,final String dept_name,final int dept_id)  {
    this.empId = argEmpId;
    this.First_name=First_name;
    this.Second_name= Second_name;
    this.Contact_no= Contact_no;
    this.Address= Address;
    this.Designation=Designation;
    this.Blood_group=Blood_group;
    this.Manager_id=Manager_id ;
    this.user_name=user_name ;
    this.passwordd=passwordd;
    this.emailid=emailid;
    this.date_of_joining=date_of_joining;
    this.dept_name = dept_name;
    this.dept_id = dept_id;
  }


  public Employee() {

}




public Employee(String string, String first_name2, int i, String string2, int j, String designation2,
		String blood_group2, String string3, int k, String passwordd2, String emailid2, String string4,
		String dept_name2, int dept_id2) {
}



public Employee(String string, String first_name2, int i, String string2, int j, String designation2,
		String blood_group2, String string3, int k, Date date_of_joining2, String emailid2, String string4,
		String dept_name2, int dept_id2) {
}



/**
   * Gets the EmployeeId.
   * @return this Employee's ID.
   */
  public final int getEmpId() {
    return empId;
  }
  public final String getFirst_name()
        {
            return First_name;
        }
  public final String getSecond_name()
        {
            return Second_name;
        }
  public final int getContact_no()
        {
            return Contact_no;
        }
  public final String getAddress()
        {
            return Address;
        }
  public final String getDesignation()
        {
            return Designation;
        }
  public final String getBlood_group()
        {
            return Blood_group;
        }
  public final int getManager_id()
        {
            return Manager_id;
        }
  public final String getuser_name()
        {
            return user_name;
        }
  public final String getpasswordd()
        {
            return passwordd;
        }
  public final String getEmailid()
        {
            return emailid;
        }
  public final Date getDate_of_joining()
        {
            return date_of_joining;
        }
  public String getDept_name() {
          return dept_name;
        }
  public int getDept_id(){
          return dept_id;
  }
  /**
   *
   * @param argEmpId to set employee id.
   */
  public final void setEmpId(final int argEmpId) {
    this.empId = argEmpId;
  }
  public final void setFirst_name (String First_name){
    this.First_name = First_name;
}
public final void setSecond_name (String Second_name){
    this.Second_name = Second_name;
}
public final void setContact_no (int Contact_no){
    this.Contact_no = Contact_no;
}
public final void setAddress (String Address){
    this.Address = Address;
}
public final void setDesignation (String Designation){
    this.Designation = Designation;
}
public final void setBlood_group (String Blood_group){
    this.Blood_group = Blood_group;
}
public final void setManager_id (int Manager_id){
    this.Manager_id = Manager_id;
}
public final void setUser_name (String User_name){
  this.user_name = User_name;
}
public final void setPassword (String Password){
  this.passwordd = Password;
}
public final void setEmailid (String Emailid){
  this.emailid = Emailid;
}
public final void setDate_of_joining (Date Date_of_joining){
  this.date_of_joining = Date_of_joining;
}
public final void setDept_name(String dept_name) {
  this.dept_name = dept_name;
}
public final void setDept_id(int dept_id){
  this.dept_id = dept_id;
}



  static Employee[] arr = new Employee[10];

 
  




  private static EmployeeDAO dao() {
    DbConnection db = new DbConnection();
    return db.getConnect().onDemand(EmployeeDAO.class);
  }

  /**
   * list all employee details.
   * 
   * @return all employees' details
   */
  public static Employee[] listAll() {

    List<Employee> es = dao().list();
    return es.toArray(new Employee[es.size()]);
  }


  /**
   * list employee details by id.
   * 
   * @param empID id to get employee details.
   * @return Employee
   */
  public static Employee listById(final int empID) {
    return dao().find(empID);
  }

public static void main(String[] args) {
    display();

}

  private static void display() {
  }
}








