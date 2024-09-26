<script setup>
import PricingsProduct from '@/components/PricingsProduct.vue';
import HeaderComponent from '@/components/HeaderComponent.vue';
import PricingDetailsComponent from '@/components/PricingDetailsComponent.vue';

// const goToBottom = document.getElementById("go-to-bottom");
// const goToTop = document.getElementById("go-to-top");

// goToBottom.addEventListener("click", () => {
//   goToTop.scrollIntoView({ behavior: "instant", block: "end" });
// });
</script>


<template>
    <main>
        <div class="container p-5">
            <HeaderComponent/>
        </div>
        <h1>{{ $t('pricingPage')}}</h1>
        <PricingsProduct :isEditable=false />
        <div class="text-center p-3">
            <button class="button" id="go-to-bottom"> {{$t('viewMore')}}</button>
        </div>
        <PricingsProduct :isEditable=false />
        <PricingsProduct :isEditable=false />
        <PricingsProduct :isEditable=false />
        <PricingsProduct :isEditable=false />

        <PricingDetailsComponent id="go-to-top"/>
    </main>
</template>

<style>

.button {
    padding: 0.5rem 3rem;
}
</style>