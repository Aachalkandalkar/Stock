package com.geekster.stock.service;

import com.geekster.stock.model.Stock;
import com.geekster.stock.repository.IStockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class StockService {

    @Autowired
    IStockRepository stockRepo;

    //custome finder
    public List<Stock> getStockByType(String stockType) {
        return stockRepo.findByStockType(stockType);
    }

    //implicit method in crudRepo
    public String addStocks(List<Stock> stockList) {
         Iterable<Stock> list = stockRepo.saveAll(stockList);
         if(list != null){
             return "Added list of Stocks....!!!";
         }else{
             return "Could not added";
         }
    }

    public List<Stock> getStockAbovePriceAndLowerDate(Double price, LocalDateTime date) {
     return stockRepo.findByStockPriceGreaterThanAndStockBirthTimeStampLessThan(price , date);
    }
}
