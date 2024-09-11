package ProjetoFinal.MVC;

public class Main {
    public static void main(String[] args) {
        User model = new User("John Doe", "john.doe@example.com");
        UserView view = new UserView();
        UserController controller = new UserController(model, view);

        controller.updateView();

        // Atualizando o modelo
        controller.setUserName("Jane Doe");
        controller.updateView();
    }
}
