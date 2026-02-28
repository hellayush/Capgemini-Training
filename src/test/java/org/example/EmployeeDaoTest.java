package org.example;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

public class EmployeeDaoTest {
    @Test
    void testPrintAllEmployee()
    {
        EmployeeDao dao = new EmployeeDao();
        try {
            dao.printAllEmployee();
        } catch (Exception e) {
             System.out.println(e);
             fail("exception" + e);
        }
    }

void testAddEmployee()
{
    Employee dao = new Employee();
    try
    {
        Date hired_date = Date.valueOf("2000-05-12");
        Double salary = 58200.0;
        int employee_id = 208;
        Integer manager_id = 200;
        String phone_number = null;
        String first_number = "3454656";
        String last_name = "Adiya";
        String email = "adi@gmail.com";
        String job_title = null;

        Employee emp = new Employee(hire_date , salary , employee_id , manager_id , department_id , phone_number, first_number , last_name, email , job_title );

        System.out.println(emp);
        Employee employee= dao.addEmployee(emp);
        assertNotNull(employee);

    }catch (Exception e)
    {
        System.out.println(e);
    }
}
public boolean deleteEmployee(int empid) throws SQLException
{
    try(Connection connection = DBconnection.getConnection())
    {
        String sqlDel = "delete from employee where empid= ?";
        PreparedStatement stmt = connection.prepareStatement(sqlDel);
        stmt.setInt(1,empid);
        int rowsupdated  = stmt.executeUpdate();
        if(rowsupdated != 1)
        {
            throws new RuntimeException("some sql error occured");
        }else
        {
            return true;
        }
    }
}
}
