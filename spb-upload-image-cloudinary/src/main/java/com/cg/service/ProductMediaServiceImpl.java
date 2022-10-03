package com.cg.service;


import com.cg.model.ProductMedia;
import com.cg.repository.ProductMediaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class ProductMediaServiceImpl implements ProductMediaService {

    @Autowired
    private ProductMediaRepository productMediaRepository;

    @Override
    public Iterable<ProductMedia> findAll() {
        return productMediaRepository.findAll();
    }

    @Override
    public ProductMedia create(ProductMedia productMedia) {
        return productMediaRepository.save(productMedia);
    }

    @Override
    public void delete(ProductMedia productMedia) {
        productMediaRepository.delete(productMedia);
    }
}
