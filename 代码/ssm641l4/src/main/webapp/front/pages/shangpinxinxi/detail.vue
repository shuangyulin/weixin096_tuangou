<template>
	<mescroll-uni @init="mescrollInit" :up="upOption" :down="downOption" @down="downCallback" @up="upCallback" :bottom="100">
		<view class="container">
                                                			<view><swiper class="swiper" :indicator-dots='".swiper-pagination"==null?false:true' :autoplay='autoplaySwiper' :circular='true' indicator-active-color='rgba(242, 199, 68, 1)' indicator-color='rgba(218, 218, 218, 1)' :duration='1000' :interval='intervalSwiper' :vertical='"horizontal"=="horizontal"?false:true'>
				<swiper-item v-for="(swiper,index) in swiperList" :key="index">
					<image mode="aspectFill" :src="swiper"></image>
				</swiper-item>
			</swiper></view>
			                                                                                                                                                                                                                                                                                                                                                                                                <view class="detail-content">

																																																						<view class="price detail-list-item" :style='{"boxShadow":"0 0 2rpx rgba(0,0,0,.8)","margin":"0 ","borderColor":"#fff","backgroundColor":"#fff","borderRadius":"0","borderWidth":"0","borderStyle":"solid","height":"68rpx"}'>
                                <view class="text" :style='{"color":"#333","textAlign":"left","fontSize":"28rpx"}'>¥{{detail.price}}</view>
                        </view>	
			

                                                <view class="name shop-title" :style='{"boxShadow":"0 0 2rpx rgba(0,0,0,.8)","margin":"0","borderColor":"#fff","backgroundColor":"#fff","color":"#000","borderRadius":"0","borderWidth":"0","fontSize":"36rpx","borderStyle":"solid"}'>
					商品名称：{{detail.shangpinmingcheng}}
				</view>
				                                                                                                                                                                                                                                                                                                                                                                                                                                                <view class="price detail-list-item" :style='{"boxShadow":"0 0 2rpx rgba(0,0,0,.8)","margin":"0 ","borderColor":"#fff","backgroundColor":"#fff","borderRadius":"0","borderWidth":"0","borderStyle":"solid","height":"68rpx"}' v-if="count<=0">
					<view class="lable" :style='{"width":"auto","fontSize":"28rpx","color":"#333","textAlign":"left"}'>倒计时：</view>
					<view class="text" :style='{"color":"#333","textAlign":"left","fontSize":"28rpx"}'>该活动已结束</view>
				</view>
				<view class="price detail-list-item" :style='{"boxShadow":"0 0 2rpx rgba(0,0,0,.8)","margin":"0 ","borderColor":"#fff","backgroundColor":"#fff","borderRadius":"0","borderWidth":"0","borderStyle":"solid","height":"68rpx"}' v-if="count>0">
					<view class="lable" :style='{"width":"auto","fontSize":"28rpx","color":"#333","textAlign":"left"}'>倒计时：</view>
					<view class="text" :style='{"color":"#333","textAlign":"left","fontSize":"28rpx"}'>{{SecondToDate}}</view>
				</view>
                                                                                                                                				
                                								                								                				<view class="detail-list-item" :style='{"boxShadow":"0 0 2rpx rgba(0,0,0,.8)","margin":"0 ","borderColor":"#fff","backgroundColor":"#fff","borderRadius":"0","borderWidth":"0","borderStyle":"solid","height":"68rpx"}'>
					<view class="lable" :style='{"width":"auto","fontSize":"28rpx","color":"#333","textAlign":"left"}'>商品类型：</view>
					<view class="text" :style='{"color":"#333","textAlign":"left","fontSize":"28rpx"}'>{{detail.shangpinleixing}}</view>
				</view>
                				                				<view class="detail-list-item" :style='{"boxShadow":"0 0 2rpx rgba(0,0,0,.8)","margin":"0 ","borderColor":"#fff","backgroundColor":"#fff","borderRadius":"0","borderWidth":"0","borderStyle":"solid","height":"68rpx"}'>
					<view class="lable" :style='{"width":"auto","fontSize":"28rpx","color":"#333","textAlign":"left"}'>商家账号：</view>
					<view class="text" :style='{"color":"#333","textAlign":"left","fontSize":"28rpx"}'>{{detail.shangjiazhanghao}}</view>
				</view>
                				                				<view class="detail-list-item" :style='{"boxShadow":"0 0 2rpx rgba(0,0,0,.8)","margin":"0 ","borderColor":"#fff","backgroundColor":"#fff","borderRadius":"0","borderWidth":"0","borderStyle":"solid","height":"68rpx"}'>
					<view class="lable" :style='{"width":"auto","fontSize":"28rpx","color":"#333","textAlign":"left"}'>商铺名称：</view>
					<view class="text" :style='{"color":"#333","textAlign":"left","fontSize":"28rpx"}'>{{detail.shangpumingcheng}}</view>
				</view>
                				                				<view class="detail-list-item" :style='{"boxShadow":"0 0 2rpx rgba(0,0,0,.8)","margin":"0 ","borderColor":"#fff","backgroundColor":"#fff","borderRadius":"0","borderWidth":"0","borderStyle":"solid","height":"68rpx"}'>
					<view class="lable" :style='{"width":"auto","fontSize":"28rpx","color":"#333","textAlign":"left"}'>商品原价：</view>
					<view class="text" :style='{"color":"#333","textAlign":"left","fontSize":"28rpx"}'>{{detail.shangpinyuanjia}}</view>
				</view>
                				                				<view class="detail-list-item" :style='{"boxShadow":"0 0 2rpx rgba(0,0,0,.8)","margin":"0 ","borderColor":"#fff","backgroundColor":"#fff","borderRadius":"0","borderWidth":"0","borderStyle":"solid","height":"68rpx"}'>
					<view class="lable" :style='{"width":"auto","fontSize":"28rpx","color":"#333","textAlign":"left"}'>商品现价：</view>
					<view class="text" :style='{"color":"#333","textAlign":"left","fontSize":"28rpx"}'>{{detail.shangpinxianjia}}</view>
				</view>
                				                				<view class="detail-list-item" :style='{"boxShadow":"0 0 2rpx rgba(0,0,0,.8)","margin":"0 ","borderColor":"#fff","backgroundColor":"#fff","borderRadius":"0","borderWidth":"0","borderStyle":"solid","height":"68rpx"}'>
					<view class="lable" :style='{"width":"auto","fontSize":"28rpx","color":"#333","textAlign":"left"}'>团购最低人数：</view>
					<view class="text" :style='{"color":"#333","textAlign":"left","fontSize":"28rpx"}'>{{detail.tuangouzuidirenshu}}</view>
				</view>
                				                				<view class="detail-list-item" :style='{"boxShadow":"0 0 2rpx rgba(0,0,0,.8)","margin":"0 ","borderColor":"#fff","backgroundColor":"#fff","borderRadius":"0","borderWidth":"0","borderStyle":"solid","height":"68rpx"}'>
					<view class="lable" :style='{"width":"auto","fontSize":"28rpx","color":"#333","textAlign":"left"}'>商品折扣：</view>
					<view class="text" :style='{"color":"#333","textAlign":"left","fontSize":"28rpx"}'>{{detail.shangpinzhekou}}</view>
				</view>
                				                				<view class="detail-list-item" :style='{"boxShadow":"0 0 2rpx rgba(0,0,0,.8)","margin":"0 ","borderColor":"#fff","backgroundColor":"#fff","borderRadius":"0","borderWidth":"0","borderStyle":"solid","height":"68rpx"}'>
					<view class="lable" :style='{"width":"auto","fontSize":"28rpx","color":"#333","textAlign":"left"}'>团购开始时间：</view>
					<view class="text" :style='{"color":"#333","textAlign":"left","fontSize":"28rpx"}'>{{detail.tuangoukaishishijian}}</view>
				</view>
                				                				<view class="detail-list-item" :style='{"boxShadow":"0 0 2rpx rgba(0,0,0,.8)","margin":"0 ","borderColor":"#fff","backgroundColor":"#fff","borderRadius":"0","borderWidth":"0","borderStyle":"solid","height":"68rpx"}'>
					<view class="lable" :style='{"width":"auto","fontSize":"28rpx","color":"#333","textAlign":"left"}'>团购结束时间：</view>
					<view class="text" :style='{"color":"#333","textAlign":"left","fontSize":"28rpx"}'>{{detail.tuangoujieshushijian}}</view>
				</view>
                				                								                				<view class="detail-list-item" :style='{"boxShadow":"0 0 2rpx rgba(0,0,0,.8)","margin":"0 ","borderColor":"#fff","backgroundColor":"#fff","borderRadius":"0","borderWidth":"0","borderStyle":"solid","height":"68rpx"}'>
					<view class="lable" :style='{"width":"auto","fontSize":"28rpx","color":"#333","textAlign":"left"}'>可提货点：</view>
					<view class="text" :style='{"color":"#333","textAlign":"left","fontSize":"28rpx"}'>{{detail.ketihuodian}}</view>
				</view>
                				                								                          						                				<view class="detail-list-item" :style='{"boxShadow":"0 0 2rpx rgba(0,0,0,.8)","margin":"0 ","borderColor":"#fff","backgroundColor":"#fff","borderRadius":"0","borderWidth":"0","borderStyle":"solid","height":"68rpx"}'>
					<view class="lable" :style='{"width":"auto","fontSize":"28rpx","color":"#333","textAlign":"left"}'>积分：</view>
					<view class="text" :style='{"color":"#333","textAlign":"left","fontSize":"28rpx"}'>{{detail.jifen}}</view>
				</view>
                				                                				                
							</view>

                        			            			            			            			            			            			            			            			            			            			            			            			            			            			            			            			            						
			            			            			            			            			            			            			            			            			            			            			            			            			            			            			            			            			            						
			            			            			            			            			            			            			            			            			            			            			            			                        <view class="time-content" :style='{"boxShadow":"0 0 2rpx rgba(0,0,0,.8)","margin":"0","borderColor":"#fff","backgroundColor":"#fff","borderRadius":"0","borderWidth":"0","borderStyle":"solid","height":"auto"}' style="height:auto !important;">
				<view class="header" :style='{"color":"#333","fontSize":"28rpx"}'>
					商品描述
				</view>
				<view class="content" :style='{"color":"#333","fontSize":"28rpx"}'>
					<rich-text style="font-size: 33upx;line-height: 50upx;letter-spacing: 5upx;" :nodes="detail.shangpinmiaoshu"></rich-text>
				</view>
			</view>
            			            			            			            			            			            						
            
			<view class="bottom-content cu-bar bg-white tabbar border shop">
				<view style="text-align: left;display: flex;">
									</view>
				<view style="text-align: right;">
																				                    <button @tap="onCartTap" class="cu-btn bg-orange round shadow-blur" style="margin-right: 10upx;" :style="{width:'auto',borderRadius:'40rpx',height:'80rpx',fontSize:'28rpx',color:'rgba(239, 239, 239, 1)',backgroundColor:btnColor[2],borderColor:btnColor[2]}">加入购物车</button>
					                                        <button @tap="onBuyTap" style="margin-right: 10upx;" class="cu-btn bg-red round shadow-blur" :style="{width:'auto',borderRadius:'40rpx',height:'80rpx',fontSize:'28rpx',color:'rgba(239, 239, 239, 1)',backgroundColor:btnColor[3],borderColor:btnColor[3]}">立即订购</button>
                    										                    <button @tap="onJifenTap" style="margin-right: 10upx;" class="cu-btn bg-red round shadow-blur" :style="{width:'auto',borderRadius:'40rpx',height:'80rpx',fontSize:'28rpx',color:'rgba(239, 239, 239, 1)',backgroundColor:btnColor[5],borderColor:btnColor[5]}">积分兑换</button>
                                    </view>
			</view>
		</view>

		<!-- 确认完成弹窗 -->
		<uni-popup class="popup-content" ref="popup" type="center">
			<form class="popup-form">
				<view class="cu-form-group margin-top">
					<picker @change="sfshChange" :value="sfshIndex" :range="sfshOptions">
						<view class="uni-input">{{detail.sfsh?detail.sfsh:'选择审核结果'}}</view>
					</picker>
				</view>
				<view class="cu-form-group">
					<!-- <view class="title">审核回复</view> -->
					<textarea style="width: 200px;" v-model="detail.shhf" placeholder="审核回复"></textarea>
					<!-- <input v-model="douyinId" placeholder="审核回复" name="input"></input> -->
				</view>
				<view class="btn-content">
					<button @tap="onCloseWinTap" class="cu-btn bg-cyan">取消</button>
					<button @tap="onFinishTap" class="cu-btn bg-red">确认</button>
				</view>
			</form>
		</uni-popup>

	</mescroll-uni>
