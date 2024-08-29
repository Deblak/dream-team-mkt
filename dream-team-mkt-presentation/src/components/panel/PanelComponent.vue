<script setup>
import { onMounted, ref } from 'vue';
import PanelComponentService from '../../services/panelComponentService.js'

const props = defineProps({
  isEditable: Boolean
})

const data = ref({});
const isInEdition = ref(false);

onMounted( async () => {
  data.value = await PanelComponentService.fetchData();
})

function toggleEdition() {
  isInEdition.value = true;
}

async function saveChange() {
  data.value = await PanelComponentService.updateData(data.value);
  isInEdition.value = false;
}
</script>


<template>
    <section class="container">

        <div class="row row-cols-lg-2 my-4">
          <div class="mb-3">
            <span v-if="isInEdition">English</span>
            <div class="card">
              <p class="align-self-center p-4">{{ data.panelOneDescEn }}</p>
            </div>
          </div>
          <div class="mb-3">
            <span v-if="isInEdition">English</span>
            <div class="card">
              <p class="align-self-center p-4">{{ data.panelTwoDescEn }}</p>
            </div>
          </div>
        </div>
        <div v-if="isInEdition" class="row row-cols-lg-2 my-4">
          <div class="mb-3">
            <label for="panel-one-en">English</label>
            <textarea v-model="data.panelOneDescEn" id="panel-one-en" class="form-control"></textarea>
          </div>
          <div class="mb-3">
            <label for="panel-two-en">English</label>
            <textarea v-model="data.panelTwoDescEn" id="panel-two-en" class="form-control"></textarea>
          </div>
          <div class="mb-3">
            <label for="panel-one-fr">Francais</label>
            <textarea v-model="data.panelOneDescFr" id="panel-one-fr" class="form-control"></textarea>
          </div>
          <div class="mb-3">
            <label for="panel-two-fr">Francais</label>
            <textarea v-model="data.panelTwoDescFr" id="panel-two-fr" class="form-control"></textarea>
          </div>
        </div>
        <div v-if="props.isEditable && !isInEdition" @click="toggleEdition" class="btn btn-primary">edit panels</div>
        <div v-if="props.isEditable && isInEdition" @click="saveChange" class="btn btn-primary">save</div>
    </section>
</template>
