package kouclo.dubbo;

import java.util.List;

public interface DemoService {
	public 	String sayHello(String name);
	public 	String sayFuck(String name);
     List<User> getUsers();
}
