package lab2.task1;

public class Complex {
    private int real;
    private int imaginary;

    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex() {
        this.real = 0;
        this.imaginary = 0;
    }

    public Complex(Complex c) {
        this.real = c.real;
        this.imaginary = c.imaginary;
    }

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImaginary() {
        return imaginary;
    }

    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }

    void addWithComplex(Complex c) {
        this.real = this.real + c.real;
        this.imaginary = this.imaginary + c.imaginary;
    }

    void showNumber() {
        if( this.imaginary > 0 )
            System.out.println(this.real + " + i * " + this.imaginary);
        else if( this.imaginary < 0 )
            System.out.println(this.real + " - i * " + this.imaginary);
        if( this.imaginary == 0 )
            System.out.println(this.real);
    }
}
