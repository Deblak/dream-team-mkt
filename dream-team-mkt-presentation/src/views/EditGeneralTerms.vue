<script setup>
import Header from '../components/Header.vue';
import TermsForm from '../components/TermsForm.vue';
</script>

<template>
    <main>
      <div class="container p-5">
        <Header/>
      </div>

      <div class="container p-5">
        <h1>Genral terms and conditions</h1>
      </div>

      <div class="container p-5">
      <TermsForm :isEditable="true"/>
      </div>
    </main>
</template>
