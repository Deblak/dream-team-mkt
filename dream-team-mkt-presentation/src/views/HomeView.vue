<script setup>
import ContactForm from '../components/ContactForm.vue'
import PanelComponent from '../components/panel/PanelComponent.vue'
import IdentityProduct from '@/components/IdentityProduct.vue';
import PricingsProduct from '@/components/PricingsProduct.vue';
</script>


<template>
  <main>
    <h1>home page</h1>
    <IdentityProduct/>
    <PanelComponent/>
    <PricingsProduct/>
    <ContactForm />
  </main>
</template>
