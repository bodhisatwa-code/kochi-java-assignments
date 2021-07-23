import java.util.*;


class Employee {
    public int employee_id;
    public String name;
    public double basicSalary;
    public String[] skillset;
    
    public Employee(){
        employee_id = 0;
        name = "Jhon Doe";
        basicSalary = 150.5;
        skillset = new String[1];
    }
    
    public Employee(
      int id , String employee_name, double salary , String[] skills
    ){
        employee_id = id;
        name = employee_name;
        basicSalary = salary;
        skillset = skills;
    }
}


class DataUtil {
    
    public Employee employees[];
    
    public DataUtil(){
        employees = new Employee[1];
    }
    
    public void populateEmployees(){
        System.out.print("How many employees do you need : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        Employee temp_emps[] = new Employee[number];
        
        for( int i = 0 ; i < number ; i++ ){
            System.out.println("Enter details of employee #"+(i+1));
            System.out.print("Employee #"+(i+1) + " name : ");
            String name = scanner.next();
            
            System.out.print("Employee #"+(i+1) + " salary : ");
            double salary = scanner.nextDouble();
            
            System.out.print("Employee #"+(i+1) + " skills : ");
            System.out.print("How many skills you want to add : ");
            int no_of_skills = scanner.nextInt();
            String temp_skills[] = new String[no_of_skills];
            for( int j = 0 ; j < no_of_skills ; j++ ){
                System.out.print("Enter skill #"+(j+1)+" : ");
                temp_skills[j] = scanner.next();
            }
            
            temp_emps[i] = new Employee(
                (i+1),
                name,
                salary,
                temp_skills
            );
            
        }
        this.employees = temp_emps;
        scanner.close();
    }
    
    public void displayEmployees(){
        System.out.println("Employee List : ");
        for( int i = 0 ; i < this.employees.length ; i++){
            System.out.println("Employee #"+(i+1));
            System.out.println(" Name : "+this.employees[i].name);
            System.out.println(" Salary : "+this.employees[i].basicSalary);
            System.out.println(" Skils : "+ this.employees[i].skillset);
        }
    }
}

public class OrgnizationExecuter {
    public static void main(String args[]) {
      System.out.println("Kochi kal bero ghurte !!!");
      DataUtil data = new DataUtil();
      data.populateEmployees();
      data.displayEmployees();
    }
}