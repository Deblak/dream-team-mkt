<script setup>
import PanelComponent from '../components/panel/PanelComponent.vue'
import HeaderComponet from '@/components/HeaderComponent.vue';
import IdentityProduct from '@/components/IdentityProduct.vue';
import PricingsProduct from '@/components/PricingsProduct.vue';

</script>
<template>
  <main>
    <HeaderComponet/>
    <h1>Edit page</h1>
    <div>
      <IdentityProduct :isEditable=true />
    </div>
    <PanelComponent :isEditable=true />
    <PricingsProduct :isEditable=true />
  </main>
</template>
