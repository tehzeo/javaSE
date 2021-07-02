public class Arrays {
    public static void main(String[] args) {
        String[] androidVersions = new String[17];
        String days[] = new String[7];

        String[][] cities = new String[4][2];

        int [][][] numbers = new int [2][2][2];
        int [] [] [] [] numbers4 = new int [2][2][2][2];

        String[][][][] chango = new String[2][3][2][2];

       /* for (int i = 0; i < androidVersions.length ; i++) {

        }*/
        for (String androidVersion: androidVersions){
            System.out.println(androidVersion);
        }

        androidVersions[0] = "Applie Pie";
        androidVersions[1] = "Banana Bread";
        androidVersions[2] = "Cupcake";
        androidVersions[3] = "Donut";

        /*System.out.println(androidVersions[0]);
        System.out.println(androidVersions[1]);
        System.out.println(androidVersions[2]);
        System.out.println(androidVersions[3]);*/

        System.out.println();
        System.out.println();

        cities[0][0] = "Colombia";
        cities[0][1] = "Medellin";
        cities[1][0] = "Colombia";
        cities[1][1] = "Bogota";
        cities[2][0] = "Mexico";
        cities[2][1] = "Guadalajara";
        cities[3][0] = "Medxico";
        cities[3][1] = "CDMX";

        for (String[] pair :cities){
            for (String name :pair) {
                System.out.println(name);
            }
        }

        chango [1][0][0][1] = "Changuito";

        /*System.out.println(cities [0][0]);
        System.out.println(cities [0][1]);
        System.out.println(cities [1][0]);
        System.out.println(cities [1][1]);
        System.out.println(cities [2][0]);
        System.out.println(cities [2][1]);
        System.out.println(cities [3][0]);
        System.out.println(cities [3][1]);*/

        for (int i = 0; i < cities.length; i++) {
            for (int j = 0; j < cities[i].length; j++) {
                System.out.println(cities[i][j]);

            }

        }

        System.out.println(chango[1][0][0][1]);
    }
}
