class mat extends Thread {


    int[][] arr1, arr2, result;
    int row;

    mat(int[][] arr1, int[][] arr2, int[][] result, int hello) {
        this.arr1 = arr1;
        this.arr2 = arr2;
        this.result = result;
        this.row = hello;
    }

    public void run() {
        for (int j = 0; j < arr1[0].length; j++) {
            result[row][j] = arr1[row][j] + arr2[row][j];
        }
    }
}


public class matrix_using_thread {
    static void main() {
        int[][] arr = {{1,2,3}, {2,3,4} , {5,6,7}};
        int[][] arr1 = {{4,5,7} , {3,4,3} , {1,1,1}};
        int[][] res= new int[3][3];
        mat[] threads = new mat[3];
        for (int i = 0; i < 3; i++) {
            threads[i] = new mat(arr, arr1, res, i);
            threads[i].start();
        }


        try {
            for (int i = 0; i < 3; i++) {
                threads[i].join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("Result Matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
