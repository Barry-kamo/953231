public class testperson {
    public static void main(String[] args) { 
        person person = new person("Pierre"); 
        Student student = new Student("Salim"); 
        Employee employee = new Employee("Emile"); 
        Faculty faculty = new Faculty("Franco"); 
        Staff staff = new Staff("Stacy"); 
        System.out.println(person.toString()); 
        System.out.println(student.toString()); 
        System.out.println(employee.toString()); 
        System.out.println(faculty.toString()); 
        System.out.println(staff.toString()); 
    } 
}
