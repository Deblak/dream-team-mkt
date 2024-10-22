<script>
import PricingDetails from '../services/pricingDetails.js';

export default {

  name: 'PriicingDetailView',
  props: {
    isEditable: Boolean
  },
  data(){
    return {
      scrollRefComponent: null,
      isInEdition: false,
      retrieveDatas: []
    }
  },
  mounted() {
    async () => {
      this.retrieveDatas = await PricingDetails.fetchData();
    }
  },
  methods: {
   splitDetailPlanOffer(params) {
  return params.split(',')
},
toggleEdition() {
  this.isInEdition = !this.isInEdition;
},
async saveChange() {
    console.log('Données avant avant à jour:', this.retrieveDatas);
  await PricingDetails.updateData(this.retrieveDatas);
  console.log('Données avant mise à jour:', this.retrieveDatas);
  this.retrieveDatas = await PricingDetails.fetchData();
  this.isInEdition = false;
}
  }
};
</script>


<template>
    <section class="text-end" ref="scrollRefComponent" >
    <button v-if="isEditable" class="me-5 btn btn-info mt-3" @click="toggleEdition">
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
    <label v-if="isEditable && isInEdition">English</label>
    <div v-if="isInEdition" class="row row-cols-lg-3 bg-info-subtle">
      <div v-for="data in retrieveDatas" :key="data" class="p-2 text-center">
        <textarea v-model="data.detailPlanEn" type="text"></textarea>
      </div>
    </div>
    <label v-if="isEditable && isInEdition">Français</label>
    <div v-if="isInEdition" class="row row-cols-lg-3 bg-info-subtle">
      <div v-for="data in retrieveDatas" :key="data" class="p-2 text-center">
        <textarea v-model="data.detailPlanFr" type="text"></textarea>
      </div>
    </div>
    <div v-if="isEditable && isInEdition" @click="saveChange" class="btn btn-primary">save</div>
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