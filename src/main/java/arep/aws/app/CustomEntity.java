package arep.aws.app;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entity
 */
@Entity
@Table(name = "entities")
public class CustomEntity {
    @Id
    private String id;
    private String body;

    public CustomEntity() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}