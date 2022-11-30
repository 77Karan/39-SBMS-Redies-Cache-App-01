package in.ashokit.dao;

import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import in.ashokit.bind.Users;

@Repository
public class UsersDao
{
	private HashOperations<String,String,Users> hashOps;
	
	
	public UsersDao(RedisTemplate<String,Users> redisTemplate)
	{
		hashOps =redisTemplate.opsForHash();

	}
	public void saveUser(Users users)
	{
		hashOps.put("USER",users.getId(), users);
	}
	
	public Users getUserById(String userId)
	{
		return hashOps.get("USER",userId);
	}

}
