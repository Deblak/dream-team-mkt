<script setup>
import {onMounted, ref} from 'vue';
import PricingsProduct from '@/components/PricingsProduct.vue';
import HeaderComponent from '@/components/HeaderComponent.vue';
import PricingDetailsComponent from '@/components/PricingDetailsComponent.vue';

const toColumnsDetails = ref(null);

const scrollToComponantDetail = () => {
    if(toColumnsDetails.value){
        toColumnsDetails.value.$refs.componentElement.scrollIntoView({ behavior: 'smooth' });
    }
    }
    onMounted(() => {
    console.log("this is" + toColumnsDetails.value); // Vérifiez que l'élément est correctement référencé
});
</script>


<template>
    <main>
        <div class="container p-5">
            <HeaderComponent/>
        </div>
        <h1>{{ $t('pricingPage')}}</h1>
        <PricingsProduct :isEditable=false />
        <div class="text-center p-3">
            <button class="button" id="go-to-bottom" @click="scrollToComponantDetail"> {{$t('viewMore')}}</button>
        </div>
        <PricingsProduct :isEditable=false />
        <PricingsProduct :isEditable=false />
        <PricingsProduct :isEditable=false />
        <PricingsProduct :isEditable=false />
            <PricingDetailsComponent :isEditable=true ref="toColumnsDetails" />
    </main>
</template>

<style>

.button {
    padding: 0.5rem 3rem;
}
</style>