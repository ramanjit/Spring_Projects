package org.raman.springmvcshoppingcart.dao;

import java.util.List;

import org.raman.springmvcshoppingcart.model.CartInfo;
import org.raman.springmvcshoppingcart.model.OrderDetailInfo;
import org.raman.springmvcshoppingcart.model.OrderInfo;
import org.raman.springmvcshoppingcart.model.PaginationResult;

public interface OrderDAO {
	
	 public void saveOrder(CartInfo cartInfo);
	 
	    public PaginationResult<OrderInfo> listOrderInfo(int page,
	            int maxResult, int maxNavigationPage);
	    
	    public OrderInfo getOrderInfo(String orderId);
	    
	    public List<OrderDetailInfo> listOrderDetailInfos(String orderId);

}
