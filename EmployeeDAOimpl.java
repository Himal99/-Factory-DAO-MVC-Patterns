import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOimpl implements EmployeeDAO {

    private List<Employee> employeeList = new ArrayList<>();

    @Override
    public boolean insert(Employee employee) {
        return employeeList.add(employee);
    }

    @Override
    public boolean delete(int id) {


        return employeeList.removeAll(employeeList);
    }

    @Override
    public boolean update(Employee employee) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public List<Employee> getall() {
        // TODO Auto-generated method stub
        return employeeList;
    }

    @Override
    public List<Employee> search(String name) {

        return null;
    }

  
}