public class Fnciones {
    public static void main(String[] args) {
        double y= 3;
        //Area de un circulo
        //pi * r2
        System.out.println(Math.PI * Math.pow(y,2));

        //Aread e una esfera
        //4*PI*r2
        System.out.println(Math.PI * Math.pow(y,2));

        //Volumen de una esfera
        //(4/3)*pi *r3
        System.out.println((4/3) * Math.PI * Math.pow(y,3));

        System.out.println("Pesos a Dolares: " + convertToDolar(200,"MXN"));
    }
    public static double circleArea(double r){
        return Math.PI * Math.pow(r,2);
    }
    public static double sphereArea(double r){
        return 4 * Math.PI * Math.pow(r,2);
    }
    public static double sphereVolumen(double r){
        return (4/3) * Math.PI * Math.pow(r,3);
    }

    /**
     * Descripcion: Funcion que especificando su moneda convierte una cantidad de dinero a dolares.
     *
     * @param quantity Cantidad de Dinero
     * @param currency Tipo de Moneda: Solo acepta MXN o COP.
     * @return quantity Devuelve la cantidad actualizada en Dolares.
     */
    public static double convertToDolar(double quantity, String currency){
        //MXN COP
        switch (currency){
            case "MXN":
                quantity = quantity * 0.052;
                break;
            case "COP":
                quantity = quantity * 0.00031;
                break;
        }

        return quantity;
    }
}
