<#import "/spring.ftl" as spring/>
<#assign security=JspTaglibs["http://www.springframework.org/security/tags"] />
<#--<#assign security = JspTaglibs[""]/>-->
<#--<#assign isAuthenticated = false/>-->
<#--<@security.authentication property = "principal" var = "user"/>-->
<#--<@security.authorize access = "isAuthenticated()">-->
    <#--<#assign isAuthenticated = true/>-->
<#--</@security.authorize>-->

<div class="container">
    <a href="<@spring.url '/login'/>">Login</a>
</div>


