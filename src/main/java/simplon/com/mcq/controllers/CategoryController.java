package simplon.com.mcq.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import simplon.com.mcq.domain.dtos.CategoryView;
import simplon.com.mcq.services.CategoryService;

@RestController("/categories")
public class CategoryController {

    private final CategoryService service;

    CategoryController(CategoryService service) {
	this.service = service;
    }

    @RequestMapping("/all")
    public List<CategoryView> getAll() {
	return service.getAll();

    }

}
