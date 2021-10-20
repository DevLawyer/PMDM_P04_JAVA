package model;

import java.util.*;

/**
 *
 * @author Miguel Maria Vazquez Martinez
 */

interface DateInterface {

    public final static int DIA_DEL_MES = Calendar.DAY_OF_MONTH;
    public final static int MES_DEL_ANIO = Calendar.MONTH + 1;
    public final static int ANIO = Calendar.YEAR;

    public abstract boolean passedOneMonth(GregorianCalendar entryDate);

    public abstract boolean passedOneQuarter(GregorianCalendar entryDate);

    public abstract boolean passedOneYear(GregorianCalendar entryDate);

}