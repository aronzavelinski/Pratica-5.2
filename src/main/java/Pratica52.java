
import utfpr.ct.dainf.if62c.pratica.Equacao2Grau;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Template de projeto de programa Java usando Maven.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Pratica52 {
    public static void main(String[] args) {
        Equacao2Grau<Integer> eq;
        Integer[][] vals = new Integer[3][3];
        vals[0][0] = 1;
        vals[0][1] = -4;
        vals[0][2] = 3;
        vals[1][0] = 1;
        vals[1][1] = -4;
        vals[1][2] = 4;
        vals[2][0] = 1;
        vals[2][1] = -4;
        vals[2][2] = 5;

        for(Integer[] coefs: vals){
            try {
                eq = new Equacao2Grau<Integer>(coefs[0], coefs[1], coefs[2]);
                System.out.println(eq.getRaiz1());
                System.out.println(eq.getRaiz2());
            } catch (IllegalArgumentException arge){
                System.out.println(arge.toString());
            }catch (ArithmeticException arite){
                System.out.println(arite.toString());
            }
        }
    }
}


