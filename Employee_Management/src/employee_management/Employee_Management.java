/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package employee_management;
import java.util.*;
/**
 *
 * @author Vishwanath
 */
class employee{
    public void creat_emp(String name, int age, double salary, String address)
    {  
      /* addemp a = new addemp(); 
       a.name=name;
       a.age=age;
       a.salary=salary;
       a.address=address; 
       acc.add(a);
       System.out.println("The employee ID is\n" + emp_id);
       emp_id++;
        */
      
    }
    
    
}
public class Employee_Management {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       employee e = new employee();
    Scanner input = new Scanner(System.in);
    int emp_age,emp_id;
    String emp_name,emp_address;
    double emp_salary;
    int choice;
    do{
    System.out.println("*****************WELCOME***************\n");
    System.out.println("1. Add employee\n 2. Delete employee\n 3. Modify\n 4. Display Details of the employee\n 5. Exit\n");
    System.out.println("Enter your choice");
    choice=input.nextInt();
    switch (choice)
    {
        case 1: System.out.println("Enter the employee name:");
                 emp_name=input.next();
                
                System.out.println("Enter age of the employee:");
                emp_age=input.nextInt();
               
                System.out.println("Enter Salary of the employee");
                emp_salary = input.nextDouble();
              
                System.out.println("Enter address of the emplyee");
                 emp_address=input.next();
      
                e.creat_emp(emp_name,emp_age,emp_salary,emp_address);
            break;
        
        case 2: delete d = new delete();
                d.delete();
            break;
            
        case 3: System.out.println("Enter employee ID: ");
                emp_id=input.nextInt();
                e.update_account(emp_id);
            break;
            
        case 4: System.out.println("Enter employee ID: ");
                emp_id=input.nextInt();
                display dis = new display();
                dis.display(emp_id);
            break;
        
        case 5:System.exit(0);
            break;
            
        default : System.out.println("Enter choice from 1-4");
            break;
    }
        
    }while(choice!=5);
    
    }
    }
    
    
