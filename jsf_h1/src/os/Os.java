package os;

import javax.faces.bean.SessionScoped;
import javax.faces.bean.ManagedBean;  

@ManagedBean
@SessionScoped
public class Os implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	private String name;
    private int version;


    public Os() {
        name = "OS";
        version = 3;      
    }
    
    public Os(String name, int version) {
        this.name = name;
        this.version = version;
    }

    @Override
    public String toString() {
        return "os " + name + " was published in " + version;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }


    
}
