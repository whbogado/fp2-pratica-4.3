package utfpr.ct.dainf.if62c.pratica;

/**
 * IF62C Fundamentos de Programação 2
 * Exemplo de interface em Java.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public abstract class Poligono implements Figura {

    /**
     * Retorna o nome da figura.
     * Este método retorno o nome não qualificado da classe.
     * @return O nome da figura.
     */
    @Override
    public String getNome() {
        return this.getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return getNome();
    }

}
