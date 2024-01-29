<template>
	<view class="uni-padding-wrap">
		<view class="header">
			<view class="headerb">
				<swiper class="swiper" :indicator-dots='".swiper-pagination"==null?false:true' :autoplay='autoplaySwiper' :circular='true' indicator-active-color='rgba(242, 199, 68, 1)' indicator-color='rgba(218, 218, 218, 1)' :duration='1000' :interval='intervalSwiper' :vertical='"horizontal"=="horizontal"?false:true'>
					<swiper-item v-for="(swiper,index) in swiperList" :key="index" @tap="onSwiperTap(swiper)">
						<image mode="aspectFill" :src="swiper.img"></image>
					</swiper-item>
				</swiper>
			</view>
		</view>

		
																																																
														<view class="pl15 col3 header-title" style="padding: 0 12px;box-sizing: border-box;" :style='{"backgroundColor":"rgba(242, 199, 68, 1)","borderColor":"red","color":"rgba(0, 0, 0, 1)","borderRadius":0,"borderWidth":"0px","fontSize":"32rpx","lineHeight":"72rpx","borderStyle":"solid"}'>
			<view class="left" :style="{fontSize:'32rpx',color:'rgba(0, 0, 0, 1)'}">
				商品信息
			</view>
			<view class="right-content" @tap="onPageTap('shangpinxinxi')" :style="{fontSize:'32rpx',color:'rgba(0, 0, 0, 1)'}">
				查看更多
			</view>
		</view>
		<view v-if='1 == 1 || 1 == 2' class="uni-product-list" :class="1 == 2 ? 'active' : ''" :style='{"borderRadius":0,"backgroundColor":"rgba(255, 255, 255, 1)"}'>
			<view @tap="onDetailTap('shangpinxinxi',product.id)" :style='{"borderRadius":"0px","backgroundColor":"#fff"}' class="uni-product" v-for="(product,index) in homeshangpinxinxilist" :key="index">
				                				<view :style='{"fontSize":"24rpx","lineHeight":"44rpx","color":"rgba(0, 0, 0, 1)","textAlign":"center"}' class="uni-product-title">{{product.shangpinmingcheng}}</view>
								                				<view class="image-view" :style='{"borderRadius":"100%","height":"280rpx"}'>
					<image :style='{"borderRadius":"100%","height":"280rpx"}' mode="aspectFill" class="uni-product-image" :src="product.shangpintupian?product.shangpintupian.split(',')[0]:''"></image>
				</view>
                				                				                				                				                				                				                				                				                				                				                				                				                				                				                				                				<view class="uni-product-price" :style='{"fontSize":"24rpx","lineHeight":"48rpx","color":"rgba(0, 0, 0, 1)","textAlign":"center"}'>
					<text v-if="product.price" class="">￥{{product.price}}</text>
				</view>
											</view>
		</view>
		<view class="list" v-if='1 == 3' :style='{"borderRadius":0,"backgroundColor":"rgba(255, 255, 255, 1)"}'>
			<view :style='{"borderRadius":"0px","backgroundColor":"#fff"}' @tap="onDetailTap('shangpinxinxi',product.id)" v-for="(product,index) in homeshangpinxinxilist" :key="index" class="listm flex flex-between">
																<view class="listmr">
					<view class="col3 f30 elip mb15" :style='{"fontSize":"24rpx","lineHeight":"44rpx","color":"rgba(0, 0, 0, 1)","textAlign":"center"}'>{{product.shangpinmingcheng}}</view>
				</view>
																								<image :style='{"borderRadius":"100%","height":"280rpx"}' mode="aspectFill" class="listmpic" :src="product.shangpintupian?product.shangpintupian.split(',')[0]:''"></image>
																																																																																																																																																																																																																																																																																																																												<view class="listmr">
					<view  class="colb f24 lh35" :style='{"fontSize":"24rpx","lineHeight":"48rpx","color":"rgba(0, 0, 0, 1)","textAlign":"center"}'>￥{{product.price}}</view>
				</view>
															</view>
		</view>
		<!--list end-->
																																				
																																														
	</view>
</template>

<script>
	import '@/assets/css/global-restaurant.css'
	import uniIcons from "@/components/uni-ui/lib/uni-icons/uni-icons.vue"
	export default {
		components: {
			uniIcons
		},
		data() {
			return {

				autoplaySwiper: {"delay":"3000","disableOnInteraction":false} ? true : false,
				intervalSwiper: {"delay":"3000","disableOnInteraction":false} ? 3000 : 5000,
				//轮播
				swiperList: [],
																																																																																																																								homeshangpinxinxilist: [],
																																																																												news: [],
			}
		},
		async onShow() {
			// 轮播图
			let swiperList = []
			let res = await this.$api.page('config', {
				page: 1,
				limit: 5
			});
			for (let item of res.data.list) {
				if (item.name.indexOf('picture') >= 0 && item.value && item.value!="" && item.value!=null ) {
					swiperList.push({
						img: item.value
					});
				}
			}
			if (swiperList) {
				this.swiperList = swiperList;
			}
																																																																								
																																																																					
									res = await this.$api.list('shangpinxinxi', {
				page: 1,

				limit: 4
			});
			this.homeshangpinxinxilist = res.data.list
																																},

		methods: {

			//轮播图跳转
			onSwiperTap(e) {

			},
			// 新闻详情
			onNewsDetailTap(id) {
				this.$utils.jump(`../news-detail/news-detail?id=${id}`)
			},
			// 推荐列表点击详情
			onDetailTap(tableName, id) {
				this.$utils.jump(`../${tableName}/detail?id=${id}`)
			},
			onPageTap(tableName){

				uni.navigateTo({
					url: `../${tableName}/list`,
					fail: function(){
						uni.switchTab({
							url: `../${tableName}/list`
						});
					}
				});
				// this.$utils.jump(`../${tableName}/list`)
			}
		}
	}
