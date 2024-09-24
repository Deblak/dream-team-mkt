<script setup>
import ContactForm from '@/components/ContactForm.vue';
import FooterComponenet from'@/components/FooterComponent.vue';
import HeaderComponant from '@/components/HeaderComponent.vue';
import IdentityProduct from '@/components/IdentityProduct.vue';
import PanelComponent from '@/components/PanelComponent.vue'
import PricingsProduct from '@/components/PricingsProduct.vue';
</script>

<template>
  <main>
    <HeaderComponant/>
    <h1>{{ $t('homePage')}}</h1>
    <IdentityProduct :isEditable=false />
    <PanelComponent :isEditable=false />
    <PricingsProduct :isEditable=false />
    <ContactForm />
    <FooterComponenet/>
  </main>
</template>
