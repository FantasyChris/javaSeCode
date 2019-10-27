package IOTest;

import java.io.Serializable;

public class Hero implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String name;

    public Hero(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
