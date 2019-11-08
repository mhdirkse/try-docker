package nl.integrationpartners.trydocker;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@Entity
@JacksonXmlRootElement(localName = "item")
public class Item {
	@Id
	@JacksonXmlProperty(localName = "id")
	private Integer id;

	@JacksonXmlProperty(localName = "name")
	private String name;

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		String theId = id == null ? "<null>" : Integer.toString(id);
		String theName = name == null ? "<null>" : name;
		return "Item(id = " + theId + ", name = " + theName + ")";
	}
}
