<%@ page import="com.nerds.Nerd" %>

<div class="fieldcontain ${hasErrors(bean: nerdInstance, field: 'firstName', 'error')} ">
	<label for="firstName">
		<g:message code="nerd.firstName.label" default="First Name" />
		
	</label>
	<g:textField name="firstName" value="${nerdInstance?.firstName}" />

</div>

<div class="fieldcontain ${hasErrors(bean: nerdInstance, field: 'lastName', 'error')} ">
	<label for="lastName">
		<g:message code="nerd.lastName.label" default="Last Name" />
		
	</label>
	<g:textField name="lastName" value="${nerdInstance?.lastName}" />

</div>

<div class="fieldcontain ${hasErrors(bean: nerdInstance, field: 'initials', 'error')} ">
    <label for="initials">
        <g:message code="nerd.initials.label" default="Initials" />

    </label>
    <g:textField name="initials" value="${nerdInstance?.initials}" />

</div>

<div class="fieldcontain ${hasErrors(bean: nerdInstance, field: 'birthDate', 'error')} ">
    <label for="birthDate">
        <g:message code="nerd.birthDate.label" default="Birth Date" />

    </label>
    <g:datePicker name="birthDate" precision="day" value="${nerdInstance?.birthDate}" />

</div>

<div class="fieldcontain ${hasErrors(bean: nerdInstance, field: 'acceptedTerms', 'error')} ">
    <label for="acceptedTerms">
        <g:message code="nerd.acceptedTerms.label" default="Accepted Terms" />

    </label>
    <g:checkBox name="acceptedTerms" value="${nerdInstance?.acceptedTerms}" />

</div>