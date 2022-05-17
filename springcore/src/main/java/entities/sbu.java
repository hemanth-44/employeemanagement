package entities;

import java.util.List;

public class sbu {
	private int sbucode;
	private String sbuHead;
	private String sbuName;
	private List<Employee> emplist;
	@Override
	public String toString() {
		return "Sbu deatails=SBU [sbucode=" + sbucode + ", sbuHead=" + sbuHead + ", sbuName=" + sbuName + ",Employee details-----> =" + emplist + "]";
	}
	public List<Employee> getEmplist() {
		return emplist;
	}
	public void setEmplist(List<Employee> emplist) {
		this.emplist = emplist;
	}
	public sbu() {
		super();
	}
	public int getSbucode() {
		return sbucode;
	}
	public void setSbucode(String sbuId) {
		this.sbucode = sbucode;
	}
	public String getSbuHead() {
		return sbuHead;
	}
	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}
	public String getSbuName() {
		return sbuName;
	}
	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}
}
