.class public final synthetic Lt1/e0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lt1/m0$b;


# instance fields
.field public final synthetic a:J

.field public final synthetic b:Ll1/p;


# direct methods
.method public synthetic constructor <init>(JLl1/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lt1/e0;->a:J

    iput-object p3, p0, Lt1/e0;->b:Ll1/p;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-wide v0, p0, Lt1/e0;->a:J

    iget-object v2, p0, Lt1/e0;->b:Ll1/p;

    check-cast p1, Landroid/database/sqlite/SQLiteDatabase;

    invoke-static {v0, v1, v2, p1}, Lt1/m0;->w(JLl1/p;Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
