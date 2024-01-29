<template>
	<view class="content">
		<view class="logo" v-if="false">
			<image :style='{"boxShadow":"0 0 16rpx #59f43e","borderColor":"#ccc","borderRadius":"40rpx","borderWidth":"2rpx","width":"160rpx","borderStyle":"solid","url":"http://codegen.caihongy.cn/20201024/ed5e326ca66f403aa3197b5fbb4ec733.jpg","isShow":false,"height":"160rpx"}' src='http://codegen.caihongy.cn/20201024/ed5e326ca66f403aa3197b5fbb4ec733.jpg' mode="aspectFill"></image>
		</view>
		<view v-if="tableName=='huiyuan'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(242, 199, 68, 1)","backgroundColor":"#fff","borderRadius":"32rpx","color":"#333","textAlign":"left","borderWidth":"4rpx 4rpx 4rpx 4rpx","fontSize":"24rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.huiyuanzhanghao" type="text" class="uni-input" name="" placeholder="会员账号" />
		</view>
		<view v-if="tableName=='huiyuan'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(242, 199, 68, 1)","backgroundColor":"#fff","borderRadius":"32rpx","color":"#333","textAlign":"left","borderWidth":"4rpx 4rpx 4rpx 4rpx","fontSize":"24rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.mima" type="text" class="uni-input" name="" placeholder="密码" />
		</view>
		<view v-if="tableName=='huiyuan'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(242, 199, 68, 1)","backgroundColor":"#fff","borderRadius":"32rpx","color":"#333","textAlign":"left","borderWidth":"4rpx 4rpx 4rpx 4rpx","fontSize":"24rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.huiyuanxingming" type="text" class="uni-input" name="" placeholder="会员姓名" />
		</view>
		<view v-if="tableName=='huiyuan'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(242, 199, 68, 1)","backgroundColor":"#fff","borderRadius":"32rpx","color":"#333","textAlign":"left","borderWidth":"4rpx 4rpx 4rpx 4rpx","fontSize":"24rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.shouji" type="text" class="uni-input" name="" placeholder="手机" />
		</view>
		<view v-if="tableName=='huiyuan'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(242, 199, 68, 1)","backgroundColor":"#fff","borderRadius":"32rpx","color":"#333","textAlign":"left","borderWidth":"4rpx 4rpx 4rpx 4rpx","fontSize":"24rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.youxiang" type="text" class="uni-input" name="" placeholder="邮箱" />
		</view>
		<view v-if="tableName=='huiyuan'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(242, 199, 68, 1)","backgroundColor":"#fff","borderRadius":"32rpx","color":"#333","textAlign":"left","borderWidth":"4rpx 4rpx 4rpx 4rpx","fontSize":"24rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.shenfenzheng" type="text" class="uni-input" name="" placeholder="身份证" />
		</view>
		<view v-if="tableName=='shangjia'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(242, 199, 68, 1)","backgroundColor":"#fff","borderRadius":"32rpx","color":"#333","textAlign":"left","borderWidth":"4rpx 4rpx 4rpx 4rpx","fontSize":"24rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.shangjiazhanghao" type="text" class="uni-input" name="" placeholder="商家账号" />
		</view>
		<view v-if="tableName=='shangjia'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(242, 199, 68, 1)","backgroundColor":"#fff","borderRadius":"32rpx","color":"#333","textAlign":"left","borderWidth":"4rpx 4rpx 4rpx 4rpx","fontSize":"24rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.mima" type="text" class="uni-input" name="" placeholder="密码" />
		</view>
		<view v-if="tableName=='shangjia'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(242, 199, 68, 1)","backgroundColor":"#fff","borderRadius":"32rpx","color":"#333","textAlign":"left","borderWidth":"4rpx 4rpx 4rpx 4rpx","fontSize":"24rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.xingming" type="text" class="uni-input" name="" placeholder="姓名" />
		</view>
		<view v-if="tableName=='shangjia'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(242, 199, 68, 1)","backgroundColor":"#fff","borderRadius":"32rpx","color":"#333","textAlign":"left","borderWidth":"4rpx 4rpx 4rpx 4rpx","fontSize":"24rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.shouji" type="text" class="uni-input" name="" placeholder="手机" />
		</view>
		<view v-if="tableName=='shangjia'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(242, 199, 68, 1)","backgroundColor":"#fff","borderRadius":"32rpx","color":"#333","textAlign":"left","borderWidth":"4rpx 4rpx 4rpx 4rpx","fontSize":"24rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.youxiang" type="text" class="uni-input" name="" placeholder="邮箱" />
		</view>
		<view v-if="tableName=='shangjia'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(242, 199, 68, 1)","backgroundColor":"#fff","borderRadius":"32rpx","color":"#333","textAlign":"left","borderWidth":"4rpx 4rpx 4rpx 4rpx","fontSize":"24rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.shenfenzheng" type="text" class="uni-input" name="" placeholder="身份证" />
		</view>
		<view v-if="tableName=='shangjia'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(242, 199, 68, 1)","backgroundColor":"#fff","borderRadius":"32rpx","color":"#333","textAlign":"left","borderWidth":"4rpx 4rpx 4rpx 4rpx","fontSize":"24rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.shangpumingcheng" type="text" class="uni-input" name="" placeholder="商铺名称" />
		</view>
		<view v-if="tableName=='shangjia'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(242, 199, 68, 1)","backgroundColor":"#fff","borderRadius":"32rpx","color":"#333","textAlign":"left","borderWidth":"4rpx 4rpx 4rpx 4rpx","fontSize":"24rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.shangpudizhi" type="text" class="uni-input" name="" placeholder="商铺地址" />
		</view>
		<view v-if="tableName=='shangjia'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(242, 199, 68, 1)","backgroundColor":"#fff","borderRadius":"32rpx","color":"#333","textAlign":"left","borderWidth":"4rpx 4rpx 4rpx 4rpx","fontSize":"24rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.jingyingfanwei" type="text" class="uni-input" name="" placeholder="经营范围" />
		</view>
		<view>
			<button @tap="register" type="primary" :style='{"borderColor":"#ccc","backgroundColor":"rgba(242, 199, 68, 1)","borderRadius":"6rpx","color":"rgba(0, 0, 0, 1)","borderWidth":"0px","fontSize":"30rpx","borderStyle":"solid","height":"76rpx"}'>注册</button>
		</view>
	</view>
