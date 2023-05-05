package Model.Classes;

import Model.Interfaces.ArithmeticOperation;

public class DivisionOfNumbers implements ArithmeticOperation {
    @Override
    public ComplexNumber arithmeticOperation(ComplexNumber first, ComplexNumber second) {
        double temp = second.getReal() * second.getReal() +
                      second.getImaginary() * second.getImaginary();
        double real = first.getReal() * second.getReal() + first.getImaginary() * second.getImaginary();
        double imaginary = first.getImaginary() * second.getReal() - first.getReal() * second.getImaginary();
        real /= temp;
        imaginary /= temp;
        ComplexNumber complexNumber;
        if (imaginary == 0)
            complexNumber = new ComplexNumber(real);
        else
            complexNumber = new ComplexNumber(real, imaginary);
        return complexNumber;
    }
}
