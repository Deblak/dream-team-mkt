
import { axiosClient } from "./axiosClient"

class ContactForm {

  static sendContactFormData(inputs) {
    const data = {
      corporateName: inputs.value.corporateName.trim(),
      firstName: inputs.value.firstName.trim(),
      lastName: inputs.value.lastName.trim(),
      email: inputs.value.email.trim(),
      phoneNumber: inputs.value.phoneNumber.trim(),
      message: inputs.value.message.trim()
    }
    axiosClient.post('/mail/send',
      { data }
      )
  }
}

export default ContactForm;
