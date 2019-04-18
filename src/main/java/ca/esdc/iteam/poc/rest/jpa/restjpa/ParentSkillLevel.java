package ca.esdc.iteam.noc;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class ParentSkillLevel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
 
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	private String lang;
	private String text;
	
}
