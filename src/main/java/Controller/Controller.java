package Controller;

import Model.Classes.*;
import View.View;

import java.util.Scanner;

public class Controller {
    public Controller() {
        int userChoice = 0;
        Scanner scanner = new Scanner(System.in);
        ClassLogger logger = new ClassLogger();
        while (userChoice != 5) {
            View view = new View();
            view.Menu();
            logger.getLogger().info("Запущено меню!");
            userChoice = scanner.nextInt();
            switch (userChoice){
                case 1 -> {
                    logger.getLogger().info("Пользователь выбрал 'Сложение'!");
                    System.out.println("\nВведите первое число!");
                    ComplexNumber firstNumber = new ComplexNumber(scanner);
                    System.out.println("\nВведите торое число!");
                    ComplexNumber secondNumber = new ComplexNumber(scanner);
                    SumOfNumbers sum = new SumOfNumbers();
                    ComplexNumber complexNumber = sum.arithmeticOperation(firstNumber, secondNumber);
                    System.out.print("\nРезультат: ");
                    view.viewOnConsole(complexNumber);
                    logger.getLogger().info("Суммирование произведено успешно!");
                }
                case 2 -> {
                    logger.getLogger().info("Пользователь выбрал 'Вычитание'!");
                    System.out.println("\nВведите первое число!");
                    ComplexNumber firstNumber = new ComplexNumber(scanner);
                    System.out.println("\nВведите торое число!");
                    ComplexNumber secondNumber = new ComplexNumber(scanner);
                    DifferenceOfNumbers difference = new DifferenceOfNumbers();
                    ComplexNumber complexNumber = difference.arithmeticOperation(firstNumber, secondNumber);
                    System.out.print("\nРезультат: ");
                    view.viewOnConsole(complexNumber);
                    logger.getLogger().info("Вычитание произведено успешно!");
                }
                case 3 -> {
                    logger.getLogger().info("Пользователь выбрал 'Умножение'!");
                    System.out.println("\nВведите первое число!");
                    ComplexNumber firstNumber = new ComplexNumber(scanner);
                    System.out.println("\nВведите торое число!");
                    ComplexNumber secondNumber = new ComplexNumber(scanner);
                    MultiplicationOfNumbers multiplication = new MultiplicationOfNumbers();
                    ComplexNumber complexNumber = multiplication.arithmeticOperation(firstNumber, secondNumber);
                    System.out.print("\nРезультат: ");
                    view.viewOnConsole(complexNumber);
                    logger.getLogger().info("Умножение произведено успешно!");
                }
                case 4 -> {
                    logger.getLogger().info("Пользователь выбрал 'Деление'!");
                    System.out.println("\nВведите первое число!");
                    ComplexNumber firstNumber = new ComplexNumber(scanner);
                    System.out.println("\nВведите торое число!");
                    ComplexNumber secondNumber = new ComplexNumber(scanner);
                    DivisionOfNumbers division = new DivisionOfNumbers();
                    ComplexNumber complexNumber = division.arithmeticOperation(firstNumber, secondNumber);
                    System.out.print("\nРезультат: ");
                    view.viewOnConsole(complexNumber);
                    logger.getLogger().info("Деление произведено успешно!" + "\nРезультат: " + complexNumber);
                }
            }
        }
        scanner.close();
        logger.getLogger().info("Приложение было закрыто!");
    }


}
