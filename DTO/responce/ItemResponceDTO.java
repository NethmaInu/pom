package com.springbootaccadamy.batch8.pos1.DTO.responce;

import com.springbootaccadamy.batch8.pos1.entity.Enumation.MeashringUnitType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ItemResponceDTO {
    private int itemId;

    private String itemName;


    private double balanceQTY;

    private double supplerprice;

    private double sellingPrice;

    private boolean aciveState;
}
