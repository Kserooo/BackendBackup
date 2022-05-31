package com.ksero.backendkseroapi.ksero.domain.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@With
@Entity
@Table(name = "wholesaler_order")
public class WholesalerOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @NotBlank
    private String name;

    @NotNull
    @NotBlank
    @Positive
    private Long quantity;

    // Relationships

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "retail_seller_id",nullable = false)
    @JsonIgnore
    private RetailSeller retailSeller;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", nullable = false)
    @JsonIgnore
    private Product product;

}
