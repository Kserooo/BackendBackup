package com.ksero.backendkseroapi.ksero.api;

import com.ksero.backendkseroapi.ksero.domain.service.RetailSellerService;
import com.ksero.backendkseroapi.ksero.mapping.RetailSellerMapper;
import com.ksero.backendkseroapi.ksero.resources.retail_seller.CreateRetailSellerResource;
import com.ksero.backendkseroapi.ksero.resources.retail_seller.RetailSellerResource;
import com.ksero.backendkseroapi.ksero.resources.retail_seller.UpdateRetailSellerResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/retail-seller")
public class RetailSellerController {
    private final RetailSellerService retailSellerService;
    private final RetailSellerMapper mapper;

    public RetailSellerController(RetailSellerService retailSellerService, RetailSellerMapper mapper){
        this.retailSellerService = retailSellerService;
        this.mapper = mapper;
    }

    @GetMapping("{retailSellerId}")
    public RetailSellerResource getRetailSellerById(@PathVariable Long retailSellerId){
        return mapper.toResource(retailSellerService.getById(retailSellerId));
    }

    @PostMapping
    public RetailSellerResource createRetailSelle(@RequestBody CreateRetailSellerResource resource){
        return mapper.toResource(retailSellerService.create(mapper.toModel(resource)));
    }

    @PutMapping("{retailSellerId}")
    public RetailSellerResource updateRetailSelle(@PathVariable Long retailSellerId,
                                               @RequestBody UpdateRetailSellerResource resource){
        return mapper.toResource(retailSellerService.update(retailSellerId, mapper.toModel(resource)));
    }

    @DeleteMapping("{retailSellerId}")
    public ResponseEntity<?> deleteRetailSeller(@PathVariable Long retailSellerId){
        return retailSellerService.delete(retailSellerId);
    }
}
