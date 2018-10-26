package Sui1025;

public class Peo {
    private String name;
    @CustomAnnotation
    private String age;
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public String getAge()
    {
        return age;
    }
    public void setAge(String age)
    {
        this.age = age;
    }
    public String toString(){
        return "name"+name+"age"+age;
    }
}
