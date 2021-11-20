package ru.netology.domain;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)

public class Smartphone extends Product {
    private String manufacturer;
}
