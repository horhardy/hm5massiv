public class Main {
    public static void main(String[] args) {
        // ЗАДАНИЕ 1.1
        int[] weights = new int[3];
        weights[0] = 1;
        weights[1] = 2;
        weights[2] = 3;
        int pointOne = weights[0];
        int pointTwo = weights[1];
        int pointThree = weights[2];
        System.out.println(pointOne);
        System.out.println(pointTwo);
        System.out.println(pointThree);



        // ЗАДАНИЕ 1.2
        float[] weight = {1.57f, 7.654f, 9.986f};
        weight[0] = 1.57f;
        weight[1] = 7.654f;
        weight[2] = 9.986f;
        System.out.println(weight[0]);
        System.out.println(weight[1]);
        System.out.println(weight[2]);

        // ЗАДАНИЕ 1.3

        int[] year = {2000, 2001, 2002, 2003, 2004};
        for (int i = 0; i < year.length; i++)
            System.out.println(year[i]);


        // ЗАДАНИЕ 2.1
        int[] points = new int[3];
        points[0] = 1;
        points[1] = 2;
        points[2] = 3;

            for (int i = 0; i<points.length; i++) {
                System.out.print(points[i]);
                if (i<2)
                    System.out.print(", ");
            }


            System.out.println();

        // ЗАДАНИЕ 2.2

        float[] weightA = {1.57f, 7.654f, 9.986f};

        for (int i = 0; i< weightA.length; i++) {
                System.out.print(weightA[i]);
            if (i<2)
                System.out.print(", ");
        }

        System.out.println();

        // ЗАДАНИЕ 2.3

        int[] yearA = {2000, 2001, 2002, 2003, 2004};
        for (int i = 0; i < yearA.length; i++) {
            System.out.print( yearA[i] );
        if (i<4)
            System.out.print(", "); }



        System.out.println();

        // ЗАДАНИЕ 3.1

        int[] pointsA = new int[3];
        pointsA[0] = 1;
        pointsA[1] = 2;
        pointsA[2] = 3;

        for (int i =  pointsA.length - 1; i >= 0; i--) {
            System.out.print( pointsA[i]);
        if (i > 0)
            System.out.print(", "); }



        System.out.println();

        // ЗАДАНИЕ 3.2

        float[] weightB = {1.57f, 7.654f, 9.986f};


        for (int i = weightB.length - 1; i >= 0; i--)  {
            System.out.print(weightB[i]);
        if (i > 0)
            System.out.print(", "); }



        System.out.println();


        // ЗАДАНИЕ 3.3

        int[] yearB = {2000, 2001, 2002, 2003, 2004};
        for (int i = yearB.length -1; i >= 0; i--) {
            System.out.print(yearB[i]);
            if (i > 0)
                System.out.print(", ");
            }




        System.out.println();
        System.out.println();


        // ЗАДАНИЕ 4
        int[] weightsV =  {1, 2, 3};

        for (int i = 0; i<weightsV.length; i++) {
            if (weightsV[i] % 2 != 0  )
                weightsV[i] = weightsV[i] + 1;

            System.out.println(weightsV[i]);}



    }
}