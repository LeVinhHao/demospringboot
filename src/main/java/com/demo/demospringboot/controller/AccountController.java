package com.demo.demospringboot.controller;

import com.demo.demospringboot.models.AccountModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account")
public class AccountController {
    @GetMapping("/{id}/{custumerName}")
    public ResponseEntity<?> index(@PathVariable int id,
                                   @PathVariable("custumerName") String custumer,
                                   @RequestParam String address
                                   ){

        return new ResponseEntity<>("Hello RESTful API" + id + custumer + address, HttpStatus.OK);
    }



    @PostMapping("/{id}")
    public ResponseEntity<?> InsertAccount(
            @PathVariable int id,
            @RequestBody AccountModel accountModel
    ){
//        AccountModel accountModel = new AccountModel();
//        accountModel.setId(id);
//        accountModel.setCustomerName("Hao");
//        accountModel.setAge(21);


        return  new ResponseEntity<>(accountModel,HttpStatus.OK);
    }
}
