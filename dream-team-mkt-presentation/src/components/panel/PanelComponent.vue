<script setup>
import { onMounted, ref } from 'vue';
import PanelComponentService from '../../services/panelComponentService.js'

const data = ref({});

onMounted( async () => {
  data.value = await PanelComponentService.fetchData();
})

</script>


<template>
    <section class="container">
        <div class="row row-cols-lg-2 my-4">
            <div class="mb-3">
                <textarea v-model="data.panelOneDescEn" class="form-control" id="exampleFormControlTextarea1" rows="4"></textarea>
            </div>
            <div class="mb-3">
                <textarea v-model="data.panelTwoDescEn" class="form-control" id="exampleFormControlTextarea1" rows="4"></textarea>
            </div>
        </div>
    </section>
</template>
