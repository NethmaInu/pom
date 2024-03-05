package com.springbootaccadamy.batch8.pos1.DTO.Paginated;

import com.springbootaccadamy.batch8.pos1.DTO.responce.ItemResponceDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PaginatedResponceItemDTO {
    List<ItemResponceDTO> list;
    private long dataCount;
}
