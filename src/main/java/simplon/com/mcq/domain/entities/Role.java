package simplon.com.mcq.domain.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "roles")

public class Role extends AbstractEntity {
    @Column(name = "role_name", unique = true, nullable = false)
    private String roleName;

    @Column(name = "by_default", nullable = false)
    private boolean byDefault;

    public String getRoleName() {
	return roleName;
    }

    public void setRoleName(String roleName) {
	this.roleName = roleName;
    }

    public boolean isByDefault() {
	return byDefault;
    }

    public void setByDefault(boolean byDefault) {
	this.byDefault = byDefault;
    }

    public Role() {
    }

    @Override
    public String toString() {
	return "Role [roleName=" + roleName + ", byDefault=" + byDefault + "]";
    }

}
