package ru.geekbrains.spring1final.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import ru.geekbrains.spring1final.models.Product;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class ProductDto {
    private Long id;
    private String title;
    private int price;

    public ProductDto(Product p) {
        this.id = p.getId();
        this.title = p.getTitle();
        this.price = p.getPrice();
    }


}
