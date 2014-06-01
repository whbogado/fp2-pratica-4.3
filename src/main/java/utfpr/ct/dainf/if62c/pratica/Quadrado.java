package utfpr.ct.dainf.if62c.pratica;

/**
 * IF62C Fundamentos de Programação 2
 * Exemplo de interface em Java.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Quadrado extends Retangulo {

    public Quadrado() {
        super();
    }

    public Quadrado(double lado) {
        super(lado, lado);
    }

    public double getLado() {
        return getBase();
    }

    @Override
    public String toString() {
        return getNome() + " [" + getLado() + "]";
    }

}
