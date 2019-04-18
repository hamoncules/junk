package ca.esdc.iteam.noc;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.Set;
import java.util.TreeSet;

@Entity
public class MajorGroup {
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
 
	private String employeeOccupationCategoryCode;
	
	@OneToMany
    @JoinColumn(name="employeeOccupationCategoryText_id")
    private Set<EmployeeOccupationCategoryText> employeeOccupationCategoryText = new TreeSet<>();

//    @OneToMany
//    @JoinColumn(name="employeeOccupationCategoryDescriptionText_id")
//    private Set<EmployeeOccupationCategoryDescriptionText> employeeOccupationCategoryDescriptionText = new TreeSet<>();
    
	
    public String getEmployeeOccupationCategoryCode() {
		return employeeOccupationCategoryCode;
	}

	public void setEmployeeOccupationCategoryCode(String employeeOccupationCategoryCode) {
		this.employeeOccupationCategoryCode = employeeOccupationCategoryCode;
	}

	public Set<EmployeeOccupationCategoryText> getEmployeeOccupationCategoryText() {
		return employeeOccupationCategoryText;
	}

	public void setEmployeeOccupationCategoryText(Set<EmployeeOccupationCategoryText> employeeOccupationCategoryText) {
		this.employeeOccupationCategoryText = employeeOccupationCategoryText;
	}

//	public Set<EmployeeOccupationCategoryDescriptionText> getEmployeeOccupationCategoryDescriptionText() {
//		return employeeOccupationCategoryDescriptionText;
//	}
//
//	public void setEmployeeOccupationCategoryDescriptionText(
//			Set<EmployeeOccupationCategoryDescriptionText> employeeOccupationCategoryDescriptionText) {
//		this.employeeOccupationCategoryDescriptionText = employeeOccupationCategoryDescriptionText;
//	}

}