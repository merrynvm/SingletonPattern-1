public class User {
    private static String name;
    private static Integer age;

    //creo una variabile statica per la chiamata d'istanza del singleton
    private static User singleton;

    private User(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    //metodo per la chiamata dell'istanza del singleton
    public static User getSingleton() {
        if (singleton == null) {
            singleton = new User(name, age);
        }
        return singleton;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
