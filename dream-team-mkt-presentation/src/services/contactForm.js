
import { axiosClient } from "./axiosClient"

class ContactForm {

  static sendContactFormData(inputs) {
    const data = {
      corporateName: inputs.corporateName.trim(),
      firstName: inputs.firstName.trim(),
      lastName: inputs.lastName.trim(),
      email: inputs.email.trim(),
      phoneNumber: inputs.phoneNumber.trim(),
      message: inputs.message.trim()
    }
    axiosClient.post('/mail/send',
      {data }
      )
  }
}

export default ContactForm;
