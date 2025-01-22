import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import news from '@/views/modules/news/list'
    import cuotifankui from '@/views/modules/cuotifankui/list'
    import xuesheng from '@/views/modules/xuesheng/list'
    import cuotilianxi from '@/views/modules/cuotilianxi/list'
    import jiaoshi from '@/views/modules/jiaoshi/list'
    import zuoyexinxi from '@/views/modules/zuoyexinxi/list'
    import wanchengzuoye from '@/views/modules/wanchengzuoye/list'
    import forum from '@/views/modules/forum/list'
    import jiazhang from '@/views/modules/jiazhang/list'
    import jiaoshitixing from '@/views/modules/jiaoshitixing/list'
    import xuanzezuoye from '@/views/modules/xuanzezuoye/list'
    import config from '@/views/modules/config/list'
    import discusszuoyexinxi from '@/views/modules/discusszuoyexinxi/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/news',
        name: '通知公告',
        component: news
      }
      ,{
	path: '/cuotifankui',
        name: '错题反馈',
        component: cuotifankui
      }
      ,{
	path: '/xuesheng',
        name: '学生',
        component: xuesheng
      }
      ,{
	path: '/cuotilianxi',
        name: '错题练习',
        component: cuotilianxi
      }
      ,{
	path: '/jiaoshi',
        name: '教师',
        component: jiaoshi
      }
      ,{
	path: '/zuoyexinxi',
        name: '作业信息',
        component: zuoyexinxi
      }
      ,{
	path: '/wanchengzuoye',
        name: '完成作业',
        component: wanchengzuoye
      }
      ,{
	path: '/forum',
        name: '家校留言板',
        component: forum
      }
      ,{
	path: '/jiazhang',
        name: '家长',
        component: jiazhang
      }
      ,{
	path: '/jiaoshitixing',
        name: '教师提醒',
        component: jiaoshitixing
      }
      ,{
	path: '/xuanzezuoye',
        name: '选择作业',
        component: xuanzezuoye
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/discusszuoyexinxi',
        name: '作业信息评论',
        component: discusszuoyexinxi
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
