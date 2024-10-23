<script setup>
import Header from '../components/Header.vue';
import LinkEditGeneralTerms from '../components/LinkEditGeneralTerms.vue';
import TermsForm from '../components/TermsForm.vue';
</script>

<template>
    <main>
      <Header/>
      <h1>Genral terms and conditions</h1>
      <TermsForm :isEditable="false"/>
    </div>
    <div class="container p-5">
      <LinkEditGeneralTerms/>
    </div>
    
    </main>
</template>