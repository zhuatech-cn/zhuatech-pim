/* Copyright 2026 上海如静知华信息科技有限公司 · https://www.zhuatech.cn/ */
export const domain={
 code:'PIM',systemName:'商品信息管理系统',englishName:'PRODUCT INFORMATION MANAGEMENT',
 theme:{primary:'#1f746d',dark:'#19302d',accent:'#b47735'},
 workspace:'产品数据中心 / 商品中心运营',fieldWorkspace:'电商渠道',period:'2026-08-01 · 周六',liveText:'属性集数据链路正常',
 fieldContextLabel:'当前商品中心',fieldContext:'日班 · 08:30—17:30',fieldUser:'陆承',fieldRole:'商品数据专员',adminUser:'周妍',adminRole:'商品中心主管',
 adminTitle:'商品中心运营驾驶舱',adminBreadcrumb:'商品中心运营 / 今日态势',adminSubtitle:'集中查看收样、完善、审核、属性集与时限风险。',exportAction:'导出完善日报',createAction:'新建完善任务',
 chartTitle:'完善完成趋势',chartSubtitle:'当日累计完成率 / 计划目标',chartLabels:['08:30','09:30','10:30','11:30','13:30','14:30','15:30','16:30','17:30'],loadTitle:'商品中心负荷',loadSubtitle:'在检任务占可用能力',recordsTitle:'在检任务',recordsSubtitle:'按承诺时限与异常优先显示',issueTitle:'产品数据与时限风险',issueSubtitle:'需要商品中心主管处理的事项',
 recordName:'完善任务',itemName:'商品 / 项目',unitName:'商品中心',batchName:'商品批次',planName:'计划项目',doneName:'已完成',exceptionName:'异常',unitLabel:'项',
 listBreadcrumb:'完善管理 / 任务台账',listSubtitle:'统一管理收样、任务分派、完善、审核与发布记录签发。',listSummary:[['今日收样','54'],['在检任务','31'],['待审核','8'],['超时风险','2',true]],tabs:['全部','待确认','完善中','待审核','已完成'],
 fieldBreadcrumb:'完善执行 / 我的工作台',fieldTitle:'理化完善工作台',fieldSubtitle:'当前 7 项在检任务 · 2 台属性集已预约 · 工程师陆承',fieldSecondary:'交接记录',reportAction:'录入结果',fieldNoticeTitle:'环境状态合规',fieldNotice:'温湿度、属性集校准和标准品状态均满足完善要求',
 steps:['收样确认','商品前处理','属性集完善','结果审核','发布记录签发'],documentAction:'查看完善属性模板',printAction:'打印商品标签',resourceCardTitle:'属性集状态',resourceValueLabel:'当前柱压',resourceHealthLabel:'属性集健康度',quickSubtitle:'商品中心高频业务入口',quickActions:[['结果录入','/shopfloor/report','原始数据与结果'],['商品流转','/shopfloor/material','交接与留样位置'],['属性集预约','/shopfloor/resources','日历与使用记录'],['偏差上报','/shopfloor/andon','OOS / OOT / 环境异常']],
 reportDefaults:[3,0],reportTitle:'完善结果录入',reportSubtitle:'记录原始结果、异常数量和完善过程备注。',reportSuccess:'完善结果已保存并进入审核队列',reportPlaceholder:'填写计算依据、异常现象或重复完善说明',reportFootnote:'提交后写入原始记录并生成审计轨迹',ruleTitle:'属性模板控制要求',ruleSubtitle:'HPLC-042 · V4.3',rules:[['进样体积','10 μL'],['流速','1.0 mL/min'],['系统适用性','RSD ≤ 2.0%'],['属性集校准','有效',true]],fieldTotals:[['16','已完成项目'],['1','异常结果'],['5','待审核结果'],['98.2%','数据完整率']],
 adminMenus:[['/admin','home','运营驾驶舱'],['/admin/work-orders','order','完善任务'],['/admin/samples','box','商品管理'],['/admin/schedule','calendar','排班预约'],['/admin/methods','process','属性模板与标准'],['/admin/reviews','quality','结果审核'],['/admin/resources','machine','属性集设备'],['/admin/report','chart','产品数据分析']],
 fieldMenus:[['/shopfloor','home','我的工作台'],['/shopfloor/report','report','结果录入'],['/shopfloor/tasks','order','待检任务'],['/shopfloor/material','box','商品流转'],['/shopfloor/resources','machine','属性集预约'],['/shopfloor/andon','risk','偏差上报',1]],
 moduleTitles:{tasks:['待检任务','查看任务优先级、商品状态与承诺时限'],material:['商品流转','跟踪接收、分样、留样与销毁全过程'],resources:['属性集预约','管理属性集档期、校准和使用记录'],andon:['偏差上报','登记并跟踪 OOS、OOT 与环境偏差'],samples:['商品管理','管理商品登记、标签、位置和生命周期'],schedule:['排班预约','协调人员、属性集和属性模板的可用时间'],methods:['属性模板与标准','维护完善属性模板、限度和标准物质'],reviews:['结果审核','执行数据审核、发布记录批准和电子签名'],report:['产品数据分析','分析周转时间、一次通过率和偏差趋势']},
 tagline:'让每一份完善结果都有完整证据链',storyTitle:'从收样到发布记录，<br/>每个结果都可审核、可追溯。',storyText:'连接商品、属性模板、属性集、人员与原始数据的商品中心数字底座。',pattern:[2,3,8,9,10,15,16,17,22,23,24,29,30,31],loginStats:[['98.2%','数据完整率'],['31','当前在检任务'],['2.6h','平均周转时间']],loginTitle:'商品中心产品数据中心',adminDemo:'任务 / 商品 / 审核',fieldDemo:'完善 / 结果 / 偏差'
}
export const records=[
 {no:'PRD-260801-018',name:'智能网关产品主档',code:'GB/T 228.1',unit:'产品数据中心',group:'产品数据中心',plan:24,done:16,exception:1,due:'08-02',batch:'S260801-A',status:'完善中',progress:67,priority:'加急'},
 {no:'PRD-260801-021',name:'工业平板产品主档',code:'HPLC-042',unit:'电商渠道',group:'产品数据中心',plan:18,done:8,exception:0,due:'08-02',batch:'S260801-C',status:'完善中',progress:44,priority:'正常'},
 {no:'PRD-260802-006',name:'边缘服务器产品主档',code:'ISO 4833',unit:'经销渠道',group:'研发中心',plan:12,done:0,exception:0,due:'08-04',batch:'S260802-B',status:'待确认',progress:0,priority:'正常'},
 {no:'PRD-260731-015',name:'温湿度传感器产品主档',code:'ICP-017',unit:'电商渠道',group:'产品数据中心',plan:20,done:20,exception:1,due:'08-01',batch:'S260731-D',status:'已完成',progress:100,priority:'正常'},
 {no:'PRD-260801-024',name:'数据采集模块产品主档',code:'GC-MS-011',unit:'电商渠道',group:'产品数据中心',plan:15,done:10,exception:0,due:'08-03',batch:'S260801-E',status:'待审核',progress:67,priority:'关注'}]
