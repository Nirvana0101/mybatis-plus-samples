package com.momo.demo.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.momo.demo.dao.HistoryDataMapper;
import com.momo.demo.domain.HistoryData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class DataController {
   @Autowired
   private HistoryDataMapper historyDataMapper;

    /**
     * 分页方式一：使用pagehelper进行分页
     * @param page
     * @param size
     * @return
     */
   @RequestMapping("/selectpage")
   List<HistoryData> selectPage(int page, int size){
       PageHelper.startPage(page, size);
       List<HistoryData> historyData = historyDataMapper.selectList(null);
       PageInfo<HistoryData> historyDataPageInfo = new PageInfo<>(historyData);
       return historyDataPageInfo.getList();
    }

    /**
     * 分页方式二：使用mybatisplus自带的分页
     * @param page
     * @param size
     * @return
     */
    @RequestMapping("/selectpage_")
    List<HistoryData> selectPage_(int page, int size){
        Page<HistoryData> dataPage = new Page<>(page, size);
        IPage<HistoryData> historyDataIPage = historyDataMapper.selectPage(dataPage, null);
        return historyDataIPage.getRecords();
    }
}
