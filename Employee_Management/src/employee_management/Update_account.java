/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package employee_management;
import java.util.*;


public class Update_account {
    int update_id;
    Scanner input=new Scanner(System.in);
    static ArrayList<AddEmp> acc = new ArrayList();
    void update()
    {
        System.out.println("Enter the account to be updated");
        update_id=input.nextInt();
        int update_id=0;
         AddEmp b = new AddEmp();
       System.out.println("Enter the Employee ID to be updated:");
       update_id=input.nextInt();
       acc.remove(update_id);
       
       System.out.println("Enter new details:\n\n");
       System.out.println("Enter the employee name:");
       b.name=input.next();
        
       System.out.println("Enter age of the employee:");
       b.age=input.nextInt();
               
       System.out.println("Enter Salary of the employee");
       b.salary = input.nextDouble();
              
       System.out.println("Enter address of the emplyee");
       b.address=input.next();
      
       System.out.println("The new employee ID is\n"+ update_id++);
    }
    
}
