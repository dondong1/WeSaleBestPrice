package com.wesale.wesalebestpricebackend.controller;

import com.wesale.wesalebestpricebackend.model.Category;
import com.wesale.wesalebestpricebackend.model.Products;
import com.wesale.wesalebestpricebackend.service.ProductService.ProductServices;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

import static org.apache.commons.io.IOUtils.toByteArray;
import static org.apache.tomcat.util.http.fileupload.IOUtils.*;

@RestController
@RequestMapping("api/product")
public class ProductController {
    @Autowired
    ProductServices ProductServices;

    @RequestMapping("getAll")
    public List<Products> getAllPRoducts(){
        return ProductServices.getAllProducts();
    }
    @RequestMapping("getAllCategory")
    public List<Category> getAllCategory(){
        return ProductServices.getAllCategory();
    }
    @RequestMapping("getProductsByCategory")
    public List<Products> getProductsByCategory(@RequestBody HashMap<String,String> request){
        String category_id = request.get("cat_id");
        return ProductServices.getProductsByCategory(category_id);
    }



    @GetMapping( value = "/getimage/{img_name}",produces = MediaType.IMAGE_JPEG_VALUE)
    public @ResponseBody byte[] getImageWithMediaType(@PathVariable("img_name") String img_name) throws IOException {
        InputStream in = getClass().getResourceAsStream("/images/"+img_name);
        return toByteArray(in);
    }
}
