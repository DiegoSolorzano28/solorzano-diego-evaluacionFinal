package com.example.ec3_solorzano_diego.data.db;

import java.lang.System;

@androidx.room.Database(entities = {com.example.ec3_solorzano_diego.model.Cerveceria.class}, version = 1)
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/ec3_solorzano_diego/data/db/CerveceriaDataBase;", "Landroidx/room/RoomDatabase;", "()V", "CerveceriaDao", "Lcom/example/ec3_solorzano_diego/data/db/CerveceriaDao;", "Companion", "app_debug"})
public abstract class CerveceriaDataBase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.ec3_solorzano_diego.data.db.CerveceriaDataBase.Companion Companion = null;
    @kotlin.jvm.Volatile()
    private static volatile com.example.ec3_solorzano_diego.data.db.CerveceriaDataBase instance;
    
    public CerveceriaDataBase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.ec3_solorzano_diego.data.db.CerveceriaDao CerveceriaDao();
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/ec3_solorzano_diego/data/db/CerveceriaDataBase$Companion;", "", "()V", "instance", "Lcom/example/ec3_solorzano_diego/data/db/CerveceriaDataBase;", "buildDatabase", "context", "Landroid/content/Context;", "getDatabase", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.ec3_solorzano_diego.data.db.CerveceriaDataBase getDatabase(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private final com.example.ec3_solorzano_diego.data.db.CerveceriaDataBase buildDatabase(android.content.Context context) {
            return null;
        }
    }
}