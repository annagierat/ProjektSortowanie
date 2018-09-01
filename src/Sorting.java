import java.util.ArrayList;


public class Sorting {

    public static void unSortList(ArrayList<Integer> listSorted) {

        int startIndex = 1;
        int endIndex = Data.listFromFile.size();

        for (int i = startIndex; i < endIndex; i++) {

            Data.listSorted.add(Integer.parseInt(Data.listFromFile.get(i)));
        }
        System.out.println("Unsorted List " + Data.listSorted);
    }

    public static void bubbleSort(ArrayList<Integer> listSorted) {
        int startIndex = 0;
        int endIndex = Data.listSorted.size();
        int temp = 0;

        for (int i = startIndex; i < endIndex; i++) {
            for (int j = startIndex + 1; j < endIndex; j++) {
                if (Data.listSorted.get(j - 1) > Data.listSorted.get(j)) {
                    temp = Data.listSorted.get(j - 1);
                    Data.listSorted.set(j - 1,(Data.listSorted.get(j)));
                    Data.listSorted.set(j,temp);
                }
            }

        }
        System.out.println("BO List " + Data.listSorted);

    }

    public static void selectSort (ArrayList<Integer> listSorted) {
        int startIndex = 0;
        int endIndex = Data.listSorted.size();
        for (int i = startIndex; i < endIndex; i++) {
            int minIndex = i;
            for (int j = i + 1; j < endIndex; j++) {
                if (Data.listSorted.get(j) < Data.listSorted.get(minIndex)) {
                    minIndex = j;
                }
                if (minIndex != i) {
                    final int temp = Data.listSorted.get(i);
                    Data.listSorted.set(i, minIndex);
                    Data.listSorted.set(minIndex, temp);
                }
            }
        }
        System.out.println("CHO List " + Data.listSorted);
    }

    public static void sorting() {
        if (Data.listFromFile.get(0).equals("BO")) {
            Sorting.bubbleSort(Data.listSorted);
        } else if (Data.listFromFile.get(0).equals("CHO")) {
            Sorting.selectSort(Data.listSorted);
        }
    }
}