</template>

<script>
	export default {
		data() {
			return {
				autoplaySwiper: {"delay":"3000","disableOnInteraction":false} ? true : false,
				intervalSwiper: {"delay":"3000","disableOnInteraction":false} ? 3000 : 5000,
				btnColor: ['#409eff','#67c23a','#909399','#e6a23c','#f56c6c','#356c6c','#351c6c','#f093a9','#a7c23a','#104eff','#10441f','#a21233','#503319'],
				id: '',
				detail: {},
				swiperList: [],
				commentList: [],
				mescroll: null, //mescroll实例对象
				downOption: {
					auto: false //是否在初始化后,自动执行下拉回调callback; 默认true
				},
				upOption: {
					noMoreSize: 3, //如果列表已无数据,可设置列表的总数量要大于半页才显示无更多数据;避免列表数据过少(比如只有一条数据),显示无更多数据会不好看; 默认5
					textNoMore: '~ 没有更多了 ~',
				},
				hasNext: true,
				user: {},
				sfshIndex: -1,
				sfshOptions: ['通过','不通过'],
				count: 0
			}
		},
		computed: {
			SecondToDate: function() {
				var time = this.count;
				if (null != time && "" != time) {
					if (time > 60 && time < 60 * 60) {
						time =
							parseInt(time / 60.0) +
							"分钟" +
							parseInt((parseFloat(time / 60.0) - parseInt(time / 60.0)) * 60) +
							"秒";
					} else if (time >= 60 * 60 && time < 60 * 60 * 24) {
						time =
							parseInt(time / 3600.0) +
							"小时" +
							parseInt(
								(parseFloat(time / 3600.0) - parseInt(time / 3600.0)) * 60
							) +
							"分钟" +
							parseInt(
								(parseFloat(
										(parseFloat(time / 3600.0) - parseInt(time / 3600.0)) * 60
									) -
									parseInt(
										(parseFloat(time / 3600.0) - parseInt(time / 3600.0)) * 60
									)) *
								60
							) +
							"秒";
					} else if (time >= 60 * 60 * 24) {
						time =
							parseInt(time / 3600.0 / 24) +
							"天" +
							parseInt(
								(parseFloat(time / 3600.0 / 24) - parseInt(time / 3600.0 / 24)) *
								24
							) +
							"小时" +
							parseInt(
								(parseFloat(time / 3600.0) - parseInt(time / 3600.0)) * 60
							) +
							"分钟" +
							parseInt(
								(parseFloat(
										(parseFloat(time / 3600.0) - parseInt(time / 3600.0)) * 60
									) -
									parseInt(
										(parseFloat(time / 3600.0) - parseInt(time / 3600.0)) * 60
									)) *
								60
							) +
							"秒";
					} else {
						time = parseInt(time) + "秒";
					}
				}
				return time;
			}
		},
		async onLoad(options) {
			this.id = options.id;
		},
		async onShow(options) {
			// 渲染数据
			this.init();
			let table = uni.getStorageSync("nowTable");
			// 获取用户信息
			let res = await this.$api.session(table);
			this.user = res.data;
			this.btnColor = this.btnColor.sort(()=> {
				return (0.5-Math.random());
			});
		},
		destroyed: function() {
			//window.clearInterval(this.inter);
		},
		methods: {
			// 支付
			onPayTap(){
				uni.setStorageSync('paytable','shangpinxinxi');
				uni.setStorageSync('payObject',this.detail);
				this.$utils.jump('../pay-confirm/pay-confirm?type=1')
			},
			// 收藏
			// 跨表
			onAcrossTap(tableName){
     			uni.setStorageSync('crossTable','shangpinxinxi');
				uni.setStorageSync(`crossObj`, this.detail);
				this.$utils.jump(`../${tableName}/add-or-update?cross=true`);
			},
			// 获取详情
			async init(){
				let res = await this.$api.info('shangpinxinxi', this.id);
				this.detail = res.data;
																				// 轮播图片
				this.swiperList = this.detail.shangpintupian ? this.detail.shangpintupian.split(",") : [];
																																																																																								//修改富文本的图片样式
				this.detail.shangpinmiaoshu = this.detail.shangpinmiaoshu.replace(/img src/gi,"img style=\"width:100%;\" src");
																								let reversetime = new Date(this.detail.reversetime).getTime()
				let now = new Date().getTime();
				console.log(reversetime)
				console.log(now)
				let count = reversetime - now;
				console.log(count)
				if (count > 0) {
					this.count = count / 1000
					var _this = this;
					this.inter = window.setInterval(function() {
						_this.count = _this.count - 1;
						if (_this.count < 0) {
							window.clearInterval(_this.inter);
							uni.showModal({
								title: '活动结束',
								content: '该活动已结束',
								showCancel: false,
								success: async function(res) {}
							});
						}
					}, 1000);
				}
				console.log(this.count)
																																			},

			// mescroll组件初始化的回调,可获取到mescroll对象
			mescrollInit(mescroll) {
				this.mescroll = mescroll;
			},

			/*下拉刷新的回调 */
			downCallback(mescroll) {
				this.hasNext = true
				mescroll.resetUpScroll()
			},

			/*上拉加载的回调: mescroll携带page的参数, 其中num:当前页 从1开始, size:每页数据条数,默认10 */
			async upCallback(mescroll) {
								mescroll.endSuccess(mescroll.size, this.hasNext);
                
            },

			            async onCartTap() {
								if (this.count <= 0) {
					this.$utils.msg('该活动已结束')
					return
				}
								if (uni.getStorageSync(`cart${this.detail.id}${this.user.id}`)) {
					this.$utils.msg('该商品已添加到购物车')
					return
				}
				await this.$api.add('cart', {
					tablename: 'shangpinxinxi',
					goodid: this.detail.id,
															goodname: this.detail.shangpinmingcheng,
																																																																																																																																																																															picture: this.swiperList[0],
					buynumber: 1,
					userid: this.user.id,
					price: this.detail.price,
					discountprice: this.detail.vipprice
				});
				uni.setStorageSync(`cart${this.detail.id}${this.user.id}`, true);
				this.$utils.msg('添加到购物车成功')
			},
            			            onBuyTap() {
								if (this.count <= 0) {
					this.$utils.msg('该活动已结束')
					return
				}
								uni.setStorageSync('orderGoods', [{
					tablename: 'shangpinxinxi',
					goodid: this.detail.id,
															goodname: this.detail.shangpinmingcheng,
																																																																																																																																																																															picture: this.swiperList[0],
					buynumber: 1,
					price: this.detail.price,
					discountprice: this.detail.vipprice
				}])
				this.$utils.jump('../shop-order-confirm/shop-order-confirm?type=1');
			},
            						// 积分兑换
			onJifenTap(){
								if (this.count <= 0) {
					this.$utils.msg('该活动已结束')
					return
				}
								uni.setStorageSync('orderGoods', [{
					tablename: 'shangpinxinxi',
					goodid: this.detail.id,
															goodname: this.detail.shangpinmingcheng,
																																																																																																																																																																															picture: this.swiperList[0],
					buynumber: 1,
					price: this.detail.jifen,
					discountprice: this.detail.vipprice
				}])
				this.$utils.jump('../shop-order-confirm/shop-order-confirm?type=2');
			},
						onChatTap() {
				this.$utils.jump('../chat/chat')
			},
			// 下载
			download(url){
				let _this = this;
				uni.downloadFile({
					url: url,
					success: (res) => {
						if (res.statusCode === 200) {
							_this.$utils.msg('下载成功');
							 window.open(url);
						}
					}
				});
			},
			// 
			onCartTabTap() {
				this.$utils.tab('../shop-cart/shop-cart')
			},
			// 添加评论
			onCommentTap() {
				this.$utils.jump(`../discussshangpinxinxi/add-or-update?refid=${this.id}`)
			},
			// 点赞
			async zan() {
				let _this = this;
				uni.showModal({
					title: '提示',
					content: '是否点赞',
					success: async function(res) {
						if (res.confirm) {
							_this.detail.thumbsupnum = parseInt(_this.detail.thumbsupnum) + 1;
							await _this.$api.update('shangpinxinxi', _this.detail);
							_this.$utils.msg('点赞成功');
						}
					}
				});
			},
			// 踩
			async cai() {
				let _this = this;
				uni.showModal({
					title: '提示',
					content: '是否点踩',
					success: async function(res) {
						if (res.confirm) {
							_this.detail.crazilynum = parseInt(_this.detail.crazilynum) + 1;
							await _this.$api.update('shangpinxinxi', _this.detail);
							_this.$utils.msg('点踩成功');
						}
					}
				});
			},
			onSHTap() {
				this.$refs.popup.open()
			},
			// 完成审核
			async onFinishTap() {
				if(!this.detail.sfsh){
					this.$utils.msg('请选择审核状态');
					return
				}
				if(!this.detail.shhf){
					this.$utils.msg('请填写审核回复');
					return
				}
				if(this.detail.sfsh=="通过"){
					this.detail.sfsh = '是'
				}
				if(this.detail.sfsh=="不通过"){
					this.detail.sfsh = '否'
				}
				await this.$api.update('shangpinxinxi', this.detail);
				this.$utils.msg('审核成功');
				this.$refs.popup.close();
			},
			// 关闭窗口
			onCloseWinTap() {
				this.$refs.popup.close()
			},
			sfshChange(e){
				console.log(this.detail)
				this.sfshIndex = e.target.value
				this.detail.sfsh = this.sfshOptions[this.sfshIndex]
			}
		}
	}
