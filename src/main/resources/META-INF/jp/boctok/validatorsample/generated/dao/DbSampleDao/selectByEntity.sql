select
  id,
  name,
  start,
  end,
  deleted
from
  db_sample
where
  /*%if entity.id != null */
  id = /* entity.id */1
  /*%end*/
  /*%if entity.name != null */
  and
  name = /* entity.name */'a'
  /*%end*/
  /*%if entity.start != null */
  and
  start = /* entity.start */'2010-01-23'
  /*%end*/
  /*%if entity.end != null */
  and
  end = /* entity.end */'2010-01-23'
  /*%end*/
  /*%if entity.deleted != null */
  and
  deleted = /* entity.deleted */'a'
/*%end*/