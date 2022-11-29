select
  id,
  name,
  start,
  end
from
  sample_tbl
where
  /*#if entity.id != null */
  id = /* entity.id */1
  /*end*/
  and
  /*#if entity.name != null */
  name = /* entity.name */'a'
  /*end*/
  and
  /*#if entity.start != null */
  start = /* entity.start */'2010-01-23'
  /*end*/
  and
  /*#if entity.end != null */
  end = /* entity.end */'2010-01-23'
