<script>
import ContactForm from "../services/contactForm.js"

export default{
  name: 'ContanctForm',
  props: {
    isEditable: Boolean
  },
  data(){
    return {
      isValidInputFormData: { 
  corporateName: true,
  firstName: true,
  lastName: true,
  emailPhoneNumber: true,
  message: true
      },

      inputFormData: {
  corporateName: "",
  firstName: "",
  lastName: "",
  email: "",
  phoneNumber: "",
  message: ""
    }
  }
},


  methods: {
    isValidInput(inputs) {
  let isValid = true;
  this.isValidInputFormData.corporateName = true;
  this.isValidInputFormData.firstName = true;
  this.isValidInputFormData.lastName = true;
  this.isValidInputFormData.emailPhoneNumber = true;
  this.isValidInputFormData.message = true;
  if (inputs.value.corporateName === '' || inputs.value.corporateName.trim().length > 200) {
    this.isValidInputFormData.corporateName = false;
    isValid = false;
  }
  if (inputs.value.firstName === '' || inputs.value.firstName.trim().length > 200) {
    this.isValidInputFormData.firstName = false;
    isValid = false;
  }
  if (inputs.value.lastName === '' || inputs.value.lastName.trim().length > 200) {
    this.isValidInputFormData.lastName = false;
    isValid = false;
  }
  if (inputs.value.email === '' && inputs.value.phoneNumber === '') {
    this.isValidInputFormData.emailPhoneNumber = false;
    isValid = false;
  }
  if (inputs.value.message === '' || inputs.value.message.trim().length > 2000) {
    this.isValidInputFormData.message = false;
    isValid = false;
  }
  return isValid;
    },

    submitData() {
  event.preventDefault()
  if (this.isValidInput(this.inputFormData)) {
    ContactForm.sendContactFormData(this.inputFormData);
    this.inputFormData = {
      corporateName: "",
      firstName: "",
      lastName: "",
      email: "",
      phoneNumber: "",
      message: ""
    }
  }
  }
}
}

// const isValidInputFormData = ref({
//   corporateName: true,
//   firstName: true,
//   lastName: true,
//   emailPhoneNumber: true,
//   message: true
// })

// const inputFormData = ref({
//   corporateName: "",
//   firstName: "",
//   lastName: "",
//   email: "",
//   phoneNumber: "",
//   message: ""
// })

// function isValidInput(inputs) {
//   let isValid = true;
//   isValidInputFormData.value.corporateName = true;
//   isValidInputFormData.value.firstName = true;
//   isValidInputFormData.value.lastName = true;
//   isValidInputFormData.value.emailPhoneNumber = true;
//   isValidInputFormData.value.message = true;
//   if (inputs.value.corporateName === '' || inputs.value.corporateName.trim().length > 200) {
//     isValidInputFormData.value.corporateName = false;
//     isValid = false;
//   }
//   if (inputs.value.firstName === '' || inputs.value.firstName.trim().length > 200) {
//     isValidInputFormData.value.firstName = false;
//     isValid = false;
//   }
//   if (inputs.value.lastName === '' || inputs.value.lastName.trim().length > 200) {
//     isValidInputFormData.value.lastName = false;
//     isValid = false;
//   }
//   if (inputs.value.email === '' && inputs.value.phoneNumber === '') {
//     isValidInputFormData.value.emailPhoneNumber = false;
//     isValid = false;
//   }
//   if (inputs.value.message === '' || inputs.value.message.trim().length > 2000) {
//     isValidInputFormData.value.message = false;
//     isValid = false;
//   }
//   return isValid;
// }

// function submitData() {
//   event.preventDefault()
//   if (isValidInput(inputFormData)) {
//     ContactForm.sendContactFormData(inputFormData);
//     inputFormData.value = {
//       corporateName: "",
//       firstName: "",
//       lastName: "",
//       email: "",
//       phoneNumber: "",
//       message: ""
//     }
//   }
// }
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
              v-bind:class="{ borderIsRed: !isValidInputFormData.corporateName }" id="corporateName"
              v-bind:placeholder="$t('200MaxChar')" required>
            <span v-if="!isValidInputFormData.corporateName" class="feedback fst-italic text-danger">
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
                v-bind:class="{ borderIsRed: !isValidInputFormData.firstName }" id="firstName"
                v-bind:placeholder="$t('200MaxChar')" required>
              <span v-if="!isValidInputFormData.firstName" class="feedback fst-italic text-danger">
                {{ $t('firstNameValidation')}}
              </span>
            </div>
          </div>
          <div class="">
            <div class="field mx-3">
              <label for="lastName" class="form-label fs-5">{{ $t('lastName')}}<span class="text-danger">*</span></label>
              <input v-model="inputFormData.lastName" type="text" class="form-control"
                v-bind:class="{ borderIsRed: !isValidInputFormData.lastName }" id="lastName"
                v-bind:placeholder="$t('200MaxChar')" required>
              <span v-if="!isValidInputFormData.lastName" class="feedback fst-italic text-danger">
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
                v-bind:class="{ borderIsRed: !isValidInputFormData.emailPhoneNumber }" id="email"
                v-bind:placeholder="$t('emailAndPhoneValidation')">
              <span v-if="!isValidInputFormData.emailPhoneNumber" class="feedback fst-italic text-danger">
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
                v-bind:class="{ borderIsRed: !isValidInputFormData.emailPhoneNumber }" id="phoneNumber"
                v-bind:placeholder="$t('emailAndPhoneValidation')">
              <span v-if="!isValidInputFormData.emailPhoneNumber" class="feedback fst-italic text-danger">
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
              v-bind:class="{ borderIsRed: !isValidInputFormData.message }" rows="3" required v-bind:placeholder="$t('200MaxChar')"></textarea>
            <span v-if="!isValidInputFormData.message" class="feedback fst-italic text-danger">
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
