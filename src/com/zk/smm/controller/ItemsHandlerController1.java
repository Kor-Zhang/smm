package com.zk.smm.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.HttpRequestHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.zk.smm.bean.Items;

/**
 * Title:ItemsHandlerController1
 * <p>
 * Description:实现controller业务的接口
 * <p>
 * @author Kor_Zhang
 * @date 2017年9月5日 上午10:10:59
 * @version 1.0
 */
public class ItemsHandlerController1 implements HttpRequestHandler{

	@Override
	public void handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		/**
		 * 模拟处理数据
		 */
		List<Items> items = new ArrayList<Items>();
		int index = 0;
		Items it;
		while(index++ < 10){
			it = new Items();
			it.setDescription(""+index);
			it.setId(""+index);
			it.setName(""+index);
			it.setOrderDetails(null);
			it.setPrice(Double.valueOf(index));
			it.setQuantity(index);
			items.add(it);
		}
		
		//填充数据
		request.setAttribute("items",items);
		//转发
		/*视图解析器配置了prefix和suffix*/
		request.getRequestDispatcher("items/itemsList").forward(request, response);
		
		
	}

	

}
