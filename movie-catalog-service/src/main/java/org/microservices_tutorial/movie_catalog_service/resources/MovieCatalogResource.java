package org.microservices_tutorial.movie_catalog_service.resources;

import org.microservices_tutorial.movie_catalog_service.models.CategoryItem;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

    @RequestMapping("/{userId}")
    public List<CategoryItem> getCatalog(@PathVariable("userId") String userId){
        return Collections.singletonList(
                new CategoryItem("Harry-Potter","Some description", 4)
        );
    }
}
