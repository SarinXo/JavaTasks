package org.example.calculator;

@FunctionalInterface
public interface BinOperation {
    double operation(double operand1, double operand2);
}
