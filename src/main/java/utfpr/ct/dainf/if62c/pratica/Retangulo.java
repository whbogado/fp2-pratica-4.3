package utfpr.ct.dainf.if62c.pratica;

/**
 * IF62C Fundamentos de Programação 2
 * Exemplo de interface em Java.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Retangulo extends Quadrilatero {

    public Retangulo() {
        super();
    }

    public Retangulo(double base, double altura) {
        super(base, altura);
    }

    @Override
    public double getLadoMenor() {
        return getBase() < getAltura() ? getBase() : getAltura();
    }

    @Override
    public double getLadoMaior() {
        return getBase() > getAltura() ? getBase() : getAltura();
    }

    @Override
    public double getArea() {
        return getBase() * getAltura();
    }

    @Override
    public double getPerimetro() {
        return (getBase() + getAltura()) * 2;
    }
}
