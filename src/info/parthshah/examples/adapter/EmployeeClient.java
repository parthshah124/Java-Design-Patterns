package info.parthshah.examples.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {
    public List<Employee> getEmployeeList() {
        List<Employee> employees = new ArrayList<>();
        Employee employeeFromDB = new EmployeeDB("rogers", "Steve", "Steve@CaptainAmerica.com");
        employees.add(employeeFromDB);

        EmployeeLDAP employeeFromLDAP = new EmployeeLDAP("stark", "Tony", "Tony@IronMan.com");
        employees.add(new EmployeeAdapterLDAP(employeeFromLDAP));
        return employees;
    }
}
