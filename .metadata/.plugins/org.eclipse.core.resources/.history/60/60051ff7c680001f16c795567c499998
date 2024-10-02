//2.    Print the sum, difference and product of two complex numbers by creating a class, 
//named 'Complex' with separate methods for each operation whose real and imaginary parts are entered by user.
//Use Constructors to initialize the data members.

package Assignment4;

import java.util.Scanner;

class Complex {
     private double real;
    private double imaginary;
    
    
    

  
    public Complex(double real, double imaginary) {
		super();
		this.real = real;
		this.imaginary = imaginary;
	}

	

    
    public Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imaginary + other.imaginary);
    }

    
    public Complex subtract(Complex other) {
        return new Complex(this.real - other.real, this.imaginary - other.imaginary);
    }

    
    public Complex multiply(Complex other) {
        double realPart = (this.real * other.real) - (this.imaginary * other.imaginary);
        double imaginaryPart = (this.real * other.imaginary) + (this.imaginary * other.real);
        return new Complex(realPart, imaginaryPart);
    }

  
    public String toString() {
        return real + " + " + imaginary + "i";
    }

   
}
