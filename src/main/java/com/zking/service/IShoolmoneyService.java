package com.zking.service;

import com.zking.model.Shooolmoney;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface IShoolmoneyService {

    List<Shooolmoney> list();
}
