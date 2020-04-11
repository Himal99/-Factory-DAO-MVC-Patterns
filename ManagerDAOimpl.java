import java.util.List;

public class ManagerDAOimpl implements EmployeeDAO {

    @Override
    public boolean insert(Employee employee) {
        System.out.println("successfully inserted in manager file");
        return true;
    }

    @Override
    public boolean delete(int id) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean update(Employee employee) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public List<Employee> getall() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Employee> search(String name) {
        // TODO Auto-generated method stub
        return null;
    }

}