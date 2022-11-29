package jp.boctok.validatorsample.generated.dao;

import jp.boctok.validatorsample.generated.entity.DbSample;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao
public interface DbSampleDao {

    @Select
    DbSample select(Long ids);

    /**
     * @param id
     * @return the DbSample entity
     */
    @Select
    DbSample selectById(Long id);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(DbSample entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(DbSample entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(DbSample entity);
}