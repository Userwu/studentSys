<#macro macroBtn url title theme="res" isSave=false saveLabel="保存">
    <#assign btnLabel = "">
    <#if isSave>
        <#assign btnLabel = "<button data-style=\"slide-up\" id=\"save-btn\" class=\"btn btn-${theme} ladda-button\"
                onclick=\"func.${url}('up','?');\"><span
                class=\"ladda-label\">${saveLabel}</span></button>">
    <#elseif theme == "res">
        <#assign btnLabel = "<a onclick=\"func.${url}('show','?');\" class=\"${theme}\">${title}</a>">
    <#else>
        <#assign btnLabel = "<a onclick=\"func.${url}('show','?');\" class=\"btn btn-${theme}\">${title}</a>">
    </#if>
</#macro>

<#macro initBtn map view theme = "success" saveLabel="保存">
    <#assign updateAble = false>
    <#assign deleteAble = false>
    <#assign addAble = false>
    <#assign addBtn = "">
    <#assign saveBtn = "">
    <#assign updateBtn = "">
    <#assign deleteBtn = "">

    <#if map??>
        <#list map["operators"+view.id] as op>
            <#if op.url?starts_with("add")>
                <#assign addAble = true>
                <@macroBtn url = op.url title = op.title theme=theme></@macroBtn>
                <#assign addBtn = btnLabel>
                <@macroBtn url = op.url title = op.title theme="success" isSave=true saveLabel=saveLabel></@macroBtn>
                <#assign saveBtn = btnLabel>
            <#elseif op.url?starts_with("update")>
                <#assign updateAble = true>
                <@macroBtn url = op.url title = op.title ></@macroBtn>
                <#assign updateBtn = btnLabel>
            <#elseif op.url?starts_with("delete")>
                <#assign deleteAble = true>
                <@macroBtn url = op.url title = op.title ></@macroBtn>
                <#assign deleteBtn = btnLabel>
            </#if>
        </#list>
    </#if>
</#macro>
