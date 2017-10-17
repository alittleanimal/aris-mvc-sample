package com.accenture.aris.inventory.business.service.impl;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accenture.aris.core.support.ServiceResult;
import com.accenture.aris.core.support.message.Messages;
import com.accenture.aris.core.support.pagination.Pagination;
import com.accenture.aris.core.support.pagination.PaginationUtils;
import com.accenture.aris.inventory.business.entity.StockInfoEntity;
import com.accenture.aris.inventory.business.repository.StockRepository;
import com.accenture.aris.inventory.business.service.StockService;

@Service
public class StockServiceImpl implements StockService {
	private static final long serialVersionUID = 4775138227367404038L;

	@Autowired
	private Messages messages;

	@Autowired
	private StockRepository stockRepository;

	@Override
	public ServiceResult<Void> searchStockInfoService(StockInfoEntity entity,
			int page) {
		if(entity == null){
			entity = new StockInfoEntity();
		}
		int recordCount = stockRepository.countByStockInfoEntity(entity);
		int disp = 5;
		int offset = (page -1)*disp;

		List<StockInfoEntity> stocks = stockRepository.selectByStockInfoEntity(entity, new RowBounds(offset,disp));
		List<Pagination> pages = PaginationUtils.pagination(recordCount, page, disp);
		ServiceResult<Void> result = new ServiceResult<Void>();
		result.setAttribute("stocks", stocks);
		result.setAttribute("pages", pages);
		return result;
	}

}
