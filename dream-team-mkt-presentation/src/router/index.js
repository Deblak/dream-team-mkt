import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/Home.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: HomeView
    },
    {
      path: '/edit',
      name: 'edit-home',
      component: () => import('../views/EditHome.vue')
    },
    {
      path: '/terms',
      name: 'terms',
      component: () => import('../views/GeneralTerms.vue')
    },
    {
      path: '/edit-terms',
      name: 'edit-terms',
      component: () => import('../views/EditGeneralTerms.vue')
    },
    {
      path: '/pricing',
      name: 'pricing',
      component: () => import('../views/PricingDetails.vue')
    }
  ]
})

export default router
