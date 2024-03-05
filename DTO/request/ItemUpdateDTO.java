package com.springbootaccadamy.batch8.pos1.DTO.request;

import com.springbootaccadamy.batch8.pos1.entity.Enumation.MeashringUnitType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ItemUpdateDTO {
    private int itemId;
    private String itemName;

    private MeashringUnitType measharingUnitType;

    private double balanceQTY;

    private double supplerprice;

    private double sellingPrice;

}
