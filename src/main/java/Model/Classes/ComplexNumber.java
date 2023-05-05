package Model.Classes;

import lombok.Data;

import java.text.DecimalFormat;
import java.util.Scanner;

@Data
public class ComplexNumber {
    private Double real;
    private Double imaginary;

    DecimalFormat format = new DecimalFormat();

    public ComplexNumber(Double real, Double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber(Scanner scanner) {
        System.out.print("\nВведите вещественную часть: ");
        this.real = scanner.nextDouble();
        System.out.print("Введите мнимую часть: ");
        this.imaginary = scanner.nextDouble();
        if (imaginary == 0)
            System.out.println("\nСформированное число = " + format.format(getReal()));
        if (imaginary < 0)
            System.out.println("\nСформированное число = " + format.format(getReal()) + format.format(getImaginary()) + "i");
        if (imaginary > 0)
            System.out.println("\nСформированное число = " + format.format(getReal()) + "+" + format.format(getImaginary()) + "i");
    }

    public ComplexNumber(Double real) {
        this.real = real;
        this.imaginary = 0.0;
    }

    @Override
    public String toString() {
        if (imaginary == 0) System.out.println(format.format(getReal()));
        if (imaginary < 0) System.out.println(format.format(getReal()) + format.format(getImaginary()) + "i");
        if (imaginary > 0) System.out.println(format.format(getReal()) + "+" + format.format(getImaginary()) + "i");
        return null;
    }
}
