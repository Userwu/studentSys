<#include "../macro-item.ftl">
<@item>
<div class="panel-heading title">${view.title}</div>
<div class="panel-body">
    <div id="chart-inner">
        <div id="dataTables-example_wrapper" class="table-responsive dataTables_wrapper form-inline" role="grid">
            <table class="table table-striped table-bordered table-hover dataTable no-footer"
                   id="dataTables-example" aria-describedby="dataTables-example_info">
                <thead>
                <tr>
                    <th>
                        试卷名称
                    </th>
                    <th>
                        班级
                    </th>
                    <th>
                        开始时间
                    </th>
                    <th>
                        结束时间
                    </th>
                <#--<#if updateAble || deleteAble>
                    <th>
                        操作
                    </th>
                </#if>-->
                </tr>
                </thead>
                <tbody>

                    <#list disList as q>
                    <tr id="testQuestionnaireClass${(q.id)!}">
                        <td id="testQuestionnaireId${(q.id)!}"
                            data-label="${(q.testQuestionnaireId)!}">${(testQuestionnaireMap["${(q.id)!0}"].testQuestionnaireTitle)!}</td>
                        <td id="classId${(q.id)!}"
                            data-label="${(q.testQuestionnaireId)!}">${(classMap["${q.id}"].className)!}</td>
                        <td id="testQuestionnaireStartTime${(q.id)!}"
                            data-label="${(q.testQuestionnaireStartTime)!}">${(q.testQuestionnaireStartTime?number)?number_to_datetime}</td>
                        <td id="testQuestionnaireEndTime${q.id}"
                            data-label="${(q.testQuestionnaireEndTime)!}}">${((q.testQuestionnaireEndTime)?number)?number_to_datetime}</td>
                    </tr>
                    </#list>
                </tbody>
            </table>
        </div>
        <#if disList?size <= 0>
            <div class="text-center small">暂无数据...</div>
        <#else>
            <div class="text-center small">更多已分配试卷信息请到成绩统计中查看...</div>
        </#if>

    </div>
</div>
</@item>