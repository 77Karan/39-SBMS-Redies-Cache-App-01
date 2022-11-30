package in.ashokit.bind;

import java.io.Serializable;

import lombok.Data;

@Data
public class Users implements Serializable
{
	private String id;
	private String name;
	private long sal;

}
