

import java.io.Serializable;

public class Personal implements Serializable
{

	private String name;
	private String fn;
	private String mn;
	private String address;
	private String regNumber;
	
	public Personal()
	{
		
	}
	
	public Personal(String name,String Fn,String Mn,String hometown,String regNumber)
	{
		this.name=name;
		this.fn=Fn;
		this.mn=Mn;
		this.address=hometown;
		this.regNumber=regNumber;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFn() {
		return fn;
	}
	public void setFn(String Fn) {
		fn = Fn;
	}
	public String getMn() {
		return  mn;
	}
	public void setMn(String Mn) {
		mn=Mn;
	}
	
	public String getHomeTown() {
		return address;
	}
	public void setHomeTown(String homeTown) {
		this.address = homeTown;
	}
	public String getRegNo() {
		return regNumber;
	}

}
