<script setup>
import { ref ,onMounted } from 'vue';
import PricingProductService from '../services/pricingProductService.js'

const datas = ref([]);

onMounted( async () => {
  datas.value = await PricingProductService.fetchData();
})
</script>

<template>
    <section class="container ">
        <div class="row row-cols-lg-3 bg-info-subtle">
          <div v-for="data in datas" :key="data.nameOfferEn" class="p-2 text-center">
            <h3 class="h3">{{data.nameOfferEn}}</h3>
            <h4 class="h3">{{data.priceOfferEn}}</h4>
            <ul  class="list-unstyled">
                <li v-for="value in data.planOfferEn" :key="value" >&bull;&#160;{{ value }}</li>
            </ul>
        </div>
    </div>

    </section>
</template>
