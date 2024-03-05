package com.springbootaccadamy.batch8.pos1.entity;

import com.springbootaccadamy.batch8.pos1.entity.Enumation.MeashringUnitType;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "item")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Item {
    @Id
    @Column(name = "item_id", length = 50)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int itemId;
    @Column(name = "item_name")
    private String itemName;
    @Enumerated(EnumType.STRING)
    @Column(name = "measer_type", length = 100)
    private MeashringUnitType measharingUnitType;
    @Column(name = "balance_qty")
    private double balanceQTY;
    @Column(name = "suppler_price")
    private double supplerprice;
    @Column(name = "selling_price")
    private double sellingPrice;
    @Column(name = "active_state", columnDefinition = "TINYINT default 1")
    private boolean aciveState;


}
