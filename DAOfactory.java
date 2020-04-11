
public class DAOfactory {

    public static EmployeeDAO get(String name){
        if(name.equalsIgnoreCase("employee")){
            return new EmployeeDAOimpl();
        }
        else if(name.equalsIgnoreCase("manager")){
            return new ManagerDAOimpl();
        }
        else{
            return null;
        }
        
    }
}