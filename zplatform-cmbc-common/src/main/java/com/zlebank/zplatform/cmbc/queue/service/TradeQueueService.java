/* 
 * TradeQueueService.java  
 * 
 * version TODO
 *
 * 2016年10月26日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.cmbc.queue.service;

import com.zlebank.zplatform.cmbc.common.bean.CMBCTradeQueueBean;
import com.zlebank.zplatform.cmbc.common.enums.TradeStatFlagEnum;

/**
 * Class Description
 *
 * @author guojia
 * @version
 * @date 2016年10月26日 上午11:03:02
 * @since 
 */
public interface TradeQueueService {

	/**
	 * 将代付交易（未知状态）放入队列（redis）中
	 * @param queueBean
	 */
	public void addInsteadPayQueue(CMBCTradeQueueBean queueBean);
	
	/**
	 * 放入交易队列中
	 * @param txnseqno 交易序列号
	 * @param tradeStatFlagEnum 交易状态枚举
	 */
	public void addTradeQueue(String txnseqno,TradeStatFlagEnum tradeStatFlagEnum);
}
