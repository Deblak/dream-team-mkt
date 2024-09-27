<script setup>
import { onMounted, ref } from 'vue';
import TermsForm from '../services/termsForm.js';

const termsForm = ref("");

const props = defineProps({
  isEditable: Boolean
})

const data = ref({});
const isInEdition = ref(false);

onMounted(async () => {
  data.value = await TermsForm.fetchData();
})

function toggleEdition() {
  //isInEdition.value = true;
  isInEdition.value = !isInEdition.value;
}

async function saveChange() {
  data.value = await TermsForm.updateData(data.value);
  isInEdition.value = false;
}

</script>

<template>

  <section class="form-term">

    <button v-if="props.isEditable" class="me-5 btn btn-info mt-3" @click="toggleEdition">
      <i class="h4 text-white bi bi-pencil-square"></i>
    </button>

    <div class="row row-cols-lg-1 mt-4">
      
      <div class="form-floating"> 
        <textarea  class="form-control" placeholder="Leave a comment here" 
        id="floatingTextarea2" style="min-height: 350px; width: 1000px;">{{termsForm}}</textarea>

        <label for="floatingTextarea2">Comments</label>
      </div>

      <div v-if="props.isEditable" class="form-floating"> <!--<span> {{termsForm}} </span>-->
        <textarea v-model="termsForm" class="form-control" placeholder="Leave a comment here" 
        id="floatingTextarea2" style="min-height: 350px; width: 1000px;"></textarea>

        <label for="floatingTextarea2">Comments</label>
      </div>

      <div class="text-end">
        <div v-if="props.isEditable && isInEdition" @click="saveChange" class="btn btn-primary mb-3">SAVE</div>
      </div>

    </div>

  </section>
  
</template>../services/termsForm.js
