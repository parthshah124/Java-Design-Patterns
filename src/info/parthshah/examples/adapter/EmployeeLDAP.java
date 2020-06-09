package info.parthshah.examples.adapter;

public class EmployeeLDAP {
    private String cn;
    private String givenName;
    private String mail;

    public EmployeeLDAP(String cn, String givenName, String mail) {
        this.cn = cn;
        this.givenName = givenName;
        this.mail = mail;
    }

    public String getCn() {
        return cn;
    }

    public String getGivenName() {
        return givenName;
    }

    public String getMail() {
        return mail;
    }
}
