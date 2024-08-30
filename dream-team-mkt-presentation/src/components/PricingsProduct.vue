<script setup>
import { ref, onMounted } from 'vue';
import PricingProductService from '../services/pricingProductService.js';

const props = defineProps({
  isEditable: Boolean
})

const datas = ref([]);
const formatedDatas = ref([]);

const isInEdition = ref(false);

onMounted(async () => {
  datas.value = await PricingProductService.fetchData();
  formatedDatas.value = datas.value.map(data => {
    return {
      nameOfferEn: data.nameOfferEn,
      nameOfferFr: data.nameOfferFr,
      priceOfferFr: data.priceOfferFr,
      priceOfferEn: data.priceOfferEn,
      planOfferFr: data.planOfferFr.split(","),
      planOfferEn: data.planOfferEn.split(","),
      callToActionFr: data.callToActionFr,
      callToActionEn: data.callToActionEn
    }
  });
})

// datas.value = formatedDatas.value.map( data => {
//     return {
//       nameOfferEn: data.nameOfferEn,
//       nameOfferFr: data.nameOfferFr,
//       priceOfferFr: data.priceOfferFr,
//       priceOfferEn: data.priceOfferEn,
//       planOfferFr: data.planOfferFr.join(","),
//       planOfferEn: data.planOfferEn.join(","),
//       callToActionFr: data.callToActionFr,
//       callToActionEn: data.callToActionEn
//     }
//   });

function toggleEdition() {
  //isInEdition.value = true;
  isInEdition.value = !isInEdition.value;

}

async function saveChange() {
  PricingProductService.updateData(datas.value);
  // data.value = await PanelComponentService.updateData(data.value);
  isInEdition.value = false;
}

</script>

<template>
  <div class="text-end">

  </div>
  <section class="text-end">
    <button v-if="props.isEditable" class="me-5 btn btn-info mt-3" @click="toggleEdition">
      <i class="h4 text-white bi bi-pencil-square"></i>
    </button>
    <div class="container">
      <div class="row row-cols-lg-3 bg-info-subtle">
        <div v-for="formatedData in formatedDatas" :key="formatedData.nameOfferEn" class="p-2 text-center">
          <h3 class="h3">{{ formatedData.nameOfferEn }}</h3>
          <h4 class="h3">{{ formatedData.priceOfferEn }}</h4>
          <ul class="list-unstyled">
            <li v-for="value in formatedData.planOfferEn" :key="value">&bull;&#160;{{ value }}</li>
          </ul>
        </div>
      </div>
      <div v-if="isInEdition" class="row row-cols-lg-3 bg-info-subtle">
        <div v-for="data in datas" :key="data.nameOfferEn" class="p-2 text-center">
          <input class="h3" v-model="data.nameOfferEn" type="text" />
          <input class="h3" v-model="data.priceOfferEn" type="text" />
          <textarea type="text" v-model="data.planOfferEn"></textarea>
        </div>
      </div>
      <div v-if="props.isEditable && isInEdition" @click="saveChange" class="btn btn-primary">SAVE</div>
    </div>
  </section>
</template>
