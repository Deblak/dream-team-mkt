<script setup>
import { ref } from 'vue';
import ContactFormService from "../services/contactFormService.js"

const inputFormDataIsValid = ref({
  corporateName: true,
  firstName: true,
  lastName: true,
  emailPhoneNumber: true,
  message: true
})
const inputFormData = ref({
  corporateName: "",
  firstName: "",
  lastName: "",
  email: "",
  phoneNumber: "",
  message: ""
})

function inputIsValid(inputs) {
  let isValid = true;
  inputFormDataIsValid.value.corporateName = true;
  inputFormDataIsValid.value.firstName = true;
  inputFormDataIsValid.value.lastName = true;
  inputFormDataIsValid.value.emailPhoneNumber = true;
  inputFormDataIsValid.value.message = true;
  if (inputs.value.corporateName === '' || inputs.value.corporateName.trim().length > 200 ) {
    inputFormDataIsValid.value.corporateName = false;
    isValid = false;
  }
  if (inputs.value.firstName === '' || inputs.value.firstName.trim().length > 200 ) {
    inputFormDataIsValid.value.firstName = false;
    isValid = false;
  }
  if (inputs.value.lastName === '' || inputs.value.lastName.trim().length > 200 ) {
    inputFormDataIsValid.value.lastName = false;
    isValid = false;
  }
  if (inputs.value.email === '' && inputs.value.phoneNumber === '') {
    inputFormDataIsValid.value.emailPhoneNumber = false;
    isValid = false;
  }
  if (inputs.value.message === '' || inputs.value.message.trim().length > 2000) {
    inputFormDataIsValid.value.message = false;
    isValid = false;
  }
  return isValid;
}

function submitData() {
  event.preventDefault()
  if (inputIsValid(inputFormData)) {
    ContactFormService.sendContactFormData(inputFormData);
    inputFormData.value = {
      corporateName: "",
      firstName: "",
      lastName: "",
      email: "",
      phoneNumber: "",
      message: ""
    }
  }
}
</script>

<template>
  <div class="container bg-light border rounded-2">
  <form novalidate class="p4">
    <div class="contact-form-container col-12 py-3 ">
      <h1 class="text-center m-3">Contact form</h1>
        <div class="m-3 row">
          <div class="field mx-3 col-10 col-lg-4">
            <label for="corporateName" class="form-label">Corporate names<span class="text-danger"><span class="text-danger">*</span></span></label>
            <input v-model="inputFormData.corporateName" type="text" class="form-control" v-bind:class="{borderIsRed: !inputFormDataIsValid.corporateName}" id="corporateName" placeholder="Example input placeholder" required>
            <span v-if="!inputFormDataIsValid.corporateName" class="feedback fst-italic text-danger">Corporate name can't be blank, max 200 characters !</span>
          </div>
        </div>
        <div class="row row-cols-lg-2 m-3">
          <div class="col-10 col-lg-4">
            <div class="field mx-3">
              <label for="firstName" class="form-label">First name<span class="text-danger">*</span></label>
              <input v-model="inputFormData.firstName" type="text" class="form-control" v-bind:class="{borderIsRed: !inputFormDataIsValid.firstName}" id="firstName" placeholder="Another input placeholder" required>
              <span v-if="!inputFormDataIsValid.firstName" class="feedback fst-italic text-danger">First name can't be blank, max 200 characters !</span>
            </div>
          </div>
          <div class="col-10 col-lg-4">
            <div class="field mx-3">
              <label for="lastName" class="form-label">Last name<span class="text-danger">*</span></label>
              <input v-model="inputFormData.lastName" type="text" class="form-control" v-bind:class="{borderIsRed: !inputFormDataIsValid.lastName}" id="lastName" placeholder="Another input placeholder" required>
              <span v-if="!inputFormDataIsValid.lastName" class="feedback fst-italic text-danger">Last name can't be blank, max 200 characters !</span>
          </div>
        </div>
      </div>
      <div class="row row-cols-lg-2 m-3">
        <div class="col-10 col-lg-4">
          <div class="field mx-3 ">
            <label for="email" class="form-label">Email<span class="text-danger">*</span></label>
            <input v-model="inputFormData.email" type="email" class="form-control" v-bind:class="{borderIsRed: !inputFormDataIsValid.emailPhoneNumber}" id="email" placeholder="Another input placeholder">
            <span v-if="!inputFormDataIsValid.emailPhoneNumber" class="feedback fst-italic text-danger">Email or Phone number can't be blank !</span>
          </div>
        </div>
        <div class="col-10 col-lg-4">
          <div class="field mx-3">
            <label for="phoneNumber" class="form-label">Phone number<span class="text-danger">*</span></label>
            <input v-model="inputFormData.phoneNumber" type="tel" class="form-control" v-bind:class="{borderIsRed: !inputFormDataIsValid.emailPhoneNumber}" id="phoneNumber" placeholder="Another input placeholder">
            <span v-if="!inputFormDataIsValid.emailPhoneNumber" class="feedback fst-italic text-danger">Email or Phone number can't be blank !</span>
          </div>
        </div>
      </div>
      <div class="m-3 row">
        <div class="field mx-3 col-10">
          <label for="message" class="form-label">Message</label>
          <textarea v-model="inputFormData.message" class="form-control" id="message" v-bind:class="{borderIsRed: !inputFormDataIsValid.message}" rows="3" required></textarea>
          <span v-if="!inputFormDataIsValid.message" class="feedback fst-italic text-danger">Message can't be blank, max 2000 characters !</span>
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

<style>
.borderIsRed  {
  border-color: red;
}
</style>
