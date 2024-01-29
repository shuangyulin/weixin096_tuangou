/*
SQLyog Ultimate v11.3 (64 bit)
MySQL - 5.7.32-log : Database - ssm641l4
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`ssm641l4` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `ssm641l4`;

/*Table structure for table `address` */

DROP TABLE IF EXISTS `address`;

CREATE TABLE `address` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `address` varchar(200) NOT NULL COMMENT '地址',
  `name` varchar(200) NOT NULL COMMENT '收货人',
  `phone` varchar(200) NOT NULL COMMENT '电话',
  `isdefault` varchar(200) NOT NULL COMMENT '是否默认地址[是/否]',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='地址';

/*Data for the table `address` */

insert  into `address`(`id`,`addtime`,`userid`,`address`,`name`,`phone`,`isdefault`) values (1,'2021-04-03 16:44:40',1,'宇宙银河系金星1号','金某','13823888881','是'),(2,'2021-04-03 16:44:40',2,'宇宙银河系木星1号','木某','13823888882','是'),(3,'2021-04-03 16:44:40',3,'宇宙银河系水星1号','水某','13823888883','是'),(4,'2021-04-03 16:44:40',4,'宇宙银河系火星1号','火某','13823888884','是'),(5,'2021-04-03 16:44:40',5,'宇宙银河系土星1号','土某','13823888885','是'),(6,'2021-04-03 16:44:40',6,'宇宙银河系月球1号','月某','13823888886','是');

/*Table structure for table `cart` */

DROP TABLE IF EXISTS `cart`;

CREATE TABLE `cart` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `tablename` varchar(200) DEFAULT 'shangpinxinxi' COMMENT '商品表名',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `goodid` bigint(20) NOT NULL COMMENT '商品id',
  `goodname` varchar(200) DEFAULT NULL COMMENT '商品名称',
  `picture` varchar(200) DEFAULT NULL COMMENT '图片',
  `buynumber` int(11) NOT NULL COMMENT '购买数量',
  `price` float DEFAULT NULL COMMENT '单价',
  `discountprice` float DEFAULT NULL COMMENT '会员价',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='购物车表';

/*Data for the table `cart` */

/*Table structure for table `config` */

DROP TABLE IF EXISTS `config`;

CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='配置文件';

/*Data for the table `config` */

insert  into `config`(`id`,`name`,`value`) values (1,'picture1','http://localhost:8080/ssm641l4/upload/picture1.jpg'),(2,'picture2','http://localhost:8080/ssm641l4/upload/picture2.jpg'),(3,'picture3','http://localhost:8080/ssm641l4/upload/picture3.jpg'),(6,'homepage',NULL);

/*Table structure for table `goumaidingdan` */

DROP TABLE IF EXISTS `goumaidingdan`;

CREATE TABLE `goumaidingdan` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `dingdanhao` varchar(200) DEFAULT NULL COMMENT '订单号',
  `shangpinmingcheng` varchar(200) DEFAULT NULL COMMENT '商品名称',
  `shangpintupian` varchar(200) DEFAULT NULL COMMENT '商品图片',
  `shangpinxianjia` varchar(200) DEFAULT NULL COMMENT '商品现价',
  `goumaishijian` datetime DEFAULT NULL COMMENT '购买时间',
  `huiyuanzhanghao` varchar(200) DEFAULT NULL COMMENT '会员账号',
  `huiyuanxingming` varchar(200) DEFAULT NULL COMMENT '会员姓名',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `ziqushijian` datetime DEFAULT NULL COMMENT '自取时间',
  `ispay` varchar(200) DEFAULT '未支付' COMMENT '是否支付',
  `clicknum` int(11) DEFAULT '0' COMMENT '点击次数',
  `userid` bigint(20) DEFAULT NULL COMMENT '用户id',
  `longitude` float DEFAULT NULL COMMENT '经度',
  `latitude` float DEFAULT NULL COMMENT '纬度',
  `fulladdress` varchar(200) DEFAULT NULL COMMENT '地址',
  PRIMARY KEY (`id`),
  UNIQUE KEY `dingdanhao` (`dingdanhao`)
) ENGINE=InnoDB AUTO_INCREMENT=57 DEFAULT CHARSET=utf8 COMMENT='购买订单';

/*Data for the table `goumaidingdan` */

