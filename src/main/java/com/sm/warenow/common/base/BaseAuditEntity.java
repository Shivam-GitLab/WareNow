package com.sm.warenow.common.base;

import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@Getter
@Setter
public abstract class BaseAuditEntity extends BaseEntity {

    private String createdBy;
    private String updatedBy;
}