<script setup>
import HeaderComponent from '../components/HeaderComponent.vue';
import LinkEditGeneralTerms from '../components/LinkEditGeneralTerms.vue';
import TermsForm from '../components/TermsForm.vue';
</script>

<template>
    <main>
      <div class="container p-5">
        <HeaderComponent/>
      </div>

      <div class="container p-5">
        <h1>Genral terms and conditions</h1>
      </div>

      <div class="container p-5">
        <TermsForm :isEditable="false"/>
      </div>

      <div class="container p-5">
        <LinkEditGeneralTerms/>
      </div>
    </main>
</template>