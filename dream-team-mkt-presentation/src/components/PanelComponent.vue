<script setup>
import { onMounted, ref } from 'vue';
import PanelComponentService from '../services/panelComponentService.js'

const props = defineProps({
  isEditable: Boolean
})

const data = ref({});
const isInEdition = ref(false);
const language = navigator.language;

onMounted(async () => {
  data.value = await PanelComponentService.fetchData();
})

function toggleEdition() {
  //isInEdition.value = true;
  isInEdition.value = !isInEdition.value;
}

async function saveChange() {
  data.value = await PanelComponentService.updateData(data.value);
  isInEdition.value = false;
}
</script>


<template>

  <section class="text-end">
    <button v-if="props.isEditable" class="me-5 btn btn-info mt-3" @click="toggleEdition">
      <i class="h4 text-white bi bi-pencil-square"></i>
    </button>
    <div class="container">
      <div class="row row-cols-lg-2 my-4">
        <div class="mb-3">
          <div v-if="isInEdition">
            <span v-if="language === 'fr-FR'">{{$t('french')}}</span>
            <span v-else>{{$t('english')}}</span>
          </div>
          <div class="card">
            <p v-if="language === 'fr-FR'" class="align-self-center p-4">{{ data.panelOneDescFr }}</p>
            <p v-else class="align-self-center p-4">{{ data.panelOneDescEn }}</p>
          </div>
        </div>
        <div class="mb-3">
          <div v-if="isInEdition">
            <span v-if="language === 'fr-FR'">{{$t('french')}}</span>
            <span v-else>{{$t('english')}}</span>
          </div>
          <div class="card">
            <p v-if="language === 'fr-FR'" class="align-self-center p-4">{{ data.panelTwoDescFr }}</p>
            <p v-else class="align-self-center p-4">{{ data.panelTwoDescEn }}</p>
          </div>
        </div>
      </div>

      <div v-if="isInEdition" class="row row-cols-lg-2 mt-4">
        <div class="mb-3">
          <label for="panel-one-en">{{$t('english')}}</label>
          <textarea v-model="data.panelOneDescEn" id="panel-one-en" class="form-control"></textarea>
        </div>
        <div class="mb-3">
          <label for="panel-two-en">{{$t('english')}}</label>
          <textarea v-model="data.panelTwoDescEn" id="panel-two-en" class="form-control"></textarea>
        </div>
        <div class="mb-3">
          <label for="panel-one-fr">{{$t('french')}}</label>
          <textarea v-model="data.panelOneDescFr" id="panel-one-fr" class="form-control"></textarea>
        </div>
        <div class="mb-3">
          <label for="panel-two-fr">{{$t('french')}}</label>
          <textarea v-model="data.panelTwoDescFr" id="panel-two-fr" class="form-control"></textarea>
        </div>
      </div>
      <div class="text-end">
        <div v-if="props.isEditable && isInEdition" @click="saveChange" class="btn btn-primary mb-3">{{$t('save')}}</div>
      </div>
    </div>

  </section>
</template>../services/panelComponentService.js
