<template>
	<view class="content">
		<view :style='{"boxShadow":"0 0 2rpx rgba(0,0,0,.4)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"#ccc","margin":"0 0 0px 0","borderWidth":"0","borderStyle":"solid","height":"100rpx"}' v-if="tableName=='huiyuan'" class="cu-form-group">
			<view class="title" :style='{"width":"20%","fontSize":"24rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left"}'>会员账号</view>
			<input  style="padding: 0 30upx" :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(205, 205, 205, 1)","borderRadius":"12rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"24rpx","borderStyle":"solid","height":"72rpx"}' v-model="ruleForm.huiyuanzhanghao" placeholder="会员账号"></input>
		</view>
		<view :style='{"boxShadow":"0 0 2rpx rgba(0,0,0,.4)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"#ccc","margin":"0 0 0px 0","borderWidth":"0","borderStyle":"solid","height":"100rpx"}' v-if="tableName=='huiyuan'" class="cu-form-group">
			<view class="title" :style='{"width":"20%","fontSize":"24rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left"}'>密码</view>
			<input type="password" style="padding: 0 30upx" :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(205, 205, 205, 1)","borderRadius":"12rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"24rpx","borderStyle":"solid","height":"72rpx"}' v-model="ruleForm.mima" placeholder="密码"></input>
		</view>
		<view :style='{"boxShadow":"0 0 2rpx rgba(0,0,0,.4)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"#ccc","margin":"0 0 0px 0","borderWidth":"0","borderStyle":"solid","height":"100rpx"}' v-if="tableName=='huiyuan'" class="cu-form-group">
			<view class="title" :style='{"width":"20%","fontSize":"24rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left"}'>会员姓名</view>
			<input  style="padding: 0 30upx" :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(205, 205, 205, 1)","borderRadius":"12rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"24rpx","borderStyle":"solid","height":"72rpx"}' v-model="ruleForm.huiyuanxingming" placeholder="会员姓名"></input>
		</view>
		<view :style='{"boxShadow":"0 0 2rpx rgba(0,0,0,.4)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"#ccc","margin":"0 0 0px 0","borderWidth":"0","borderStyle":"solid","height":"100rpx"}' v-if="tableName=='huiyuan'" class="cu-form-group">
			<view class="title" :style='{"width":"20%","fontSize":"24rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left"}'>手机</view>
			<input  style="padding: 0 30upx" :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(205, 205, 205, 1)","borderRadius":"12rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"24rpx","borderStyle":"solid","height":"72rpx"}' v-model="ruleForm.shouji" placeholder="手机"></input>
		</view>
		<view :style='{"boxShadow":"0 0 2rpx rgba(0,0,0,.4)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"#ccc","margin":"0 0 0px 0","borderWidth":"0","borderStyle":"solid","height":"100rpx"}' v-if="tableName=='huiyuan'" class="cu-form-group">
			<view class="title" :style='{"width":"20%","fontSize":"24rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left"}'>邮箱</view>
			<input  style="padding: 0 30upx" :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(205, 205, 205, 1)","borderRadius":"12rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"24rpx","borderStyle":"solid","height":"72rpx"}' v-model="ruleForm.youxiang" placeholder="邮箱"></input>
		</view>
		<view :style='{"boxShadow":"0 0 2rpx rgba(0,0,0,.4)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"#ccc","margin":"0 0 0px 0","borderWidth":"0","borderStyle":"solid","height":"100rpx"}' v-if="tableName=='huiyuan'" class="cu-form-group">
			<view class="title" :style='{"width":"20%","fontSize":"24rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left"}'>身份证</view>
			<input  style="padding: 0 30upx" :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(205, 205, 205, 1)","borderRadius":"12rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"24rpx","borderStyle":"solid","height":"72rpx"}' v-model="ruleForm.shenfenzheng" placeholder="身份证"></input>
		</view>
		<view :style='{"boxShadow":"0 0 2rpx rgba(0,0,0,.4)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"#ccc","margin":"0 0 0px 0","borderWidth":"0","borderStyle":"solid","height":"100rpx"}' v-if="tableName=='huiyuan'" @tap="huiyuantouxiangTap" class="cu-form-group" :class="left == 'left'?'':'active'">
			<view class="title" :style='{"width":"20%","fontSize":"24rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left"}'>头像</view>
			<view style="flex: 1;textAlign:left">
				<image :style='{"width":"96rpx","boxShadow":"0 0 16rpx rgba(0,0,0,.3)","borderRadius":"0","textAlign":"left","height":"96rpx"}' v-if="ruleForm.touxiang" style="margin: 0;" class="avator" :src="ruleForm.touxiang" mode=""></image>
				<image :style='{"width":"96rpx","boxShadow":"0 0 16rpx rgba(0,0,0,.3)","borderRadius":"0","textAlign":"left","height":"96rpx"}' v-else class="avator" style="margin: 0;" src="../../static/center/face.jpeg" mode=""></image>
			</view>
		</view>
		<view :style='{"boxShadow":"0 0 2rpx rgba(0,0,0,.4)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"#ccc","margin":"0 0 0px 0","borderWidth":"0","borderStyle":"solid","height":"100rpx"}' v-if="tableName=='huiyuan'" class="cu-form-group">
			<view :style='{"width":"20%","fontSize":"24rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left"}' class="title">积分</view>
			<view style="padding: 0 30upx" :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(205, 205, 205, 1)","borderRadius":"12rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"24rpx","borderStyle":"solid","height":"72rpx"}' class="right-input">
				{{ruleForm.jifen}}
			</view>
		</view>
		<view :style='{"boxShadow":"0 0 2rpx rgba(0,0,0,.4)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"#ccc","margin":"0 0 0px 0","borderWidth":"0","borderStyle":"solid","height":"100rpx"}' v-if="tableName=='shangjia'" class="cu-form-group">
			<view class="title" :style='{"width":"20%","fontSize":"24rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left"}'>商家账号</view>
			<input  style="padding: 0 30upx" :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(205, 205, 205, 1)","borderRadius":"12rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"24rpx","borderStyle":"solid","height":"72rpx"}' v-model="ruleForm.shangjiazhanghao" placeholder="商家账号"></input>
		</view>
		<view :style='{"boxShadow":"0 0 2rpx rgba(0,0,0,.4)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"#ccc","margin":"0 0 0px 0","borderWidth":"0","borderStyle":"solid","height":"100rpx"}' v-if="tableName=='shangjia'" class="cu-form-group">
			<view class="title" :style='{"width":"20%","fontSize":"24rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left"}'>密码</view>
			<input type="password" style="padding: 0 30upx" :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(205, 205, 205, 1)","borderRadius":"12rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"24rpx","borderStyle":"solid","height":"72rpx"}' v-model="ruleForm.mima" placeholder="密码"></input>
		</view>
		<view :style='{"boxShadow":"0 0 2rpx rgba(0,0,0,.4)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"#ccc","margin":"0 0 0px 0","borderWidth":"0","borderStyle":"solid","height":"100rpx"}' v-if="tableName=='shangjia'" class="cu-form-group">
			<view class="title" :style='{"width":"20%","fontSize":"24rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left"}'>姓名</view>
			<input  style="padding: 0 30upx" :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(205, 205, 205, 1)","borderRadius":"12rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"24rpx","borderStyle":"solid","height":"72rpx"}' v-model="ruleForm.xingming" placeholder="姓名"></input>
		</view>
		<view :style='{"boxShadow":"0 0 2rpx rgba(0,0,0,.4)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"#ccc","margin":"0 0 0px 0","borderWidth":"0","borderStyle":"solid","height":"100rpx"}' v-if="tableName=='shangjia'" class="cu-form-group">
			<view class="title" :style='{"width":"20%","fontSize":"24rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left"}'>手机</view>
			<input  style="padding: 0 30upx" :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(205, 205, 205, 1)","borderRadius":"12rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"24rpx","borderStyle":"solid","height":"72rpx"}' v-model="ruleForm.shouji" placeholder="手机"></input>
		</view>
		<view :style='{"boxShadow":"0 0 2rpx rgba(0,0,0,.4)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"#ccc","margin":"0 0 0px 0","borderWidth":"0","borderStyle":"solid","height":"100rpx"}' v-if="tableName=='shangjia'" class="cu-form-group">
			<view class="title" :style='{"width":"20%","fontSize":"24rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left"}'>邮箱</view>
			<input  style="padding: 0 30upx" :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(205, 205, 205, 1)","borderRadius":"12rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"24rpx","borderStyle":"solid","height":"72rpx"}' v-model="ruleForm.youxiang" placeholder="邮箱"></input>
		</view>
		<view :style='{"boxShadow":"0 0 2rpx rgba(0,0,0,.4)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"#ccc","margin":"0 0 0px 0","borderWidth":"0","borderStyle":"solid","height":"100rpx"}' v-if="tableName=='shangjia'" class="cu-form-group">
			<view class="title" :style='{"width":"20%","fontSize":"24rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left"}'>身份证</view>
			<input  style="padding: 0 30upx" :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(205, 205, 205, 1)","borderRadius":"12rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"24rpx","borderStyle":"solid","height":"72rpx"}' v-model="ruleForm.shenfenzheng" placeholder="身份证"></input>
		</view>
		<view :style='{"boxShadow":"0 0 2rpx rgba(0,0,0,.4)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"#ccc","margin":"0 0 0px 0","borderWidth":"0","borderStyle":"solid","height":"100rpx"}' v-if="tableName=='shangjia'" class="cu-form-group">
			<view class="title" :style='{"width":"20%","fontSize":"24rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left"}'>商铺名称</view>
			<input  style="padding: 0 30upx" :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(205, 205, 205, 1)","borderRadius":"12rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"24rpx","borderStyle":"solid","height":"72rpx"}' v-model="ruleForm.shangpumingcheng" placeholder="商铺名称"></input>
		</view>
		<view :style='{"boxShadow":"0 0 2rpx rgba(0,0,0,.4)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"#ccc","margin":"0 0 0px 0","borderWidth":"0","borderStyle":"solid","height":"100rpx"}' v-if="tableName=='shangjia'" @tap="shangjiashangputupianTap" class="cu-form-group" :class="left == 'left'?'':'active'">
			<view class="title" :style='{"width":"20%","fontSize":"24rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left"}'>商铺图片</view>
			<view style="flex: 1;textAlign:left">
				<image :style='{"width":"96rpx","boxShadow":"0 0 16rpx rgba(0,0,0,.3)","borderRadius":"0","textAlign":"left","height":"96rpx"}' v-if="ruleForm.shangputupian" style="margin: 0;" class="avator" :src="ruleForm.shangputupian" mode=""></image>
				<image :style='{"width":"96rpx","boxShadow":"0 0 16rpx rgba(0,0,0,.3)","borderRadius":"0","textAlign":"left","height":"96rpx"}' v-else class="avator" style="margin: 0;" src="../../static/center/face.jpeg" mode=""></image>
			</view>
		</view>
		<view :style='{"boxShadow":"0 0 2rpx rgba(0,0,0,.4)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"#ccc","margin":"0 0 0px 0","borderWidth":"0","borderStyle":"solid","height":"100rpx"}' v-if="tableName=='shangjia'" class="cu-form-group">
			<view class="title" :style='{"width":"20%","fontSize":"24rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left"}'>商铺地址</view>
			<input  style="padding: 0 30upx" :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(205, 205, 205, 1)","borderRadius":"12rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"24rpx","borderStyle":"solid","height":"72rpx"}' v-model="ruleForm.shangpudizhi" placeholder="商铺地址"></input>
		</view>
		<view :style='{"boxShadow":"0 0 2rpx rgba(0,0,0,.4)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"#ccc","margin":"0 0 0px 0","borderWidth":"0","borderStyle":"solid","height":"100rpx"}' v-if="tableName=='shangjia'" class="cu-form-group">
			<view class="title" :style='{"width":"20%","fontSize":"24rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left"}'>经营范围</view>
			<input  style="padding: 0 30upx" :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(205, 205, 205, 1)","borderRadius":"12rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"24rpx","borderStyle":"solid","height":"72rpx"}' v-model="ruleForm.jingyingfanwei" placeholder="经营范围"></input>
		</view>
		<view :style='{"boxShadow":"0 0 2rpx rgba(0,0,0,.4)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"#ccc","margin":"0 0 0px 0","borderWidth":"0","borderStyle":"solid","height":"100rpx"}' v-if="tableName=='shangjia'" class="cu-form-group">
			<view :style='{"width":"20%","fontSize":"24rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left"}' class="title">积分</view>
			<view style="padding: 0 30upx" :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(205, 205, 205, 1)","borderRadius":"12rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"24rpx","borderStyle":"solid","height":"72rpx"}' class="right-input">
				{{ruleForm.jifen}}
			</view>
		</view>
		
		<view class="btn">
			<view class="box" :style="{width: 'auto'}">
				<button @tap="update()" class="cu-btn lg" :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,0) inset","backgroundColor":"rgba(242, 199, 68, 1)","borderColor":"rgba(25, 25, 30, 1)","borderRadius":"8rpx","color":"rgba(0, 0, 0, 1)","borderWidth":"1","width":"auto","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}'>保存</button>
			</view>

			<view class="box" :style="{width: 'auto'}">
				<button @tap="logout()" class="cu-btn lg" :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,0) inset","backgroundColor":"rgba(25, 25, 30, 1)","borderColor":"rgba(242, 199, 68, 1)","borderRadius":"8rpx","color":"rgba(242, 199, 68, 1)","borderWidth":"2rpx","width":"auto","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}'>退出登录</button>
			</view>
		</view>
	</view>
