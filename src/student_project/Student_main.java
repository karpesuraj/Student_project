package student_project;
import java.sql.SQLException;
import java.util.Scanner;

public class Student_main {
	public static void main(String args[]) throws SQLException {
		Student_profile s1=new Student_profile();
		int id = 0;
		String name = null;
		String department = null;
		int age = 0;
		String address = null;
		String phone_number = null;
		String s=null;
		try (Scanner sc = new Scanner(System.in)) {
			int ch=0;
			do {
				System.out.println("\tMenu");
				System.out.println("\t1.Inserting data");
				System.out.println("\t2.Updating value");
				System.out.println("\t3.Deleting data");
				System.out.println("\t4.Display specific data using id");
				System.out.println("\t5 Display All");
				System.out.println("\t6.Exit");
				System.out.println("Enter the choice");
				ch=sc.nextInt();
				
				switch(ch) {
				case 1:
						System.out.println("Enter id");
						id=sc.nextInt();
						System.out.println("Enter name");
						name=sc.next();
						System.out.println();
						System.out.println("Enter age");
						age=sc.nextInt();
						System.out.println("\nEnter department");
						department=sc.next();
						System.out.println();
						System.out.println("Enter phone number");
						phone_number=sc.next();
						System.out.println("\nEnter address");
						address=sc.next();
						System.out.println();
						
						Student_info ub=new Student_info(id,name,department,age,address,phone_number);
						s=s1.addUser(ub);
						System.out.println(s);
						break;
				case 2:
					//int id,String attr_name,String attr_value
					System.out.println("\tUpdating....");
					System.out.println("Enter id");
					id=sc.nextInt();
					System.out.println("Enter name to update");
					name=sc.next();	
					s=s1.updateValue(id, name);
					System.out.println(s);
					break;
				case 3:
					System.out.println("\tDeleting....");
					System.out.println("Enter id");
					id=sc.nextInt();
					s=s1.deleteByID(id);
					System.out.println(s);
					break;
				case 4:
					System.out.println("\tDisplay record....");
					System.out.println("Enter id");
					id=sc.nextInt();
					s1.displaybyID(id);
					break;
				case 5:
					System.out.println("Display All Record");
					s1.display();
					break;
				case 6:
					System.out.println("Exiting from system");
					break;
				default:
					System.out.println("Not Matched");
					break;
				
				}
				
			}while(ch!=6);
		}
		
		
	}

}