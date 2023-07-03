package com.solid.controller;

import com.solid.services.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PedidoController {
    @GetMapping("/pedido/{orden}/{dia}")
    public ResponseEntity<String> login(@PathVariable String orden,@PathVariable String dia) {

        try {
            return new ResponseEntity<>(OrderService.getInstance().getPedirPizza(orden,orden).toString(), HttpStatus.OK);
        }catch (Exception ex)
        {
            return new ResponseEntity<>("Error ", HttpStatus.BAD_REQUEST);
        }

    }

}
