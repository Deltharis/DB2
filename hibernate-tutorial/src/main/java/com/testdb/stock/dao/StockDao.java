package com.testdb.stock.dao;
 
import com.testdb.stock.model.Stock;
 
public interface StockDao {
 
	void save(Stock stock);
	void update(Stock stock);
	void delete(Stock stock);
	Stock findByStockCode(String stockCode);
 
}