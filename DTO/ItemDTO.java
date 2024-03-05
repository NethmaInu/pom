package com.springbootaccadamy.batch8.pos1.DTO;

import com.springbootaccadamy.batch8.pos1.entity.Enumation.MeashringUnitType;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ItemDTO {

    private String itemName;

    private MeashringUnitType measharingUnitType;

    private double balanceQTY;

    private double supplerprice;

    private double sellingPrice;

}
