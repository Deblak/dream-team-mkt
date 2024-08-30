<script setup>
import HeaderComponant from '@/components/HeaderComponent.vue';
import PanelComponent from '../components/panel/PanelComponent.vue'
import FooterComponenet from'@/components/FooterComponent.vue';
import ContactForm from '../components/ContactForm.vue';
import IdentityProduct from '@/components/IdentityProduct.vue';
import PricingsProduct from '@/components/PricingsProduct.vue';
</script>


<template>
  <main>
    <HeaderComponant/>
    <h1>home page</h1>
    <IdentityProduct/>
    <PanelComponent :isEditable=false />
    <PricingsProduct :isEditable=false />
    <ContactForm />
    <FooterComponenet/>
  </main>
</template>
