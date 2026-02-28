package org.example;

import java.sql.*;

public class EmployeeDao {
    public void printAllEmployee() throws SQLException {
        try (Connection connection = DBconnection.getConnection();){

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from employee"); // default result set is zero
            while (resultSet.next() == true) {
                int empid = resultSet.getInt(1);
                String stringEmpid = resultSet.getString(1);
                int empid2 = resultSet.getInt("employee_id");
                String firstName = resultSet.getString(2);
                String lastName = resultSet.getString("last_name");
                System.out.println(empid + "\t" + firstName + " " + lastName);
            }

        }finally
        {
            System.out.println("Done");
        }
    }
    Employee addEmployee(Employee emp) throws SQLException
    {
        try(Connection connection = DBconnection.getConnection())
        {
            String sql = "insert into employee values (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1,emp.getEmployee_id());
            stmt.setString(2,emp.getFirst_name());
            stmt.setString(3,emp.getLast_name());
            stmt.setInt(4,emp.getDepartment_id());
            stmt.setString(5, emp.getPhone_number());
            stmt.setDate(6,emp.getHire_date());
            stmt.setString(7,emp.getJob_title());
            stmt.setObject(8,emp.getSalary());
            stmt.setObject(9,emp.getManger_id());
            stmt.setObject(10,emp.getDepartment_id());

            int rowsupdated = stmt.executeUpdate();
            if(rowsupdated != 1)
            {
                throw new
            }

        }
    }

}
