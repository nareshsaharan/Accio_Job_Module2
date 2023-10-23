package org.example;

class Complex {

    private int real;
    private int imag;

    public Complex(){
        this.real = 0;
        this.imag = 0;
    }

    public Complex(int real, int imag) {
        this.real = real;
        this.imag = imag;
    }

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImag() {
        return imag;
    }

    public void setImag(int imag) {
        this.imag = imag;
    }

    // a.add(b)

    Complex add(Complex other) {
        Complex ans = new Complex();
        ans.real = this.real + other.real;
        ans.imag = this.imag + other.imag;
        return ans;
    }

    Complex sub(Complex other) {
        Complex ans = new Complex();
        ans.real = this.real - other.real;
        ans.imag = this.imag - other.imag;
        return ans;
    }


    public String toString(){
        String num = this.real +" + "+this.imag + "i";
        return num;
    }
}

