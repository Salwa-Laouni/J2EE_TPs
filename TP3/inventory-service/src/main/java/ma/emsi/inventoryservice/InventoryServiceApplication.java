package ma.emsi.inventoryservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner start(ProductRepository productRepository){

        return args -> {
            productRepository.save(new Product(null, "Computer Desk Top HP", 900.00));
            productRepository.save(new Product(null, "Printer Epson", 80.00));
            productRepository.save(new Product(null, "MacBook Pro Lap Top", 1800.00));
            productRepository.save(new Product(null, "Gaming Monitor Dell 27\"", 350.00));
            productRepository.save(new Product(null, "Wireless Keyboard Logitech", 50.00));
            productRepository.save(new Product(null, "Smartphone Samsung Galaxy S23", 1200.00));

            productRepository.findAll().forEach(System.out::println);

        };

    }
}
