
import utfpr.ct.dainf.if62c.pratica.Circulo;
import utfpr.ct.dainf.if62c.pratica.Elipse;
import utfpr.ct.dainf.if62c.pratica.Figura;
import utfpr.ct.dainf.if62c.pratica.FiguraComEixos;
import utfpr.ct.dainf.if62c.pratica.FiguraComLados;
import utfpr.ct.dainf.if62c.pratica.Quadrado;
import utfpr.ct.dainf.if62c.pratica.Retangulo;
import utfpr.ct.dainf.if62c.pratica.TrianguloEquilatero;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Prática de programação.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Pratica43 {
    
    public static final String FORMAT_MSG = "%s de %s = %g";

    public static void main(String[] args) {
        
        // um vetor de figuras
        Figura[] figuras = {
            new Quadrado(1),
            new TrianguloEquilatero(2),
            new Retangulo(3, 4),
            new Retangulo(5, 6),
            new Elipse(7, 8),
            new Circulo(9)
        };

        // processamento das figuras
        for (Figura f: figuras) {
            System.out.println(String.format(FORMAT_MSG, "Área", f, f.getArea()));
            System.out.println(String.format(FORMAT_MSG, "Perímetro", f, f.getPerimetro()));
            if (f instanceof FiguraComLados) {
                System.out.println(String.format(FORMAT_MSG, "Lado menor", f,
                        ((FiguraComLados)f).getLadoMenor()));
                System.out.println(String.format(FORMAT_MSG, "Lado maior", f,
                        ((FiguraComLados)f).getLadoMaior()));
            }
            if (f instanceof FiguraComEixos) {
                System.out.println(String.format(FORMAT_MSG, "Eixo menor", f,
                        ((FiguraComEixos)f).getEixoMenor()));
                System.out.println(String.format(FORMAT_MSG, "Eixo maior", f,
                        ((FiguraComEixos)f).getEixoMaior()));
            }
        }
    }
}
