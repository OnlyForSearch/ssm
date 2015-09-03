package cn.feng.web.ssm.items.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.feng.web.ssm.items.mapper.ItemsMapper;
import cn.feng.web.ssm.items.po.ItemsCustom;
import cn.feng.web.ssm.items.po.ItemsVo;
import cn.feng.web.ssm.items.service.ItemsService;
@Service("itemsService")
public class ItemsServiceImpl implements ItemsService {

	@Resource
	private ItemsMapper itemsMapper;
	
	public List<ItemsCustom> findItemsList(ItemsVo itemsVo) throws Exception {
		List<ItemsCustom> list = itemsMapper.findItemsList(itemsVo);
		return list;
	}

}
