package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Complex a = new Complex(1, 2);
        Complex b = new Complex(3, 4);

        //Complex c = new Complex(a.getReal() + b.getReal(), a.getImag() + b.getImag());

        Complex c = a.add(b);
        Complex d = a.sub(b);

        // Multiplication method
        // Division method

        System.out.println(d);

    }
}
