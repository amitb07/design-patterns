

class Main{
    public static void main(String[] args) {
        SortingContext sortingContext = new SortingContext(new BubbleSortStrategy());
        int[] arr = {1,3,6,8};
        sortingContext.performSort(arr);

        sortingContext.setSortingStrategy(new MergeSortStrategy());
        sortingContext.performSort(arr);
    }
}
interface SortStrategy{
    void sort(int[] arr);
}

class BubbleSortStrategy implements SortStrategy{
    public void sort(int[] arr) {
        System.out.println("This is bubble sort");
    }
}

class MergeSortStrategy implements SortStrategy{
    public void sort(int[] arr) {
        System.out.println("This is merge sort");
    }
}

class SortingContext {
    private SortStrategy sortingStrategy;
    SortingContext(SortStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void setSortingStrategy (SortStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void performSort (int[] arr) {
        sortingStrategy.sort(arr);
    }
}