</template>

<script>
	export default {
		data() {
			return {
				ruleForm: {
				},
				tableName:"",
			}
		},
		async onLoad() {
			let table = uni.getStorageSync("nowTable");
			let res = await this.$api.session(table);
			this.ruleForm = res.data;
			this.tableName = table;
			this.styleChange()
		},
		methods: {
			styleChange() {
				this.$nextTick(()=>{
					// document.querySelectorAll('.cu-form-group .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.userInfoForm.list.input.backgroundColor
					// })
				})
			},
			// 获取uuid
			getUUID () {
				return new Date().getTime();
			},
			logout() {
				uni.setStorageSync('token', '');
				this.$utils.jump('../login/login');
			},
			// 注册
			async update() {
				if((!this.ruleForm.huiyuanzhanghao) && `huiyuan` == this.tableName){
					this.$utils.msg(`会员账号不能为空`);
					return
				}
				if((!this.ruleForm.mima) && `huiyuan` == this.tableName){
					this.$utils.msg(`密码不能为空`);
					return
				}
				if(`huiyuan` == this.tableName && this.ruleForm.shouji&&(!this.$validate.isMobile(this.ruleForm.shouji))){
					this.$utils.msg(`手机应输入手机格式`);
					return
				}
				if(`huiyuan` == this.tableName && this.ruleForm.youxiang&&(!this.$validate.isEmail(this.ruleForm.youxiang))){
					this.$utils.msg(`邮箱应输入邮件格式`);
					return
				}
				if(`huiyuan` == this.tableName && this.ruleForm.shenfenzheng&&(!this.$validate.checkIdCard(this.ruleForm.shenfenzheng))){
					this.$utils.msg(`身份证应输入身份证格式`);
					return
				}
				if(`huiyuan` == this.tableName && this.ruleForm.jifen&&(!this.$validate.isNumber(this.ruleForm.jifen))){
					this.$utils.msg(`积分应输入数字`);
					return
				}
				if(`huiyuan` == this.tableName && this.ruleForm.money&&(!this.$validate.isNumber(this.ruleForm.money))){
					this.$utils.msg(`余额应输入数字`);
					return
				}
				if(`shangjia` == this.tableName && this.ruleForm.shouji&&(!this.$validate.isMobile(this.ruleForm.shouji))){
					this.$utils.msg(`手机应输入手机格式`);
					return
				}
				if(`shangjia` == this.tableName && this.ruleForm.youxiang&&(!this.$validate.isEmail(this.ruleForm.youxiang))){
					this.$utils.msg(`邮箱应输入邮件格式`);
					return
				}
				if(`shangjia` == this.tableName && this.ruleForm.shenfenzheng&&(!this.$validate.checkIdCard(this.ruleForm.shenfenzheng))){
					this.$utils.msg(`身份证应输入身份证格式`);
					return
				}
				if(`shangjia` == this.tableName && this.ruleForm.jifen&&(!this.$validate.isNumber(this.ruleForm.jifen))){
					this.$utils.msg(`积分应输入数字`);
					return
				}
				if(`shangjia` == this.tableName && this.ruleForm.money&&(!this.$validate.isNumber(this.ruleForm.money))){
					this.$utils.msg(`余额应输入数字`);
					return
				}
				let table = uni.getStorageSync("nowTable");
				await this.$api.update(table, this.ruleForm);
				this.$utils.msgBack('修改成功');;
			}

			,huiyuantouxiangTap() {
				let _this = this;
				this.$api.upload(function(res) {
					_this.ruleForm.touxiang = _this.$base.url + 'upload/' + res.file;
					_this.$forceUpdate();
				});
			}
			,shangjiashangputupianTap() {
				let _this = this;
				this.$api.upload(function(res) {
					_this.ruleForm.shangputupian = _this.$base.url + 'upload/' + res.file;
					_this.$forceUpdate();
				});
			}
		}
	}
</script>

<style lang="scss" scoped>
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

	.avator {
		width: 110upx;
		height: 110upx;
		border-radius: 50%;
		margin-left: 30upx;
	}
	
	.cu-form-group.active {
		justify-content: space-between;
	}

	.cu-btn {
		width: 100%;
	}

	.right-input {
		flex: 1;
		text-align: left;
		line-height: 72rpx;
	}
	.btn {
	  display: flex;
	  align-items: center;
	  justify-content: center;
	  flex-wrap: wrap;
	  padding: 20upx 0;
	}
	
	.box {
	  width: auto;
	  padding: 0 10upx;
	  box-sizing: border-box;
	  margin-bottom: 20upx;
	}
	
	.cu-btn {
	  width: 100% !important;
	}

.picker-select-input {
	line-height: 72rpx;
}
</style>
