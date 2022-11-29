package jp.boctok.validatorsample.generated.entity;

import java.time.LocalDate;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity
@Table(name = "sample_tbl")
public class SampleTbl {

    /** */
    @Id
    @Column(name = "id")
    Long id;

    /** */
    @Column(name = "name")
    String name;

    /** */
    @Column(name = "start")
    LocalDate start;

    /** */
    @Column(name = "end")
    LocalDate end;

    /** 
     * Returns the id.
     * 
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /** 
     * Sets the id.
     * 
     * @param id the id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /** 
     * Returns the name.
     * 
     * @return the name
     */
    public String getName() {
        return name;
    }

    /** 
     * Sets the name.
     * 
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /** 
     * Returns the start.
     * 
     * @return the start
     */
    public LocalDate getStart() {
        return start;
    }

    /** 
     * Sets the start.
     * 
     * @param start the start
     */
    public void setStart(LocalDate start) {
        this.start = start;
    }

    /** 
     * Returns the end.
     * 
     * @return the end
     */
    public LocalDate getEnd() {
        return end;
    }

    /** 
     * Sets the end.
     * 
     * @param end the end
     */
    public void setEnd(LocalDate end) {
        this.end = end;
    }
}