</template>

<script>
	export default {
		data() {
			return {
				ruleForm: {
				},
				tableName:""
			}
		},
		async onLoad() {
			let res = [];
			let table = uni.getStorageSync("loginTable");
	    		this.tableName = table;

			
			this.styleChange()
		},
		methods: {

			styleChange() {
				this.$nextTick(()=>{
					// document.querySelectorAll('.uni-input .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.registerFrom.content.input.backgroundColor
					// })
				})
			},
			// 获取uuid
			getUUID () {
				return new Date().getTime();
			},
			// 注册
			async register() {
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
				await this.$api.register(`${this.tableName}`, this.ruleForm);
				this.$utils.msgBack('注册成功');;
			}
		}
	}
</script>

<style lang="scss" scoped>
	$color-primary: #b49950;

	.content {
		padding: 100upx;
	}
	
	.content:after {
		position: fixed;
		top: 0;
		right: 0;
		left: 0;
		bottom: 0;
		content: '';
				background-image: url(http://codegen.caihongy.cn/20210319/b8394cadb54b46f3b5bdcad6f3ad3aa9.jpg);
				background-attachment: fixed;
		background-size: cover;
		background-position: center;
	}

	.logo {
		text-align: center;

		image {
			height: 200upx;
			width: 200upx;
			margin: 0 0 60upx;
		}
	}

	.uni-form-item {
		margin-bottom: 40upx;
		padding: 0;

		.uni-input {
			font-size: 30upx;
			padding: 7px 0;
		}
	}

	button[type="primary"] {
		background-color: $color-primary;
		border-radius: 0;
		font-size: 34upx;
		margin-top: 60upx;
	}

	.links {
		text-align: center;
		margin-top: 40upx;
		font-size: 26upx;
		color: #999;

		view {
			display: inline-block;
			vertical-align: top;
			margin: 0 10upx;
		}

		.link-highlight {
			color: $color-primary
		}
	}
.picker-select-input {
	line-height: 80rpx;
}

</style>
