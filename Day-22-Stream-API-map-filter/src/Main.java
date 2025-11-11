import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> evenNumbers = numbers.stream()
                // n -> n % 2 == 0 là một Predicate
                .filter(n -> n % 2 == 0)
                .toList();

        System.out.println("Số chẵn (dùng filter): " + evenNumbers);

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        List<String> upperNames = names.stream()
                // name -> name.toUpperCase() là một Function
                .map(String::toUpperCase)
                .toList();

        System.out.println("Tên viết hoa (dùng map): " + upperNames);

        List<Integer> result = numbers.stream()
                .filter(n -> n % 2 == 0)      // 1. Lọc: [2, 4, 6]
                .map(n -> n * n)            // 2. Biến đổi: [4, 16, 36]
                .toList();                        // 3. Thu thập

        System.out.println("Bình phương số chẵn (dùng stream): " + result);

        // Bài tập:
        /*
        Cho List<String> words = Arrays.asList("Java", "is", "fun", "and", "powerful"); Hãy dùng stream() và filter() để tạo ra một list mới chỉ chứa các từ có độ dài lớn hơn 3.
        Tiếp tục với list words ở trên, hãy dùng stream() và map() để tạo ra một list mới chứa độ dài (Integer) của mỗi từ.
         */
        List<String> words = Arrays.asList("Java", "is", "fun", "and", "powerful");
        System.out.println("Các từ có độ dài lớn hơn 3:");
        words.stream().filter(w -> w.length() > 3).toList().forEach(System.out::println);

        List<Integer> lengthOfWords = words.stream().map(String::length).toList();
        System.out.println("List độ dài của words là: " + lengthOfWords);
    }
}