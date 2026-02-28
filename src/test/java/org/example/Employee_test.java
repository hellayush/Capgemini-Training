package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

public class Employee_test {
    @Test
    void testGetConnection(){
        Employee obj = new Employee();


        try{
            obj.getEmployee(100);
        } catch (Exception e){
            System.out.println(e);
//            e.printStackTrace();
            fail("eception " + e);
        }
    }

}

