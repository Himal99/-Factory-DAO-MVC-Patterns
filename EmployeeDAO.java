import java.util.List;

public interface EmployeeDAO {

    boolean insert(Employee employee);
    boolean delete(int id);
    boolean update(Employee employee);
    List<Employee> getall();
    List<Employee> search(String name);

}