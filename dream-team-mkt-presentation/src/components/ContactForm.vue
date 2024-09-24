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
  if (inputs.value.corporateName === '' || inputs.value.corporateName.trim().length > 200) {
    inputFormDataIsValid.value.corporateName = false;
    isValid = false;
  }
  if (inputs.value.firstName === '' || inputs.value.firstName.trim().length > 200) {
    inputFormDataIsValid.value.firstName = false;
    isValid = false;
  }
  if (inputs.value.lastName === '' || inputs.value.lastName.trim().length > 200) {
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
  <div class="container  col-12">
    <h1 class="text-center m-3">{{ $t('contactForm')}}</h1>
    <form novalidate class="d-flex flex-column mx-3 bg-light rounded-2">
      <div class="contact-form-container">
        <div class="m-3 row">
          <div class="">
            <label for="corporateName" class="form-label fs-5">
              {{ $t('corporateName')}}<span class="text-danger"><span class="text-danger">*</span></span>
            </label>
            <input v-model="inputFormData.corporateName" type="text" class="form-control"
              v-bind:class="{ borderIsRed: !inputFormDataIsValid.corporateName }" id="corporateName"
              placeholder="max 200 characters" required>
            <span v-if="!inputFormDataIsValid.corporateName" class="feedback fst-italic text-danger">
              {{ $t('corporateNameValidation')}}
            </span>
          </div>
        </div>
        <div class="row row-cols-lg-2 m-3">
          <div class="">
            <div class="field mx-3">
              <label for="firstName" class="form-label fs-5">
                {{ $t('firstName')}}<span class="text-danger">*</span>
              </label>
              <input v-model="inputFormData.firstName" type="text" class="form-control"
                v-bind:class="{ borderIsRed: !inputFormDataIsValid.firstName }" id="firstName"
                placeholder="max 200 characters" required>
              <span v-if="!inputFormDataIsValid.firstName" class="feedback fst-italic text-danger">
                {{ $t('firstNameValidation')}}
              </span>
            </div>
          </div>
          <div class="">
            <div class="field mx-3">
              <label for="lastName" class="form-label fs-5">{{ $t('lastName')}}<span class="text-danger">*</span></label>
              <input v-model="inputFormData.lastName" type="text" class="form-control"
                v-bind:class="{ borderIsRed: !inputFormDataIsValid.lastName }" id="lastName"
                placeholder="max 200 characters" required>
              <span v-if="!inputFormDataIsValid.lastName" class="feedback fst-italic text-danger">
                {{ $t('lastNameValidation')}}
              </span>
            </div>
          </div>
        </div>
        <div class="row row-cols-lg-2 m-3">
          <div >
            <div class="field mx-3 ">
              <label for="email" class="form-label fs-5">
                {{ $t('email')}}<span class="text-danger">*</span>
              </label>
              <input v-model="inputFormData.email" type="email" class="form-control"
                v-bind:class="{ borderIsRed: !inputFormDataIsValid.emailPhoneNumber }" id="email"
                placeholder="email or Phone number can't be blank">
              <span v-if="!inputFormDataIsValid.emailPhoneNumber" class="feedback fst-italic text-danger">
                {{ $t('emailAndPhoneValidation')}}
              </span>
            </div>
          </div>
          <div >
            <div class="field mx-3">
              <label for="phoneNumber" class="form-label fs-5">
                {{ $t('phone')}}<span class="text-danger">*</span>
              </label>
              <input v-model="inputFormData.phoneNumber" type="tel" class="form-control"
                v-bind:class="{ borderIsRed: !inputFormDataIsValid.emailPhoneNumber }" id="phoneNumber"
                placeholder="email or Phone number can't be blank">
              <span v-if="!inputFormDataIsValid.emailPhoneNumber" class="feedback fst-italic text-danger">
                {{ $t('emailAndPhoneValidation')}}
              </span>
            </div>
          </div>
        </div>
        <div class="m-3 row">
          <div class="">
            <label for="message" class="form-label fs-5">
              {{ $t('message')}}<span class="text-danger">*</span>
            </label>
            <textarea v-model="inputFormData.message" class="form-control" id="message"
              v-bind:class="{ borderIsRed: !inputFormDataIsValid.message }" rows="3" required placeholder="max 2000 characters"></textarea>
            <span v-if="!inputFormDataIsValid.message" class="feedback fst-italic text-danger">
              {{ $t('messageValidation')}}
            </span>
          </div>
        </div>
        <div class="m-4 row justify-content-center">
          <button v-on:click="submitData" class="btn btn-primary col-12 col-lg-auto">
            {{ $t('send') }}
          </button>
        </div>
      </div>
    </form>
  </div>
</template>

<style>
.borderIsRed {
  border-color: red;
}
</style>
