<script setup>
import {onMounted, ref} from 'vue';
import PricingsProduct from '@/components/PricingsProduct.vue';
import Header from '@/components/Header.vue';
import PricingDetails from '@/components/PricingDetails.vue';

const refToDetailsPricingList = ref(null);

const scrollToComponentDetail = () => {
    if(refToDetailsPricingList.value){
        refToDetailsPricingList.value.$refs.scrollRefComponent.scrollIntoView({ behavior: 'smooth' });
    }
    }
    onMounted(() => {
    console.log("this is" + refToDetailsPricingList.value); // Vérifiez que l'élément est correctement référencé
});
</script>


<template>
    <main>
        <div class="container p-5">
            <Header/>
        </div>
        <h1>{{ $t('pricingPage')}}</h1>
        <PricingsProduct :isEditable=false />
        <div class="text-center p-3">
            <button class="button" id="go-to-bottom" @click="scrollToComponentDetail"> {{$t('viewMore')}}</button>
        </div>
        <PricingsProduct :isEditable=false />
        <PricingsProduct :isEditable=false />
        <PricingsProduct :isEditable=false />
        <PricingsProduct :isEditable=false />
            <PricingDetails :isEditable=true ref="refToDetailsPricingList" />
    </main>
</template>

<style>

.button {
    padding: 0.5rem 3rem;
}
</style>