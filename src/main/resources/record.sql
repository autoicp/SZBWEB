# Host: localhost  (Version: 5.5.15)
# Date: 2017-12-01 22:55:20
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
