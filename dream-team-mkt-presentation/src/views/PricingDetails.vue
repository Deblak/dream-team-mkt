<script setup>
import {ref} from 'vue';
import PricingsProduct from '@/components/PricingsProduct.vue';
import Header from '@/components/Header.vue';
import PricingDetails from '@/components/PricingDetails.vue';
import {MqResponsive} from 'vue3-mq';

const refToDetailsPricingList = ref(null);

const scrollToComponentDetail = () => {
    if(refToDetailsPricingList.value){
        refToDetailsPricingList.value.$refs.scrollRefComponent.scrollIntoView({ behavior: 'smooth',block:'start'});
    }else {
        refToDetailsPricingList.value.$refs.scrollRefComponentSmartphone.scrollIntoView({behavior: 'smooth',block:'start'})
    }
    };
</script>


<template>
    <main>
        <div class="container p-5">
            <Header/>
        </div>
        <h1>{{ $t('pricingPage')}}</h1>
        <div class="custom-inline-flex">
            <PricingsProduct :isEditable="false" />
        </div>
        <MqResponsive group>
            <template #lg+>
                <div class="text-center p-3">
                    <!-- <PricingsProduct :isEditable=false /> -->
                    <button class="button" id="go-to-bottom" @click="scrollToComponentDetail"> {{$t('viewMore')}}</button>
                </div>
            </template>
            <template #md->
                <!-- <div class="d-inline-flex flex-nowrap">
                    <PricingsProduct :isEditable=false />
                </div> -->
                <div class="text-center p-3 nowrap">
                    <button class="button" id="go-to-bottom" @click="scrollToComponentDetail"> Small</button>
                    <button class="button" id="go-to-bottom" @click="scrollToComponentDetail"> Medium</button>
                    <button class="button" id="go-to-bottom" @click="scrollToComponentDetail"> Large</button>
                </div>
            </template>
        </MqResponsive>
        <!-- <PricingsProduct :isEditable=false />
        <PricingsProduct :isEditable=false />
        <PricingsProduct :isEditable=false />
        <PricingsProduct :isEditable=false /> -->
            <PricingDetails :isEditable=true ref="refToDetailsPricingList" />
    </main>
</template>

<style>

.button {
    padding: 0.5rem 3rem;
}
.nowrap{
    display: flex;
    flex-wrap: nowrap;
    justify-content: center;
}
.color{
    background-color: violet;
}
.custom-inline-flex {
  display: inline-flex;
  flex-wrap: nowrap;
}
</style>