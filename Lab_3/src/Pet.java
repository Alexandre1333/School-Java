public class Pet {
    public Pet(String n, int a, String tp){
        name = n;
        age = a;
        type = tp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    private String name;
    private String type;
    private int age;
}
