package com.tia102g2.drinkOrder.model;

import java.util.List;

public interface DrinkOrderDAO_interface {
	public void insert(DrinkOrderVO drinkOrderVO);
	public void update(DrinkOrderVO drinkOrderVO);
	
	//searchByOneParame
	public DrinkOrderVO findByDrinkOrderID(Integer drinkOrderID);
	public List<DrinkOrderVO> findByDrinkOrderStatus(Integer drinkOrderStatus);	
	public List<DrinkOrderVO> findByUserID(Integer userID);
	public List<DrinkOrderVO> findByStoreID(Integer storeID);
	public List<DrinkOrderVO> getAll();
	//之後想再用getAll之方法，把資料放入Redis，再去做後續的search 
	
//	public List<DrinkOrderVO> findByDrinkStatusAndUserID(Integer drinkOrderStatus, Integer userID);
//	public List<DrinkOrderVO> findBYDrinkStatusAndStoreID(Integer drinkOrderStatus, Integer storeID);
	//搜尋到的未完成status傳入redis 再從該Redis裡的資料進行未完成狀態資料的後續查詢
	
}
