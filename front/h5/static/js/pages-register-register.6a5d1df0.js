(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["pages-register-register"],{"05cc":function(r,i,e){"use strict";var t=e("97fd"),o=e.n(t);o.a},"2e61":function(r,i,e){var t=e("24fb");i=t(!1),i.push([r.i,'@charset "UTF-8";\n/**\r\n * 这里是uni-app内置的常用样式变量\r\n *\r\n * uni-app 官方扩展插件及插件市场（https://ext.dcloud.net.cn）上很多三方插件均使用了这些样式变量\r\n * 如果你是插件开发者，建议你使用scss预处理，并在插件代码中直接使用这些变量（无需 import 这个文件），方便用户通过搭积木的方式开发整体风格一致的App\r\n *\r\n */\n/**\r\n * 如果你是App开发者（插件使用者），你可以通过修改这些变量来定制自己的插件主题，实现自定义主题功能\r\n *\r\n * 如果你的项目同样使用了scss预处理，你也可以直接在你的 scss 代码中使用如下变量，同时无需 import 这个文件\r\n */\n/* 颜色变量 */\n/* 行为相关颜色 */\n/* 文字基本颜色 */\n/* 背景颜色 */\n/* 边框颜色 */\n/* 尺寸变量 */\n/* 文字尺寸 */\n/* 图片尺寸 */\n/* Border Radius */\n/* 水平间距 */\n/* 垂直间距 */\n/* 透明度 */\n/* 文章场景相关 */.content[data-v-2b5dd12a]{height:calc(100vh - 44px);overflow:auto}.content[data-v-2b5dd12a]:after{position:fixed;top:0;right:0;left:0;bottom:0;content:"";background-image:url(http://codegen.caihongy.cn/20220227/c4d17998351b4c04a2db3b86d81e1a97.png);background-attachment:fixed;background-size:cover;background-position:50%}.logo[data-v-2b5dd12a]{text-align:center}.logo uni-image[data-v-2b5dd12a]{height:%?200?%;width:%?200?%;margin:0 0 %?60?%}.uni-form-item[data-v-2b5dd12a]{margin-bottom:%?40?%;padding:0}.uni-form-item .uni-input[data-v-2b5dd12a]{font-size:%?30?%;padding:7px 0}uni-button[type="primary"][data-v-2b5dd12a]{background-color:#b49950;border-radius:0;font-size:%?34?%;margin-top:%?60?%}.links[data-v-2b5dd12a]{text-align:center;margin-top:%?40?%;font-size:%?26?%;color:#999}.links uni-view[data-v-2b5dd12a]{display:inline-block;vertical-align:top;margin:0 %?10?%}.links .link-highlight[data-v-2b5dd12a]{color:#b49950}.picker-select-input[data-v-2b5dd12a]{line-height:%?80?%}',""]),r.exports=i},3735:function(r,i,e){"use strict";e.r(i);var t=e("88c1"),o=e("48c7");for(var n in o)"default"!==n&&function(r){e.d(i,r,(function(){return o[r]}))}(n);e("05cc"),e("9088");var a,s=e("f0c5"),d=Object(s["a"])(o["default"],t["b"],t["c"],!1,null,"2b5dd12a",null,!1,t["a"],a);i["default"]=d.exports},"3d17":function(r,i,e){var t=e("2e61");"string"===typeof t&&(t=[[r.i,t,""]]),t.locals&&(r.exports=t.locals);var o=e("4f06").default;o("46652005",t,!0,{sourceMap:!1,shadowMode:!1})},"48c7":function(r,i,e){"use strict";e.r(i);var t=e("4e2d"),o=e.n(t);for(var n in t)"default"!==n&&function(r){e.d(i,r,(function(){return t[r]}))}(n);i["default"]=o.a},"4e2d":function(r,i,e){"use strict";var t=e("4ea4");Object.defineProperty(i,"__esModule",{value:!0}),i.default=void 0,e("28a5"),e("96cf");var o=t(e("3b8d")),n={data:function(){return{yonghuxingbieOptions:[],yonghuxingbieIndex:0,shejishixingbieOptions:[],shejishixingbieIndex:0,shejishifenleiOptions:[],shejishifenleiIndex:0,ruleForm:{},emailcode:"",tableName:""}},onLoad:function(){var r=(0,o.default)(regeneratorRuntime.mark((function r(){var i,e;return regeneratorRuntime.wrap((function(r){while(1)switch(r.prev=r.next){case 0:if(i=[],e=uni.getStorageSync("loginTable"),this.tableName=e,"yonghu"==this.tableName&&(this.yonghuxingbieOptions="男,女".split(","),this.ruleForm.xingbie=this.yonghuxingbieOptions[0]),"shejishi"==this.tableName&&(this.shejishixingbieOptions="男,女".split(","),this.ruleForm.xingbie=this.shejishixingbieOptions[0]),"shejishi"!=this.tableName){r.next=11;break}return r.next=8,this.$api.option("fenlei","fenlei",{});case 8:i=r.sent,this.shejishifenleiOptions=i.data,this.ruleForm.fenlei=this.shejishifenleiOptions[0];case 11:this.styleChange();case 12:case"end":return r.stop()}}),r,this)})));function i(){return r.apply(this,arguments)}return i}(),methods:{yonghuxingbieChange:function(r){this.yonghuxingbieIndex=r.target.value,this.ruleForm.xingbie=this.yonghuxingbieOptions[this.yonghuxingbieIndex]},shejishixingbieChange:function(r){this.shejishixingbieIndex=r.target.value,this.ruleForm.xingbie=this.shejishixingbieOptions[this.shejishixingbieIndex]},shejishifenleiChange:function(r){this.shejishifenleiIndex=r.target.value,this.ruleForm.fenlei=this.shejishifenleiOptions[this.shejishifenleiIndex]},styleChange:function(){this.$nextTick((function(){}))},getUUID:function(){return(new Date).getTime()},register:function(){var r=(0,o.default)(regeneratorRuntime.mark((function r(){return regeneratorRuntime.wrap((function(r){while(1)switch(r.prev=r.next){case 0:if("yonghu"!=this.tableName||this.ruleForm.mima==this.ruleForm.mima2){r.next=3;break}return this.$utils.msg("两次密码输入不一致"),r.abrupt("return");case 3:if("yonghu"!=this.tableName||!this.ruleForm.lianxifangshi||this.$validate.isMobile(this.ruleForm.lianxifangshi)){r.next=6;break}return this.$utils.msg("联系方式应输入手机格式"),r.abrupt("return");case 6:if("shejishi"!=this.tableName||this.ruleForm.mima==this.ruleForm.mima2){r.next=9;break}return this.$utils.msg("两次密码输入不一致"),r.abrupt("return");case 9:if("shejishi"!=this.tableName||!this.ruleForm.shejishidianhua||this.$validate.isMobile(this.ruleForm.shejishidianhua)){r.next=12;break}return this.$utils.msg("设计师电话应输入手机格式"),r.abrupt("return");case 12:return r.next=14,this.$api.register("".concat(this.tableName),this.ruleForm,this.emailcode);case 14:this.$utils.msgBack("注册成功");case 16:case"end":return r.stop()}}),r,this)})));function i(){return r.apply(this,arguments)}return i}()}};i.default=n},"88c1":function(r,i,e){"use strict";var t,o=function(){var r=this,i=r.$createElement,e=r._self._c||i;return e("v-uni-view",{staticClass:"content"},[e("v-uni-view",{staticClass:"box",style:{padding:"48rpx",boxShadow:"0px 6rpx 12rpx #ADDB8C",margin:"20rpx auto",borderColor:"#ccc",backgroundColor:"#fff",borderRadius:"0 180rpx 0 0",borderWidth:"0",width:"85%",borderStyle:"solid",height:"100%"}},[e("v-uni-view",{staticClass:"logo",style:{padding:"0",boxShadow:"0 2rpx 12rpx rgba(0,0,0,0)",margin:"0 0 24rpx",borderColor:"#ccc",backgroundColor:"rgba(255, 255, 255, 0)",borderRadius:"0",borderWidth:"0",width:"100%",borderStyle:"solid",height:"auto"}},[e("v-uni-image",{style:{padding:"0",boxShadow:"0 0 0px #59f43e",margin:"0 auto",borderColor:"#ccc",borderRadius:"50%",borderWidth:"0",width:"160rpx",borderStyle:"solid",url:"http://codegen.caihongy.cn/20220227/2950728fe0af4ec5a93125c8528e0f31.jpg",isShow:!0,height:"160rpx"},attrs:{src:"http://codegen.caihongy.cn/20220227/2950728fe0af4ec5a93125c8528e0f31.jpg",mode:"aspectFill"}})],1),"yonghu"==r.tableName?e("v-uni-view",{staticClass:"uni-form-item uni-column",style:{padding:"0",boxShadow:"0 2rpx 12rpx rgba(0,0,0,0)",margin:"0 0 24rpx",borderColor:"#ccc",backgroundColor:"rgba(255, 255, 255, 0)",borderRadius:"0",borderWidth:"0",width:"100%",borderStyle:"solid",height:"auto"}},[e("v-uni-input",{staticClass:"uni-input",style:{padding:"0 24rpx",boxShadow:"0 2rpx 12rpx rgba(0,0,0,0)",margin:"0",borderColor:"rgba(164, 164, 164, 1)",backgroundColor:"#fff",color:"#333",textAlign:"left",borderRadius:"40rpx",borderWidth:"2rpx",width:"100%",fontSize:"28rpx",borderStyle:"solid",height:"80rpx"},attrs:{type:"text",name:"",placeholder:"用户账号"},model:{value:r.ruleForm.yonghuzhanghao,callback:function(i){r.$set(r.ruleForm,"yonghuzhanghao",i)},expression:"ruleForm.yonghuzhanghao"}})],1):r._e(),"yonghu"==r.tableName?e("v-uni-view",{staticClass:"uni-form-item uni-column",style:{padding:"0",boxShadow:"0 2rpx 12rpx rgba(0,0,0,0)",margin:"0 0 24rpx",borderColor:"#ccc",backgroundColor:"rgba(255, 255, 255, 0)",borderRadius:"0",borderWidth:"0",width:"100%",borderStyle:"solid",height:"auto"}},[e("v-uni-input",{staticClass:"uni-input",style:{padding:"0 24rpx",boxShadow:"0 2rpx 12rpx rgba(0,0,0,0)",margin:"0",borderColor:"rgba(164, 164, 164, 1)",backgroundColor:"#fff",color:"#333",textAlign:"left",borderRadius:"40rpx",borderWidth:"2rpx",width:"100%",fontSize:"28rpx",borderStyle:"solid",height:"80rpx"},attrs:{type:"password",name:"",placeholder:"密码"},model:{value:r.ruleForm.mima,callback:function(i){r.$set(r.ruleForm,"mima",i)},expression:"ruleForm.mima"}})],1):r._e(),"yonghu"==r.tableName?e("v-uni-view",{staticClass:"uni-form-item uni-column"},[e("v-uni-input",{staticClass:"uni-input",style:{padding:"0 24rpx",boxShadow:"0 2rpx 12rpx rgba(0,0,0,0)",margin:"0",borderColor:"rgba(164, 164, 164, 1)",backgroundColor:"#fff",color:"#333",textAlign:"left",borderRadius:"40rpx",borderWidth:"2rpx",width:"100%",fontSize:"28rpx",borderStyle:"solid",height:"80rpx"},attrs:{type:"password",name:"",placeholder:"确认密码"},model:{value:r.ruleForm.mima2,callback:function(i){r.$set(r.ruleForm,"mima2",i)},expression:"ruleForm.mima2"}})],1):r._e(),"yonghu"==r.tableName?e("v-uni-view",{staticClass:"uni-form-item uni-column",style:{padding:"0",boxShadow:"0 2rpx 12rpx rgba(0,0,0,0)",margin:"0 0 24rpx",borderColor:"#ccc",backgroundColor:"rgba(255, 255, 255, 0)",borderRadius:"0",borderWidth:"0",width:"100%",borderStyle:"solid",height:"auto"}},[e("v-uni-input",{staticClass:"uni-input",style:{padding:"0 24rpx",boxShadow:"0 2rpx 12rpx rgba(0,0,0,0)",margin:"0",borderColor:"rgba(164, 164, 164, 1)",backgroundColor:"#fff",color:"#333",textAlign:"left",borderRadius:"40rpx",borderWidth:"2rpx",width:"100%",fontSize:"28rpx",borderStyle:"solid",height:"80rpx"},attrs:{type:"text",name:"",placeholder:"用户姓名"},model:{value:r.ruleForm.yonghuxingming,callback:function(i){r.$set(r.ruleForm,"yonghuxingming",i)},expression:"ruleForm.yonghuxingming"}})],1):r._e(),"yonghu"==r.tableName?e("v-uni-view",{staticClass:"uni-form-item uni-column",style:{padding:"0",boxShadow:"0 2rpx 12rpx rgba(0,0,0,0)",margin:"0 0 24rpx",borderColor:"#ccc",backgroundColor:"rgba(255, 255, 255, 0)",borderRadius:"0",borderWidth:"0",width:"100%",borderStyle:"solid",height:"auto"}},[e("v-uni-picker",{attrs:{value:r.yonghuxingbieIndex,range:r.yonghuxingbieOptions},on:{change:function(i){arguments[0]=i=r.$handleEvent(i),r.yonghuxingbieChange.apply(void 0,arguments)}}},[e("v-uni-view",{staticClass:"uni-input",style:{padding:"0 24rpx",boxShadow:"0 2rpx 12rpx rgba(0,0,0,0)",margin:"0",borderColor:"rgba(79, 74, 78, 1)",backgroundColor:"rgba(0,0,0,0)",color:"#333",textAlign:"left",borderRadius:"40rpx",borderWidth:"2rpx",width:"100%",lineHeight:"80rpx",fontSize:"28rpx",borderStyle:"solid"}},[r._v(r._s(r.ruleForm.xingbie?r.ruleForm.xingbie:"请选择性别"))])],1)],1):r._e(),"yonghu"==r.tableName?e("v-uni-view",{staticClass:"uni-form-item uni-column",style:{padding:"0",boxShadow:"0 2rpx 12rpx rgba(0,0,0,0)",margin:"0 0 24rpx",borderColor:"#ccc",backgroundColor:"rgba(255, 255, 255, 0)",borderRadius:"0",borderWidth:"0",width:"100%",borderStyle:"solid",height:"auto"}},[e("v-uni-input",{staticClass:"uni-input",style:{padding:"0 24rpx",boxShadow:"0 2rpx 12rpx rgba(0,0,0,0)",margin:"0",borderColor:"rgba(164, 164, 164, 1)",backgroundColor:"#fff",color:"#333",textAlign:"left",borderRadius:"40rpx",borderWidth:"2rpx",width:"100%",fontSize:"28rpx",borderStyle:"solid",height:"80rpx"},attrs:{type:"text",name:"",placeholder:"联系方式"},model:{value:r.ruleForm.lianxifangshi,callback:function(i){r.$set(r.ruleForm,"lianxifangshi",i)},expression:"ruleForm.lianxifangshi"}})],1):r._e(),"shejishi"==r.tableName?e("v-uni-view",{staticClass:"uni-form-item uni-column",style:{padding:"0",boxShadow:"0 2rpx 12rpx rgba(0,0,0,0)",margin:"0 0 24rpx",borderColor:"#ccc",backgroundColor:"rgba(255, 255, 255, 0)",borderRadius:"0",borderWidth:"0",width:"100%",borderStyle:"solid",height:"auto"}},[e("v-uni-input",{staticClass:"uni-input",style:{padding:"0 24rpx",boxShadow:"0 2rpx 12rpx rgba(0,0,0,0)",margin:"0",borderColor:"rgba(164, 164, 164, 1)",backgroundColor:"#fff",color:"#333",textAlign:"left",borderRadius:"40rpx",borderWidth:"2rpx",width:"100%",fontSize:"28rpx",borderStyle:"solid",height:"80rpx"},attrs:{type:"text",name:"",placeholder:"设计师账号"},model:{value:r.ruleForm.shejishizhanghao,callback:function(i){r.$set(r.ruleForm,"shejishizhanghao",i)},expression:"ruleForm.shejishizhanghao"}})],1):r._e(),"shejishi"==r.tableName?e("v-uni-view",{staticClass:"uni-form-item uni-column",style:{padding:"0",boxShadow:"0 2rpx 12rpx rgba(0,0,0,0)",margin:"0 0 24rpx",borderColor:"#ccc",backgroundColor:"rgba(255, 255, 255, 0)",borderRadius:"0",borderWidth:"0",width:"100%",borderStyle:"solid",height:"auto"}},[e("v-uni-input",{staticClass:"uni-input",style:{padding:"0 24rpx",boxShadow:"0 2rpx 12rpx rgba(0,0,0,0)",margin:"0",borderColor:"rgba(164, 164, 164, 1)",backgroundColor:"#fff",color:"#333",textAlign:"left",borderRadius:"40rpx",borderWidth:"2rpx",width:"100%",fontSize:"28rpx",borderStyle:"solid",height:"80rpx"},attrs:{type:"password",name:"",placeholder:"密码"},model:{value:r.ruleForm.mima,callback:function(i){r.$set(r.ruleForm,"mima",i)},expression:"ruleForm.mima"}})],1):r._e(),"shejishi"==r.tableName?e("v-uni-view",{staticClass:"uni-form-item uni-column"},[e("v-uni-input",{staticClass:"uni-input",style:{padding:"0 24rpx",boxShadow:"0 2rpx 12rpx rgba(0,0,0,0)",margin:"0",borderColor:"rgba(164, 164, 164, 1)",backgroundColor:"#fff",color:"#333",textAlign:"left",borderRadius:"40rpx",borderWidth:"2rpx",width:"100%",fontSize:"28rpx",borderStyle:"solid",height:"80rpx"},attrs:{type:"password",name:"",placeholder:"确认密码"},model:{value:r.ruleForm.mima2,callback:function(i){r.$set(r.ruleForm,"mima2",i)},expression:"ruleForm.mima2"}})],1):r._e(),"shejishi"==r.tableName?e("v-uni-view",{staticClass:"uni-form-item uni-column",style:{padding:"0",boxShadow:"0 2rpx 12rpx rgba(0,0,0,0)",margin:"0 0 24rpx",borderColor:"#ccc",backgroundColor:"rgba(255, 255, 255, 0)",borderRadius:"0",borderWidth:"0",width:"100%",borderStyle:"solid",height:"auto"}},[e("v-uni-input",{staticClass:"uni-input",style:{padding:"0 24rpx",boxShadow:"0 2rpx 12rpx rgba(0,0,0,0)",margin:"0",borderColor:"rgba(164, 164, 164, 1)",backgroundColor:"#fff",color:"#333",textAlign:"left",borderRadius:"40rpx",borderWidth:"2rpx",width:"100%",fontSize:"28rpx",borderStyle:"solid",height:"80rpx"},attrs:{type:"text",name:"",placeholder:"设计师姓名"},model:{value:r.ruleForm.shejishixingming,callback:function(i){r.$set(r.ruleForm,"shejishixingming",i)},expression:"ruleForm.shejishixingming"}})],1):r._e(),"shejishi"==r.tableName?e("v-uni-view",{staticClass:"uni-form-item uni-column",style:{padding:"0",boxShadow:"0 2rpx 12rpx rgba(0,0,0,0)",margin:"0 0 24rpx",borderColor:"#ccc",backgroundColor:"rgba(255, 255, 255, 0)",borderRadius:"0",borderWidth:"0",width:"100%",borderStyle:"solid",height:"auto"}},[e("v-uni-picker",{attrs:{value:r.shejishixingbieIndex,range:r.shejishixingbieOptions},on:{change:function(i){arguments[0]=i=r.$handleEvent(i),r.shejishixingbieChange.apply(void 0,arguments)}}},[e("v-uni-view",{staticClass:"uni-input",style:{padding:"0 24rpx",boxShadow:"0 2rpx 12rpx rgba(0,0,0,0)",margin:"0",borderColor:"rgba(79, 74, 78, 1)",backgroundColor:"rgba(0,0,0,0)",color:"#333",textAlign:"left",borderRadius:"40rpx",borderWidth:"2rpx",width:"100%",lineHeight:"80rpx",fontSize:"28rpx",borderStyle:"solid"}},[r._v(r._s(r.ruleForm.xingbie?r.ruleForm.xingbie:"请选择性别"))])],1)],1):r._e(),"shejishi"==r.tableName?e("v-uni-view",{staticClass:"uni-form-item uni-column",style:{padding:"0",boxShadow:"0 2rpx 12rpx rgba(0,0,0,0)",margin:"0 0 24rpx",borderColor:"#ccc",backgroundColor:"rgba(255, 255, 255, 0)",borderRadius:"0",borderWidth:"0",width:"100%",borderStyle:"solid",height:"auto"}},[e("v-uni-input",{staticClass:"uni-input",style:{padding:"0 24rpx",boxShadow:"0 2rpx 12rpx rgba(0,0,0,0)",margin:"0",borderColor:"rgba(164, 164, 164, 1)",backgroundColor:"#fff",color:"#333",textAlign:"left",borderRadius:"40rpx",borderWidth:"2rpx",width:"100%",fontSize:"28rpx",borderStyle:"solid",height:"80rpx"},attrs:{type:"text",name:"",placeholder:"设计师电话"},model:{value:r.ruleForm.shejishidianhua,callback:function(i){r.$set(r.ruleForm,"shejishidianhua",i)},expression:"ruleForm.shejishidianhua"}})],1):r._e(),"shejishi"==r.tableName?e("v-uni-view",{staticClass:"uni-form-item uni-column",style:{padding:"0",boxShadow:"0 2rpx 12rpx rgba(0,0,0,0)",margin:"0 0 24rpx",borderColor:"#ccc",backgroundColor:"rgba(255, 255, 255, 0)",borderRadius:"0",borderWidth:"0",width:"100%",borderStyle:"solid",height:"auto"}},[e("v-uni-picker",{attrs:{value:r.shejishifenleiIndex,range:r.shejishifenleiOptions},on:{change:function(i){arguments[0]=i=r.$handleEvent(i),r.shejishifenleiChange.apply(void 0,arguments)}}},[e("v-uni-view",{staticClass:"uni-input",style:{padding:"0 24rpx",boxShadow:"0 2rpx 12rpx rgba(0,0,0,0)",margin:"0",borderColor:"rgba(79, 74, 78, 1)",backgroundColor:"rgba(0,0,0,0)",color:"#333",textAlign:"left",borderRadius:"40rpx",borderWidth:"2rpx",width:"100%",lineHeight:"80rpx",fontSize:"28rpx",borderStyle:"solid"}},[r._v(r._s(r.ruleForm.fenlei?r.ruleForm.fenlei:"请选择分类"))])],1)],1):r._e(),e("v-uni-button",{staticClass:"btn-submit",style:{padding:"0",boxShadow:"0 2rpx 12rpx rgba(0,0,0,0)",margin:"0",borderColor:"#ccc",backgroundColor:"rgba(194, 228, 106, 1)",borderRadius:"50rpx",color:"rgba(255, 255, 255, 1)",borderWidth:"0",width:"100%",fontSize:"32rpx",borderStyle:"solid",height:"88rpx"},attrs:{type:"primary"},on:{click:function(i){arguments[0]=i=r.$handleEvent(i),r.register.apply(void 0,arguments)}}},[r._v("注册")])],1)],1)},n=[];e.d(i,"b",(function(){return o})),e.d(i,"c",(function(){return n})),e.d(i,"a",(function(){return t}))},9088:function(r,i,e){"use strict";var t=e("3d17"),o=e.n(t);o.a},"97fd":function(r,i,e){var t=e("9de4");"string"===typeof t&&(t=[[r.i,t,""]]),t.locals&&(r.exports=t.locals);var o=e("4f06").default;o("cd94f68e",t,!0,{sourceMap:!1,shadowMode:!1})},"9de4":function(r,i,e){var t=e("24fb");i=t(!1),i.push([r.i,".btn-submit[data-v-2b5dd12a]{height:auto!important;line-height:%?88?%}",""]),r.exports=i}}]);