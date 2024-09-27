<script setup>
import ContactForm from '@/components/ContactForm.vue';
import Footer from '@/components/Footer.vue';
import Header from '@/components/Header.vue';
import IdentityProduct from '@/components/IdentityProduct.vue';
import InformPanels from '@/components/InformPanels.vue'
import PricingsProduct from '@/components/PricingsProduct.vue';
</script>

<template>
  <main>
    <div class="container p-5">
      <Header/>
    </div>
    <h1>{{ $t('homePage')}}</h1>
    <IdentityProduct :isEditable=false />
    <InformPanels :isEditable=false />
    <PricingsProduct :isEditable=false />
    <ContactForm />
    <Footer/>
  </main>
</template>
