package cn.feng.web.ssm.items.mapper;

import java.util.List;

import cn.feng.web.ssm.items.po.ItemsCustom;
import cn.feng.web.ssm.items.po.ItemsVo;

public interface ItemsMapper {

  public  List<ItemsCustom> findItemsList(ItemsVo itemsVo)throws Exception;


}