insert  into `goumaidingdan`(`id`,`addtime`,`dingdanhao`,`shangpinmingcheng`,`shangpintupian`,`shangpinxianjia`,`goumaishijian`,`huiyuanzhanghao`,`huiyuanxingming`,`shouji`,`ziqushijian`,`ispay`,`clicknum`,`userid`,`longitude`,`latitude`,`fulladdress`) values (51,'2021-04-03 16:44:40','订单号1','商品名称1','http://localhost:8080/ssm641l4/upload/goumaidingdan_shangpintupian1.jpg','商品现价1','2021-04-03 16:44:40','会员账号1','会员姓名1','手机1','2021-04-03 16:44:40','未支付',1,1,1,1,'宇宙银河系地球1号'),(52,'2021-04-03 16:44:40','订单号2','商品名称2','http://localhost:8080/ssm641l4/upload/goumaidingdan_shangpintupian2.jpg','商品现价2','2021-04-03 16:44:40','会员账号2','会员姓名2','手机2','2021-04-03 16:44:40','未支付',2,2,2,2,'宇宙银河系地球2号'),(53,'2021-04-03 16:44:40','订单号3','商品名称3','http://localhost:8080/ssm641l4/upload/goumaidingdan_shangpintupian3.jpg','商品现价3','2021-04-03 16:44:40','会员账号3','会员姓名3','手机3','2021-04-03 16:44:40','未支付',3,3,3,3,'宇宙银河系地球3号'),(54,'2021-04-03 16:44:40','订单号4','商品名称4','http://localhost:8080/ssm641l4/upload/goumaidingdan_shangpintupian4.jpg','商品现价4','2021-04-03 16:44:40','会员账号4','会员姓名4','手机4','2021-04-03 16:44:40','未支付',4,4,4,4,'宇宙银河系地球4号'),(55,'2021-04-03 16:44:40','订单号5','商品名称5','http://localhost:8080/ssm641l4/upload/goumaidingdan_shangpintupian5.jpg','商品现价5','2021-04-03 16:44:40','会员账号5','会员姓名5','手机5','2021-04-03 16:44:40','未支付',5,5,5,5,'宇宙银河系地球5号'),(56,'2021-04-03 16:44:40','订单号6','商品名称6','http://localhost:8080/ssm641l4/upload/goumaidingdan_shangpintupian6.jpg','商品现价6','2021-04-03 16:44:40','会员账号6','会员姓名6','手机6','2021-04-03 16:44:40','未支付',6,6,6,6,'宇宙银河系地球6号');

/*Table structure for table `huiyuan` */

DROP TABLE IF EXISTS `huiyuan`;

