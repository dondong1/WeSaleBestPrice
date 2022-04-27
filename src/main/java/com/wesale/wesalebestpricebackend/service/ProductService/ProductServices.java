package com.wesale.wesalebestpricebackend.service.ProductService;

import com.wesale.wesalebestpricebackend.Repository.CategoryRepo;
import com.wesale.wesalebestpricebackend.Repository.ProductRepo;
import com.wesale.wesalebestpricebackend.model.Category;
import com.wesale.wesalebestpricebackend.model.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServices {

    @Autowired
    ProductRepo productRepo;
    @Autowired
    CategoryRepo cateRepo;
    public List<Products> getAllProducts(){
        return productRepo.findAll();
    }
    public List<Products>getProductsByCategory(String product_id){
        return productRepo.getByCategoryId(product_id);
    }

    public List<Category>getAllCategory(){
        return cateRepo.findAll();
    }

    public Products getProductsById(long productId) throws Exception {
        return productRepo.findById(productId).orElseThrow(() ->new Exception("Product is not found"));
    }
}
