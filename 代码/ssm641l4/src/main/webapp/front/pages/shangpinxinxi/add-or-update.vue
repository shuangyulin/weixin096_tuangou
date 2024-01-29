<template>
	<view class="content">
		<form class="app-update-pv">
			
									<view :style='{"boxShadow":"0 0 2rpx rgba(0,0,0,.8)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"#ccc","margin":"0","borderWidth":"0","borderStyle":"solid","height":"88rpx"}' class="cu-form-group">
				<view :style='{"width":"22%","fontSize":"24rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left"}' class="title">商品名称</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(205, 205, 205, 1)","borderRadius":"16rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"26rpx","borderStyle":"solid","height":"60rpx"}' :disabled="ro.shangpinmingcheng" v-model="ruleForm.shangpinmingcheng" placeholder="商品名称"></input>
			</view>
												<view :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"#ccc","margin":"0 0 20rpx 0","borderWidth":"0","borderStyle":"solid","height":"108rpx"}' class="cu-form-group" @tap="shangpintupianTap" :class='left == "left"?"":"active"'>
				<view :style='{"width":"22%","fontSize":"24rpx","color":"rgba(1, 1, 1, 1)","textAlign":"left"}' class="title">商品图片</view>
				<view class="right-input" :style='{textAlign:"left"}' style="padding:0">
					<image :style='{"width":"100rpx","boxShadow":"0 0 16rpx rgba(0,0,0,.3)","borderRadius":"2%","textAlign":"left","height":"100rpx"}' class="avator" v-if="ruleForm.shangpintupian" :src="ruleForm.shangpintupian" mode="aspectFill"></image>
					<image :style='{"width":"100rpx","boxShadow":"0 0 16rpx rgba(0,0,0,.3)","borderRadius":"2%","textAlign":"left","height":"100rpx"}' class="avator" v-else src="../../static/gen/upload.png" mode="aspectFill"></image>
				</view>
			</view>
												<view :style='{"boxShadow":"0 0 2rpx rgba(0,0,0,.8)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"#ccc","margin":"0","borderWidth":"0","borderStyle":"solid","height":"108rpx"}' class="cu-form-group select">
				<view :style='{"width":"22%","fontSize":"24rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left"}' class="title">商品类型</view>
				<picker @change="shangpinleixingChange" :value="shangpinleixingIndex" :range="shangpinleixingOptions">
					<view :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(0,0,0,.6)","borderRadius":"16rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' class="uni-input">{{ruleForm.shangpinleixing?ruleForm.shangpinleixing:"请选择商品类型"}}</view>
				</picker>
			</view>
												<view :style='{"boxShadow":"0 0 2rpx rgba(0,0,0,.8)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"#ccc","margin":"0","borderWidth":"0","borderStyle":"solid","height":"88rpx"}' class="cu-form-group">
				<view :style='{"width":"22%","fontSize":"24rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left"}' class="title">商家账号</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(205, 205, 205, 1)","borderRadius":"16rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"26rpx","borderStyle":"solid","height":"60rpx"}' :disabled="ro.shangjiazhanghao" v-model="ruleForm.shangjiazhanghao" placeholder="商家账号"></input>
			</view>
												<view :style='{"boxShadow":"0 0 2rpx rgba(0,0,0,.8)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"#ccc","margin":"0","borderWidth":"0","borderStyle":"solid","height":"88rpx"}' class="cu-form-group">
				<view :style='{"width":"22%","fontSize":"24rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left"}' class="title">商铺名称</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(205, 205, 205, 1)","borderRadius":"16rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"26rpx","borderStyle":"solid","height":"60rpx"}' :disabled="ro.shangpumingcheng" v-model="ruleForm.shangpumingcheng" placeholder="商铺名称"></input>
			</view>
												<view :style='{"boxShadow":"0 0 2rpx rgba(0,0,0,.8)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"#ccc","margin":"0","borderWidth":"0","borderStyle":"solid","height":"88rpx"}' class="cu-form-group">
				<view :style='{"width":"22%","fontSize":"24rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left"}' class="title">商品原价</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(205, 205, 205, 1)","borderRadius":"16rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"26rpx","borderStyle":"solid","height":"60rpx"}' :disabled="ro.shangpinyuanjia" v-model="ruleForm.shangpinyuanjia" placeholder="商品原价"></input>
			</view>
												<view :style='{"boxShadow":"0 0 2rpx rgba(0,0,0,.8)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"#ccc","margin":"0","borderWidth":"0","borderStyle":"solid","height":"88rpx"}' class="cu-form-group">
				<view :style='{"width":"22%","fontSize":"24rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left"}' class="title">商品现价</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(205, 205, 205, 1)","borderRadius":"16rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"26rpx","borderStyle":"solid","height":"60rpx"}' :disabled="ro.shangpinxianjia" v-model="ruleForm.shangpinxianjia" placeholder="商品现价"></input>
			</view>
												<view :style='{"boxShadow":"0 0 2rpx rgba(0,0,0,.8)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"#ccc","margin":"0","borderWidth":"0","borderStyle":"solid","height":"88rpx"}' class="cu-form-group">
				<view :style='{"width":"22%","fontSize":"24rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left"}' class="title">团购最低人数</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(205, 205, 205, 1)","borderRadius":"16rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"26rpx","borderStyle":"solid","height":"60rpx"}' :disabled="ro.tuangouzuidirenshu" v-model="ruleForm.tuangouzuidirenshu" placeholder="团购最低人数"></input>
			</view>
												<view :style='{"boxShadow":"0 0 2rpx rgba(0,0,0,.8)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"#ccc","margin":"0","borderWidth":"0","borderStyle":"solid","height":"88rpx"}' class="cu-form-group">
				<view :style='{"width":"22%","fontSize":"24rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left"}' class="title">商品折扣</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(205, 205, 205, 1)","borderRadius":"16rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"26rpx","borderStyle":"solid","height":"60rpx"}' :disabled="ro.shangpinzhekou" v-model="ruleForm.shangpinzhekou" placeholder="商品折扣"></input>
			</view>
												<view :style='{"boxShadow":"0 0 2rpx rgba(0,0,0,.8)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"#ccc","margin":"0","borderWidth":"0","borderStyle":"solid","height":"88rpx"}' class="cu-form-group">
				<view :style='{"width":"22%","fontSize":"24rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left"}' class="title">团购开始时间</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(205, 205, 205, 1)","borderRadius":"16rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"26rpx","borderStyle":"solid","height":"60rpx"}' v-model="ruleForm.tuangoukaishishijian" placeholder="团购开始时间" @tap="toggleTab('tuangoukaishishijian')"></input>
			</view>
												<view :style='{"boxShadow":"0 0 2rpx rgba(0,0,0,.8)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"#ccc","margin":"0","borderWidth":"0","borderStyle":"solid","height":"88rpx"}' class="cu-form-group">
				<view :style='{"width":"22%","fontSize":"24rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left"}' class="title">团购结束时间</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(205, 205, 205, 1)","borderRadius":"16rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"26rpx","borderStyle":"solid","height":"60rpx"}' v-model="ruleForm.tuangoujieshushijian" placeholder="团购结束时间" @tap="toggleTab('tuangoujieshushijian')"></input>
			</view>
																					<view :style='{"boxShadow":"0 0 2rpx rgba(0,0,0,.8)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"#ccc","margin":"0","borderWidth":"0","borderStyle":"solid","height":"108rpx"}' class="cu-form-group select">
				<view :style='{"width":"22%","fontSize":"24rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left"}' class="title">可提货点</view>
				<picker @change="ketihuodianChange" :value="ketihuodianIndex" :range="ketihuodianOptions">
					<view :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(0,0,0,.6)","borderRadius":"16rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' class="uni-input">{{ruleForm.ketihuodian?ruleForm.ketihuodian:"请选择可提货点"}}</view>
				</picker>
			</view>
																														<view :style='{"boxShadow":"0 0 2rpx rgba(0,0,0,.8)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"#ccc","margin":"0","borderWidth":"0","borderStyle":"solid","height":"88rpx"}' class="cu-form-group">
				<view :style='{"width":"22%","fontSize":"24rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left"}' class="title">积分</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(205, 205, 205, 1)","borderRadius":"16rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"26rpx","borderStyle":"solid","height":"60rpx"}' :disabled="ro.jifen" v-model="ruleForm.jifen" placeholder="积分"></input>
			</view>
												<view :style='{"boxShadow":"0 0 2rpx rgba(0,0,0,.8)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"#ccc","margin":"0","borderWidth":"0","borderStyle":"solid","height":"88rpx"}' class="cu-form-group">
				<view :style='{"width":"22%","fontSize":"24rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left"}' class="title">价格</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(205, 205, 205, 1)","borderRadius":"16rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"26rpx","borderStyle":"solid","height":"60rpx"}' :disabled="ro.price" v-model="ruleForm.price" placeholder="价格"></input>
			</view>
									
			<!-- 否 -->
 
			
			          				          				          				          				          				          				          				          				          				          				          				          				          				          				          				          				          							
			          				          				          				          				          				          				          				          				          				          				          				          				<view :style='{"boxShadow":"0 0 2rpx rgba(0,0,0,.8)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"#ccc","margin":"0","borderWidth":"0","borderStyle":"solid","height":"auto"}' class="cu-form-group">
				<view :style='{"width":"22%","fontSize":"24rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left"}' class="title">商品描述</view>
				<textarea :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(205, 205, 205, 1)","borderRadius":"16rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"200rpx"}' v-model="ruleForm.shangpinmiaoshu" placeholder="商品描述"></textarea>
			</view>
						          				          				          				          				          							
			<view class="btn">
				<button :style='{"boxShadow":"0 0 0px rgba(0,0,0,0) inset","backgroundColor":"rgba(242, 199, 68, 1)","borderColor":"rgba(57, 78, 99, 1)","borderRadius":"40rpx","color":"rgba(0, 0, 0, 1)","borderWidth":"0","width":"40%","fontSize":"28rpx","borderStyle":"solid","height":"76rpx"}' @tap="onSubmitTap" class="bg-red">提交</button>
			</view>
		</form>

																																										<w-picker mode="dateTime" step="1" :current="false" :hasSecond="false" @confirm="tuangoukaishishijianConfirm" ref="tuangoukaishishijian" themeColor="#333333"></w-picker>
								<w-picker mode="dateTime" step="1" :current="false" :hasSecond="false" @confirm="tuangoujieshushijianConfirm" ref="tuangoujieshushijian" themeColor="#333333"></w-picker>
																<w-picker mode="dateTime" step="1" :current="false" :hasSecond="false" @confirm="reversetimeConfirm" ref="reversetime" themeColor="#333333"></w-picker>
																			
	</view>
