package Department;

public class Department {
    private int id;
    private String name;

    Department(String name, int id){
        this.id = id;
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
}
