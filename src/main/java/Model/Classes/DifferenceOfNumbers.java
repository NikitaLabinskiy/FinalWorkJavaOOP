package Model.Classes;

import Model.Interfaces.ArithmeticOperation;

public class DifferenceOfNumbers implements ArithmeticOperation {
    @Override
    public ComplexNumber arithmeticOperation(ComplexNumber first, ComplexNumber second) {
        double real = first.getReal() - second.getReal();
        double imaginary = first.getImaginary() - second.getImaginary();
        ComplexNumber complexNumber;
        if (imaginary == 0)
            complexNumber = new ComplexNumber(real);
        else
            complexNumber = new ComplexNumber(real, imaginary);
        return complexNumber;
    }
}
