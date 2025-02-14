//Crea una classe User che abbia i parametri privati nome ed età e i getter e setter
//All'interno di User ci sarà anche una funzione che stampi a video le informazioni di età e il nome.
//Creare 2 oggetti User di cui creerà un'istanza.
//Del primo si stamperanno le informazioni di default, del secondo si cambieranno le informazioni e poi si stamperanno a video

public class Main {
    public static void main(String[] args) {
        User user1 = User.getSingleton("Mario", 21);
        System.out.println(user1);

        User user2 = User.getSingleton("Gino", 38);
        user2.setName("Gino");
        user2.setAge(38);
        System.out.println(user2);
    }
}