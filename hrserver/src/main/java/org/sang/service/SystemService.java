package org.sang.service;

import org.sang.mapper.SystemMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by sang on 2017/12/29.
 */
@Service
@Transactional
public class SystemService {
    @Resource
    SystemMapper systemMapper;

}
