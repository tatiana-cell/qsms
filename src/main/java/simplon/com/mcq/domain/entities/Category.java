package simplon.com.mcq.domain.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "categories")
public class Category extends AbstractEntity {
    @Column(name = "category_name")
    private String categoryName;

    public Category() {

    }

    public String getCategoryName() {
	return categoryName;
    }

    public void setCategoryName(String categoryName) {
	this.categoryName = categoryName;
    }

    @Override
    public String toString() {
	return "Category [categoryName=" + categoryName + "]";
    }

}
