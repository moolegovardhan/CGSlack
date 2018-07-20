package com.cgs.pro94tek.healthcare.dataaccess.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;
import com.cgs.pro94tek.healthcare.bean.CgsStock;

public interface ICgsStockDAO {
	public CgsStock createCgsStock(CgsStock cgsStockEntity) throws DataAccessException;
	public CgsStock createOrUpdatecreateCgsStock(CgsStock cgsStockEntity)throws DataAccessException;
	public List<CgsStock> createCgsStock(List<CgsStock> cgsStockEntitys)throws DataAccessException;
	public List<String> fetchAllCgsStock() throws DataAccessException;
	public List<CgsStock> fetchAllCgsStockByorderNO(String orderNO)throws DataAccessException;
	public boolean deleteCgsStockById(Long orderNO) throws DataAccessException; 
	public CgsStock createOrUpdatePurchageAamount(Long id,Long totalAmount)throws DataAccessException;
	public CgsStock getCgsStockId(Long orderNO)throws DataAccessException; 
	public CgsStock getCgsStockStoreId(String orderNO)throws DataAccessException;
	public List<CgsStock> getStockStatusTracking(String orderNO)throws DataAccessException;
}