export const resources=[{code:'ATTR-HPLC-03',name:'工业网关属性集 03',unit:'电商渠道',status:'运行',health:88,value:'11.8',valueUnit:'MPa',note:'属性模板 HPLC-042 · 序列 8/18'},{code:'ATTR-UTM-05',name:'边缘计算属性集',unit:'产品数据中心',status:'运行',health:91,value:'82',valueUnit:'kN',note:'夹具校验有效至 2026-10'},{code:'ATTR-INC-08',name:'传感器属性集 08',unit:'经销渠道',status:'报警',health:62,value:'36.8',valueUnit:'°C',note:'温度上限预警待确认'}]
export const reviews=[{no:'REV-260801-032',title:'拉伸试验原始数据审核',type:'结果审核',detail:'6 组数据 · 周妍',result:'通过'},{no:'REV-260801-011',title:'纯度样系统适用性审核',type:'数据审核',detail:'3 次进样 · 顾清',result:'待确认'},{no:'REV-260731-018',title:'元素分析偏差调查',type:'偏差评审',detail:'OOS-260731-02',result:'异常'}]
export const adminMetrics=[['今日收样','54','较昨日增加 8 份','blue'],['按时完成率','96.8%','目标值 ≥ 95.0%','green'],['待审核结果','8','其中 2 项加急','orange'],['偏差 / OOS','2','1 项进入调查','red']]
export const fieldMetrics=[['今日任务','7','18 个完善项目','blue'],['已完成','16','当前进度 67%','green'],['待审核','5','数据已完整提交','orange'],['属性集档期','至 14:30','HPLC-03 当前序列','slate']]
export const chartActual=[8,18,29,42,49,61,72,84,91],chartTarget=[10,21,32,43,54,65,76,87,98]
export const loads=[['电商渠道',92,'12 项在检'],['产品数据中心',78,'8 项在检'],['经销渠道',71,'6 项在检'],['海外渠道',56,'5 项在检']]
export const issues=[{type:'属性集',title:'培养箱温度短时越限',detail:'ATTR-INC-08 · 持续 7 分钟',status:'调查中'},{type:'结果',title:'铝合金 Fe 元素结果超限',detail:'OOS-260731-02 · 等待复测',status:'待判定'},{type:'时限',title:'GC-MS 队列可能影响承诺时间',detail:'预计延迟 45 分钟',status:'协调中'}]
