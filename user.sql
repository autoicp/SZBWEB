# Host: localhost  (Version: 5.5.15)
# Date: 2017-11-26 08:18:26
# Generator: MySQL-Front 5.3  (Build 4.38)

/*!40101 SET NAMES utf8 */;

#
# Structure for table "user"
#

CREATE TABLE `user` (
  `Id` varchar(40) NOT NULL DEFAULT '',
  `userName` varchar(30) DEFAULT NULL COMMENT '姓名',
  `telephone` varchar(11) DEFAULT NULL COMMENT '手机号',
  `shopAddress` varchar(255) DEFAULT NULL COMMENT '公司或店铺名称',
  `homeAddress` varchar(255) DEFAULT NULL COMMENT '家庭住址',
  `userType` varchar(2) DEFAULT NULL COMMENT '用户类型（店铺/商家）',
  `chatId` varchar(255) DEFAULT NULL COMMENT '微信号',
  `shopName` varchar(255) DEFAULT NULL COMMENT '店铺或公司名称',
  `qrCodeAddress` varchar(255) DEFAULT NULL COMMENT '二维码地址（存储路径）',
  `headPortraitAddress` varchar(255) DEFAULT NULL COMMENT '头像地址',
  `nickName` varchar(255) DEFAULT NULL COMMENT '昵称',
  `registTime` timestamp NULL DEFAULT NULL COMMENT '注册时间',
  `changeTime` timestamp NULL DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`Id`),
  KEY `chat_id` (`chatId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';

#
# Data for table "user"
#

INSERT INTO `user` VALUES ('0bd6cbe2-d1ec-11e7-8d04-e8039a352be6','秦健峰','15600454998','丰台路口',NULL,NULL,NULL,'高伟达',NULL,NULL,NULL,'2017-11-25 14:22:19',NULL);
