package in.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.bind.Users;
import in.ashokit.dao.UsersDao;

@RestController
public class UserController 
{
	@Autowired
	private UsersDao usersDao;
	
	@PostMapping("/user")
	public String saveUser(@RequestBody Users users)
	{
		usersDao.saveUser(users);
		return "sucess";
	}
	
	@GetMapping("/user/{userId}")
	public Users getUser(@PathVariable String userId)
	{
		return usersDao.getUserById(userId);
	}

}
