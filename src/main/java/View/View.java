package View;

import Model.Interfaces.MenuInterface;

public class View implements MenuInterface {
    @Override
    public void Menu() {
        System.out.println("\nКАЛЬКУЛЯТОР КОМПЛЕКСНЫХ ЧИСЕЛ");
        System.out.println();
        System.out.println("    (1) Сложение ");
        System.out.println("    (2) Вычитание ");
        System.out.println("    (3) Умножение ");
        System.out.println("    (4) Деление ");
        System.out.println("    (5) Закрыть калькулятор ");
        System.out.println();
        System.out.print("Выберите действие: ");
    }
    public void viewOnConsole(Object object){
        System.out.println(object);
    }
}
