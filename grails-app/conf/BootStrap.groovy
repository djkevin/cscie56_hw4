import com.nerds.Nerd

class BootStrap {

    def grailsApplication
    def messageSource

    def init = { servletContext ->

        for (dc in grailsApplication.domainClasses) {
            dc.metaClass.getErrorStrings = { Locale locale = Locale.default ->
                def stringsByField = [:].withDefault { [] }
                for (fieldErrors in delegate.errors) {
                    for (error in fieldErrors.allErrors) {
                        String message = messageSource.getMessage(error, locale)
                        stringsByField[error.field] << message
                    }
                }
                stringsByField
            }
        }


        if (!Nerd.count()) {
            def nerd1 = new Nerd(firstName: "kevin", lastName: "jutliah", initials: "dj", birthDate: new Date(), acceptedTerms: true).save(failOnError: true)
        }
    }
    def destroy = {
    }
}
