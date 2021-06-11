public class Employee {
  String fname;
  String lname;

  public Employee(String fname, String lname) {
    this.fname = fname;
    this.lname = lname;
  }

  public String getFirstName() {
    return this.fname;
  }

  public String getLastName() {
    return this.lname;
  }
}
