package com.tale.master.service.impl;

import com.blade.ioc.annotation.Inject;
import com.blade.ioc.annotation.Service;
import com.blade.jdbc.ActiveRecord;
import com.blade.kit.DateKit;
import com.tale.master.model.Logs;
import com.tale.master.service.LogService;

import java.util.List;

/**
 * Created by biezhi on 2017/2/26.
 */
@Service
public class LogServiceImpl implements LogService {

    @Inject
    private ActiveRecord activeRecord;

    @Override
    public void save(String action, String data, String ip, Integer author_id) {
        Logs logs = new Logs();
        logs.setAction(action);
        logs.setData(data);
        logs.setIp(ip);
        logs.setAuthor_id(author_id);
        logs.setCreated(DateKit.getCurrentUnixTime());
        activeRecord.insert(logs);
    }

    @Override
    public List<Logs> getLogs(int page, int limit) {
//        if (page <= 0) {
//            page = 1;
//        }
//
//        if (limit < 1 || limit > TaleConst.MAX_POSTS) {
//            limit = 10;
//        }
//       // TLogsExample.Criteria criteria = example.createCriteria();
//        //int total = tLogsReadDao.countByExample(example);
//        List<TLogs> lists = tLogsReadDao.selectByExample(example);
//        List<Logs> results = new ArrayList<>();
//        for (TLogs logs : lists) {
//            Logs log = new Logs();
//            BeanUtils.copyProperties(logs, log);
//            results.add(log);
//        }
//        Paginator<Logs> logsPaginator = new Paginator((long)total, page, limit);
//        return results;
        return null;
    }
}
