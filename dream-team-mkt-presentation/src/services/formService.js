import { axiosClient } from './axiosClient.js'

class formService {

  static sendContactFormData(inputData) {
    const data = {
      corporateName: inputData.value.firstName.trim(),
      firstName: inputData.value.lastName.trim(),
      lastName: inputData.value.lastName.trim(),
      email: inputData.value.email.trim(),
      phoneNumber: inputData.value.phoneNumber.trim(),
      message: inputData.value.message.trim()
    }

    axiosClient.post('/url',
      { data }
    )
  }

}

export default formService;
