package guru.springframework.sfgpetclinic.model;

import java.io.Serializable;

public class BaseEntity implements Serializable {

    private Long id; // Box-types is recommended to use by Hibernate (can be Null)

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
