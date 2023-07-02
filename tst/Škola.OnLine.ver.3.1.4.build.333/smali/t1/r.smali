.class public final synthetic Lt1/r;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lt1/m0$b;


# instance fields
.field public final synthetic a:Lt1/m0;

.field public final synthetic b:Ll1/p;


# direct methods
.method public synthetic constructor <init>(Lt1/m0;Ll1/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt1/r;->a:Lt1/m0;

    iput-object p2, p0, Lt1/r;->b:Ll1/p;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lt1/r;->a:Lt1/m0;

    iget-object v1, p0, Lt1/r;->b:Ll1/p;

    check-cast p1, Landroid/database/sqlite/SQLiteDatabase;

    invoke-static {v0, v1, p1}, Lt1/m0;->M(Lt1/m0;Ll1/p;Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
