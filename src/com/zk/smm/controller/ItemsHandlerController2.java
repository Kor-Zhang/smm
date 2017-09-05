package com.zk.smm.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zk.smm.bean.Items;

/**
 * Title:ItemsHandlerController2
 * <p>
 * Description:实现注解controller
 * <p>
 * @author Kor_Zhang
 * @date 2017年9月5日 上午10:10:59
 * @version 1.0
 */
//标志其是一个控制器
@Controller
public class ItemsHandlerController2 {

	//查询商品列表
	//一般和方法名同名,方便维护
	//action可加可不加
	@RequestMapping("/selectItems2")
	public ModelAndView selectItems(){
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

		ModelAndView mav = new ModelAndView();
		//指定数据
		mav.addObject("items",items);
		//指定视图
		/*视图解析器配置了prefix和suffix*/
		mav.setViewName("items/itemsList");
		
		
		return mav;

	}
	

	

}
