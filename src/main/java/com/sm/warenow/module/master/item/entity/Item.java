package com.sm.warenow.module.master.item.entity;

import com.sm.warenow.common.base.BaseAuditEntity;
import com.sm.warenow.common.enums.ItemStatus;
import com.sm.warenow.common.enums.TrackingType;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "items")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Item extends BaseAuditEntity {

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String sku;

    private String description;

    @Enumerated(EnumType.STRING)
    private TrackingType trackingType;

    @Enumerated(EnumType.STRING)
    private ItemStatus status;

    private String baseUom;

    private Double weight;
    private Double length;
    private Double width;
    private Double height;

    private Integer minStock;
    private Integer maxStock;
    private Integer reorderLevel;

    private Boolean isFragile;
    private Boolean isPerishable;
}