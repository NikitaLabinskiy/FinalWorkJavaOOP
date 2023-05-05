package Model;

import lombok.Data;

import java.util.Scanner;

@Data
public class ComplexNumber {
    private int real;
    private int imaginary;

    public ComplexNumber(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber(Scanner scanner) {
        System.out.print("\nВведите вещественную часть: ");
        this.real = scanner.nextInt();
        System.out.print("Введите мнимую часть: ");
        this.imaginary = scanner.nextInt();
        if (imaginary == 0)
            System.out.println("\nСформированное число = " + getReal());
        if (imaginary < 0)
            System.out.println("\nСформированное число = " + getReal() + "-" + getImaginary() + "i");
        if (imaginary > 0)
            System.out.println("\nСформированное число = " + getReal() + "+" + getImaginary() + "i");
    }

    public ComplexNumber(int real) {
        this.real = real;
        this.imaginary = 0;
    }

    @Override
    public String toString() {
        if (imaginary == 0) System.out.println(getReal());
        if (imaginary < 0) System.out.println(getReal() + "-" + getImaginary() + "i");
        if (imaginary > 0) System.out.println(getReal() + "+" + getImaginary() + "i");
        return null;
    }
}
