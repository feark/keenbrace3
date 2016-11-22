package com.keenbrace.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.keenbrace.greendao.ShortPlan;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "SHORT_PLAN".
*/
public class ShortPlanDao extends AbstractDao<ShortPlan, Long> {

    public static final String TABLENAME = "SHORT_PLAN";

    /**
     * Properties of entity ShortPlan.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property ShortPlanName = new Property(1, String.class, "ShortPlanName", false, "SHORT_PLAN_NAME");
        public final static Property TotalTime = new Property(2, Integer.class, "totalTime", false, "TOTAL_TIME");
        public final static Property Pos = new Property(3, String.class, "pos", false, "POS");
        public final static Property Intense = new Property(4, Integer.class, "intense", false, "INTENSE");
        public final static Property Status = new Property(5, Integer.class, "status", false, "STATUS");
        public final static Property Logo = new Property(6, Integer.class, "logo", false, "LOGO");
        public final static Property SingleTrainID = new Property(7, Integer.class, "singleTrainID", false, "SINGLE_TRAIN_ID");
        public final static Property WarmUpTime = new Property(8, Integer.class, "warmUpTime", false, "WARM_UP_TIME");
        public final static Property Distance = new Property(9, Integer.class, "distance", false, "DISTANCE");
        public final static Property Section = new Property(10, Integer.class, "section", false, "SECTION");
        public final static Property Content = new Property(11, byte[].class, "content", false, "CONTENT");
        public final static Property Duration = new Property(12, byte[].class, "duration", false, "DURATION");
        public final static Property Cadence = new Property(13, Integer.class, "cadence", false, "CADENCE");
        public final static Property Speed = new Property(14, Integer.class, "speed", false, "SPEED");
        public final static Property Type = new Property(15, byte[].class, "type", false, "TYPE");
        public final static Property Set = new Property(16, byte[].class, "set", false, "SET");
        public final static Property Reps = new Property(17, byte[].class, "reps", false, "REPS");
        public final static Property RestBtwType = new Property(18, Integer.class, "restBtwType", false, "REST_BTW_TYPE");
        public final static Property RestBtwSet = new Property(19, byte[].class, "restBtwSet", false, "REST_BTW_SET");
    };


    public ShortPlanDao(DaoConfig config) {
        super(config);
    }
    
    public ShortPlanDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"SHORT_PLAN\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"SHORT_PLAN_NAME\" TEXT UNIQUE ," + // 1: ShortPlanName
                "\"TOTAL_TIME\" INTEGER," + // 2: totalTime
                "\"POS\" TEXT," + // 3: pos
                "\"INTENSE\" INTEGER," + // 4: intense
                "\"STATUS\" INTEGER," + // 5: status
                "\"LOGO\" INTEGER," + // 6: logo
                "\"SINGLE_TRAIN_ID\" INTEGER," + // 7: singleTrainID
                "\"WARM_UP_TIME\" INTEGER," + // 8: warmUpTime
                "\"DISTANCE\" INTEGER," + // 9: distance
                "\"SECTION\" INTEGER," + // 10: section
                "\"CONTENT\" BLOB," + // 11: content
                "\"DURATION\" BLOB," + // 12: duration
                "\"CADENCE\" INTEGER," + // 13: cadence
                "\"SPEED\" INTEGER," + // 14: speed
                "\"TYPE\" BLOB," + // 15: type
                "\"SET\" BLOB," + // 16: set
                "\"REPS\" BLOB," + // 17: reps
                "\"REST_BTW_TYPE\" INTEGER," + // 18: restBtwType
                "\"REST_BTW_SET\" BLOB);"); // 19: restBtwSet
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"SHORT_PLAN\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, ShortPlan entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String ShortPlanName = entity.getShortPlanName();
        if (ShortPlanName != null) {
            stmt.bindString(2, ShortPlanName);
        }
 
        Integer totalTime = entity.getTotalTime();
        if (totalTime != null) {
            stmt.bindLong(3, totalTime);
        }
 
        String pos = entity.getPos();
        if (pos != null) {
            stmt.bindString(4, pos);
        }
 
        Integer intense = entity.getIntense();
        if (intense != null) {
            stmt.bindLong(5, intense);
        }
 
        Integer status = entity.getStatus();
        if (status != null) {
            stmt.bindLong(6, status);
        }
 
        Integer logo = entity.getLogo();
        if (logo != null) {
            stmt.bindLong(7, logo);
        }
 
        Integer singleTrainID = entity.getSingleTrainID();
        if (singleTrainID != null) {
            stmt.bindLong(8, singleTrainID);
        }
 
        Integer warmUpTime = entity.getWarmUpTime();
        if (warmUpTime != null) {
            stmt.bindLong(9, warmUpTime);
        }
 
        Integer distance = entity.getDistance();
        if (distance != null) {
            stmt.bindLong(10, distance);
        }
 
        Integer section = entity.getSection();
        if (section != null) {
            stmt.bindLong(11, section);
        }
 
        byte[] content = entity.getContent();
        if (content != null) {
            stmt.bindBlob(12, content);
        }
 
        byte[] duration = entity.getDuration();
        if (duration != null) {
            stmt.bindBlob(13, duration);
        }
 
        Integer cadence = entity.getCadence();
        if (cadence != null) {
            stmt.bindLong(14, cadence);
        }
 
        Integer speed = entity.getSpeed();
        if (speed != null) {
            stmt.bindLong(15, speed);
        }
 
        byte[] type = entity.getType();
        if (type != null) {
            stmt.bindBlob(16, type);
        }
 
        byte[] set = entity.getSet();
        if (set != null) {
            stmt.bindBlob(17, set);
        }
 
        byte[] reps = entity.getReps();
        if (reps != null) {
            stmt.bindBlob(18, reps);
        }
 
        Integer restBtwType = entity.getRestBtwType();
        if (restBtwType != null) {
            stmt.bindLong(19, restBtwType);
        }
 
        byte[] restBtwSet = entity.getRestBtwSet();
        if (restBtwSet != null) {
            stmt.bindBlob(20, restBtwSet);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public ShortPlan readEntity(Cursor cursor, int offset) {
        ShortPlan entity = new ShortPlan( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // ShortPlanName
            cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2), // totalTime
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // pos
            cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4), // intense
            cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5), // status
            cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6), // logo
            cursor.isNull(offset + 7) ? null : cursor.getInt(offset + 7), // singleTrainID
            cursor.isNull(offset + 8) ? null : cursor.getInt(offset + 8), // warmUpTime
            cursor.isNull(offset + 9) ? null : cursor.getInt(offset + 9), // distance
            cursor.isNull(offset + 10) ? null : cursor.getInt(offset + 10), // section
            cursor.isNull(offset + 11) ? null : cursor.getBlob(offset + 11), // content
            cursor.isNull(offset + 12) ? null : cursor.getBlob(offset + 12), // duration
            cursor.isNull(offset + 13) ? null : cursor.getInt(offset + 13), // cadence
            cursor.isNull(offset + 14) ? null : cursor.getInt(offset + 14), // speed
            cursor.isNull(offset + 15) ? null : cursor.getBlob(offset + 15), // type
            cursor.isNull(offset + 16) ? null : cursor.getBlob(offset + 16), // set
            cursor.isNull(offset + 17) ? null : cursor.getBlob(offset + 17), // reps
            cursor.isNull(offset + 18) ? null : cursor.getInt(offset + 18), // restBtwType
            cursor.isNull(offset + 19) ? null : cursor.getBlob(offset + 19) // restBtwSet
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, ShortPlan entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setShortPlanName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setTotalTime(cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2));
        entity.setPos(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setIntense(cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4));
        entity.setStatus(cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5));
        entity.setLogo(cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6));
        entity.setSingleTrainID(cursor.isNull(offset + 7) ? null : cursor.getInt(offset + 7));
        entity.setWarmUpTime(cursor.isNull(offset + 8) ? null : cursor.getInt(offset + 8));
        entity.setDistance(cursor.isNull(offset + 9) ? null : cursor.getInt(offset + 9));
        entity.setSection(cursor.isNull(offset + 10) ? null : cursor.getInt(offset + 10));
        entity.setContent(cursor.isNull(offset + 11) ? null : cursor.getBlob(offset + 11));
        entity.setDuration(cursor.isNull(offset + 12) ? null : cursor.getBlob(offset + 12));
        entity.setCadence(cursor.isNull(offset + 13) ? null : cursor.getInt(offset + 13));
        entity.setSpeed(cursor.isNull(offset + 14) ? null : cursor.getInt(offset + 14));
        entity.setType(cursor.isNull(offset + 15) ? null : cursor.getBlob(offset + 15));
        entity.setSet(cursor.isNull(offset + 16) ? null : cursor.getBlob(offset + 16));
        entity.setReps(cursor.isNull(offset + 17) ? null : cursor.getBlob(offset + 17));
        entity.setRestBtwType(cursor.isNull(offset + 18) ? null : cursor.getInt(offset + 18));
        entity.setRestBtwSet(cursor.isNull(offset + 19) ? null : cursor.getBlob(offset + 19));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(ShortPlan entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(ShortPlan entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
