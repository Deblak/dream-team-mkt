<script setup>
import {onMounted, ref} from 'vue';
import PricingDetails from '../services/pricingDetails.js';

const scrollRefComponent = ref(null);
const isInEdition = ref(false);

const props = defineProps({
  isEditable: Boolean
});

const retrieveDatas = ref([]);
onMounted( async () => {
  retrieveDatas.value = await PricingDetails.fetchData();
})

function splitDetailPlanOffer(params) {
  return params.split(',')
}

function toggleEdition() {
  isInEdition.value = !isInEdition.value;
}
async function saveChange() {
    console.log('Données avant avant à jour:', retrieveDatas.value);
  await PricingDetails.updateData(retrieveDatas.value);
  console.log('Données avant mise à jour:', retrieveDatas.value);
  retrieveDatas.value = await PricingDetails.fetchData();
  isInEdition.value = false;
}

</script>


<template>
    <section class="text-end" ref="scrollRefComponent" >
    <button v-if="props.isEditable" class="me-5 btn btn-info mt-3" @click="toggleEdition">
        <i class="h4 text-white bi bi-pencil-square"></i>
    </button>
    <div class="container">
      <div class="row row-cols-lg-3 bg-info-subtle">
    <div v-for="data in retrieveDatas" :key="data" class="p-2 text-center container border">
        <ul  class="list-unstyled">
              <li v-for="value in splitDetailPlanOffer(data.detailPlanEn)" :key="value" >
                &bull;&#160;{{ value }}
              </li>
        </ul>
        <ul  class="list-unstyled">
              <li v-for="value in splitDetailPlanOffer(data.detailPlanFr)" :key="value" >
                &bull;&#160;{{ value }}
              </li>
        </ul>
    </div>
    </div>
    <label v-if="props.isEditable && isInEdition">English</label>
    <div v-if="isInEdition" class="row row-cols-lg-3 bg-info-subtle">
      <div v-for="data in retrieveDatas" :key="data" class="p-2 text-center">
        <textarea v-model="data.detailPlanEn" type="text"></textarea>
      </div>
    </div>
    <label v-if="props.isEditable && isInEdition">Français</label>
    <div v-if="isInEdition" class="row row-cols-lg-3 bg-info-subtle">
      <div v-for="data in retrieveDatas" :key="data" class="p-2 text-center">
        <textarea v-model="data.detailPlanFr" type="text"></textarea>
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