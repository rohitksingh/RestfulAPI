package org.rohksin.jersey.SamplePokee;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement
public class Pokemon {

	private String name;
	private String power;
	
	public Pokemon()
	{
		
	}
	
	public Pokemon(String name,String power)
	{
		this.name = name;
		this.power = power;
	}
		
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getPower()
	{
		return power;
	}
	
	public void setPower(String power)
	{
		this.power = power;
	}
	
	
}
