<script setup>
import Header from '../components/Header.vue';
import TermsForm from '../components/TermsForm.vue';
</script>

<template>
    <main>
      <Header/>
      <h1 class="pt-5">Genral terms and conditions</h1>
      <TermsForm :isEditable="true"/>
      </div>
    </main>
</template>
