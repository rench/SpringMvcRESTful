SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `userinfo`
-- ----------------------------
DROP TABLE IF EXISTS `userinfo`;
CREATE TABLE `userinfo` (
  `keyid` bigint(20) NOT NULL auto_increment COMMENT '主键',
  `username` varchar(100) default '' COMMENT '用户名',
  `password` varchar(100) default '' COMMENT '密码',
  `sex` tinyint(4) default 0 NOT NULL COMMENT '性别',
  `age` tinyint(4) default 0 NOT NULL COMMENT '年龄',
  `qq` varchar(100) default '' NOT NULL COMMENT 'qq号码',
  `regtime` datetime NOT NULL default '2000-01-01 00:00:00' COMMENT '注册时间',
  `modifytime` timestamp NOT NULL default CURRENT_TIMESTAMP COMMENT '修改时间',
  `isdisable` tinyint(4) default 0 NOT NULL COMMENT '是否禁用,0:启用/1:禁用',
  `isdelete` tinyint(4) default 0 NOT NULL COMMENT '是否删除,0:未删除/1:已删除',
  PRIMARY KEY  ( `keyid`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;