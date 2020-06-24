package school.models;

import java.io.Serializable;

public class SchoolDTO implements Serializable {
	private double sh_location1;
	private double sh_location2;
	private String sh_name;

	public double getSh_location1() {
		return sh_location1;
	}

	public void setSh_location1(double sh_location1) {
		this.sh_location1 = sh_location1;
	}

	public double getSh_location2() {
		return sh_location2;
	}

	public void setSh_location2(double sh_location2) {
		this.sh_location2 = sh_location2;
	}

	public String getSh_name() {
		return sh_name;
	}

	public void setSh_name(String sh_name) {
		this.sh_name = sh_name;
	}

	@Override
	public String toString() {
		return "DeptDTO [sh_location1=" + sh_location1 + ", sh_location2=" + sh_location2 + ", sh_name=" + sh_name
				+ "]";
	}

}
