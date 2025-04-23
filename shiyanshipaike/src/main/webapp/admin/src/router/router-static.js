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

     import users from '@/views/modules/users/list'
    import dictionary from '@/views/modules/dictionary/list'
    import jiaoshi from '@/views/modules/jiaoshi/list'
    import kecheng from '@/views/modules/kecheng/list'
    import kechengAdd from '@/views/modules/kecheng/add-or-update'
    import news from '@/views/modules/news/list'
    import paiekequxiao from '@/views/modules/paiekequxiao/list'
    import shiyanshebei from '@/views/modules/shiyanshebei/list'
    import shiyanshi from '@/views/modules/shiyanshi/list'
    import shiyanshishenqing from '@/views/modules/shiyanshishenqing/list'
    import yonghu from '@/views/modules/yonghu/list'
    import dictionaryBanji from '@/views/modules/dictionaryBanji/list'
    import dictionaryJieke from '@/views/modules/dictionaryJieke/list'
    import dictionaryKecheng from '@/views/modules/dictionaryKecheng/list'
    import dictionaryKechengYesno from '@/views/modules/dictionaryKechengYesno/list'
    import dictionaryNews from '@/views/modules/dictionaryNews/list'
    import dictionaryPaiekequxiaoYesno from '@/views/modules/dictionaryPaiekequxiaoYesno/list'
    import dictionarySex from '@/views/modules/dictionarySex/list'
    import dictionaryShiyanshebei from '@/views/modules/dictionaryShiyanshebei/list'
    import dictionaryShiyanshi from '@/views/modules/dictionaryShiyanshi/list'
    import dictionaryShiyanshishenqingYesno from '@/views/modules/dictionaryShiyanshishenqingYesno/list'
    import dictionaryStatus from '@/views/modules/dictionaryStatus/list'
    import dictionaryXingqi from '@/views/modules/dictionaryXingqi/list'
    import dictionaryXueqi from '@/views/modules/dictionaryXueqi/list'





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
    } ,{
        path: '/users',
        name: '管理信息',
        component: users
      }
    ,{
        path: '/dictionaryBanji',
        name: '班级',
        component: dictionaryBanji
    }
    ,{
        path: '/dictionaryJieke',
        name: '第几节',
        component: dictionaryJieke
    }
    ,{
        path: '/dictionaryKecheng',
        name: '课程类型',
        component: dictionaryKecheng
    }
    ,{
        path: '/dictionaryKechengYesno',
        name: '课程审核',
        component: dictionaryKechengYesno
    },
	,{
	    path: '/kechengAdd',
	    name: '排课信息添加',
	    component: kechengAdd
	}
    ,{
        path: '/dictionaryNews',
        name: '公告类型',
        component: dictionaryNews
    }
    ,{
        path: '/dictionaryPaiekequxiaoYesno',
        name: '排课取消审核',
        component: dictionaryPaiekequxiaoYesno
    }
    ,{
        path: '/dictionarySex',
        name: '性别',
        component: dictionarySex
    }
    ,{
        path: '/dictionaryShiyanshebei',
        name: '设备类型',
        component: dictionaryShiyanshebei
    }
    ,{
        path: '/dictionaryShiyanshi',
        name: '实验室类型',
        component: dictionaryShiyanshi
    }
    ,{
        path: '/dictionaryShiyanshishenqingYesno',
        name: '审核结果',
        component: dictionaryShiyanshishenqingYesno
    }
    ,{
        path: '/dictionaryStatus',
        name: '实验室状态',
        component: dictionaryStatus
    }
    ,{
        path: '/dictionaryXingqi',
        name: '星期',
        component: dictionaryXingqi
    }
    ,{
        path: '/dictionaryXueqi',
        name: '学期',
        component: dictionaryXueqi
    }


    ,{
        path: '/dictionary',
        name: '字典表',
        component: dictionary
      }
    ,{
        path: '/jiaoshi',
        name: '教师',
        component: jiaoshi
      }
    ,{
        path: '/kecheng',
        name: '课程信息',
        component: kecheng
      }
    ,{
        path: '/news',
        name: '公告',
        component: news
      }
    ,{
        path: '/paiekequxiao',
        name: '排课取消申请',
        component: paiekequxiao
      }
    ,{
        path: '/shiyanshebei',
        name: '实验设备',
        component: shiyanshebei
      }
    ,{
        path: '/shiyanshi',
        name: '实验室信息',
        component: shiyanshi
      }
    ,{
        path: '/shiyanshishenqing',
        name: '实验室申请',
        component: shiyanshishenqing
      }
    ,{
        path: '/yonghu',
        name: '学生',
        component: yonghu
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
