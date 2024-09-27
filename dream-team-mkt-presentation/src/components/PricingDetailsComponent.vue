<script setup>
import {onMounted, ref} from 'vue';
import PricingComponentService from '../services/pricingComponentService.js';

const componentElement = ref(null);
const isInEdition = ref(false);

const props = defineProps({
  isEditable: Boolean
});

const datas = ref([]);
onMounted( async () => {
  datas.value = await PricingComponentService.fetchData();
})

function splitPlanOffer(params) {
  return params.split(',')
}

function toggleEdition() {
  isInEdition.value = !isInEdition.value;
}
async function saveChange() {
    console.log('Données avant avant à jour:', datas.value);
  await PricingComponentService.updateData(datas.value);
  console.log('Données avant mise à jour:', datas.value);
  datas.value = await PricingComponentService.fetchData();
  isInEdition.value = false;
}

</script>


<template>
    <section class="text-end" ref="componentElement" >
    <button v-if="props.isEditable" class="me-5 btn btn-info mt-3" @click="toggleEdition">
        <i class="h4 text-white bi bi-pencil-square"></i>
    </button>
    <div class="container">
      <div class="row row-cols-lg-3 bg-info-subtle">
    <div v-for="data in datas" :key="data" class="p-2 text-center container border">
        <ul  class="list-unstyled">
              <li v-for="value in splitPlanOffer(data.detailPlanOfferEn)" :key="value" >
                &bull;&#160;{{ value }}
              </li>
        </ul>
        <ul  class="list-unstyled">
              <li v-for="value in splitPlanOffer(data.detailPlanOfferFr)" :key="value" >
                &bull;&#160;{{ value }}
              </li>
        </ul>
    </div>
    </div>
    <label v-if="props.isEditable && isInEdition">English</label>
    <div v-if="isInEdition" class="row row-cols-lg-3 bg-info-subtle">
      <div v-for="data in datas" :key="data" class="p-2 text-center">
        <textarea v-model="data.detailPlanOfferEn" type="text"></textarea>
      </div>
    </div>
    <label v-if="props.isEditable && isInEdition">Français</label>
    <div v-if="isInEdition" class="row row-cols-lg-3 bg-info-subtle">
      <div v-for="data in datas" :key="data" class="p-2 text-center">
        <textarea v-model="data.detailPlanOfferFr" type="text"></textarea>
      </div>
    </div>
    <div v-if="props.isEditable && isInEdition" @click="saveChange" class="btn btn-primary">save</div>
    </div>
</section>

</template>


<style>
.border {
    border : solid black;
    /* margin-top: 10rem; */
    background-color: yellow; 
}
</style>