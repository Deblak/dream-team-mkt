<script setup>
import axiosClient from '@/services/axiosClient';
import { ref, onMounted } from 'vue';

const dreamTeamId = ref({});

onMounted(() => {
    console.log("Hello");
    axiosClient.get('/dreamteam')
    .then(response => {
        dreamTeamId.value = response.data;
        console.log(dreamTeamId);
    });

})

</script>
<template>
 
    <section>
        <div class="d-flex flex-wrap flex-lg-nowrap g-3 align-items-center justify-content-center">
            <div class="col-lg-8 order-1 order-lg-0" >
                <img :src="dreamTeamId.picture" alt="example identity picture" class="col-lg-12 img-fluid" style="height: 50vh;">
            </div>
            <div class="mx-lg-auto text-center p-2 h4">
                {{ dreamTeamId.sloganFr }}
            </div>
        </div>
    </section>
</template>