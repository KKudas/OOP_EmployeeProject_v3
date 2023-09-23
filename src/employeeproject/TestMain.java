/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeeproject;
//import employee.version1.*;
//import employee.version2.*;
import employee.version3.*;

/**
 *
 * @author User
 */
public class TestMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HourlyEmployee employee1 = new HourlyEmployee(
                12,
                new Employee.Name("Ralph", "Mandigma"),
                new Date(02 , 10, 2003),
                new Date(10 , 10, 2020),
                35,
                76.25F);

        PieceWorkerEmployee employee2 = new PieceWorkerEmployee(
                14,
                new Employee.Name("John", "Marsona", "Mccain"),
                new Date(01, 12, 2011),
                new Date(02, 02, 2022),
                200, 76.25F);
//
        CommissionEmployee employee3 = new CommissionEmployee(
                16,
                new Employee.Name("Martin", "Luther", "King", "Jr"),
                new Date(02, 7, 2001),
                new Date(03, 05, 2023),
                12500);
//
        BasePlusCommisionEmployee employee4 = new BasePlusCommisionEmployee(
                16,
                new Employee.Name("Leonardo", "DaVinci"),
                new Date(02, 05, 2011),
                new Date(06, 04, 2015),
                5000,
                12000);

        double salaryOfEmployee1 = employee1.computeSalary();
        double salaryOfEmployee2 = employee2.computeSalary();
        double salaryOfEmployee3 = employee3.computeSalary();
        double salaryOfEmployee4 = employee4.computeSalary();

        System.out.println(employee1.getEmpName() + " Salary is: " + salaryOfEmployee1);
        employee1.displayInfo(salaryOfEmployee1);
        System.out.printf("\n");

        System.out.println(employee2.getEmpName() + " Salary is: " + salaryOfEmployee2);
        employee2.displayInfo(salaryOfEmployee2);
        System.out.printf("\n");
//
        System.out.println(employee3.getEmpName() + " Salary is: " + salaryOfEmployee3);
        employee3.displayInfo(salaryOfEmployee3);
        System.out.printf("\n");

        System.out.println(employee4.getEmpName() + " Salary is: " + salaryOfEmployee4);
        employee4.displayInfo(salaryOfEmployee4);
        System.out.printf("\n");
        
    }
}
