package ru.nsk.wheretogo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.nsk.wheretogo.entity.Category;
import ru.nsk.wheretogo.repository.CategoryRepository;

@SpringBootApplication
public class WheretogoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(WheretogoApplication.class, args);
	}

	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public void run(String... args) throws Exception {
		Category category = new Category();
		category.setName("Заброшки");
		categoryRepository.save(category);

		Category category1 = new Category();
		category1.setName("Сооружения");
		categoryRepository.save(category1);

		Category category2 = new Category();
		category2.setName("Ночью");
		categoryRepository.save(category2);

		Category category3 = new Category();
		category3.setName("Природа");
		categoryRepository.save(category3);

		Category category4 = new Category();
		category4.setName("Архитектура");
		categoryRepository.save(category4);

		Category category5 = new Category();
		category5.setName("В черте города");
		categoryRepository.save(category5);

		Category category6 = new Category();
		category6.setName("В области");
		categoryRepository.save(category6);
	}
}
