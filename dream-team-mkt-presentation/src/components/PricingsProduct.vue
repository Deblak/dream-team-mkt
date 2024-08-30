<script setup>
import { ref, onMounted } from 'vue';
import PricingProductService from '../services/pricingProductService.js';

const props = defineProps({
  isEditable: Boolean
})

const datas = ref([]);
const formatedDatas = ref([]);
const isInEdition = ref(false);

function syncFormatedData() {
  formatedDatas.value = datas.value.map( data => {
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
}

onMounted( async () => {
  datas.value = await PricingProductService.fetchData();
  syncFormatedData()
})

function toggleEdition() {
  //isInEdition.value = true;
  isInEdition.value = !isInEdition.value;

}

async function saveChange() {
  await PricingProductService.updateData(datas.value);
  datas.value = await PricingProductService.fetchData();
  syncFormatedData();
  isInEdition.value = false;
}

</script>

<template>
    <section class="container ">
        <div class="row row-cols-lg-3 bg-info-subtle">
          <div v-for="formatedData in formatedDatas" :key="formatedData.nameOfferEn" class="p-2 text-center">
            <h3 class="h3">{{formatedData.nameOfferEn}}</h3>
            <h4 class="h3">{{formatedData.priceOfferEn}}</h4>
            <ul  class="list-unstyled">
                <li v-for="value in formatedData.planOfferEn" :key="value" >&bull;&#160;{{ value }}</li>
                <!-- <li v-for="value in formatedData.planOfferEn" :key="value" >&bull;&#160;{{ value }}</li> -->
            </ul>
        </div>
      </div>
      <label >English</label>
      <div v-if="isInEdition" class="row row-cols-lg-3 bg-info-subtle">
        <div v-for="data in datas" :key="data.nameOfferEn" class="p-2 text-center">
          <input class="h3" v-model="data.nameOfferEn" type="text" />
          <input class="h3" v-model="data.priceOfferEn" type="text" />
          <textarea type="text" v-model="data.planOfferEn"></textarea>
        </div>
      </div>
      <label >Français</label>
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
