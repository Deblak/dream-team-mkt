<script setup>
import HeaderComponet from '@/components/HeaderComponent.vue';
import IdentityProduct from '@/components/IdentityProduct.vue';
import PanelComponent from '@/components/PanelComponent.vue'
import PricingsProduct from '@/components/PricingsProduct.vue';

</script>
<template>
  <main>
    <div class="container p-5">
      <HeaderComponet/>
    </div>
    <h1>{{ $t('editPage')}}</h1>
    <div>
      <IdentityProduct :isEditable=true />
    </div>
    <PanelComponent :isEditable=true />
    <PricingsProduct :isEditable=true />
  </main>
</template>
