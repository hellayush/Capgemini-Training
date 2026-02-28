package org.example;

import java.sql.*;
// Getter setter shortcut - > alt + insert

public class Employee {
    public Date getHire_date() {
        return hire_date;
    }

    public void setHire_date(Date hire_date) {
        this.hire_date = hire_date;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public int getManger_id() {
        return manger_id;
    }

    public void setManger_id(int manger_id) {
        this.manger_id = manger_id;
    }

    public int getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJob_title() {
        return job_title;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }


    private  Date hire_date;
    private  double salary;
    private int employee_id;
    private int manger_id;
    private int department_id;
    private String phone_number;
    private  String first_name;
    private  String last_name;
    private  String email;
    private String job_title;


    public void getEmployee(int emp_id) throws SQLException
    {
try (Connection connection = DBconnection.getConnection();) {
//            Connection connection = DBConnection.getConnection();

        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery("select * from employee where employee_id=" + emp_id);

        while (resultSet.next()) {
            int id = resultSet.getInt("employee_id");
            String fname = resultSet.getString("first_name");
            Date hireDate = resultSet.getDate("hire_date");

            System.out.println(id + " " + fname +" "+ hireDate);
        }

    }finally {
        System.out.println("Done");
    }
}

    }

