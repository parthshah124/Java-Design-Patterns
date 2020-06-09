package info.parthshah.examples.adapter;

public class EmployeeDB implements Employee {
    private String id;
    private String name;
    private String email;

    public EmployeeDB(String id, String name, String email){
        this.id = id;
        this.name = name;
        this.email = email;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getEmail() {
        return email;
    }

    public String toString(){
        return "name: " + name + " id: " + id + " email: " + email;
    }
}
