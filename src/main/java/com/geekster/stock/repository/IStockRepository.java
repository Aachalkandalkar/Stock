package com.geekster.stock.repository;

import com.geekster.stock.model.Stock;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface IStockRepository extends CrudRepository<Stock, Integer> {


   public List<Stock> findByStockType(String stockType);

   public List<Stock> findByStockPriceGreaterThanAndStockBirthTimeStampLessThan(Double price, LocalDateTime date);
}
