package com.geekster.stock.controller;

import com.geekster.stock.model.Stock;
import com.geekster.stock.service.StockService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping(value = "stock")
public class StockController {

    StockService stockService;

    @GetMapping(value = "/type/{stockType}")
    public List<Stock> getStockBaseOnType(@PathVariable String  stockType){
        return stockService.getStockByType(stockType);
    }

    @GetMapping(value = "abovePrice/price/{price}/lowerData/date/{date}")
        public List<Stock> getStockAbovePriceAndLowerDate(@PathVariable Double price , @PathVariable LocalDateTime date){
        return stockService.getStockAbovePriceAndLowerDate(price,date);
    }

    @PostMapping(value = "/")
    public String insertStock(@RequestBody List<Stock> stockList){
        return stockService.addStocks(stockList);
    }

}
