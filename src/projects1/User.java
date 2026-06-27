/* Build a system that:
* Fetches users from database (we'll mock it).
* Each user has role(unique).
*
* we want to:
* Remove inactive users
* list all active users
* count users per role
* */


package projects1;

import java.util.Set;

public class User {
    private String name;
    private boolean active;
    private Set<String> roles;

    public User(String name, boolean active, Set<String> roles) {
        this.name = name;
        this.active = active;
        this.roles = roles;
    }

    public String getName() {
        return name;
    }

    public boolean isActive() {
        return active;
    }

    public Set<String> getRoles() {
        return roles;
    }
}
