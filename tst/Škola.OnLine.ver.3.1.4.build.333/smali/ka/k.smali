.class public final Lka/k;
.super Landroid/database/sqlite/SQLiteOpenHelper;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lka/k$a;
    }
.end annotation


# static fields
.field public static final n:Lka/k$a;

.field private static o:Lka/k;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lka/k$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lka/k$a;-><init>(Ls9/g;)V

    sput-object v0, Lka/k;->n:Lka/k$a;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 3

    const-string v0, "download_tasks.db"

    const/4 v1, 0x0

    const/4 v2, 0x4

    invoke-direct {p0, p1, v0, v1, v2}, Landroid/database/sqlite/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Ls9/g;)V
    .locals 0

    invoke-direct {p0, p1}, Lka/k;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public static final synthetic a()Lka/k;
    .locals 1

    sget-object v0, Lka/k;->o:Lka/k;

    return-object v0
.end method

.method public static final synthetic b(Lka/k;)V
    .locals 0

    sput-object p0, Lka/k;->o:Lka/k;

    return-void
.end method


# virtual methods
.method public onCreate(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 1

    const-string v0, "db"

    invoke-static {p1, v0}, Ls9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "CREATE TABLE task (_id INTEGER PRIMARY KEY,task_id VARCHAR(256), url TEXT, status INTEGER DEFAULT 0, progress INTEGER DEFAULT 0, file_name TEXT, saved_dir TEXT, headers TEXT, mime_type VARCHAR(128), resumable TINYINT DEFAULT 0, show_notification TINYINT DEFAULT 0, open_file_from_notification TINYINT DEFAULT 0, time_created INTEGER DEFAULT 0, save_in_public_storage TINYINT DEFAULT 0, allow_cellular TINYINT DEFAULT 1)"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    return-void
.end method

.method public onDowngrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 1

    const-string v0, "db"

    invoke-static {p1, v0}, Ls9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2, p3}, Lka/k;->onUpgrade(Landroid/database/sqlite/SQLiteDatabase;II)V

    return-void
.end method

.method public onUpgrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 1

    const-string v0, "db"

    invoke-static {p1, v0}, Ls9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x4

    if-ne p3, v0, :cond_0

    const-string p2, "ALTER TABLE task ADD COLUMN allow_cellular TINYINT DEFAULT 1"

    :goto_0
    invoke-virtual {p1, p2}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    goto :goto_1

    :cond_0
    const/4 v0, 0x2

    if-ne p2, v0, :cond_1

    const/4 p2, 0x3

    if-ne p3, p2, :cond_1

    const-string p2, "ALTER TABLE task ADD COLUMN save_in_public_storage TINYINT DEFAULT 0"

    goto :goto_0

    :cond_1
    const-string p2, "DROP TABLE IF EXISTS task"

    invoke-virtual {p1, p2}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lka/k;->onCreate(Landroid/database/sqlite/SQLiteDatabase;)V

    :goto_1
    return-void
.end method
