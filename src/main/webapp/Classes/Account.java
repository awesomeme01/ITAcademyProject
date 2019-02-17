package Classes;

public class Account {
    int id;
    String fullname;
    String login;
    String email;
    String birthdate;
    String password;
    String gender;

    public Account(String fullname, String login, String email, String birthdate,String password,String gender) {
        this.id = id;
        this.fullname = fullname;
        this.login = login;
        this.email = email;
        this.birthdate = birthdate;
        this.password = password;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getFullname() {
        return fullname;
    }

    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public String getPassword() {
        return password;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", fullname='" + fullname + '\'' +
                ", login='" + login + '\'' +
                ", email='" + email + '\'' +
                ", birthdate='" + birthdate + '\'' +
                ", password='" + password + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
