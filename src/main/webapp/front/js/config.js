
var projectName = '三省学堂—学习辅助系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
	name: '我的发布',
	url: '../forum/list-my.html'
},

{
        name: '我的收藏',
        url: '../storeup/list.html'
}
]


var indexNav = [

{
	name: '作业信息',
	url: './pages/zuoyexinxi/list.html'
}, 

{
	name: '家校留言板',
	url: './pages/forum/list.html'
}, 
{
	name: '通知公告',
	url: './pages/news/list.html'
},
]

var adminurl =  "http://localhost:8080/ssmgp6yp/admin/dist/index.html";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-cardboard","buttons":["新增","查看","修改","删除"],"menu":"学生","menuJump":"列表","tableName":"xuesheng"}],"menu":"学生管理"},{"child":[{"appFrontIcon":"cuIcon-skin","buttons":["新增","查看","修改","删除"],"menu":"家长","menuJump":"列表","tableName":"jiazhang"}],"menu":"家长管理"},{"child":[{"appFrontIcon":"cuIcon-pic","buttons":["新增","查看","修改","删除"],"menu":"教师","menuJump":"列表","tableName":"jiaoshi"}],"menu":"教师管理"},{"child":[{"appFrontIcon":"cuIcon-medal","buttons":["查看","修改","删除","查看评论"],"menu":"作业信息","menuJump":"列表","tableName":"zuoyexinxi"}],"menu":"作业信息管理"},{"child":[{"appFrontIcon":"cuIcon-attentionfavor","buttons":["查看","修改","删除"],"menu":"选择作业","menuJump":"列表","tableName":"xuanzezuoye"}],"menu":"选择作业管理"},{"child":[{"appFrontIcon":"cuIcon-keyboard","buttons":["查看","修改","删除"],"menu":"完成作业","menuJump":"列表","tableName":"wanchengzuoye"}],"menu":"完成作业管理"},{"child":[{"appFrontIcon":"cuIcon-rank","buttons":["查看","修改","删除"],"menu":"错题反馈","menuJump":"列表","tableName":"cuotifankui"}],"menu":"错题反馈管理"},{"child":[{"appFrontIcon":"cuIcon-goodsnew","buttons":["查看","修改","删除"],"menu":"错题练习","menuJump":"列表","tableName":"cuotilianxi"}],"menu":"错题练习管理"},{"child":[{"appFrontIcon":"cuIcon-copy","buttons":["查看","修改","删除"],"menu":"教师提醒","menuJump":"列表","tableName":"jiaoshitixing"}],"menu":"教师提醒管理"},{"child":[{"appFrontIcon":"cuIcon-group","buttons":["查看","修改","删除"],"menu":"家校留言板","tableName":"forum"}],"menu":"家校留言板"},{"child":[{"appFrontIcon":"cuIcon-cardboard","buttons":["查看","修改","删除"],"menu":"轮播图管理","tableName":"config"},{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除"],"menu":"通知公告","tableName":"news"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-camera","buttons":["查看","查看评论","选择作业"],"menu":"作业信息列表","menuJump":"列表","tableName":"zuoyexinxi"}],"menu":"作业信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-attentionfavor","buttons":["查看","修改","删除","完成作业"],"menu":"选择作业","menuJump":"列表","tableName":"xuanzezuoye"}],"menu":"选择作业管理"},{"child":[{"appFrontIcon":"cuIcon-keyboard","buttons":["查看","修改","删除"],"menu":"完成作业","menuJump":"列表","tableName":"wanchengzuoye"}],"menu":"完成作业管理"},{"child":[{"appFrontIcon":"cuIcon-rank","buttons":["查看","错题练习"],"menu":"错题反馈","menuJump":"列表","tableName":"cuotifankui"}],"menu":"错题反馈管理"},{"child":[{"appFrontIcon":"cuIcon-goodsnew","buttons":["查看","修改","删除"],"menu":"错题练习","menuJump":"列表","tableName":"cuotilianxi"}],"menu":"错题练习管理"},{"child":[{"appFrontIcon":"cuIcon-copy","buttons":["查看"],"menu":"教师提醒","menuJump":"列表","tableName":"jiaoshitixing"}],"menu":"教师提醒管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-camera","buttons":["查看","查看评论","选择作业"],"menu":"作业信息列表","menuJump":"列表","tableName":"zuoyexinxi"}],"menu":"作业信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"学生","tableName":"xuesheng"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-attentionfavor","buttons":["查看"],"menu":"选择作业","menuJump":"列表","tableName":"xuanzezuoye"}],"menu":"选择作业管理"},{"child":[{"appFrontIcon":"cuIcon-keyboard","buttons":["查看"],"menu":"完成作业","menuJump":"列表","tableName":"wanchengzuoye"}],"menu":"完成作业管理"},{"child":[{"appFrontIcon":"cuIcon-rank","buttons":["查看"],"menu":"错题反馈","menuJump":"列表","tableName":"cuotifankui"}],"menu":"错题反馈管理"},{"child":[{"appFrontIcon":"cuIcon-goodsnew","buttons":["查看"],"menu":"错题练习","menuJump":"列表","tableName":"cuotilianxi"}],"menu":"错题练习管理"},{"child":[{"appFrontIcon":"cuIcon-copy","buttons":["查看"],"menu":"教师提醒","menuJump":"列表","tableName":"jiaoshitixing"}],"menu":"教师提醒管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-camera","buttons":["查看","查看评论","选择作业"],"menu":"作业信息列表","menuJump":"列表","tableName":"zuoyexinxi"}],"menu":"作业信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"家长","tableName":"jiazhang"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-medal","buttons":["新增","查看","修改","删除","查看评论"],"menu":"作业信息","menuJump":"列表","tableName":"zuoyexinxi"}],"menu":"作业信息管理"},{"child":[{"appFrontIcon":"cuIcon-attentionfavor","buttons":["查看","修改","删除","审核"],"menu":"选择作业","menuJump":"列表","tableName":"xuanzezuoye"}],"menu":"选择作业管理"},{"child":[{"appFrontIcon":"cuIcon-keyboard","buttons":["查看","修改","删除","错题反馈","审核"],"menu":"完成作业","menuJump":"列表","tableName":"wanchengzuoye"}],"menu":"完成作业管理"},{"child":[{"appFrontIcon":"cuIcon-rank","buttons":["查看","修改","删除"],"menu":"错题反馈","menuJump":"列表","tableName":"cuotifankui"}],"menu":"错题反馈管理"},{"child":[{"appFrontIcon":"cuIcon-goodsnew","buttons":["查看"],"menu":"错题练习","menuJump":"列表","tableName":"cuotilianxi"}],"menu":"错题练习管理"},{"child":[{"appFrontIcon":"cuIcon-copy","buttons":["新增","查看","修改","删除"],"menu":"教师提醒","menuJump":"列表","tableName":"jiaoshitixing"}],"menu":"教师提醒管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-camera","buttons":["查看","查看评论","选择作业"],"menu":"作业信息列表","menuJump":"列表","tableName":"zuoyexinxi"}],"menu":"作业信息模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"是","hasFrontRegister":"否","roleName":"教师","tableName":"jiaoshi"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
