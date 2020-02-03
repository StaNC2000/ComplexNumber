package com.eS;

public class ComplexNumber {

    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(double real, double imaginary) {
        this.real += real;
        this.imaginary += imaginary;
    }

    public ComplexNumber add(ComplexNumber complexNumber){

        return new ComplexNumber(this.real + real, this.imaginary + imaginary);

    }

    public void subtract(double real, double imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;
    }

    public ComplexNumber subtract(ComplexNumber complexNumber) {
        return new ComplexNumber(this.real - real, this.imaginary + imaginary);
    }
}
