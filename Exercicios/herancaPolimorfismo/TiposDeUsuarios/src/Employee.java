public class Employee {

    private String name;
    private String email;
    private String password;
    private boolean isAdm;

    public boolean isAdmin() {
        return isAdm;
    }

    public Employee(){}

    public Employee(String name, String email, String password, boolean isAdm) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.isAdm = isAdm;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public boolean login(String email, String password){
        return this.email.equals(email) && this.password.equals(password);
    }

    public void logoff(){
        System.out.println(name + " fez logoff.");
    }

    public void changeData(String newName, String newEmail){
        this.name = newName;
        this.email = newEmail;
    }

    public void changePassword(String newPassword){
        this.password = newPassword;
    }
}
