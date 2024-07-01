public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[] array = {1,2,3};
        int[][] arryInt = new int[3][];

        arryInt[0] = new int[2];
        arryInt[1] = array;
        arryInt[2] = new int[]{1,2,3,4,5,6};

        //int[][] arryInt2 = {{0,0},{1,2,3},{1,2,3,4,5,6}}; outra forma de inicializar

        for(int[] arrayBase: arryInt){
            System.out.println("\n-----");
            for(int num: arrayBase){
                System.out.print(num+" ");
            }
        }
    }
}
