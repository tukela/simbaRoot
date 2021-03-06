package com.simba.sigar.jobs;

import java.net.UnknownHostException;

import org.hyperic.sigar.SigarException;

import com.simba.framework.util.ApplicationContextUtil;
import com.simba.sigar.service.CapabilityService;

/**
 * 收集性能数据的定时任务(具体执行时间由定时任务管理界面设置)
 * 
 * @author caozj
 *
 */
public class CollectDataJob {

  public void collectData() throws UnknownHostException, SigarException {
    CapabilityService capbilityService = ApplicationContextUtil.getBean(CapabilityService.class);
    capbilityService.collectData();
  }

}
