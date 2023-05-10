package ir.mmghteam.SpringRest1;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class DataLoader {
    private final CoffeeRepository coffeeRepository;

    public DataLoader(CoffeeRepository coffeeRepository) {
        this.coffeeRepository = coffeeRepository;
        }

        @PostConstruct
        public void loadData() {
        this.coffeeRepository.saveAll(List.of(
                new Coffee("Cafe 1"),
                new Coffee("Cafe 2"),
                new Coffee("Cafe 3"),
                new Coffee("Cafe 4")
        ));
    }
}
