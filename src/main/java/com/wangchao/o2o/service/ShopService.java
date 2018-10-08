package com.wangchao.o2o.service;

import com.wangchao.o2o.dto.ShopExecution;
import com.wangchao.o2o.entity.Shop;

import java.io.File;

public interface ShopService {

    ShopExecution addShop(Shop shop, File shopImg);

}
