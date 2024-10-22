<script>
import PricingsProduct from '../services/pricingsProduct.js';

export default {
  name: 'PricingsProductView',
  props: {
    isEditable: Boolean
  },
  data() {
    return {
      language: navigator.language,
      datas: [],
      isInEdition: false
    };
  },
  async mounted() {
    this.datas = await PricingsProduct.fetchData();
  },
  methods: {
    async fetchData() {
      this.datas = await PricingsProduct.fetchData();
    },
    toggleEdition() {
      this.isInEdition = !this.isInEdition;
    },

    async saveChange() {
      await PricingsProduct.updateData(this.datas);
      this.datas = await PricingsProduct.fetchData();
      this.isInEdition = false;
    },

    splitPlanOffer(params) {
      return params.split(',');
    },
  }
};

// const props = defineProps({
//   isEditable: Boolean
// })

// const datas = ref([]);
// const isInEdition = ref(false);
// const language = navigator.language;

// onMounted( async () => {
//   datas.value = await PricingsProduct.fetchData();
// })

// function toggleEdition() {
//   isInEdition.value = !isInEdition.value;
// }

// async function saveChange() {
//   await PricingsProduct.updateData(datas.value);
//   datas.value = await PricingsProduct.fetchData();
//   isInEdition.value = false;
// }

// function splitPlanOffer(params) {
//   return params.split(',')
// }

</script>
<template>
  <section class="text-end">
    <button v-if="isEditable" class="me-5 btn btn-info mt-3" @click="toggleEdition">
      <i class="h4 text-white bi bi-pencil-square"></i>
    </button>
    <div class="container">
      <div v-if="isEditable && isInEdition">
        <label v-if="language === 'fr-FR'">{{ $t('french') }}</label>
        <label v-else>{{ $t('english') }}</label>
      </div>
      <div v-if="language === 'fr-FR'" class="row row-cols-lg-3 bg-info-subtle">
        <div v-for="data in datas" :key="data" class="p-2 text-center">
          <h3 class="h3">{{ data.nameFr }}</h3>
          <h4 class="h3">{{ data.priceFr }}</h4>
          <ul class="list-unstyled">
            <li v-for="value in splitPlanOffer(data.planFr)" :key="value">
              &bull;&#160;{{ value }}
            </li>
          </ul>
        </div>
      </div>
      <div v-else class="row row-cols-lg-3 bg-info-subtle">
        <div v-for="data in datas" :key="data" class="p-2 text-center">
          <h3 class="h3">{{ data.nameEn }}</h3>
          <h4 class="h3">{{ data.priceEn }}</h4>
          <ul class="list-unstyled">
            <li v-for="value in splitPlanOffer(data.planEn)" :key="value">
              &bull;&#160;{{ value }}
            </li>
          </ul>
        </div>
      </div>
      <label v-if="isEditable && isInEdition">{{ $t('english') }}</label>
      <div v-if="isInEdition" class="row row-cols-lg-3 bg-info-subtle">
        <div v-for="data in datas" :key="data" class="p-2 text-center">
          <input class="h3" v-model="data.nameEn" type="text" />
          <input class="h3" v-model="data.priceEn" type="text" />
          <textarea type="text" v-model="data.planEn"></textarea>
        </div>
      </div>
      <label v-if="isEditable && isInEdition">{{ $t('french') }}</label>
      <div v-if="isInEdition" class="row row-cols-lg-3 bg-info-subtle">
        <div v-for="data in datas" :key="data" class="p-2 text-center">
          <input class="h3" v-model="data.nameFr" type="text" />
          <input class="h3" v-model="data.priceFr" type="text" />
          <textarea type="text" v-model="data.planFr"></textarea>
        </div>
      </div>
      <div v-if="isEditable && isInEdition" @click="saveChange" class="btn btn-primary">{{ $t('save') }}</div>
    </div>
  </section>
</template>
