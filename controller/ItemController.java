package com.springbootaccadamy.batch8.pos1.controller;

import com.springbootaccadamy.batch8.pos1.DTO.ItemDTO;
import com.springbootaccadamy.batch8.pos1.DTO.Paginated.PaginatedResponceItemDTO;
import com.springbootaccadamy.batch8.pos1.DTO.request.CustomerUpdateDTO;
import com.springbootaccadamy.batch8.pos1.DTO.request.ItemUpdateDTO;
import com.springbootaccadamy.batch8.pos1.DTO.responce.ItemResponceDTO;
import com.springbootaccadamy.batch8.pos1.service.ItemService;
import com.springbootaccadamy.batch8.pos1.utill.StandedResponce;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/item")
@CrossOrigin
public class ItemController {
    @Autowired
//    private ItemService itemService;
//    @PostMapping("/save")
//    public String saveItem(@RequestBody ItemDTO itemdto){
//
//        String massage=itemService.SaveItem(itemdto);
//        return massage;
//    }
    private ItemService itemService;
    @PostMapping("/save")
    public ResponseEntity<StandedResponce> saveItem(@RequestBody ItemDTO itemdto){

        String massage=itemService.SaveItem(itemdto);
        ResponseEntity<StandedResponce> responseEntity= new ResponseEntity<StandedResponce>(
                new StandedResponce(200,"Sucess",massage), HttpStatus.CREATED);

        return responseEntity;
    }
@GetMapping(path = "/get-by-name",
        params = "name"
)
    public ResponseEntity<StandedResponce> getcustomerbynamewithmapstuct(@RequestParam(value = "name")String itemName){
        List<ItemDTO> responceDTOS=itemService.getItemByNameWithMapsStruct(itemName);
        return  new ResponseEntity<>(new StandedResponce(200,"sucess",responceDTOS),HttpStatus.CREATED);
}
@GetMapping(path ="/get-by-name-using-maps",
params = "name" )
public List<ItemResponceDTO> getcustomerbyname(@RequestParam(value = "name")String itemName) {
    List<ItemResponceDTO> responceDTOS = itemService.getItemName(itemName);
    return responceDTOS;
}
    @PutMapping("/update")
    public String updateItem(@RequestBody ItemUpdateDTO itemUpdateDTO){
        String item=itemService.UpdateItem(itemUpdateDTO);

        return item;
    }
    @GetMapping(
            path = "/get-by-id",
            params = "id"
    )
    public ItemResponceDTO getItembyId(@RequestParam(value = "id")int itemId){
        ItemResponceDTO responceDTO=itemService.getItemById(itemId);
        return responceDTO;
    }
    @SneakyThrows
    @GetMapping(
            path = "/get-by-states",
            params = {"status","pageNo","size"}
    )
    public ResponseEntity<StandedResponce> getItembyStatus(
            @RequestParam(value = "status")boolean status,
            @RequestParam(value = "pageNo")int Number,
            @RequestParam(value = "size")int size

    ){
        //List<ItemResponceDTO> responceDTOS=itemService.getItemBystatus(status);
        PaginatedResponceItemDTO itemDTO=itemService.getItemByActiveStatusWithPagination(status,Number,size);
        return new ResponseEntity<StandedResponce>(new StandedResponce(200,"Sucess",itemDTO),HttpStatus.ACCEPTED);
    }

@GetMapping(
        path = "/get-all-Items"
)
    public List<ItemResponceDTO> getAllCustomers(){
        List<ItemResponceDTO>  responceDTOS=itemService.getAllItems();
        return responceDTOS;
}
@DeleteMapping(
        path = "/delete-by-Id",
        params = "id"
)
    public String DeleteById(@RequestParam(value = "Id")int itemId){

        String massage=itemService.DeleteById(itemId);
        return massage;
}
}

