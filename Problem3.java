import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
class User implements Comparable<User>{
	
	private int id;
	private String name;
	private String email;
	private int salary;
	
	User(int id, String name, String email, int salary){
		this.id = id;
		this.name = name;
		this.setEmail(email);
		this.setSalary(salary);

	}
	
	public int getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override	
	public int compareTo(User o) {
		//sort by id
		//return this.getId()-o.getId();
	
		//sort by name
		
		return this.getName().compareTo(o.getName());
	
	}
	
	@Override
	public String toString() {
		return String.format(this.id +" "+this.getName()+" "+ this.getSalary());
				
	}
}


public class Problem3{
    public static void main(String [] args) {
		
		User user1 = new User(89,"Harry","Harry@jsjdfkj.com",40000);
		User user2 = new User(46,"Amit","fedvr@jsjdfkj.com",7000);
		User user3 = new User(14,"Bob","bgfb@jsjdfkj.com",4000);
		User user4 = new User(16,"Amit","dvdvs@jsjdfkj.com",409000);
		
		List<User> userr = new ArrayList<User>();
		userr.add(user1);
		userr.add(user2);
		userr.add(user3);
		userr.add(user4);
		
		Collections.sort(userr);
		
//		for(Users u:user) {
//			System.out.println(u);
//		}
		
		Map<Integer,User> map = new LinkedHashMap<Integer,User>();
		
		for (User u : userr) {
			map.put(u.getId(), u);
		}
		
		for (Map.Entry<Integer,User> m: map.entrySet()) {
			
			System.out.println(String.format(m.getKey()+": "+m.getValue()));
			
		}
	}



}