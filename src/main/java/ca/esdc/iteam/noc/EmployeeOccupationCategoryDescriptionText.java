package ca.esdc.iteam.noc;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EmployeeOccupationCategoryDescriptionText {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
	private String text;
	private String lang;
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	
}