</script>

<style>
	page {
		background: #F8F8F8;
	}
	
	.uni-padding-wrap:after {
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

	view {
		font-family: '\5FAE\8F6F\96C5\9ED1';
		font-size: 30upx;
	}

	.header {
		background: #EEEEEE;
		padding: 0 0 300upx 0;
		margin-bottom: 20upx;
		position: relative;
	}

	.ssbox {
		background: rgba(255, 255, 255, 0.35);
		width: 530upx;
		border-radius: 60rpx;
		padding: 10upx 15upx;
		box-sizing: border-box;
	}

	.ss_input {
		border: none;
		width: 450upx;
		font-size: 30upx;
		color: #fff;
		background: none;
		height: 45upx;
		line-break: 45upx;
	}

	.headerb {
		position: absolute;
		left: 0;
		width: 100%;
		box-sizing: border-box;
	}

	.headerb image {
		width: 100%;
		position: relative;
		z-index: 10;
	}
	
	.headerb .swiper {
		height: 300upx;
	}
	
		.swiper /deep/ .uni-swiper-dot {
		width: 20rpx;
		height: 24rpx;
		broder-radius: 50%;
	}
		

	.notice {
		position: relative;
		z-index: 5;
		padding: 0 50upx;
	}

	.noticem {
		background: #fff;
		padding: 55upx 30upx 15upx;
		border-radius: 10upx;
		margin-top: -45upx;
	}

	.noticer {
		width: 480upx;
		height: 50upx;
	}

	.noticer .swiper-item {
		white-space: nowrap;
		text-overflow: ellipsis;
		overflow: hidden;
		height: 50upx;
		line-height: 50upx;
		font-size: 24upx;
	}

	.list {
		padding: 20upx 20upx 20upx;
	}

	.listm {
		background: #fff;
		border-radius: 15upx;
		box-shadow: 0 0 2upx rgba(0, 0, 0, 0.1);
		margin-bottom: 20upx;
		padding: 30upx;
	}

	.listmpic {
		border-radius: 10upx;
		width: 166upx;
		margin-right: 20upx;
	}

	.listmr {
		// width: 460upx;
		display: inline-block;
		flex: 1;
		display: flex;
		justify-content: space-between;
		flex-direction: column;
	}

	/* #ifdef MP-WEIXIN */
	.noticer .swiper-item {
		margin-top: 5upx;
	}

	/* #endif */
	/* #ifdef MP-BAIDU */
	.noticer .swiper-item {
		margin-top: 3upx;
	}

	/* #endif */
	/* #ifdef MP-ALIPAY */
	.noticer .swiper-item {
		margin-top: 2upx;
	}

	/* #endif */
	/* #ifdef MP-QQ */
	.noticer .swiper-item {
		margin-top: 4upx;
	}

	/* #endif */
	/* #ifdef MP-TOUTIAO */
	.noticer .swiper-item {
		margin-top: 4upx;
	}

	/* #endif */

	.uni-product-list {
		display: flex;
		width: 100%;
		flex-wrap: wrap;
		flex-direction: row;
		margin-top: 0;
		padding: 0 14upx;
		box-sizing: border-box;
	}
	
	.uni-product-list.active {
		padding: 0 12upx;
	}

	.uni-product {
		padding: 10upx;
		margin: 10upx;
		width: 341upx;
		box-sizing: border-box;
		display: flex;
		flex-direction: column;
		background: #FFFFFF;
	}
	
	.uni-product-list.active .uni-product {
		width: 222upx;
	}

	.image-view {
		height: 321upx;
		width: 321upx;
		// margin: 12upx 0;
		display: flex;
		align-items: center;
		overflow: hidden;
	}
	
	.uni-product-list.active .image-view {
		height: 202upx;
		width: 202upx;
		overflow: hidden;
	}

	.uni-product-image {
		height: 100%;
		width: 100%;
		margin: 0 auto;
		display: block;
	}

	.uni-product-title {
		width: 100%;
		word-break: break-all;
		display: -webkit-box;
		overflow: hidden;
		line-height: 1.5;
		text-overflow: ellipsis;
		-webkit-box-orient: vertical;
		-webkit-line-clamp: 1;
	}

	.uni-product-price {
		width: 100%;
		margin-top: 10upx;
		font-size: 28upx;
		line-height: 1.5;
		position: relative;
	}

	.uni-product-price-original {
		color: #e80080;
	}

	.uni-product-price-favour {
		color: #888888;
		text-decoration: line-through;
		margin-left: 10upx;
	}

	.uni-product-tip {
		position: absolute;
		right: 10upx;
		background-color: #ff3333;
		color: #ffffff;
		padding: 0 10upx;
		border-radius: 5upx;
	}

	.header-title {
		display: flex;
		align-items: center;
		text-align: center;
		justify-content: space-between;
		padding: 0 40upx;
	}
</style>
