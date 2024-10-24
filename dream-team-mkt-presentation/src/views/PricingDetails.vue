<script setup>
import {ref} from 'vue';
import PricingsProduct from '@/components/PricingsProduct.vue';
import Header from '@/components/Header.vue';
import PricingDetails from '@/components/PricingDetails.vue';
import {MqResponsive} from 'vue3-mq';
import { nextTick } from 'vue';


const refToDetailsPricingList = ref(null);

const scrollToComponentDetail = () => {
  if (refToDetailsPricingList.value) {
    nextTick(() => {
      refToDetailsPricingList.value.$refs.scrollRefComponent.scrollIntoView({ behavior: 'smooth', block: 'start' });

    });
  }
};

const scrollToComponentDetailList = (id) => {
  const detailsPricingList = refToDetailsPricingList.value;
  if (detailsPricingList && detailsPricingList.scrollToData) {
    nextTick(() => {
      detailsPricingList.scrollToData(id);
    });
  } else {
    console.error("La référence à detailsPricingList ou la méthode scrollToData est indisponible.");
  }
};
</script>

<template>
  <main>
    <div class="container p-5">
      <Header />
    </div>
    <h1>{{ $t('pricingPage') }}</h1>
    <PricingsProduct :isEditable="false" />
    <MqResponsive group>
      <template #lg+>
        <div class="text-center p-3">
          <button class="button" id="go-to-bottom" @click="scrollToComponentDetail()">{{ $t('viewMore') }}</button>
        </div>
      </template>
      <template #md->
        <div class="text-center p-3 nowrap">
          <button class="button" >mall</button>
          <button class="button">Medium</button>
          <button class="button">Large</button>
        </div>
      </template>
    </MqResponsive>
    <PricingDetails :isEditable="true" ref="refToDetailsPricingList" />
  </main>
</template>

<style>

.button {
    padding: 0.5rem 3rem;
}
.nowrap{
    display: flex;
    flex-wrap: nowrap;
    justify-content: center;
}
.color{
    background-color: violet;
}
.custom-inline-flex {
  display: inline-flex;
  flex-wrap: nowrap;
}
</style>