package package1.test1;

import org.testng.annotations.Test;

public class ArrTest {
    @Test
    public void ArrTest1(){
        int[] a = new int[5];
        a[0]= 1;
        a[1]=10;
        a[2]=30;
        a[3]=50;
        a[4]=40;

        for (int i =0; i < a.length; i++){
            System.out.println("a[ " +i+ "]= " + a[i]);

        }

        for(int n : a){
            System.out.println(n);
        }

    }
    @Test
    public void arrTest2(){
        int[] a = {1,10,20,40,30,50};
        for (int i =0; i < a.length; i++){
            System.out.println("a[ " +i+ "]= " + a[i]);

        }
        for(int n : a){
            System.out.println(n);
        }
    }
    @Test
    public void ArrTest3(){
        int[] a = {100,10,20,40,30,50};
        int MIN = min(a);
        int MAX = max(a);

        System.out.println("Gia tri Min: "+MIN);
        System.out.println("Gia tri Max: "+MAX);
        //cach2
        System.out.println("Gia tri Min: "+min(a));
        System.out.println("Gia tri Min: "+max(a));

    }
    @Test
    public void minmaxTest2(){
        int[] a = {100,10,20,40,30,50};
        int[] minmax = getMinMax(a);

        System.out.println("min= "+minmax[0]);
        System.out.println("max= "+minmax[1]);
    }


    public static int[] getMinMax(int[] arr){
        int[] minmax= new int[2];

//        minmax[0] = min[arr];
//        minmax[1] = max[arr];
        return minmax;

    }
    public static int min(int[] a){
        int min = a[0];
        for (int i =0; i<a.length;i++){
            if(min > a[i])
                min =a[i];
        }
        return min;

    }
    public static int max(int[] a){
        int max = a[0];
        for (int i =0; i<a.length;i++){
            if(max < a[i])
                max =a[i];
        }
        return max;
    }
    @Test
    public void multiDimensionArrTest(){
        int[][] arr= new int[3][4];

        arr[0][0] = 13;
        arr[0][1] = 14;
        arr[0][2] = 16;
        arr[0][3] = 1;

        arr[1][0] = 16;
        arr[1][1] = 13;
        arr[1][2] = 1;
        arr[1][3] = 156;

        arr[2][0] = 132;
        arr[2][1] = 1;
        arr[2][2] = 143;
        arr[2][3] = 1;

        for (int i =0;i<3; i++){
            for (int j =0; j<4; j++){
                System.out.println("arr[ " +i+ " ][ " +j+ "]=" +arr[i][j]);
            }
            System.out.println("-----------");

        }
        System.out.println("**************************************");
        //Cach 2
        for (int i =0;i <arr.length; i++){
            for (int j =0; j<arr[i].length; j++){
                System.out.println("arr[ " +i+ " ][ " +j+ "]=" +arr[i][j]);
            }
            System.out.println("-----------");
        }

        //sx theo column

        for (int i =0;i <arr.length; i++){
            for (int j =0; j<arr[i].length; j++){
                System.out.print(arr[i][j] +"   ");
            }
            System.out.println("");
        }

    }
    @Test
    public void multiDimensionArrTest2(){
        int[][] arr = new int[3][];
        arr[0] = new int[2];
        arr[1] = new int[4];
        arr[2] = new int[3];

        arr[0][0] = 1;
        arr[0][1] = 2;

        arr[1][0] = 34;
        arr[1][1] = 54;
        arr[1][2] = 1;
        arr[1][3] = 22;

        arr[2][0] = 13;
        arr[2][1] = 264;
        arr[2][2] = 13;

        for (int i =0;i <arr.length; i++){
            for (int j =0; j<arr[i].length; j++){
                System.out.print(arr[i][j] +"   ");
            }
            System.out.println("");
        }
//        Cach 2
        for (int i =0;i <arr.length; i++){
            for (int j =0; j<arr[i].length; j++){
                System.out.println("arr[ " +i+ " ][ " +j+ "]=" +arr[i][j]);
            }
            System.out.println("-----------");
        }
    }
    @Test
    public void multiDimensionArrTest3(){
        int[][] arr = new int[3][];
        arr[0] = new int[2];
        arr[1] = new int[4];
        arr[2] = new int[3];
        int count = 0;


        //set
        for (int i =0;i <arr.length; i++){
            for (int j =0; j<arr[i].length; j++){
                arr[i][j] = count;
                count++;
            }
            System.out.println("");
        }
        //get
        for (int i =0;i <arr.length; i++){
            for (int j =0; j<arr[i].length; j++){
                System.out.print(arr[i][j] +"   ");
            }
            System.out.println("");
        }
    }
    @Test
    public void multiDimensionArrTest4(){
        float[][] arr = new float[3][];
        arr[0] = new float[2];
        arr[1] = new float[4];
        arr[2] = new float[3];
        int count = 0;


        //set
        for (int i =0;i <arr.length; i++){
            for (int j =0; j<arr[i].length; j++){
                arr[i][j] = count;
                count++;
            }
            System.out.println("");
        }
        //get
        for (int i =0;i <arr.length; i++){
            for (int j =0; j<arr[i].length; j++){
                System.out.print(arr[i][j] +"   ");
            }
            System.out.println("");
        }
    }


}
