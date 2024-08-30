<script setup>
import axiosClient from '@/services/axiosClient';
import { ref, onMounted } from 'vue';

const props = defineProps({
    isEditable: Boolean
})

console.log(props.isEditable)
const dreamTeamId = ref({});
const editDreamTeam = ref(false);

/**(button onClick) Display edit function to edit the product*/
const editIdProduct = () => {
    console.log("I believe I can click !");
    editDreamTeam.value = !editDreamTeam.value;
}
const updateValue = ref('');

/**Tap text and display value */
function onInput(e) {
    dreamTeamId.value.sloganFr = e.target.value
}

const inputDataIsValid = ref({
    picture: true,
    slogan: true
})

function submitData() {
    axiosClient.post('/dreamteam/updateData', dreamTeamId.value);
}

onMounted(() => {
    axiosClient.get('/dreamteam')
        .then(response => {
            dreamTeamId.value = response.data;
            console.log(dreamTeamId);
        });
})

</script>
<template>
    <section>
        <div class="text-end">
            <button v-if="props.isEditable" class="me-5 btn btn-info" @click="editIdProduct">
                <i class="h4 text-white bi bi-pencil-square"></i>
            </button>
            <div class="d-flex flex-wrap flex-lg-nowrap g-3 align-items-center justify-content-center">
                <div class="col-12 col-lg-8 order-1 order-lg-0">
                    <div>
                        <img :src="dreamTeamId.picture" alt="example identity picture"
                            class="col-12 img-fluid bannerPicture">
                    </div>
                </div>
                <div class="mx-lg-auto text-center p-2 h4">
                    <div>
                        {{ dreamTeamId.sloganEn }}

                    </div>
                </div>


            </div>
            <!-- Test champ saisie-->
            <div class="d-flex flex-wrap align-items-center justify-content-center mx-5" v-if="editDreamTeam"
                @submit="">
                <div class="col-12 col-lg-4 d-flex">
                    <input type="text" v-model="updateValue" class="form-control mt-2" placeholder="Upload a new image"
                        :v-bind:class="{ borderIsRed: !inputDataIsValid.picture }" required>

                    <i class="h3 m-2 bi bi-filetype-jpg"></i>
                </div>
                <div class="col-12 col-lg-4 mx-3">
                    <input :value="dreamTeamId.sloganEn" v-if="editDreamTeam" @input="onInput"
                        :placeholder="dreamTeamId.sloganEn" class="form-control mt-2 text-center">
                </div>
                <button v-on:click="submitData" type="submit" class="btn btn-primary">SAVE</button>
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
