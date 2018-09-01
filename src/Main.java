public class Main {

    public static void main(String[] args) {

        ReadFile.readFile();
        System.out.println("List from file " + Data.listFromFile);

        Sorting.unSortList(Data.listSorted);

        Sorting.sorting();
    }

}




