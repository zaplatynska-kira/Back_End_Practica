package client;

import app.controllers.UserController;
import app.repositories.UserRepository;
import app.repositories.UserRepositoryMap;
import app.services.UserService;

import java.util.Scanner;

public class Main {

    // Клиентское приложение
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        UserRepository repository = new UserRepositoryMap();
        UserService service = new UserService(repository);
        UserController controller = new UserController(scanner, service);

        while (true) {
            System.out.println("Выберите операцию:");
            System.out.println("1. Сохранение нового пользователя");
            System.out.println("2. Получение пользователя по идентификатору");
            System.out.println("3. Получение списка всех пользователей");
            System.out.println("0. Выход");
            int select = Integer.parseInt(scanner.nextLine());

            switch (select) {
                case 0:
                    System.out.println("Завершение работы");
                    return;
                case 1:
                    controller.addUser();
                    break;
                case 2:
                    // TODO
                    break;
                case 3:
                    // TODO
                    break;
                default:
                    System.out.println("Некорректный ввод");
                    break;
            }
        }
    }
}