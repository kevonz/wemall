package com.wemall.foundation.domain.query;

import com.wemall.core.query.QueryObject;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

public class GoodsQueryObject extends QueryObject {
    public GoodsQueryObject(String currentPage, ModelAndView mv, String orderBy, String orderType){
        super(currentPage, mv, orderBy, orderType);
    }

    public GoodsQueryObject(String currentPage, Map<String, Object> map, String orderBy, String orderType){
        super(currentPage, map, orderBy, orderType);
    }

    public GoodsQueryObject(){
    }
}




