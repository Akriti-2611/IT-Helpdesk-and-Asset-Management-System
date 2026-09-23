
import com.company.ithelpdesk.model.user.Employee;
import com.company.ithelpdesk.model.user.ITEngineer;
import com.company.ithelpdesk.model.user.Manager;
import com.company.ithelpdesk.model.user.User;
import com.company.ithelpdesk.repository.InMemoryUserRepository;
import com.company.ithelpdesk.repository.UserRepository;
import com.company.ithelpdesk.service.UserService;
import com.company.ithelpdesk.service.UserServiceImpl;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        UserRepository userRepository = new InMemoryUserRepository();
        UserService userService = new UserServiceImpl(userRepository);

        System.out.println("===== IT Helpdesk and Asset Management System ======");

        System.out.println();

        Scanner scanner = new Scanner(System.in);

        int continueInput = 1;
        long id;
        String email;
        String name;
        String phone;
        String department;
        User user = null;

        while(continueInput == 1) {

            System.out.println("Select options : \n1: Register Employee" +
                    "\n2: Register ITEngineer" +
                    "\n3: Register Manager" +
                    "\n4: List of All Users" +
                    "\n5: Find any User by Id" +
                    "\n6: Activate user" +
                    "\n7: Deactivate User");

            int selectedOption = scanner.nextInt();

            switch (selectedOption) {
                case 1:
                    System.out.println("Enter ID:");
                    id = scanner.nextLong();
                    System.out.println("Enter Email:");
                    email = scanner.next();
                    System.out.println("Enter name:");
                    name = scanner.next();
                    System.out.println("Enter phone no.:");
                    phone = scanner.next();
                    System.out.println("Enter Employee Code:");
                    String employeeCode = scanner.next();
                    System.out.println("Enter Employee department:");
                    department = scanner.next();
                    Employee employee = new Employee(id, name, email, phone, true, employeeCode, department);
                    user = userService.registerEmployee(employee);
                    System.out.println("Employee registered successfully : ");
                    user.displayProfile();
                    break;
                case 2:
                    System.out.println("Enter ID:");
                    id = scanner.nextLong();
                    System.out.println("Enter Email:");
                    email = scanner.next();
                    System.out.println("Enter name:");
                    name = scanner.next();
                    System.out.println("Enter phone no.:");
                    phone = scanner.next();
                    System.out.println("Enter Specialization:");
                    String specialization = scanner.next();
                    ITEngineer itEngineer = new ITEngineer(id, name, email, phone, true, specialization, 0);
                    user = userService.registerITEngineer(itEngineer);
                    System.out.println("IT Engineer registered successfully : ");
                    user.displayProfile();
                    break;
                case 3:
                    System.out.println("Enter ID:");
                    id = scanner.nextLong();
                    System.out.println("Enter Email:");
                    email = scanner.next();
                    System.out.println("Enter name:");
                    name = scanner.next();
                    System.out.println("Enter phone no.:");
                    phone = scanner.next();
                    System.out.println("Enter Departemnt:");
                    department = scanner.next();
                    Manager manager = new Manager(id, name, email, phone, true, department, null);
                    user = userService.registerManager(manager);
                    System.out.println("Manager registered successfully : ");
                    user.displayProfile();
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                default:
                    System.out.println("It is invalid Option");
                    break;
            }
            System.out.println("Press 1 to continue");
            continueInput = scanner.nextInt();
        }
        scanner.close();
    }
}