package employeemanagement2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class TestEmployee {
    employee emp;
    
    public TestEmployee() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        emp = new employee();
    }
    
    @After
    public void tearDown() {
    }

     @Test
     public void addemp()
     {
        assertEquals(0,emp.creat_emp("abc",32,500000,"xyz colony, belgaum")); 
        assertEquals(1,emp.creat_emp("xyz",44,450000,"abc colony, belgaum")); 
     }
     
     @Test
     public void testdelete()
     {
        assertEquals(0,emp.delete(0));
        assertEquals(0,emp.delete(1));     
     }
     
     @Test
     public void testupdate()
     {   
        assertEquals(2,emp.update(2)); 
        assertEquals(1,emp.update(1)); 
     }
     
     @Test
     public void display()
     {
        
        assertEquals("abcd",12,53200,"xyz street, belgaum",emp.display(2)); 
        assertEquals("pqrs",24,45700,"abc street, belgaum",emp.display(1)); 
       
     }
     
}
