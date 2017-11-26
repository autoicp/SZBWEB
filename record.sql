# Host: localhost  (Version: 5.5.15)
# Date: 2017-11-26 08:18:08
# Generator: MySQL-Front 5.3  (Build 4.38)

/*!40101 SET NAMES utf8 */;

#
# Structure for table "record"
#

CREATE TABLE `record` (
  `Id` varchar(40) NOT NULL DEFAULT '' COMMENT '账单ID',
  `floatNum` varchar(40) DEFAULT NULL COMMENT '账单流水号',
  `hostChatId` varchar(30) DEFAULT NULL COMMENT '商家ID',
  `productName` varchar(40) DEFAULT NULL COMMENT '商品名称',
  `productCounts` varchar(6) DEFAULT NULL COMMENT '商品数量',
  `productAmount` varchar(10) DEFAULT NULL COMMENT '商品总金额',
  `occurTime` timestamp NULL DEFAULT NULL COMMENT '账目发生时间',
  `duePayDate` date DEFAULT NULL COMMENT '应还款日',
  `payoutTime` timestamp NULL DEFAULT NULL COMMENT '还款时间',
  `custChatId` varchar(30) DEFAULT NULL COMMENT '客户chatID',
  `paymentStatus` varchar(1) DEFAULT '0' COMMENT '还款状态(0:未还；1:已还)',
  `checkStatus` varchar(2) DEFAULT '0' COMMENT '客户确认状态(0:未确认；1:已确认)',
  `checkTime` timestamp NULL DEFAULT NULL COMMENT '订单确认时间',
  `hostUuid` varchar(255) DEFAULT NULL COMMENT '商家UUID',
  `custUuid` varchar(255) DEFAULT NULL COMMENT '客户UUID',
  PRIMARY KEY (`Id`),
  KEY `customer_chat_id` (`custChatId`) COMMENT '按买家查找',
  KEY `host_chat_id` (`hostChatId`) COMMENT '按商家查找'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='账单';

#
# Data for table "record"
#

INSERT INTO `record` VALUES ('5b352370-d1ec-11e7-8d04-e8039a352be6',NULL,NULL,'thinkpad','2','4900.00','2017-11-25 14:24:33','2017-01-29',NULL,NULL,NULL,NULL,NULL,NULL,NULL),('b92e75eb-d1ee-11e7-8d04-e8039a352be6',NULL,NULL,'lenovel','3','5400.00','2017-11-25 14:41:29','2017-10-25',NULL,NULL,NULL,NULL,NULL,NULL,NULL),('e8350972-d23e-11e7-8d04-e8039a352be6',NULL,NULL,'史丹利','3','300.00','2017-11-26 00:15:28','2017-10-01',NULL,NULL,NULL,NULL,NULL,NULL,NULL);
