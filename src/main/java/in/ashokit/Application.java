package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import in.ashokit.bind.Users;

@SpringBootApplication
public class Application
{

	public static void main(String[] args) 
	{
		SpringApplication.run(Application.class, args);
	}
	@Bean
	public JedisConnectionFactory jedisConnFactory()
	{
		JedisConnectionFactory factory = new JedisConnectionFactory();
		return factory;
	}
	@Bean
	public RedisTemplate<String, Users> getRedisTemplate()
	{
		RedisTemplate<String, Users> redisTemplate = new RedisTemplate<String, Users>();
		redisTemplate.setConnectionFactory(jedisConnFactory());
		return redisTemplate;
	}

}
