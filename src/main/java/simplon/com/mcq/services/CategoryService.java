package simplon.com.mcq.services;

import java.util.List;

import simplon.com.mcq.domain.dtos.CategoryView;

public interface CategoryService {

    List<CategoryView> getAll();
}
