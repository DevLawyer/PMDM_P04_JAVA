package model;

/**
 *
 * @author Miguel Maria Vazquez Martinez
 * @author David Bernal Navarrete
 *
 */

import java.util.*;

interface DateInterface {

    public final static int DIA_DEL_MES = Calendar.DAY_OF_MONTH;
    public final static int MES_DEL_ANIO = Calendar.MONTH + 1;
    public final static int ANIO = Calendar.YEAR;

    public abstract boolean passedOneMonth();

    public abstract boolean passedOneQuarter();

    public abstract boolean passedOneYear();

}
