<script>
import PricingDetails from '../services/pricingDetails.js';

export default {
    name: 'PricingDetailView',
    props: {
        isEditable: Boolean
    },
    data() {
        return {
            scrollRefComponent: null,
            isInEdition: false,
            retrieveDatas: [],
            language: navigator.language
        };
    },
    async mounted() {
        this.retrieveDatas = await PricingDetails.fetchData();
    },
    methods: {
        splitDetailPlanOffer(params) {
            return params.split(',');
        },
        toggleEdition() {
            this.isInEdition = !this.isInEdition;
        },
        scrollToData(id) {
    const element = this.$refs[id]; // Accéder directement à la référence avec l'ID
    console.log("Élément à faire défiler :", element); // Ligne de débogage
    if (element && typeof element.scrollIntoView === 'function') {
        element.scrollIntoView({ behavior: 'smooth', block: 'start' });
    } else {
        console.error("L'élément ou la méthode scrollIntoView est indisponible.");
    }
},

        async saveChange() {
            console.log('Données avant avant à jour:', this.retrieveDatas);
            await PricingDetails.updateData(this.retrieveDatas);
            console.log('Données avant mise à jour:', this.retrieveDatas);
            // this.retrieveDatas = await PricingDetails.fetchData();
            this.isInEdition = false;
        }
    },
};
</script>

<template>
  <main class="container text-end" ref="scrollRefComponent">
    <button v-if="isEditable" class="me-5 btn btn-info mb-3" @click="toggleEdition">
      <i class="h4 text-white bi bi-pencil-square"></i>
    </button>

    <div v-if="isEditable && isInEdition" class="mb-3 flex-grow-1">
      <label v-if="language === 'fr-FR'">{{ $t('french') }}</label>
      <label v-else>{{ $t('english') }}</label>
    </div>

    <div class="row g-5">
      <div v-for="data in retrieveDatas" :key="data.id" :ref="data.id" class="col-lg-4 col-sm-12 p-2 text-start d-flex flex-column"> <!-- 3 colonnes en large, 2 en moyen, 1 en petit -->
        <h3>{{ data.id }}</h3>
        <div class="flex">
          <ul v-if="language === 'fr-FR'" class="list-unstyled">
          <li v-for="value in splitDetailPlanOffer(data.detailPlanFr)" :key="value">
            &bull;&#160;{{ value }}
          </li>
        </ul>
        <ul v-else class="list-unstyled">
          <li v-for="value in splitDetailPlanOffer(data.detailPlanEn)" :key="value">
            &bull;&#160;{{ value }}
          </li>
        </ul>
        </div>
        <div class="text-end">
          <label v-if="isEditable && isInEdition">{{ $t('english') }}</label>
        </div>
        <div v-if="isInEdition">
          <textarea v-model="data.detailPlanEn" type="text" class="form-control"></textarea>
        </div>

        <div class="text-end">
          <label v-if="isEditable && isInEdition">{{ $t('french') }}</label>
        </div>
        <div v-if="isInEdition">
          <textarea v-model="data.detailPlanFr" type="text" class="form-control"></textarea>
        </div>
      </div>
    </div>
    <div v-if="isEditable && isInEdition" @click="saveChange" class="btn btn-primary mt-3">Save</div>

  </main>
</template>




<style>
.border {
    border : solid black;
    /* margin-top: 10rem; */
    background-color: yellow;
}
.textarea{
  width: 100%;
  background-color: orangered;
  border: solid red;
}
.flex{
  flex: 1;
}
</style>