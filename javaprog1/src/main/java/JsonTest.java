import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonTest {

	public static void main(String[] args) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		ArrayList<Employee> list = new ArrayList();
		Employee e1=new Employee(100, "Poushali Banik");
		list.add(e1);
		
		Employee e2=new Employee(101, "Yousha Gharpure");
		list.add(e2);
		
		Employee e3=new Employee(102, "Amisha Gupta");
		list.add(e3);
		
		Employee e4=new Employee(103, "keerthi Vas");
		list.add(e4);
		
		String jsonData = mapper.writeValueAsString(list);
		System.out.println(jsonData);
				
    mapper.writeValue(new File("C:\\Users\\poushali.banik\\Desktop\\gradle1\\data.json"),list);
//make JsonProcessingException to throws IOException
		
	}

}
class Employee {
	private int empId;
	private String name;
	
	
	public Employee(int empId, String name) {
		super();
		this.empId = empId;
		this.name = name;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	 
}