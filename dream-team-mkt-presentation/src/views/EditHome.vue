<script setup>
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
    <h1>{{ $t('editPage')}}</h1>
    <div>
      <IdentityProduct :isEditable=true />
    </div>
    <InformPanels :isEditable=true />
    <PricingsProduct :isEditable=true />
  </main>
</template>
