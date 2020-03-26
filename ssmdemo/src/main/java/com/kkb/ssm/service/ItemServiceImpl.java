package com.kkb.ssm.service;

import java.util.List;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kkb.ssm.mapper.ItemMapper;
import com.kkb.ssm.po.Item;
import com.kkb.ssm.po.ItemExample;

@Service
public class ItemServiceImpl implements ItemService {

    Logger log = Logger.getLogger(ItemServiceImpl.class);

	@Autowired
	private ItemMapper mapper;
	
	@Override
	public List<Item> queryItemList() {
		ItemExample example = new ItemExample();

        PageHelper.startPage(2, 2);
		List<Item> list = mapper.selectByExample(example );
        PageInfo<Item> page = new PageInfo(list);

        log.info("page info : " + page);

		return list;
	}

}
