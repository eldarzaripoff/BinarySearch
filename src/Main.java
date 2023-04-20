import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int bookshelf[] = {14, 16, 19, 32, 32, 32, 56, 69, 72};
        int newBook = 60;

        int result = bookCalculator(bookshelf, newBook);
        System.out.println(result);
    }

    public static int bookCalculator(int bookshelf[], int newBook) {
        int quantity = 0;
        int left = 0;
        int right = bookshelf.length - 1;
        while (left < right) {
            int middle = (left + right) / 2;
            if (bookshelf[middle] > newBook && bookshelf[middle - 1] <= newBook) {
                bookshelf = Arrays.copyOfRange(bookshelf, middle, right + 1);
                System.out.println(Arrays.toString(bookshelf));
                quantity = bookshelf.length;
                break;
            } else if (bookshelf[middle] < newBook) {
                left++;
            } else if (bookshelf[middle] > newBook && bookshelf[middle - 1] > newBook) {
                left--;
            }
        }
        return quantity;
    }


}