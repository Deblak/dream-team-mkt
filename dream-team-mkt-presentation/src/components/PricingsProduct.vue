<script setup>
import { ref, onMounted } from 'vue';
import PricingProductService from '../services/pricingProductService.js';

const props = defineProps({
  isEditable: Boolean
})

const datas = ref([]);
const isInEdition = ref(false);

onMounted( async () => {
  datas.value = await PricingProductService.fetchData();
})

function toggleEdition() {
  isInEdition.value = true;
}

async function saveChange() {
  await PricingProductService.updateData(datas.value);
  datas.value = await PricingProductService.fetchData();
  isInEdition.value = false;
}

function splitPlanOffer(params) {
  return params.split(',')
}

</script>

<template>
    <section class="container ">
        <label v-if="props.isEditable && isInEdition">English</label>
        <div class="row row-cols-lg-3 bg-info-subtle">
          <div v-for="data in datas" :key="data.nameOfferEn" class="p-2 text-center">
            <h3 class="h3">{{data.nameOfferEn}}</h3>
            <h4 class="h3">{{data.priceOfferEn}}</h4>
            <ul  class="list-unstyled">
                <li v-for="value in splitPlanOffer(data.planOfferEn)" :key="value" >&bull;&#160;{{ value }}</li>
            </ul>
        </div>
      </div>
      <label v-if="props.isEditable && isInEdition">English</label>
      <div v-if="isInEdition" class="row row-cols-lg-3 bg-info-subtle">
        <div v-for="data in datas" :key="data.nameOfferEn" class="p-2 text-center">
          <input class="h3" v-model="data.nameOfferEn" type="text" />
          <input class="h3" v-model="data.priceOfferEn" type="text" />
          <textarea type="text" v-model="data.planOfferEn"></textarea>
        </div>
      </div>
      <label v-if="props.isEditable && isInEdition">Français</label>
      <div v-if="isInEdition" class="row row-cols-lg-3 bg-info-subtle">
          <div v-for="data in datas" :key="data.nameOfferFr" class="p-2 text-center">
            <input class="h3" v-model="data.nameOfferFr" type="text" />
            <input class="h3" v-model="data.priceOfferFr" type="text" />
            <textarea type="text" v-model="data.planOfferFr" ></textarea>
        </div>
      </div>
      <div v-if="props.isEditable && !isInEdition" @click="toggleEdition" class="btn btn-primary">edit prices</div>
      <div v-if="props.isEditable && isInEdition" @click="saveChange" class="btn btn-primary">save</div>
    </section>
</template>
