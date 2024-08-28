<script setup>
import ContactForm from '../components/ContactForm.vue'
import Panel from "@/components/panel/panel.vue"
import IdentityProduct from '@/components/IdentityProduct.vue';
import PricingsProduct from '@/components/PricingsProduct.vue';
</script>


<template>
  <main>
    <h1>home page</h1>
    <IdentityProduct/>
    <Panel/>
    <PricingsProduct/>
    <ContactForm />
  </main>
</template>
