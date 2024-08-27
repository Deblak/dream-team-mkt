
import { axiosClient } from "./axiosClient"

class ContactFormService {

  static sendContactFormData(inputs) {
    const data = {
      corporateName: inputs.value.firstName.trim(),
      firstName: inputs.value.lastName.trim(),
      lastName: inputs.value.lastName.trim(),
      email: inputs.value.email.trim(),
      phoneNumber: inputs.value.phoneNumber.trim(),
      message: inputs.value.message.trim()
    }
    axiosClient.post('/endPointUrl',
      { data }
      )
  }
}

export {ContactFormService};