</template>

<script>
	import wPicker from "@/components/w-picker/w-picker.vue";

	export default {
		data() {
			return {
				ruleForm: {
												shangpinmingcheng: '',
																shangpintupian: '',
																shangpinleixing: '',
																shangjiazhanghao: '',
																shangpumingcheng: '',
																shangpinyuanjia: '',
																shangpinxianjia: '',
																tuangouzuidirenshu: '',
																shangpinzhekou: '',
																tuangoukaishishijian: '',
																tuangoujieshushijian: '',
																shangpinmiaoshu: '',
																ketihuodian: '',
																reversetime: '',
																clicknum: '',
																jifen: '',
																price: '',
												},
																												shangpinleixingOptions: [],
				shangpinleixingIndex: 0,
																																																																																								ketihuodianOptions: [],
				ketihuodianIndex: 0,
																																												// 登陆用户信息
				user: {},
                                ro:{
                                   shangpinmingcheng : false,
                                   shangpintupian : false,
                                   shangpinleixing : false,
                                   shangjiazhanghao : false,
                                   shangpumingcheng : false,
                                   shangpinyuanjia : false,
                                   shangpinxianjia : false,
                                   tuangouzuidirenshu : false,
                                   shangpinzhekou : false,
                                   tuangoukaishishijian : false,
                                   tuangoujieshushijian : false,
                                   shangpinmiaoshu : false,
                                   ketihuodian : false,
                                   reversetime : false,
                                   clicknum : false,
                                   jifen : false,
                                   price : false,
                                },
			}
		},
		components: {
			wPicker
		},
		computed: {
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
					},
		async onLoad(options) {
			let table = uni.getStorageSync("nowTable");
			// 获取用户信息
			let res = await this.$api.session(table);
			this.user = res.data;
			
						// ss读取
																											this.ruleForm.shangjiazhanghao = this.user.shangjiazhanghao
												this.ruleForm.shangpumingcheng = this.user.shangpumingcheng
																																																																																	
																								// 下拉框
			res = await this.$api.option(`shangpinfenlei`,`shangpinleixing`,{});
			this.shangpinleixingOptions = res.data;
																																																																		// 下拉框
			res = await this.$api.option(`shequtihuodian`,`tihuodidian`,{});
			this.ketihuodianOptions = res.data;
																																	
			// 如果有登陆，获取登陆后保存的userid
			this.ruleForm.userid = uni.getStorageSync("userid")
			if (options.refid) {
				// 如果上一级页面传递了refid，获取改refid数据信息
				this.ruleForm.refid = options.refid;
				this.ruleForm.nickname = uni.getStorageSync("nickname");
			}
			// 如果是更新操作
			if (options.id) {
				this.ruleForm.id = options.id;
				// 获取信息
				res = await this.$api.info(`shangpinxinxi`, this.ruleForm.id);
				this.ruleForm = res.data;
			}
			// 跨表
			if(options.cross){
				var obj = uni.getStorageSync('crossObj');
				for (var o in obj){
					if(o=='shangpinmingcheng'){
					this.ruleForm.shangpinmingcheng = obj[o];
					this.ro.shangpinmingcheng = true;
					continue;
					}
					if(o=='shangpintupian'){
					this.ruleForm.shangpintupian = obj[o];
					this.ro.shangpintupian = true;
					continue;
					}
					if(o=='shangpinleixing'){
					this.ruleForm.shangpinleixing = obj[o];
					this.ro.shangpinleixing = true;
					continue;
					}
					if(o=='shangjiazhanghao'){
					this.ruleForm.shangjiazhanghao = obj[o];
					this.ro.shangjiazhanghao = true;
					continue;
					}
					if(o=='shangpumingcheng'){
					this.ruleForm.shangpumingcheng = obj[o];
					this.ro.shangpumingcheng = true;
					continue;
					}
					if(o=='shangpinyuanjia'){
					this.ruleForm.shangpinyuanjia = obj[o];
					this.ro.shangpinyuanjia = true;
					continue;
					}
					if(o=='shangpinxianjia'){
					this.ruleForm.shangpinxianjia = obj[o];
					this.ro.shangpinxianjia = true;
					continue;
					}
					if(o=='tuangouzuidirenshu'){
					this.ruleForm.tuangouzuidirenshu = obj[o];
					this.ro.tuangouzuidirenshu = true;
					continue;
					}
					if(o=='shangpinzhekou'){
					this.ruleForm.shangpinzhekou = obj[o];
					this.ro.shangpinzhekou = true;
					continue;
					}
					if(o=='tuangoukaishishijian'){
					this.ruleForm.tuangoukaishishijian = obj[o];
					this.ro.tuangoukaishishijian = true;
					continue;
					}
					if(o=='tuangoujieshushijian'){
					this.ruleForm.tuangoujieshushijian = obj[o];
					this.ro.tuangoujieshushijian = true;
					continue;
					}
					if(o=='shangpinmiaoshu'){
					this.ruleForm.shangpinmiaoshu = obj[o];
					this.ro.shangpinmiaoshu = true;
					continue;
					}
					if(o=='ketihuodian'){
					this.ruleForm.ketihuodian = obj[o];
					this.ro.ketihuodian = true;
					continue;
					}
					if(o=='reversetime'){
					this.ruleForm.reversetime = obj[o];
					this.ro.reversetime = true;
					continue;
					}
					if(o=='clicknum'){
					this.ruleForm.clicknum = obj[o];
					this.ro.clicknum = true;
					continue;
					}
					if(o=='jifen'){
					this.ruleForm.jifen = obj[o];
					this.ro.jifen = true;
					continue;
					}
					if(o=='price'){
					this.ruleForm.price = obj[o];
					this.ro.price = true;
					continue;
					}
				}
			}
			this.styleChange()
		},
		methods: {
			styleChange() {
				this.$nextTick(()=>{
					// document.querySelectorAll('.app-update-pv .cu-form-group .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.addUpdateForm.input.content.backgroundColor
					// })
				})
			},
																																																																																																												
			// 多级联动参数
																																																																																																												
																																																																																																									
																																																															// 日长控件选择日期时间
			tuangoukaishishijianConfirm(val) {
				console.log(val)
				this.ruleForm.tuangoukaishishijian = val.result;
				this.$forceUpdate();
			},
												// 日长控件选择日期时间
			tuangoujieshushijianConfirm(val) {
				console.log(val)
				this.ruleForm.tuangoujieshushijian = val.result;
				this.$forceUpdate();
			},
																								// 日长控件选择日期时间
			reversetimeConfirm(val) {
				console.log(val)
				this.ruleForm.reversetime = val.result;
				this.$forceUpdate();
			},
																								
																					// 下拉变化
			shangpinleixingChange(e) {
				this.shangpinleixingIndex = e.target.value
				this.ruleForm.shangpinleixing = this.shangpinleixingOptions[this.shangpinleixingIndex]
			},
																																																																		// 下拉变化
			ketihuodianChange(e) {
				this.ketihuodianIndex = e.target.value
				this.ruleForm.ketihuodian = this.ketihuodianOptions[this.ketihuodianIndex]
			},
																														
																		shangpintupianTap() {
				let _this = this;
				this.$api.upload(function(res) {
					_this.ruleForm.shangpintupian = _this.$base.url + 'upload/' + res.file;
					_this.$forceUpdate();
					_this.$nextTick(()=>{
						_this.styleChange()
					})
				});
			},
																																																																																																																																																
			getUUID () {
				return new Date().getTime();
			},
			async onSubmitTap() {
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																								if(this.ruleForm.shangpinyuanjia&&(!this.$validate.isIntNumer(this.ruleForm.shangpinyuanjia))){
					this.$utils.msg(`商品原价应输入整数`);
					return
				}
																																												if(this.ruleForm.shangpinxianjia&&(!this.$validate.isIntNumer(this.ruleForm.shangpinxianjia))){
					this.$utils.msg(`商品现价应输入整数`);
					return
				}
																																												if(this.ruleForm.tuangouzuidirenshu&&(!this.$validate.isIntNumer(this.ruleForm.tuangouzuidirenshu))){
					this.$utils.msg(`团购最低人数应输入整数`);
					return
				}
																																																																																																																																																																																																																																																																				if(this.ruleForm.clicknum&&(!this.$validate.isIntNumer(this.ruleForm.clicknum))){
					this.$utils.msg(`点击次数应输入整数`);
					return
				}
																																												if(this.ruleForm.jifen&&(!this.$validate.isIntNumer(this.ruleForm.jifen))){
					this.$utils.msg(`积分应输入整数`);
					return
				}
																																								if((!this.ruleForm.price)){
					this.$utils.msg(`价格不能为空`);
					return
				}
																if(this.ruleForm.price&&(!this.$validate.isNumber(this.ruleForm.price))){
					this.$utils.msg(`价格应输入数字`);
					return
				}
																																if(this.ruleForm.id){
					await this.$api.update(`shangpinxinxi`, this.ruleForm);
				}else{
					await this.$api.add(`shangpinxinxi`, this.ruleForm);
				}
				this.$utils.msgBack('提交成功');
			},
			optionsChange(e) {
				this.index = e.target.value
			},
			bindDateChange(e) {
				this.date = e.target.value
			},
			getDate(type) {
				const date = new Date();
				let year = date.getFullYear();
				let month = date.getMonth() + 1;
				let day = date.getDate();
				if (type === 'start') {
					year = year - 60;
				} else if (type === 'end') {
					year = year + 2;
				}
				month = month > 9 ? month : '0' + month;;
				day = day > 9 ? day : '0' + day;
				return `${year}-${month}-${day}`;
			},
			toggleTab(str) {
				this.$refs[str].show();
			}
		}
	}
