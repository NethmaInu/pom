package com.springbootaccadamy.batch8.pos1.utill.mappers;

import com.springbootaccadamy.batch8.pos1.DTO.ItemDTO;
import com.springbootaccadamy.batch8.pos1.DTO.request.ItemUpdateDTO;
import com.springbootaccadamy.batch8.pos1.DTO.responce.ItemResponceDTO;
import com.springbootaccadamy.batch8.pos1.entity.Item;
import org.mapstruct.Mapper;
import org.springframework.data.domain.Page;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ItemMapper {
    List<ItemDTO> entityListToDtoList(List<Item> items);

    List<ItemResponceDTO> ListDtoToPage(Page<Item> items);
}
