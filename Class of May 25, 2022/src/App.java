// Traduzca las siguientes fórmulas a expresiones escritas en Java, declarando paraello las variables que considere necesarias:

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Formulas traducidas:");

        System.out.println("Primera formula:");

        double F = 1.8;
        double C = 8;

        double finalResult = (F*C) + 32;
        System.out.println(finalResult);

    // ----------------------------------- //

        System.out.println("Segunda formula:");
        divisionFunction(2, 4);

    // ----------------------------------- //

        System.out.println("Tercera formula:");

        double exponent = 4;

        double divisionResult = (Math.exp(exponent)/Math.pow(exponent, 2));
        double addition = 1 + Math.pow(divisionResult, 2);

        System.out.println(Math.pow(addition, 0.5)); 
        
    }

    /* Se declara la funcion para pasar como parametros
    a X y a Y */

    static void divisionFunction(double x, double y){
        double numerator = 1 + ((Math.pow(x,2))/y);
        double denominator = ((Math.pow(x,3))/(1 + y));
        System.out.println(numerator/denominator);
    }

}
