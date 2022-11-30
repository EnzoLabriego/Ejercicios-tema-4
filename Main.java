public class Main {
    public static void main( String[] args ) {
        int numeroIf = 7;
        
        int numeroWhile = -1;
        
        int numeroDoWhile = -1;

        int numeroFor = 0;

        var estacion = "Invierno";
        
        if (numeroIf == 0) {
            System.out.println("es neutro: " + numeroIf);
        } else if (numeroIf > 0) {
            System.out.println("es positivo: " + numeroIf);
        } else {
            System.out.println("es negativo: " + numeroIf);
        }

        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile + 1;
        }
    
        do {
            numeroDoWhile = numeroDoWhile + 1;
        } while (numeroDoWhile < 3);
        System.out.println(numeroDoWhile);
        
        for (numeroFor = 0; numeroFor <= 3; numeroFor = numeroFor +1) {
            System.out.println(numeroFor);
        }

        switch(estacion) {
            case "Invierno":
                System.out.println("Es Invierno");
                break;
            case "Verano":
                System.out.println("Es Verano");
                break;
            case "Otono":
                System.out.println("Es Otono");
                break;
            case "Primavera":
                System.out.println("Es Primavera");
                break;
            default:
                System.out.println("No es una estacion");
        }
    }
}