CREATE TABLE `huiyuan` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `huiyuanzhanghao` varchar(200) NOT NULL COMMENT '会员账号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `huiyuanxingming` varchar(200) DEFAULT NULL COMMENT '会员姓名',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `youxiang` varchar(200) DEFAULT NULL COMMENT '邮箱',
  `shenfenzheng` varchar(200) DEFAULT NULL COMMENT '身份证',
  `touxiang` varchar(200) DEFAULT NULL COMMENT '头像',
  `jifen` float DEFAULT '0' COMMENT '积分',
  `money` float DEFAULT '0' COMMENT '余额',
  PRIMARY KEY (`id`),
  UNIQUE KEY `huiyuanzhanghao` (`huiyuanzhanghao`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8 COMMENT='会员';

/*Data for the table `huiyuan` */

insert  into `huiyuan`(`id`,`addtime`,`huiyuanzhanghao`,`mima`,`huiyuanxingming`,`shouji`,`youxiang`,`shenfenzheng`,`touxiang`,`jifen`,`money`) values (11,'2021-04-03 16:44:40','会员1','123456','会员姓名1','13823888881','773890001@qq.com','440300199101010001','http://localhost:8080/ssm641l4/upload/huiyuan_touxiang1.jpg',10000,100),(12,'2021-04-03 16:44:40','会员2','123456','会员姓名2','13823888882','773890002@qq.com','440300199202020002','http://localhost:8080/ssm641l4/upload/huiyuan_touxiang2.jpg',10000,100),(13,'2021-04-03 16:44:40','会员3','123456','会员姓名3','13823888883','773890003@qq.com','440300199303030003','http://localhost:8080/ssm641l4/upload/huiyuan_touxiang3.jpg',10000,100),(14,'2021-04-03 16:44:40','会员4','123456','会员姓名4','13823888884','773890004@qq.com','440300199404040004','http://localhost:8080/ssm641l4/upload/huiyuan_touxiang4.jpg',10000,100),(15,'2021-04-03 16:44:40','会员5','123456','会员姓名5','13823888885','773890005@qq.com','440300199505050005','http://localhost:8080/ssm641l4/upload/huiyuan_touxiang5.jpg',10000,100),(16,'2021-04-03 16:44:40','会员6','123456','会员姓名6','13823888886','773890006@qq.com','440300199606060006','http://localhost:8080/ssm641l4/upload/huiyuan_touxiang6.jpg',10000,100);

/*Table structure for table `orders` */

DROP TABLE IF EXISTS `orders`;

CREATE TABLE `orders` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `orderid` varchar(200) NOT NULL COMMENT '订单编号',
  `tablename` varchar(200) DEFAULT 'shangpinxinxi' COMMENT '商品表名',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `goodid` bigint(20) NOT NULL COMMENT '商品id',
  `goodname` varchar(200) DEFAULT NULL COMMENT '商品名称',
  `picture` varchar(200) DEFAULT NULL COMMENT '商品图片',
  `buynumber` int(11) NOT NULL COMMENT '购买数量',
  `price` float NOT NULL DEFAULT '0' COMMENT '价格/积分',
  `discountprice` float DEFAULT '0' COMMENT '折扣价格',
  `total` float NOT NULL DEFAULT '0' COMMENT '总价格/总积分',
  `discounttotal` float DEFAULT '0' COMMENT '折扣总价格',
  `type` int(11) DEFAULT '1' COMMENT '支付类型',
  `status` varchar(200) DEFAULT NULL COMMENT '状态',
  `address` varchar(200) DEFAULT NULL COMMENT '地址',
  `tel` varchar(200) DEFAULT NULL COMMENT '电话',
  `consignee` varchar(200) DEFAULT NULL COMMENT '收货人',
  PRIMARY KEY (`id`),
  UNIQUE KEY `orderid` (`orderid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单';

/*Data for the table `orders` */

/*Table structure for table `shangjia` */

DROP TABLE IF EXISTS `shangjia`;

CREATE TABLE `shangjia` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `shangjiazhanghao` varchar(200) DEFAULT NULL COMMENT '商家账号',
  `mima` varchar(200) DEFAULT NULL COMMENT '密码',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `youxiang` varchar(200) DEFAULT NULL COMMENT '邮箱',
  `shenfenzheng` varchar(200) DEFAULT NULL COMMENT '身份证',
  `shangpumingcheng` varchar(200) DEFAULT NULL COMMENT '商铺名称',
  `shangputupian` varchar(200) DEFAULT NULL COMMENT '商铺图片',
  `shangpudizhi` varchar(200) DEFAULT NULL COMMENT '商铺地址',
  `jingyingfanwei` varchar(200) DEFAULT NULL COMMENT '经营范围',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  `jifen` float DEFAULT '0' COMMENT '积分',
  `money` float DEFAULT '0' COMMENT '余额',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8 COMMENT='商家';

/*Data for the table `shangjia` */

insert  into `shangjia`(`id`,`addtime`,`shangjiazhanghao`,`mima`,`xingming`,`shouji`,`youxiang`,`shenfenzheng`,`shangpumingcheng`,`shangputupian`,`shangpudizhi`,`jingyingfanwei`,`sfsh`,`shhf`,`jifen`,`money`) values (21,'2021-04-03 16:44:40','商家1','123456','姓名1','13823888881','773890001@qq.com','440300199101010001','商铺名称1','http://localhost:8080/ssm641l4/upload/shangjia_shangputupian1.jpg','商铺地址1','经营范围1','是','',10000,100),(22,'2021-04-03 16:44:40','商家2','123456','姓名2','13823888882','773890002@qq.com','440300199202020002','商铺名称2','http://localhost:8080/ssm641l4/upload/shangjia_shangputupian2.jpg','商铺地址2','经营范围2','是','',10000,100),(23,'2021-04-03 16:44:40','商家3','123456','姓名3','13823888883','773890003@qq.com','440300199303030003','商铺名称3','http://localhost:8080/ssm641l4/upload/shangjia_shangputupian3.jpg','商铺地址3','经营范围3','是','',10000,100),(24,'2021-04-03 16:44:40','商家4','123456','姓名4','13823888884','773890004@qq.com','440300199404040004','商铺名称4','http://localhost:8080/ssm641l4/upload/shangjia_shangputupian4.jpg','商铺地址4','经营范围4','是','',10000,100),(25,'2021-04-03 16:44:40','商家5','123456','姓名5','13823888885','773890005@qq.com','440300199505050005','商铺名称5','http://localhost:8080/ssm641l4/upload/shangjia_shangputupian5.jpg','商铺地址5','经营范围5','是','',10000,100),(26,'2021-04-03 16:44:40','商家6','123456','姓名6','13823888886','773890006@qq.com','440300199606060006','商铺名称6','http://localhost:8080/ssm641l4/upload/shangjia_shangputupian6.jpg','商铺地址6','经营范围6','是','',10000,100);

/*Table structure for table `shangpinfenlei` */

DROP TABLE IF EXISTS `shangpinfenlei`;

CREATE TABLE `shangpinfenlei` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `shangpinleixing` varchar(200) DEFAULT NULL COMMENT '商品类型',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8 COMMENT='商品分类';

/*Data for the table `shangpinfenlei` */

insert  into `shangpinfenlei`(`id`,`addtime`,`shangpinleixing`) values (41,'2021-04-03 16:44:40','商品类型1'),(42,'2021-04-03 16:44:40','商品类型2'),(43,'2021-04-03 16:44:40','商品类型3'),(44,'2021-04-03 16:44:40','商品类型4'),(45,'2021-04-03 16:44:40','商品类型5'),(46,'2021-04-03 16:44:40','商品类型6');

/*Table structure for table `shangpinpingjia` */

DROP TABLE IF EXISTS `shangpinpingjia`;

CREATE TABLE `shangpinpingjia` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `pinglunbiaoti` varchar(200) DEFAULT NULL COMMENT '评论标题',
  `shangpinmingcheng` varchar(200) DEFAULT NULL COMMENT '商品名称',
  `shangpumingcheng` varchar(200) DEFAULT NULL COMMENT '商铺名称',
  `huiyuanzhanghao` varchar(200) DEFAULT NULL COMMENT '会员账号',
  `huiyuanxingming` varchar(200) DEFAULT NULL COMMENT '会员姓名',
  `shangpinpingjia` longtext COMMENT '商品评价',
  `shangpintupian` varchar(200) DEFAULT NULL COMMENT '商品图片',
  `shangjiahuifu` longtext COMMENT '商家回复',
  `userid` bigint(20) DEFAULT NULL COMMENT '用户id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=77 DEFAULT CHARSET=utf8 COMMENT='商品评价';

/*Data for the table `shangpinpingjia` */

insert  into `shangpinpingjia`(`id`,`addtime`,`pinglunbiaoti`,`shangpinmingcheng`,`shangpumingcheng`,`huiyuanzhanghao`,`huiyuanxingming`,`shangpinpingjia`,`shangpintupian`,`shangjiahuifu`,`userid`) values (71,'2021-04-03 16:44:40','评论标题1','商品名称1','商铺名称1','会员账号1','会员姓名1','商品评价1','http://localhost:8080/ssm641l4/upload/shangpinpingjia_shangpintupian1.jpg','商家回复1',1),(72,'2021-04-03 16:44:40','评论标题2','商品名称2','商铺名称2','会员账号2','会员姓名2','商品评价2','http://localhost:8080/ssm641l4/upload/shangpinpingjia_shangpintupian2.jpg','商家回复2',2),(73,'2021-04-03 16:44:40','评论标题3','商品名称3','商铺名称3','会员账号3','会员姓名3','商品评价3','http://localhost:8080/ssm641l4/upload/shangpinpingjia_shangpintupian3.jpg','商家回复3',3),(74,'2021-04-03 16:44:40','评论标题4','商品名称4','商铺名称4','会员账号4','会员姓名4','商品评价4','http://localhost:8080/ssm641l4/upload/shangpinpingjia_shangpintupian4.jpg','商家回复4',4),(75,'2021-04-03 16:44:40','评论标题5','商品名称5','商铺名称5','会员账号5','会员姓名5','商品评价5','http://localhost:8080/ssm641l4/upload/shangpinpingjia_shangpintupian5.jpg','商家回复5',5),(76,'2021-04-03 16:44:40','评论标题6','商品名称6','商铺名称6','会员账号6','会员姓名6','商品评价6','http://localhost:8080/ssm641l4/upload/shangpinpingjia_shangpintupian6.jpg','商家回复6',6);

/*Table structure for table `shangpinxinxi` */

DROP TABLE IF EXISTS `shangpinxinxi`;

CREATE TABLE `shangpinxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `shangpinmingcheng` varchar(200) DEFAULT NULL COMMENT '商品名称',
  `shangpintupian` varchar(200) DEFAULT NULL COMMENT '商品图片',
  `shangpinleixing` varchar(200) DEFAULT NULL COMMENT '商品类型',
  `shangjiazhanghao` varchar(200) DEFAULT NULL COMMENT '商家账号',
  `shangpumingcheng` varchar(200) DEFAULT NULL COMMENT '商铺名称',
  `shangpinyuanjia` int(11) DEFAULT NULL COMMENT '商品原价',
  `shangpinxianjia` int(11) DEFAULT NULL COMMENT '商品现价',
  `tuangouzuidirenshu` int(11) DEFAULT NULL COMMENT '团购最低人数',
  `shangpinzhekou` varchar(200) DEFAULT NULL COMMENT '商品折扣',
  `tuangoukaishishijian` datetime DEFAULT NULL COMMENT '团购开始时间',
  `tuangoujieshushijian` datetime DEFAULT NULL COMMENT '团购结束时间',
  `shangpinmiaoshu` longtext COMMENT '商品描述',
  `ketihuodian` varchar(200) DEFAULT NULL COMMENT '可提货点',
  `reversetime` datetime DEFAULT NULL COMMENT '倒计结束时间',
  `clicknum` int(11) DEFAULT '0' COMMENT '点击次数',
  `jifen` int(11) DEFAULT '-1' COMMENT '积分',
  `price` float NOT NULL COMMENT '价格',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8 COMMENT='商品信息';

/*Data for the table `shangpinxinxi` */

insert  into `shangpinxinxi`(`id`,`addtime`,`shangpinmingcheng`,`shangpintupian`,`shangpinleixing`,`shangjiazhanghao`,`shangpumingcheng`,`shangpinyuanjia`,`shangpinxianjia`,`tuangouzuidirenshu`,`shangpinzhekou`,`tuangoukaishishijian`,`tuangoujieshushijian`,`shangpinmiaoshu`,`ketihuodian`,`reversetime`,`clicknum`,`jifen`,`price`) values (31,'2021-04-03 16:44:40','商品名称1','http://localhost:8080/ssm641l4/upload/shangpinxinxi_shangpintupian1.jpg','商品类型1','商家账号1','商铺名称1',1,1,1,'商品折扣1','2021-04-03 16:44:40','2021-04-03 16:44:40','商品描述1','可提货点1','2021-04-04 00:00:00',3,10000,99.9),(32,'2021-04-03 16:44:40','商品名称2','http://localhost:8080/ssm641l4/upload/shangpinxinxi_shangpintupian2.jpg','商品类型2','商家账号2','商铺名称2',2,2,2,'商品折扣2','2021-04-03 16:44:40','2021-04-03 16:44:40','商品描述2','可提货点2','2021-04-04 00:00:00',2,10000,99.9),(33,'2021-04-03 16:44:40','商品名称3','http://localhost:8080/ssm641l4/upload/shangpinxinxi_shangpintupian3.jpg','商品类型3','商家账号3','商铺名称3',3,3,3,'商品折扣3','2021-04-03 16:44:40','2021-04-03 16:44:40','商品描述3','可提货点3','2021-04-04 00:00:00',3,10000,99.9),(34,'2021-04-03 16:44:40','商品名称4','http://localhost:8080/ssm641l4/upload/shangpinxinxi_shangpintupian4.jpg','商品类型4','商家账号4','商铺名称4',4,4,4,'商品折扣4','2021-04-03 16:44:40','2021-04-03 16:44:40','商品描述4','可提货点4','2021-04-04 00:00:00',4,10000,99.9),(35,'2021-04-03 16:44:40','商品名称5','http://localhost:8080/ssm641l4/upload/shangpinxinxi_shangpintupian5.jpg','商品类型5','商家账号5','商铺名称5',5,5,5,'商品折扣5','2021-04-03 16:44:40','2021-04-03 16:44:40','商品描述5','可提货点5','2021-04-04 00:00:00',5,10000,99.9),(36,'2021-04-03 16:44:40','商品名称6','http://localhost:8080/ssm641l4/upload/shangpinxinxi_shangpintupian6.jpg','商品类型6','商家账号6','商铺名称6',6,6,6,'商品折扣6','2021-04-03 16:44:40','2021-04-03 16:44:40','商品描述6','可提货点6','2021-04-04 00:00:00',6,10000,99.9);

/*Table structure for table `shequtihuodian` */

DROP TABLE IF EXISTS `shequtihuodian`;

CREATE TABLE `shequtihuodian` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `tihuodidian` varchar(200) DEFAULT NULL COMMENT '提货地点',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=87 DEFAULT CHARSET=utf8 COMMENT='社区提货点';

/*Data for the table `shequtihuodian` */

insert  into `shequtihuodian`(`id`,`addtime`,`tihuodidian`) values (81,'2021-04-03 16:44:40','提货地点1'),(82,'2021-04-03 16:44:40','提货地点2'),(83,'2021-04-03 16:44:40','提货地点3'),(84,'2021-04-03 16:44:40','提货地点4'),(85,'2021-04-03 16:44:40','提货地点5'),(86,'2021-04-03 16:44:40','提货地点6');

/*Table structure for table `token` */

DROP TABLE IF EXISTS `token`;

CREATE TABLE `token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='token表';

/*Data for the table `token` */

insert  into `token`(`id`,`userid`,`username`,`tablename`,`role`,`token`,`addtime`,`expiratedtime`) values (1,11,'会员1','huiyuan','会员','0dwu88xqlhnen5qw7863b4m9fmshe9h2','2021-04-03 16:46:29','2021-04-03 17:46:30');

/*Table structure for table `tuihuotuikuan` */

DROP TABLE IF EXISTS `tuihuotuikuan`;

CREATE TABLE `tuihuotuikuan` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `dingdanhao` varchar(200) DEFAULT NULL COMMENT '订单号',
  `shangpinmingcheng` varchar(200) DEFAULT NULL COMMENT '商品名称',
  `shangpintupian` varchar(200) DEFAULT NULL COMMENT '商品图片',
  `tuihuoshijian` datetime DEFAULT NULL COMMENT '退货时间',
  `huiyuanzhanghao` varchar(200) DEFAULT NULL COMMENT '会员账号',
  `huiyuanxingming` varchar(200) DEFAULT NULL COMMENT '会员姓名',
  `tuihuoliyou` longtext COMMENT '退货理由',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  `clicknum` int(11) DEFAULT '0' COMMENT '点击次数',
  `userid` bigint(20) DEFAULT NULL COMMENT '用户id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=67 DEFAULT CHARSET=utf8 COMMENT='退货退款';

/*Data for the table `tuihuotuikuan` */

insert  into `tuihuotuikuan`(`id`,`addtime`,`dingdanhao`,`shangpinmingcheng`,`shangpintupian`,`tuihuoshijian`,`huiyuanzhanghao`,`huiyuanxingming`,`tuihuoliyou`,`sfsh`,`shhf`,`clicknum`,`userid`) values (61,'2021-04-03 16:44:40','订单号1','商品名称1','http://localhost:8080/ssm641l4/upload/tuihuotuikuan_shangpintupian1.jpg','2021-04-03 16:44:40','会员账号1','会员姓名1','退货理由1','是','',1,1),(62,'2021-04-03 16:44:40','订单号2','商品名称2','http://localhost:8080/ssm641l4/upload/tuihuotuikuan_shangpintupian2.jpg','2021-04-03 16:44:40','会员账号2','会员姓名2','退货理由2','是','',2,2),(63,'2021-04-03 16:44:40','订单号3','商品名称3','http://localhost:8080/ssm641l4/upload/tuihuotuikuan_shangpintupian3.jpg','2021-04-03 16:44:40','会员账号3','会员姓名3','退货理由3','是','',3,3),(64,'2021-04-03 16:44:40','订单号4','商品名称4','http://localhost:8080/ssm641l4/upload/tuihuotuikuan_shangpintupian4.jpg','2021-04-03 16:44:40','会员账号4','会员姓名4','退货理由4','是','',4,4),(65,'2021-04-03 16:44:40','订单号5','商品名称5','http://localhost:8080/ssm641l4/upload/tuihuotuikuan_shangpintupian5.jpg','2021-04-03 16:44:40','会员账号5','会员姓名5','退货理由5','是','',5,5),(66,'2021-04-03 16:44:40','订单号6','商品名称6','http://localhost:8080/ssm641l4/upload/tuihuotuikuan_shangpintupian6.jpg','2021-04-03 16:44:40','会员账号6','会员姓名6','退货理由6','是','',6,6);

/*Table structure for table `users` */

DROP TABLE IF EXISTS `users`;

CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `role` varchar(100) DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';

/*Data for the table `users` */

insert  into `users`(`id`,`username`,`password`,`role`,`addtime`) values (1,'abo','abo','管理员','2021-04-03 16:44:40');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
