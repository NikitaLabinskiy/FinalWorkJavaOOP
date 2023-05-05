package Model.Classes;

import Model.Interfaces.ArithmeticOperation;

public class MultiplicationOfNumbers implements ArithmeticOperation {
    @Override
    public ComplexNumber arithmeticOperation(ComplexNumber first, ComplexNumber second) {
        double real = first.getReal() * second.getReal() - first.getImaginary() * second.getImaginary();
        double imaginary = first.getImaginary() * second.getReal() + first.getReal() * second.getImaginary();
        ComplexNumber complexNumber;
        if (imaginary == 0)
            complexNumber = new ComplexNumber(real);
        else
            complexNumber = new ComplexNumber(real, imaginary);
        return complexNumber;
    }
}
