import java.util.Scanner;

public class EmployeeController {
    EmployeeDAO dao = new EmployeeDAOimpl();
    private Scanner scanner;
    private EmployeeDAO employeeDAO;

    public EmployeeController(EmployeeDAO dao, Scanner scanner) {
        this.employeeDAO = dao;
    }

    public void menu() {
        System.out.println("1. Add");
        System.out.println("2. Getall");
        System.out.println("3. search");
        System.out.println("4. delete");
        System.out.println("5. Exit");

    }

    public static void topcontroll() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the database name you want to use");
        String dbname = scanner.next();
        EmployeeDAO dao = DAOfactory.get(dbname);
        EmployeeController controller = new EmployeeController(dao, scanner);
        System.out.println("----------welcome to our " + dbname + " Management system----------");
        while (true) {

            controller.menu();
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Employee employee = new Employee();
                    System.out.println("Enter id");
                    employee.setId(scanner.nextInt());
                    System.out.println("enter name");
                    employee.setName(scanner.next());
                    System.out.println("enter address");
                    employee.setAdd(scanner.next());
                    dao.insert(employee);

                    break;
                case 2: {
                    if (dao.getall() != null) {

                        for (Employee e : dao.getall()) {
                            System.out.println(e);
                        }

                    } else {
                        System.out.println("there is no data");
                    }
                }
                case 4:
                dao.delete(1);
                    break;
                case 5:
                    System.exit(0);
                default: {
                    System.out.println("done");
                }
            }

        }
    }

}
