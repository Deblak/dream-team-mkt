<script setup>
import {ref} from 'vue'

const inputFormData = ref({
  corporateName: "",
  firstName: "",
  lastName: "",
  email: "",
  phoneNumber: "",
  message: ""
})

function inputisValid(inputs) {
  let isValid = true
  if (inputs.value.firstName === '' || inputs.value.lastName == '') {
    isValid = false
  }
  return isValid;
}

function submitData() {
  event.preventDefault()
  if (inputisValid(inputFormData)) {
    // TODO
  } else {
    // TODO
  }
  inputisValid(inputFormData)
  console.log(inputFormData.value.firstName);

}
</script>


<template>
  <div class="container bg-light border rounded-2">
  <form novalidate>
    <div class="contact-form-container col-12 py-3">
      <h1 class="text-center m-3">Contact form</h1>
        <div class="m-3 row">
          <div class="field mx-4 col-10 col-lg-4">
            <label for="corporateName" class="form-label">Corporate names<span class="text-danger"><span class="text-danger">*</span></span></label>
            <input v-model="inputFormData.corporateName" type="text" class="form-control" id="corporateName" placeholder="Example input placeholder">
          </div>
        </div>
        <div class="row row-cols-lg-2 m-3">
          <div class="col-10 col-lg-4">
            <div class="field mx-4">
              <label for="firstName" class="form-label">First name<span class="text-danger">*</span></label>
              <input v-model="inputFormData.firstName" type="text" class="form-control" id="firstName" placeholder="Another input placeholder">
            </div>
          </div>
          <div class="col-10 col-lg-4">
            <div class="field mx-4">
              <label for="lastName" class="form-label">Last name<span class="text-danger">*</span></label>
              <input v-model="inputFormData.lastName" type="text" class="form-control" id="lastName" placeholder="Another input placeholder">
          </div>
        </div>
      </div>
      <div class="row row-cols-lg-2 m-3">
        <div class="col-10 col-lg-4">
          <div class="field mx-4 ">
            <label for="email" class="form-label">Email<span class="text-danger">*</span></label>
            <input v-model="inputFormData.email" type="email" class="form-control" id="email" placeholder="Another input placeholder">
          </div>
        </div>
        <div class="col-10 col-lg-4">
          <div class="field mx-4">
            <label for="phoneNumber" class="form-label">Phone number<span class="text-danger">*</span></label>
            <input v-model="inputFormData.phoneNumber" type="tel" class="form-control" id="phoneNumber" placeholder="Another input placeholder">
          </div>
        </div>
      </div>
      <div class="m-3 row">
        <div class="field mx-4 col-10">
          <label for="message" class="form-label">Message</label>
          <textarea v-model="inputFormData.message" class="form-control" id="message" rows="3"></textarea>
        </div>
      </div>
      <div class="m-4 row">
        <button v-on:click="submitData" class="btn btn-primary mx-4 mt-4 col-10 col-xl-4">Submit
      </button>
    </div>
    </div>
  </form>
</div>
</template>
