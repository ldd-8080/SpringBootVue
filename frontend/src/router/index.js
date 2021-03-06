import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'
import testCom from '@/components/testCom'
import About from '@/components/About'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'HelloWorld',
      component: HelloWorld
    },
    {
      path: '/testCom',
      name: 'testCom',
      component: testCom
    },
    {
      path: '/about',
      name: 'About',
      component: About
    }
  ]
})
