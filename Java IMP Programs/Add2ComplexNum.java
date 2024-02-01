public class Add2ComplexNum {
    double real;
    double imag;

    public Add2ComplexNum(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public static void main(String[] args) {
        Add2ComplexNum n1 = new Add2ComplexNum(2.3, 4.5),
                n2 = new Add2ComplexNum(3.4, 5.0),
                temp;

        temp = add(n1, n2);

        System.out.printf("Sum = %.1f + %.1fi", temp.real, temp.imag);
    }

    public static Add2ComplexNum add(Add2ComplexNum n1, Add2ComplexNum n2)
    {
        Add2ComplexNum temp = new Add2ComplexNum(0.0, 0.0);

        temp.real = n1.real + n2.real;
        temp.imag = n1.imag + n2.imag;

        return(temp);
    }
}

