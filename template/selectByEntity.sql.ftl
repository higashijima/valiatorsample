<#-- このテンプレートに対応するデータモデルのクラスは org.seasar.doma.extension.gen.SqlDesc です -->
<#-- entityクラスをパラメータにしてパラメータの値があるものを検索条件にするselectのテンプレート -->
select
<#list entityDesc.entityPropertyDescs as property>
  ${property.columnName}<#if property_has_next>,</#if>
</#list>
from
  ${entityDesc.tableName}
where
<#list entityDesc.entityPropertyDescs as property>
  /*#if entity.${property.name} != null */
  ${property.columnName} = /* entity.${property.name} */<#if property.number>1<#elseif property.time>${toTime("12:34:56")}<#elseif property.date>${toDate("2010-01-23")}<#elseif property.timestamp>${toTimestamp("2010-01-23 12:34:56")}<#else>'a'</#if><#if property_has_next>
  /*end*/
  and</#if>
</#list>
