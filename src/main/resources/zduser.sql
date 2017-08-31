/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1_3306
Source Server Version : 50024
Source Host           : 127.0.0.1:3306
Source Database       : mybatis

Target Server Type    : MYSQL
Target Server Version : 50024
File Encoding         : 65001

Date: 2017-08-30 16:49:08
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `zduser`
-- ----------------------------
DROP TABLE IF EXISTS `zduser`;
CREATE TABLE `zduser` (
  `UserName` varchar(200) NOT NULL,
  `RealName` varchar(1000) default NULL,
  `Password` varchar(100) NOT NULL,
  `BranchInnerCode` varchar(100) NOT NULL,
  `IsBranchAdmin` varchar(2) NOT NULL,
  `Status` varchar(50) NOT NULL,
  `Type` varchar(2) default NULL,
  `Email` varchar(100) default NULL,
  `Tel` varchar(20) default NULL,
  `Mobile` varchar(50) default NULL,
  `LastLoginTime` datetime default NULL,
  `LastLoginIP` varchar(50) default NULL,
  `Prop1` varchar(50) default NULL,
  `Prop2` varchar(50) default NULL,
  `Prop6` varchar(50) default NULL,
  `Prop5` varchar(50) default NULL,
  `Prop4` varchar(100) default NULL,
  `Prop3` varchar(100) default NULL,
  `Memo` varchar(100) default NULL,
  `AddTime` datetime NOT NULL,
  `AddUser` varchar(200) NOT NULL,
  `ModifyTime` datetime default NULL,
  `ModifyUser` varchar(200) default NULL,
  `LoginErrorCount` bigint(20) default NULL,
  `LoginErrorTime` datetime default NULL,
  `ModifyPassStatus` varchar(200) default NULL,
  `ForbiddenLoginTime` datetime default NULL,
  `LastModifyPassTime` datetime default NULL,
  PRIMARY KEY  (`UserName`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of zduser
-- ----------------------------
INSERT INTO `zduser` VALUES ('admin', '系统管理员', '30c810428998a2618258bf27802e12d1d408d0b35e508c70', '0001', 'Y', 'Y', '', 'admin@zving.com', '', '', '2017-08-09 10:22:13', '0:0:0:0:0:0:0:1', '', '', '', '', '', '', '', '2010-08-24 18:59:37', 'admin', '2013-11-19 14:34:27', 'admin', '0', null, null, null, null);
INSERT INTO `zduser` VALUES ('audit', '审核', '30c810428998a2618258bf27802e12d1d408d0b35e508c70', '000100210011', 'N', 'Y', '', 'audit@zving.com', '', '', '2017-05-03 14:40:28', '0:0:0:0:0:0:0:1', '', '', '', '', '', '', '', '2012-03-13 11:37:01', 'admin', '2013-11-19 14:34:16', 'admin', '0', null, null, null, null);
INSERT INTO `zduser` VALUES ('edit', '编辑', '30c810428998a2618258bf27802e12d1d408d0b35e508c70', '000100210011', 'N', 'Y', '', 'edit@zving.com', '', '', '2013-11-25 16:12:46', '127.0.0.1', '', '', '', '', '', '', '', '2012-03-13 11:18:55', 'admin', '2013-11-22 11:34:19', 'admin', null, null, null, null, null);
