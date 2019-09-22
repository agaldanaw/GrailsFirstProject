<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'trip.label', default: 'Trip')}" />
        <title><g:message code="default.list.label" args="[entityName]" /></title>
    </head>
    <body>
        <a href="#list-trip" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
        <div class="nav" role="navigation">
            <ul>
                <li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
                <li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
            </ul>
        </div>
        <fieldset class="form">
            <g:form action="index" method="GET">
                <div class="fieldcontain">
                    <label for="query">Busqueda por destino (para eliminar el filtro, borrar la busqueda y buscar):</label>
                    <g:textField name="query" value="${params.query}"/>
                    <input class="search" type="submit" value="Buscar" /> 
                </div>
            </g:form>
        </fieldset>
        <div id="list-trip" class="content scaffold-list" role="main">
            <h1><g:message code="default.list.label" args="[entityName]" /></h1>
            <g:if test="${flash.message}">
                <div class="message" role="status">${flash.message}</div>
            </g:if>
            <f:table collection="${tripList}" />
            <div class="pagination">
                <g:paginate total="${tripCount ?: 0}" />
            </div>
        </div>
    </body>
</html>