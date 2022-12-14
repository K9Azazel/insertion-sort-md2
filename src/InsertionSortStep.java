public class InsertionSortStep {
    public static void main(String[] args) {
        int[] list = new int[]{-8,-20,23,53,8,3,6};
        System.out.println("\nBegin sort processing.... ");
        insertionSortStep(list);
    }
    public static void insertionSortStep(int[] arr){

        for( int i=1; i<arr.length; i++ ) {
            int key = arr[i];
            int j = i -1;

            while (j >=0 && arr[j] > key) {

                System.out.println("Swap " + arr[j] + " with " + arr[j + 1]);
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;


            System.out.println("List after the '" + i + "' sort: ");
            for (int k : arr) {
                System.out.print(k + "\t");
            }
            System.out.println();
        }
    }
}
