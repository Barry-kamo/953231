public class person {
        private String name; 
        private String address; 
        private String phoneNumber; 
        private String email; 
        public person(String name) { 
            this.name = name; 
        } 
        public String toString() { 
            return this.getClass().getName() + " " + this.name;
        } 
} 
    
     
    
class Student extends person { 
    private final String status = "Junior"; 
        public Student(String name) { 
            super(name); 
        } 
    
    } 
    class Employee extends person { 
        private String office; 
        private double salary;    
        public Employee(String name) { 
            super(name); 
    
        } 
} 
    
     
    
    class Faculty extends Employee { 
        private double hours; 
        private String rank; 
        public Faculty(String name) { 
            super(name); 
        } 
    
    } 
    class Staff extends Employee { 
    
        private String title; 
    
     
    
        public Staff(String name) { 
    
            super(name); 
    
    }
}