</script>

<style lang="scss" scoped>
	.container {
		padding: 20upx;
	}
	
	.content:after {
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

	textarea {
		border: 1upx solid #EEEEEE;
		border-radius: 20upx;
		padding: 20upx;
	}

	.title {
		width: 180upx;
	}

	.avator {
		width: 150upx;
		height: 60upx;
	}

	.right-input {
		flex: 1;
		text-align: left;
		padding: 0 24upx;
	}
	
	.cu-form-group.active {
		justify-content: space-between;
	}
	
	.btn {
	  display: flex;
	  align-items: center;
	  justify-content: center;
	  flex-wrap: wrap;
	  padding: 20upx 0;
	}
	
	.cu-form-group {
		padding: 0 24upx;
		background-color: transparent;
		min-height: inherit;
	}
	
	.cu-form-group+.cu-form-group {
		border: 0;
	}
	
	.cu-form-group uni-input {
		padding: 0 30upx;
	}
	
	.uni-input {
		padding: 0 30upx;
	}
	
	.cu-form-group uni-textarea {
		padding: 30upx;
		margin: 0;
	}
	
	.cu-form-group uni-picker::after {
		line-height: 88rpx;
	}
	
	.select .uni-input {
		line-height: 88rpx;
	}
	
	.input .right-input {
		line-height: 60rpx;
	}
</style>
