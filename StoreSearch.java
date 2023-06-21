import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

class Product {
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}

public class StoreSearch {
    public static void main(String[] args) {
        // Materi linked list
        // Membuat linked list untuk menyimpan produk
        LinkedList<Product> products = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        // Menambahkan data produk ke dalam linked list
        products.add(new Product("teh gelas", 8000));
        products.add(new Product("cokolatos", 1000));
        products.add(new Product("oreo", 3500));
        products.add(new Product("nextar", 5000));
        products.add(new Product("roti", 4000));
        products.add(new Product("ultra milk", 7000));
        products.add(new Product("aqua", 5000));
        products.add(new Product("superstar", 9000));
        products.add(new Product("nabati", 6000));
        products.add(new Product("floridina", 3000));
        products.add(new Product("mentos", 12000));

        // Materi Sorting
        // Mengurutkan produk berdasarkan harga menggunakan Collections.sort()
        Collections.sort(products, (p1, p2) -> p1.getPrice() - p2.getPrice());

        // Menampilkan daftar produk yang tersedia
        System.out.println("Daftar Produk:");
        for (Product product : products) {
            System.out.println(product.getName());
        }

        // Meminta pengguna untuk memasukkan nama produk yang akan dicari harganya
        System.out.print("Masukkan nama produk yang ingin diketahui harganya: ");
        String searchProduct = scanner.nextLine();

        // Materi sercing
        // Mencari produk dalam linked list menggunakan searching
        boolean found = false;
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(searchProduct)) {
                System.out.println("Produk ditemukan!");
                System.out.println("Nama Produk: " + product.getName());
                System.out.println("Harga Produk: " + product.getPrice());
                found = true;
                break;
            }
        }

        // Menampilkan pesan jika produk tidak ditemukan
        if (!found) {
            System.out.println("Produk tidak ditemukan.");
        }
    }
}

//progam tersebut memberikan contoh sederhana tentang bagaimana menggunakan linked list, sorting dan searching untuk mencari produk dlm sebuah toko berdasarkan namanya 
