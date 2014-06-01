package utfpr.ct.dainf.if62c.pratica;

/**
 * IF62C Fundamentos de Programação 2
 * Exemplo de interface em Java.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class TrianguloEquilatero extends Retangulo {

    public TrianguloEquilatero() {
        super();
    }

    public TrianguloEquilatero(double lado) {
        super(lado, lado * Math.sqrt(3) / 2);
    }

    @Override
    public double getArea() {
        return super.getArea() / 2;
    }

    @Override
    public double getPerimetro() {
        return 3 * getBase();
    }

    public double getLado() {
        return getBase();
    }

    @Override
    public String toString() {
        return getNome() + " [" + getLado() + "]";
    }

}