</script>

<style lang="scss">
	.container {
		// padding-bottom: 80upx;
	}
	
	.container:after {
		position: fixed;
		top: 0;
		right: 0;
		left: 0;
		bottom: 0;
		content: '';
				background-attachment: fixed;
		background-size: cover;
		background-position: center;
	}

	.swiper {
		width: 100%;
		height: 450upx;

		image {
			width: 100%;
		}
	}

	.detail-content {
		font-size: 28upx;
		color: #888888;
		// padding: 10upx 20upx;
		background: #FFFFFF;
		line-height: 45upx;

		.name {
			font-size: 38rpx;
			font-weight: blod;
			// margin-bottom: 20upx;
			padding-top: 20upx;
		}

		.price {
			font-size: 33rpx;
			color: red;
			// margin-top: 20upx;
		}
	}

	.time-content {
		background: #FFFFFF;
		padding: 30upx;
		font-size: 30upx;
		border-radius: 20upx;
		margin-top: 20upx;

		.header {
			font-size: 33upx;
			margin-bottom: 20upx;
		}
	}

	.bottom-content {
		position: fixed;
		bottom: 0;
		left: 0;
		width: 100%;
	}

	.comoment-header {
		display: flex;
		justify-content: space-between;
		align-items: center;
		padding-bottom: 12upx;

		.btn-comment-content {
			color: #DD514C;
			font-weight: bold;
			padding: 0 12upx;
		}
	}

	.comment-item {
		margin-bottom: 10upx;
		border-bottom: 1px solid #EEEEEE;
		padding-bottom: 20upx;

		.content {
			margin-left: 20upx;
			margin-top: 20upx;
		}
	}

	.icon {
		width: 50upx;
		height: 50upx;
	}

	.popup-content {
		.popup-form {
			background: #FFFFFF;
			margin-top: 20upx;
		}

		.btn-content {
			text-align: right;
			background: #FFFFFF;

			button {
				margin-left: 20upx;
				margin-right: 20upx;
				margin-bottom: 20upx;
			}
		}
	}
	
	.detail-list-item {
	  padding: 0 24upx;
	  box-sizing: border-box;
	  display: flex;
	  align-items: center;
	  height: 68upx;
	  border-bottom: 2upx solid #efefef;
	  background-color: #fff;
	
	  .lable {
	    font-size: 28upx;
	    color: #000;
	  }
	
	  .text {
	    flex: 1;
	    font-size: 24upx;
	    color: #FF00FF;
	    text-align: left;
	  }
	
	  &.favor {
	    .el-icon-star-on {
	      color: inherit;
	      font-size: inherit;
	    }
	  }
	}
	
	.detail-content .shop-title {
		padding: 20upx 24upx;
		box-sizing: border-box;
		line-height: 1.4;
	}
	
	.priceFavor {
		height: 96upx !important;
	}
	
	.priceFavor .text {
		font-size: 64upx !important;
		color: red !important;
	}
	
	.priceFavor .icon {
		font-size: 56upx !important;
		text-align: right !important;
		color: red !important;
	}
</style>
