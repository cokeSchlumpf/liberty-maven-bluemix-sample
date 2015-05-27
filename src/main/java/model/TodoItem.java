package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TodoItem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String summary;
	private String description;

	public String getDescription() {
		return description;
	}

	public String getSummary() {
		return summary;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String toString() {
		return "TodoItem(id: " + id + ", summary: " + summary + ", description: " + description + ")";
	}

}
