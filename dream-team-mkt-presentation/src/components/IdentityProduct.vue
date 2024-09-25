<script setup>
import { ref, onMounted } from 'vue';
import IdentityProductService from '@/services/identityProductService';

const props = defineProps({
    isEditable: Boolean
})

const dreamTeamId = ref({});
const editDreamTeam = ref(false);
const language = navigator.language;

const editIdProduct = () => {
    editDreamTeam.value = !editDreamTeam.value;
}

function onInput(e) {
    dreamTeamId.value.sloganEn = e.target.value
}

async function submitData() {
  dreamTeamId.value = await IdentityProductService.updateData(dreamTeamId.value);
  editDreamTeam.value = false;
}

onMounted( async() => {
  dreamTeamId.value = await IdentityProductService.fetchData();
})

</script>
<template>
  <section>
    <div class="text-end editStyle mb-3">
    <button v-if="props.isEditable" class="me-5 btn btn-info" @click="editIdProduct">
      <i class="h4 text-white bi bi-pencil-square"></i>
    </button>
      <div class="d-flex flex-wrap flex-lg-nowrap g-3 align-items-center justify-content-center">
        <div class="col-12 col-lg-8 order-1 order-lg-0">
          <div>
            <div v-if="editDreamTeam">
              <label v-if="language === 'fr-FR'">{{$t('french')}}</label>
              <label v-else>{{$t('english')}}</label>
            </div>
            <img v-if="language === 'fr-FR'" :src="dreamTeamId.picture_fr" alt="example identity picture"
              class="col-12 img-fluid bannerPicture">
              <img v-else :src="dreamTeamId.picture_en" alt="example identity picture"
              class="col-12 img-fluid bannerPicture">
          </div>
        </div>
        <div class="mx-lg-auto ">
          <div v-if="editDreamTeam">
            <label v-if="language === 'fr-FR'">{{$t('french')}}</label>
            <label v-else>{{$t('english')}}</label>
          </div>
          <div v-if="language === 'fr-FR'" class="text-center p-2 h4">{{ dreamTeamId.sloganFr }}</div>
          <div v-else class="text-center p-2 h4">{{ dreamTeamId.sloganEn }}</div>
        </div>
      </div>
      <div v-if="editDreamTeam">
        <div class="d-flex flex-wrap align-items-center justify-content-center mx-5 mb-3">
          <label >{{ $t('english') }}</label>
          <div class="col-12 col-lg-4 d-flex">
            <input type="text" v-model="dreamTeamId.picture_en" class="form-control mt-2" placeholder="Upload a new image" required>
            <i class="h3 m-2 bi bi-filetype-jpg"></i>
        </div>
        <label >{{ $t('english') }}</label>
        <div class="col-12 col-lg-4 mx-3">
          <input :value="dreamTeamId.sloganEn" v-if="editDreamTeam" @input="onInput"
            :placeholder="dreamTeamId.sloganEn" class="form-control mt-2">
        </div>
    </div>
    <div class="d-flex flex-wrap align-items-center justify-content-center mx-5 mb-3">
        <label >{{ $t('french') }}</label>
        <div class="col-12 col-lg-4 d-flex">
          <input type="text" v-model="dreamTeamId.picture_fr" class="form-control mt-2" placeholder="Upload a new image" required>
            <i class="h3 m-2 bi bi-filetype-jpg"></i>
        </div>
        <label >{{ $t('french') }}</label>
        <div class="col-12 col-lg-4 mx-3">
          <input :value="dreamTeamId.sloganFr" v-if="editDreamTeam" @input="onInput"
            :placeholder="dreamTeamId.sloganFr" class="form-control mt-2">
        </div>
    </div>
    <div class="text-end my-3">
          <button v-on:click="submitData" type="submit" class="btn btn-primary">
            {{$t('save')}}
          </button>
    </div>
    </div>
    </div>
  </section>
</template>
<style scoped>
.bannerPicture {
    max-height: 50vh;
    object-fit: cover;
}
</style>
