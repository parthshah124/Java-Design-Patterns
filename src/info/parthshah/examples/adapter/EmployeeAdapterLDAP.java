package info.parthshah.examples.adapter;

public class EmployeeAdapterLDAP implements Employee {
    private EmployeeLDAP instance;

    public EmployeeAdapterLDAP(EmployeeLDAP employeeFromLDAP) {
        this.instance = employeeFromLDAP;
    }

    @Override
    public String getId() {
        return instance.getCn();
    }

    @Override
    public String getName() {
        return instance.getGivenName();
    }

    @Override
    public String getEmail() {
        return instance.getMail();
    }

    public String toString(){
        return "name: " + instance.getGivenName() + " id: " + instance.getCn() + " email: " + instance.getMail();
    }
}
