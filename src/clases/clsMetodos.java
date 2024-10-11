package clases;



public class clsMetodos {

    public String mtdFactorial(int num) {
        String respuesta;

        int factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }

        respuesta = "El factorial es: " + String.valueOf(factorial);
        return respuesta;
    }
    

    public String mtdMayorMenor(int num, int num1) {
        String answer;
        if (num > num1) {
            answer = "El numero mayor es: " + num + " El numero menor es: " + num1;
        } else {
            answer = "El numero mayor es: " + num1 + "El numero menor es: " + num;
        }
        return answer;
    }

    public String mtdTablaMultiplicar(int num) {
        String res = "";
        for (int i = 1; i < 12; i++) {
            res = res + num + " X " + i + " = " + num * i + "\n";
        }
        return res;
    }

    public String multiplo_2_numeros(int num1, int num2) {
        String resultado = "";
        if ((num1 > 0) && (num2 > 0)) {
            if ((num1 % num2 == 0) || (num2 % num1 == 0)) {
                resultado = "Su número si es múltiplo del otro";
            } else {
                resultado = "Su número no es múltiplo del otro";
            }
        } else {
            resultado = "Alguno de sus numeros es igual o menor a 0, dijite otro valor";
        }
        return resultado;
    }

    public double mtd_operacionesMatematicas(double num1, double num2, String signo){

    double res=0;
    switch(signo) {
    
    case"+":
    res=num1+num2;
    break;
    case"-":
    res=num1-num2;
    break;
    case"*":
    res=num1*num2;
    break;
    case"/":
    res=num1/num2;
    break;
}
    return res ;
    }
    

}
