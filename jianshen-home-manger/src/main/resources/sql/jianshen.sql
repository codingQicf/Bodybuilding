/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50173
Source Host           : 127.0.0.1:3306
Source Database       : jianshen

Target Server Type    : MYSQL
Target Server Version : 50173
File Encoding         : 65001

Date: 2019-01-28 22:14:17
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for hibernate_sequence
-- ----------------------------
DROP TABLE IF EXISTS `hibernate_sequence`;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of hibernate_sequence
-- ----------------------------
INSERT INTO `hibernate_sequence` VALUES ('1');

-- ----------------------------
-- Table structure for t_ban
-- ----------------------------
DROP TABLE IF EXISTS `t_ban`;
CREATE TABLE `t_ban` (
  `id` int(11) NOT NULL,
  `btitle` varchar(255) DEFAULT NULL COMMENT '留言标题(缺省字段，暂时不用，用content)',
  `bcontent` varchar(255) DEFAULT NULL COMMENT '留言内容',
  `uid` int(11) DEFAULT NULL COMMENT '评论用户id',
  `puid` int(11) DEFAULT NULL COMMENT '父用户id',
  `btime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_ban
-- ----------------------------

-- ----------------------------
-- Table structure for t_hello
-- ----------------------------
DROP TABLE IF EXISTS `t_hello`;
CREATE TABLE `t_hello` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_hello
-- ----------------------------
INSERT INTO `t_hello` VALUES ('1', 'das');
INSERT INTO `t_hello` VALUES ('2', 'fdsf');

-- ----------------------------
-- Table structure for t_js
-- ----------------------------
DROP TABLE IF EXISTS `t_js`;
CREATE TABLE `t_js` (
  `id` int(11) NOT NULL,
  `jstitle` varchar(255) DEFAULT NULL COMMENT '健身方案标题',
  `jscontent` varchar(255) DEFAULT NULL COMMENT '健身内容',
  `jsimg` varchar(255) DEFAULT NULL COMMENT '健身图片',
  `jstime` datetime DEFAULT NULL COMMENT '健身方案创建时间',
  `jsuid` int(11) DEFAULT NULL COMMENT '那个健身教练的健身方案(user表)',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_js
-- ----------------------------

-- ----------------------------
-- Table structure for t_news
-- ----------------------------
DROP TABLE IF EXISTS `t_news`;
CREATE TABLE `t_news` (
  `id` int(11) NOT NULL,
  `ntitle` varchar(255) DEFAULT NULL COMMENT '资讯标题',
  `ncontent` varchar(255) DEFAULT NULL COMMENT '资讯内容',
  `ntime` datetime DEFAULT NULL COMMENT '资讯创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_news
-- ----------------------------

-- ----------------------------
-- Table structure for t_project
-- ----------------------------
DROP TABLE IF EXISTS `t_project`;
CREATE TABLE `t_project` (
  `id` int(11) NOT NULL,
  `pname` varchar(255) DEFAULT NULL COMMENT '项目名称',
  `ptype` varchar(255) DEFAULT NULL COMMENT '项目分类',
  `pcomment` varchar(255) DEFAULT NULL COMMENT '项目评价（一个项目2个评价，那就是2条数据，查询项目列表时注意group下）',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_project
-- ----------------------------

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` int(11) NOT NULL,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `isJs` int(11) DEFAULT '0' COMMENT '是否是健身教练(1是，0不是)',
  `isPm` int(11) DEFAULT '0' COMMENT '是否是管理员(1是 0不是)',
  `nickname` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `sex` varchar(255) DEFAULT NULL COMMENT '男，女 字符串表示',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
