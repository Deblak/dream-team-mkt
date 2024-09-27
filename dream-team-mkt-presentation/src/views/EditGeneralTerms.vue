<script setup>
import Header from '../components/Header.vue';
import TermsForm from '../components/TermsForm.vue';
</script>

<template>
    <main>
      <div class="container p-5">
        <Header/>
      </div>
      <h1>Genral terms and conditions</h1>
      <TermsForm :isEditable="true"/>
    </main>
</template>
