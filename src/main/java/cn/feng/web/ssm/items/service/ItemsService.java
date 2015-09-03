package cn.feng.web.ssm.items.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cn.feng.web.ssm.items.po.ItemsCustom;
import cn.feng.web.ssm.items.po.ItemsVo;

public interface ItemsService {
	public List<ItemsCustom> findItemsList(ItemsVo itemsVo) throws Exception;

}
