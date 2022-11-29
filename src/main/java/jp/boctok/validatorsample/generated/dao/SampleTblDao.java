package jp.boctok.validatorsample.generated.dao;

import jp.boctok.validatorsample.generated.entity.SampleTbl;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao
public interface SampleTblDao {

    /**
     * @param id
     * @return the SampleTbl entity
     */
    @Select
    SampleTbl selectById(Long id);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(SampleTbl entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(SampleTbl entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(SampleTbl entity);
}