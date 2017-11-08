package com.hlq.mallbase.management.factory;

import com.baomidou.mybatisplus.plugins.Page;
import com.hlq.mallbase.management.facade.dto.page.PageQueryDto;


/**
 * BootStrap Table默认的分页参数创建
 *
 * @author fengshuonan
 * @date 2017-04-05 22:25
 */
public class PageFactory<T> {
    public Page<T> defaultPage(PageQueryDto query) {
        int limit=10;
        int offset=0;
        if(query.getLimit()!=null)
          limit = query.getLimit();
        if(query.getOffset()!=null)
          offset = query.getOffset();
        String sort =query.getOrderByField();
        String order =query.getOrder();
        if(sort==null || "".equals(sort.trim())){
            Page<T> page = new Page<>((offset / limit + 1), limit);
            page.setOpenSort(false);
            return page;
        }else{
            Page<T> page = new Page<>((offset / limit + 1), limit, sort);
            if("asc".equals(order)){
                page.setAsc(true);
            }else{
                page.setAsc(false);
            }
            return page;
        }
	}
}
