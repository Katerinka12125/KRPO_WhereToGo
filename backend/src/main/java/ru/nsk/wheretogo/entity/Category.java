package ru.nsk.wheretogo.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import ru.nsk.wheretogo.dto.CategoryDTO;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
@Entity
@Table(name = "categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    public Category(String name)
    {this.name = name;}

    public static Category getFromDTO(CategoryDTO dto ) {
        if (dto == null) {
            return null;
        }
        return new Category()
                .setId(dto.getId())
                .setName(dto.getName());
    }


}
